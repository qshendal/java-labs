package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Task5EvenCount {
    public static void main(String[] args) {
        Path path = Paths.get("f.txt");

        try {
            List<String> numbers = Arrays.asList("10", "15", "22", "33", "40", "7", "8", "19", "20", "25");
            Files.write(path, numbers);
            System.out.println("Числа в файле 'f.txt': " + numbers);

            List<String> lines = Files.readAllLines(path);
            int evenCount = 0;

            for (String line : lines) {
                int num = Integer.parseInt(line);
                if (num % 2 == 0) {
                    evenCount++;
                }
            }

            System.out.println("Количество чётных значений в файле: " + evenCount);

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
