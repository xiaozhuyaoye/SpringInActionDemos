package config;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class HandleParameter {

    //@Before("execution(* entity.Printer.*(String)) && args(info)")
    public void methodWithParam(String info){
        System.out.println("入参："+info);
    }

}
