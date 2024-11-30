package example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import example.beans.Vehicle;

@Component
public class Person {



    private String name="Lucky";

    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle2")Vehicle vehicle){
        System.out.println("Person bean created by Spring");
        this.vehicle = vehicle;
    }

    /*
    The @Autowired annotation marks on a field, constructor, Setter method
    is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
    by Spring Dependency Injection mechanism
    * */
    /*@Autowired*/




    public String getName() {
        return name;
    }




    public Vehicle getVehicle() {
        return vehicle;
    }
}