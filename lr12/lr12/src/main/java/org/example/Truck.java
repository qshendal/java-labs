package org.example;

public class Truck extends Vehicle{
    private double capacity;

    public double getCapacity() {
        return capacity;
    }

    public Truck(String name, String id, int speed, double capacity){
        super(name, id, speed);
        this.capacity = capacity;
    }

    @Override
    public String toString(){
        return "Название: " + getName() + " id: " + getId() + " скорость: " + getSpeed() + " расход: " + getCapacity();
    }
}