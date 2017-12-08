package config;

import entity.WashingMachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:info/WashingMachineInfo.properties",encoding = "GBK")
public class Config {
    @Autowired
    private Environment env;

    @Bean
    public WashingMachine washingMachine(){
        return new WashingMachine(env.getProperty("brand"),env.getProperty("price",Double.class));
    }
}
