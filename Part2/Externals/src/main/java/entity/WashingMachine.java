package entity;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Component
public class WashingMachine {


    private String brand;
    private double price;

    public WashingMachine(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void show(){
        System.out.println(brand+"牌洗衣机售价"+price+"元");
    }
}
