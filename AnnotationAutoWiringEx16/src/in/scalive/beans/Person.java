package in.scalive.beans;

public class Person {

    private String name = "ashish";

    private Car car;

    public Person(Car car) {

        this.car = car;
        System.out.println("person created ....");
    }

    public void display() {

        System.out.println("person name is :" + name);

        if (car == null) {
            System.out.println("person has no car");
        } else {
            System.out.println("persons cars is :" + car.getCarName());
        }
    }
}