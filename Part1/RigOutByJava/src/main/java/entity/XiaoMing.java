package entity;

import type.Machine;
import type.People;

public class XiaoMing implements People {
    private Machine washingMachine;

    public XiaoMing(){

    }

    public XiaoMing(Machine machine){
        this.washingMachine = machine;
    }

    public void setWashingMachine(Machine washingMachine) {
        this.washingMachine = washingMachine;
    }

    public void work() {
        washingMachine.work();
    }
}
