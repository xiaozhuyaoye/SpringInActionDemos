package entity;

import machine.Machine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import tag.Cloths;
import tag.Housework;

@Component
//@Qualifier("floor")
//@Primary
@Cloths
@Housework
public class SweepingRobot implements Machine{
    public void work() {
        System.out.println("I can sweep the floor");
    }
}
