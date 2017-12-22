package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MachineAroundPerformance {
    @Around("execution(* entity.WashingMachine.*(..))")
    public void around(ProceedingJoinPoint point){
        try {
            System.out.println("start work ...");
            long startTime = System.currentTimeMillis();
            point.proceed();
            System.out.println("end work ...");
            long endTime = System.currentTimeMillis();
            System.out.println("执行了"+ (endTime - startTime) + "毫秒");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常");
        }
    }
}
