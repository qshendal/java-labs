package org.example;

public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String name, String id, int speed, boolean hasSider){
        super(name, id, speed);
        this.hasSidecar = hasSider;
    }

    @Override
    public String toString(){
        return "Название: " + getName() + " id: " + getId() + " скорость: " + getSpeed() + " расход: " + hasSidecar;
    }
}