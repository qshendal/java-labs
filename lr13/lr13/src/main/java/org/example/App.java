package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try {
            students.add(new Student("Алексей", 19, 4, "IS-21"));
            students.add(new Student("Мария", 18, 3, "IS-21"));
            students.add(new Student("Иван", 20, 5, "IS-22"));
            System.out.println("Студенты успешно добавлены.");
        } catch (InvalidStudentDataException e) {
            System.err.println("Ошибка создания студента: " + e.getMessage());
        }

        System.out.println("\n--- Тест неверных данных ---");
        try {
            Student badStudent = new Student("Петр", 10, 3, "IS-23");
        } catch (InvalidStudentDataException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        System.out.println("\n--- Операции с успеваемостью ---");
        try {
            Student target = findStudentByName(students, "Мария");
            System.out.println("Найден: " + target);

            target.updateGrade(5);
            System.out.println("После обновления оценки: " + target);

            target.promote();
            System.out.println("После перевода (promote): " + target);
        } catch (StudentNotFoundException | GradeUpdateException e) {
            System.err.println("Ошибка операции: " + e.getMessage());
        }

        System.out.println("\n--- Тест поиска несуществующего студента ---");
        try {
            String searchId = "Аркадий";
            Student missing = findStudentByName(students, searchId);
        } catch (StudentNotFoundException e) {
            System.out.println("Поймано исключение! Искомый ID/Имя: [" + e.getStudentIdentifier() + "]. Сообщение: " + e.getMessage());
        }
    }

    public static Student findStudentByName(List<Student> list, String name) {
        for (Student s : list) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        throw new StudentNotFoundException(name, "Студент с именем '" + name + "' не найден в списке.");
    }
}