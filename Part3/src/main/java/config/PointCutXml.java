package config;

import org.aspectj.lang.ProceedingJoinPoint;

public class PointCutXml {
    public void start(){
        System.out.println("start ... ");
    }

    public void end(){
        System.out.println("end ... ");
    }

    public void around(ProceedingJoinPoint point){
        System.out.println("around start ...");
        long start = System.currentTimeMillis();
        try {
            point.proceed();
            System.out.println("around end ...");
            System.out.println("花费时间"+ (System.currentTimeMillis() - start) +"毫秒");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("around error");
        }
    }
}
