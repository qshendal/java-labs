package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2MaxNumber {
    public static void main(String[] args) {
        Path path = Paths.get("f.txt");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите 10 целых чисел:");
            List<String> numbersList = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                System.out.print("Число " + i + ": ");
                numbersList.add(scanner.nextLine());
            }
            Files.write(path, numbersList);

            List<String> lines = Files.readAllLines(path);
            System.out.println("\nЧисла из файла и поиск максимума:");

            int max = Integer.parseInt(lines.get(0));
            System.out.print("Прочитано: ");

            for (int i = 0; i < lines.size(); i++) {
                int num = Integer.parseInt(lines.get(i));
                System.out.print(num + "; ");
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("\n\nМаксимальное значение: " + max);

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не целое число.");
        }
    }
}