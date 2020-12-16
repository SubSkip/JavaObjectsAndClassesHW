package com.pkg;
/*
\.java 
Create a Custom Class (anything you want - car, phone, holiday, etc.). 
Requirements: Minimum 3 private instance variables 
An empty constructor 
A constructor that uses only 2 of your 3 variables 
A constructor that uses all 3 of your instance variables 
Get methods for all 3 of your instance variables 
Set methods for all 3 of your instance variables 
A method that returns a Boolean 
A method that returns a String For example, if I created a Santa Custom Class, my code would look something like the attached Santa.java file. 
Submit a link to your GitHub repository
*/

public class Car {

    private String color;
    private int NumberOfDoors;
    private String EngineType;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return this.NumberOfDoors;
    }

    public void setNumberOfDoors(int NumberOfDoors) {
        this.NumberOfDoors = NumberOfDoors;
    }

    public String getEngineType() {
        return this.EngineType;
    }

    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    // no-arg constructor
    public Car() {
        color = "grey";
        NumberOfDoors = 5;
    }

    // constructor with two arguments
    public Car(String color, int doors) {
        this.color = color;
        this.NumberOfDoors = doors;
    }

    // constructor with three arguments
    public Car(String color, int doors, String engine) {
        this.color = color;
        this.NumberOfDoors = 4;
        this.EngineType = "4-cyl";
    }

    // Other methods remain as they were

    public void start() {
        System.out.println("Car starting");
    }

    public void stop() {
        System.out.println("Car stopping");
    }

    public void drive() {
        System.out.println("Car driving");
    }

    public boolean isHatchback() {
        if (NumberOfDoors > 4) {
            return true;
        }
        return false;
    }
}
