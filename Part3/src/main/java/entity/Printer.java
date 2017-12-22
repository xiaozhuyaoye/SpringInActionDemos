package entity;

import org.springframework.stereotype.Component;

@Component
public class Printer {
    public void print(String info){
        System.out.println("working ... "+info);
    }
}
