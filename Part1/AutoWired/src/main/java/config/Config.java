package config;

import entity.WashingMachine;
import entity.XiaoMing;
import type.Machine;
import type.People;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {WashingMachine.class, XiaoMing.class})
public class Config {
}
