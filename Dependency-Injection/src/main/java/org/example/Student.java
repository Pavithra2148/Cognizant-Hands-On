package org.example;

public class Student {

    private String name;
    private Address address;

    // Constructor Injection
    public Student(Address address) {
        this.address = address;
    }

    // Setter Injection
    public void setName(String name) {
        this.name = name;
    }

    public void display() {

        System.out.println("Student Name : " + name);
        System.out.println("City         : " + address.getCity());

    }

}