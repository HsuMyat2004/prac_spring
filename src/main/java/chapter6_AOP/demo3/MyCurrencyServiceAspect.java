package chapter6_AOP.demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyCurrencyServiceAspect {

    @Pointcut("bean(myCurrency)")
    public void beanPointcut() {}

    @Pointcut("@annotation(chapter6_AOP.demo3.InTransaction)") // annotation
    public void annotationPointcut() {}

    @Pointcut("within(chapter6_AOP.demo3.*)")// all methods and all classes under a specific package
    public void withinPointcut() {}

    @Pointcut("@within(chapter6_AOP.demo3.Secured)")
    public void annotationWithinPointcut() {}

    @Pointcut("@target(chapter6_AOP.demo3.Secured)") // it equals to within annotation
    public void annotationTargetPointcut() {}

    @Pointcut("@args(chapter6_AOP.demo3.Validated)") //it is used only for method arguments to validate
    public void annotationArgsPointcut() {}

    @Pointcut("args(String,String,double)") // only specific methods that have the same parameters will work
    public void argsPointCut(){}

    //@Before("argsPointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("%s.%s method invoke with %s arguments".formatted(joinPoint.getTarget().getClass().getName(),joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs())));
    }

    // only exception error method will show
   // @AfterThrowing(value = "annotationTargetPointcut()", throwing="exception")
    public void afterThrowingAdvice(JoinPoint joinPoint, Throwable exception){
        System.out.println(
                "%s.%s method caught %s exception with args %s"
                        .formatted(
                                joinPoint.getTarget().getClass().getName(),
                                joinPoint.getSignature().getName(),
                                exception.getClass().getSimpleName(),
                                Arrays.toString(joinPoint.getArgs())
                        ));
    }

    // all methods that are returned or null (including void) will show
    //@AfterReturning(value = "annotationTargetPointcut()",returning = "returnValue")
    public void afterReturningAdvice(JoinPoint joinPoint, Object returnValue ){
        System.out.println(
                "%s.%s method caught %s return values with args"
                        .formatted(
                                joinPoint.getTarget().getClass().getName(),
                                joinPoint.getSignature().getName(),
                                returnValue,
                                Arrays.toString(joinPoint.getArgs())
                        ));
    }

    @Around("annotationTargetPointcut()")
    //1. void can't be written in around advice
    //2.  method signature isn't joinPoint, ProcessingJoinPoint only accepts
    //3. must be throwable and try, catch, finally
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // before advice
        System.out.println("%s.%s method invoke before".formatted(proceedingJoinPoint.getTarget().getClass().getName(),proceedingJoinPoint.getSignature().getName()));
        Object object = null;
        try{
            object = proceedingJoinPoint.proceed();
            System.out.println("Return Type : " + object.getClass().getName()); //return type //after returning
            return object;
        } catch (Exception e){
            System.out.println("Exception: %s".formatted(e.getMessage())); //after throwing
        } finally{
            // after advice
            System.out.println("%s.%s method invoke after".formatted(proceedingJoinPoint.getTarget().getClass().getName(),proceedingJoinPoint.getSignature().getName()));
        }
        System.out.println();
        return object;
    }
}
