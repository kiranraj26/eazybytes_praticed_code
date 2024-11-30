package example.beans;


import org.springframework.stereotype.Component;


public class Vehicle {

    public Vehicle(){
        System.out.println("Vechile bean is created by spring");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    public void printHello(){
        System.out.println("Print from vechile bean");
    }



}