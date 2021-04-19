package com.inherit;

public class Run {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.setName("Jack");
        dog.setAge(100);
        System.out.println(animal.getName() + dog.getAge());
    }

}
