package bean;

import org.springframework.stereotype.Component;

@Component
public class BeanOne {
    public BeanOne() {
        System.out.println("Bean One Instantiated");
    }
}
