package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Task1City {
    public static void main(String[] args) {
        Path path = Paths.get("city.txt");

        try {
            String info = "Город: Минск\n" +
                    "Страна: Беларусь\n" +
                    "Основан в: 1067 году\n" +
                    "Население: около 2 млн человек";
            Files.writeString(path, info);

            System.out.println("Сведения о файле");
            System.out.println("Имя файла: " + path.getFileName());
            System.out.println("Путь: " + path.toAbsolutePath());
            System.out.println("Размер файла: " + Files.size(path) + " байт");
            System.out.println("Файл существует: " + Files.exists(path));

            System.out.println("\nСодержимое файла");
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}