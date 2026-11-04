package org.example;

public class Car extends Vehicle{
    private int doors;

    public int getDoors() {
        return doors;
    }

    public Car(String name, String id, int speed, int doors){
        super(name, id, speed);
        this.doors = doors;
    }

    @Override
    public String toString(){
        return "Название: " + getName() + " id: " + getId() + " скорость: " + getSpeed() + " количество дверей: " + getDoors();
    }
}
