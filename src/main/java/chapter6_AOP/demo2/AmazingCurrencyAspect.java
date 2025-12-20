package chapter6_AOP.demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class AmazingCurrencyAspect {

    @Pointcut("this(chapter6_AOP.demo2.AmazingCurrencyService)")
    public void thisPointCut() {}

    @Pointcut("target(chapter6_AOP.demo2.AmazingCurrencyService)")
    public void targetPointCut() {}

    @Before("thisPointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("%s.%s invoke the method with %s".formatted(
                joinPoint.getTarget().getClass().getName(),
                joinPoint.getSignature().getName(),
                Arrays.toString(joinPoint.getArgs())
        ));
    }
}
