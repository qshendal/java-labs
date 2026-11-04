package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3SplitNumbers {
    public static void main(String[] args) {
        Path fileF = Paths.get("f.txt");
        Path fileG = Paths.get("g.txt");
        Path fileH = Paths.get("h.txt");
        Random random = new Random();

        try {
            List<String> numbersF = new ArrayList<>();
            System.out.println("Сгенерированные числа в файле 'f':");
            for (int i = 0; i < 15; i++) {
                int num = random.nextInt(61) - 30;
                numbersF.add(String.valueOf(num));
                System.out.print(num + " ");
            }
            System.out.println();
            Files.write(fileF, numbersF);

            List<String> lines = Files.readAllLines(fileF);
            List<String> positives = new ArrayList<>();
            List<String> negatives = new ArrayList<>();

            for (String line : lines) {
                int num = Integer.parseInt(line);
                if (num > 0) {
                    positives.add(line);
                } else if (num < 0) {
                    negatives.add(line);
                }
            }

            Files.write(fileG, positives);
            Files.write(fileH, negatives);

            System.out.println("\nПоложительные записаны в 'g.txt', отрицательные — в 'h.txt'.");
            System.out.println("Положительные: " + positives);
            System.out.println("Отрицательные: " + negatives);

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}
