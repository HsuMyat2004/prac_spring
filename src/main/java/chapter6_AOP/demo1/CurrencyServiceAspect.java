package chapter6_AOP.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class CurrencyServiceAspect {
    @Pointcut("target(chapter6_AOP.demo1.CurrencyService)")
    public void targetPointcut() {} // interface is used "target" keyword

    @Pointcut("this(chapter6_AOP.demo1.CurrencyService)")
    public void thisPointcut() {} // interface is used "this" keyword

    @Pointcut("target(chapter6_AOP.demo1.CurrencyServiceImpl)")
    public void targetImplPointCut() {} // there is reason to use "target" for impl class

    @Pointcut("this(chapter6_AOP.demo1.CurrencyServiceImpl)")
    public void thisImplPointCut() {} // there is no reason to use "this" for impl class

    //@Before("thisImplPointCut()")
    public void beforeCurrencyAdvice(JoinPoint joinPoint) {
        System.out.println("%s.%s method invoke with %s arguments"
                .formatted(joinPoint.getTarget().getClass().getName(), joinPoint.getSignature().getName() ,
                        Arrays.toString(joinPoint.getArgs())));
    }

}
