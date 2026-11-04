package org.example;

public class Vehicle {
    private String name;
    private String id;
    private int speed;

    public Vehicle(String name, String id, int speed){
        this.name = name;
        this.id = id;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString(){
        return "Название: " + getName() + " id: " + getId() + " скорость: " + getSpeed();
    }
}
