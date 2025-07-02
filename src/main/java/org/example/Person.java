package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    double size;
    int id;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String gender, double size, int id) {
        this(firstName,lastName,age);
        this.gender = gender;
        this.size = size;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public boolean isTeen(){
        if(this.age<19 && this.age>13){
            return true;
        }
        return false;
    }
}
