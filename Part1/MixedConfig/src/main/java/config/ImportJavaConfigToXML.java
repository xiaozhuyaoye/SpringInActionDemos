package config;

import entity.WashingMachine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import type.Machine;

@Configuration
public class ImportJavaConfigToXML {
    @Bean
    public Machine washingMachine(){
        return new WashingMachine();
    }
}
