package com.inherit;

public class Person {
    String name = "Jack";
    float height = 1.7f;
    int weihgt = 60;
    float bmi;
    public void calculate(){
        bmi = weihgt/(height* height);
    }
    public float getBmi(){
        return bmi;
    }
    public void Student(String name , float height , int weihgt , float bmi){
        this.name = name ;
        this.weihgt = weihgt;
        this.bmi = bmi ;
        this.height = height;

    }
}
