package Config;

import entity.WashingMachine;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = WashingMachine.class)
public class Config {

}
