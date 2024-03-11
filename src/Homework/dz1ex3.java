package Homework;

public class dz1ex3 {
    public static void main(String[] args) {
        Person person = new Person("Alex", 20);
        Car car = new Car("BMW", "X7");
        Animal animal = new Animal("Cat", "Main Coon");
            Object[] objects = {person, car, animal};
            for (Object obj : objects) {
                if (obj instanceof Person) {
                System.out.println("Person: " + obj.toString());
                } else if (obj instanceof Car) {
                System.out.println("Car: " + obj.toString());
                } else if (obj instanceof Animal) {
                System.out.println("Animal: " + obj.toString());
                }
            }
        }
    }
        class Person {
    private String name;
            private int age;
            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
            @Override
            public String toString() {
                return "Name: " + name + ", Age: " + age;
            }
        }
        class Car {
    private String make;
    private String model;
            public Car(String make, String model) {
                this.make = make;
                this.model = model;
            }
            @Override
            public String toString() {
                return "Make: " + make + ", Model: " + model;
            }
}
        class Animal {
            private String type;
            private String breed;

            public Animal(String type, String breed) {
                this.type = type;
                this.breed = breed;
            }
            @Override
            public String toString() {
                return "Type: " + type + ", Breed: " + breed;
    }
}
