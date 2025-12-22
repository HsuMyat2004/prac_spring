package chapter6_AOP.demo4.without_interface;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyTestServiceAspect {
    @Pointcut("bean(myCurrencyTest)")
    public void targetPointCut(){}

    @Before("targetPointCut()")
    public void before(JoinPoint joinPoint){
        System.out.println("%s.%s method invoked with %s args"
                .formatted(joinPoint.getTarget().getClass().getSimpleName(),
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs())));
    }
}
