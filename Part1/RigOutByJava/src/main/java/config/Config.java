package config;

import entity.WashingMachine;
import entity.XiaoMing;
import org.springframework.context.annotation.Bean;

public class Config {
    @Bean
    public WashingMachine washingMachine(){
        return new WashingMachine();
    }

    /*@Bean
    public XiaoMing xiaoMing(){
        return new XiaoMing(washingMachine());
    }*/

    /*@Bean
    public XiaoMing xiaoMing(WashingMachine washingMachine){
        return new XiaoMing(washingMachine);
    }*/

    @Bean
    public XiaoMing xiaoMing(WashingMachine washingMachine){
        XiaoMing xiaoMing = new XiaoMing();
        xiaoMing.setWashingMachine(washingMachine);
        return xiaoMing;
    }
}
