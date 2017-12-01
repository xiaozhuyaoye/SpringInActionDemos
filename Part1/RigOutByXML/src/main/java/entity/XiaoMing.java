package entity;

import type.Machine;
import type.People;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class XiaoMing implements People {
    private Machine washingMachine;

    private String str;
    private List list;
    private Set set;
    private Map map;
    private Properties properties;

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

    public void setStr(String str) {
        this.str = str;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void show(){
        System.out.println("str：" + str);
        System.out.println("list.size：" + list.size());
        System.out.println("set.size：" + set.size());
        System.out.println("map.size：" + map.size());
        System.out.println("properties.size：" + properties.size());

    }
}
