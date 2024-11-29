package example.main;

import example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example1 {

    public static void main(String[] args) {


        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle name from " + "Spring Context is: " + vehicle.getName());





    }
}
