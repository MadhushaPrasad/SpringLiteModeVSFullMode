package main;

import bean.BeanTwo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
//@ComponentScans({
//        @ComponentScan(basePackages = "bean"),
//        @ComponentScan(basePackageClasses = {BeanOne.class})
//})
public class AppConfig {

    //Full Mode
    public BeanTwo btwo() {
        //interbean dependancies
        //satisfy interbean dependancies
        //manage lifecycle of bthree1 and bthree2

        return new BeanTwo();
    }

}