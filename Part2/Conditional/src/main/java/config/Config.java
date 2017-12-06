package config;

import entity.WashingMachine;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = WashingMachine.class)
public class Config {

    /*@Bean
    @Conditional(ExistConditional.class)
    public WashingMachine washingMachine(){
        return new WashingMachine();
    }*/
}
