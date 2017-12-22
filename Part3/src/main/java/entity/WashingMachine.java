package entity;

import org.springframework.stereotype.Component;

@Component()
public class WashingMachine extends Machine {
    @Override
    public void work() {
        System.out.println("washing clothes ...");
    }
}
