package entity;

import machine.Machine;
import org.springframework.stereotype.Component;

@Component
public class AirConditioning implements Machine{
    public void work() {
        System.out.println("I can drop temperature");
    }
}
