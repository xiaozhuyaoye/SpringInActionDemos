package entity;

import org.springframework.stereotype.Component;
import type.Machine;

@Component
public class WashingMachine implements Machine {
    public void work() {
        System.out.println("Start washing clothes ......");
    }
}
