package chapter6.demo3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

// step 2. Defining an aspect class
@Aspect // aspect itself is not the bean // u only told that " Spring that the class implements the definition of an aspect"
public class LoggingAspect {

    private final Logger logger =
            Logger.getLogger(LoggingAspect.class.getName());
    // step 3.  USE AN ADVICE ANNOTATION TO TELL SPRING WHEN AND WHICH METHOD CALLS TO INTERCEPT
    // AspectJ pointcut language
    @Around("execution(* chapter6.demo3..*Service.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        /*
        1. Obtains the name and parameters of the intercepted method
         */
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        //======================//

        /*
        2. Logs the name and parameters of the intercepted method
         */
        logger.info("Method " + methodName +
                " with parameters " + Arrays.asList(args).toString() +
                " will execute");
        // ======================= //

        Object returnedByMethod = joinPoint.proceed();
        logger.info("Method executed");
        return returnedByMethod;
//        return joinPoint.proceed();
    }
}

