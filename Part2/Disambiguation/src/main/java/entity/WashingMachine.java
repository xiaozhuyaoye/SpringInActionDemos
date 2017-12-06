package entity;

import machine.Machine;
import org.springframework.stereotype.Component;
import tag.Cloths;
import tag.Housework;

@Component
@Cloths
@Housework
public class WashingMachine implements Machine{
    public void work() {
        System.out.println("I can wash");
    }
}
