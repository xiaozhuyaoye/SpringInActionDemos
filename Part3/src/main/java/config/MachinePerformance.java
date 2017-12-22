package config;

import org.aspectj.lang.annotation.*;

@Aspect
public class MachinePerformance {
    @Pointcut("execution(* entity.*.*(..)) && !bean(washingMachine)")
    public void myPointCut(){}

    @Before("myPointCut()")
    //@Before("@within(org.springframework.context.annotation.Primary)")
    public void start(){
        System.out.println("机器开始工作");
    }

    @After("myPointCut()")
    public void end(){
        System.out.println("机器结束工作");
    }

    @AfterReturning("execution(* entity.*.*(..))")
    public void endReturn(){
        System.out.println("机器结束工作(成功)");
    }

    @AfterThrowing("execution(* entity.*.*(..))")
    public void endExcept(){
        System.out.println("机器结束工作(失败)");
    }
}
