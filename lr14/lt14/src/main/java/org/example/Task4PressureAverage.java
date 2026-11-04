package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4PressureAverage {
    public static void main(String[] args) {
        Path path = Paths.get("pressure.txt");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите 15 значений атмосферного давления (например, 760.5):");
            List<String> pressureList = new ArrayList<>();
            for (int i = 1; i <= 15; i++) {
                System.out.print("Давление " + i + ": ");
                pressureList.add(scanner.nextLine());
            }
            Files.write(path, pressureList);

            List<String> lines = Files.readAllLines(path);
            double sum = 0;
            for (String line : lines) {
                sum += Double.parseDouble(line);
            }

            double average = sum / lines.size();
            System.out.printf("\nСреднее атмосферное давление: %.2f мм рт. ст.\n", average);

        } catch (IOException e) {
            System.out.println("Ошибка файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено некорректное вещественное число.");
        }
    }
}