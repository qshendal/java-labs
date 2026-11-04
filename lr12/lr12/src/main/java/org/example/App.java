package org.example;

import java.util.*;

public class App
{
    public static void printEmployees(List<Employee> employees, int level){
        System.out.println("Сотрудники на уровне: " + level);

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if(emp.getLevel() == level){
                System.out.println(emp);
            }
        }
    }
}