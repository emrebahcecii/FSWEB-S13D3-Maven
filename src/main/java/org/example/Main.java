package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Person p = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + p.getFirstName());
        System.out.println("LastName: " + p.getLastName());
        System.out.println("Age: " + p.getAge());

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}

