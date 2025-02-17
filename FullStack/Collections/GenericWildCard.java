package org.studyeasy;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
    private int id;

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                '}';
    }

    public Vehicle(int id) {
        this.id = id;
    }
}
class Car extends Vehicle{
    private String model;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

    public Car(int id, String model) {
        super(id);
        this.model = model;
    }
}
public class GenericWildCard {
    public static void main(String[] args) {
        List<Vehicle> list =new ArrayList<>();
        list.add(new Vehicle(1));
        list.add(new Vehicle(2));
        list.add(new Vehicle(3));
        list.add(new Vehicle(4));
        list.add(new Car(5,"D57"));
        System.out.println(list);
        GenericWildCard.display(list);
    }
   // public static void display(List<? super Vehicle> list){   -> can be vehicle class or parent of vehicle class (inner bound)
   // public static void display(List<? extends Vehicle> list){   -> it is only from vehicle class (upper bound)
    public static void display(List<? extends Vehicle> list){
        for(Object data:list){
            System.out.println(data);
        }
    }
}
