package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import type.Machine;
import type.People;

@Component
public class XiaoMing implements People {
    private Machine washingMachine;

    @Autowired
    public void setWashingMachine(Machine washingMachine) {
        this.washingMachine = washingMachine;
    }

    public void work() {
        washingMachine.work();
    }
}
