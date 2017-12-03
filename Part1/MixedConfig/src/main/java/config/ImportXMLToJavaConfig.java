package config;

import entity.WashingMachine;
import entity.XiaoMing;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:ImportXMLToJavaConfig.xml")
public class ImportXMLToJavaConfig {
    @Bean
    public XiaoMing xiaoMing(WashingMachine washingMachine){
        return new XiaoMing(washingMachine);
    }
}
