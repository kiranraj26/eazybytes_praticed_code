package example.main;

import example.beans.Vehicle;
import example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        Vehicle veh1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());




    }
}
