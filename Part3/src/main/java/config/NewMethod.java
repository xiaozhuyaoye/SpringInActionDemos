package config;

import entity.People;
import entity.ShoppingGuide;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NewMethod {
    @DeclareParents(value = "entity.Machine+",defaultImpl = ShoppingGuide.class)
    public People people;
}
