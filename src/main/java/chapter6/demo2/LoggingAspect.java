package chapter6.demo2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

// step 2. Defining an aspect class
@Aspect // aspect itself is not the bean // u only told that " Spring that the class implements the definition of an aspect"
public class LoggingAspect {

    // step 3.  USE AN ADVICE ANNOTATION TO TELL SPRING WHEN AND WHICH METHOD CALLS TO INTERCEPT
   // AspectJ pointcut language
    @Around("execution(* chapter6.demo2.*.*(..))") //Defines which are the intercepted methods
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed(); //Delegates to the actual intercepted method
    }
}
