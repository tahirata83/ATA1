package day32.example;

class Car {
    public String name;

    public static int count = 0;
}

public class StaticField {
    // how to use static field, attribute
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "bwm";
        car1.count++;
        System.out.println("Car1 name: " + car1.name);
        System.out.println("Car1 count: " + car1.count);

        Car car2 = new Car();
        car2.name = "toyota";
        car2.count++;
        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car2 count: " + car2.count);


        Car car3 = new Car();}}
//        car3.name = "For