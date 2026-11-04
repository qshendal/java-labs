package org.example;

public class Student {
    private String name;
    private int age;
    private int grade;
    private String group;

    public Student(String name, int age, int grade, String group) {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidStudentDataException("Имя студента не может быть пустым.");
        }
        if (age < 16 || age > 60) {
            throw new InvalidStudentDataException("Возраст должен быть в диапазоне от 16 до 60. Передано: " + age);
        }
        if (grade < 1 || grade > 5) {
            throw new InvalidStudentDataException("Оценка должна быть в диапазоне от 1 до 5. Передано: " + grade);
        }

        this.name = name;
        this.age = age;
        this.grade = grade;
        this.group = group;
    }

    public void updateGrade(int newGrade) {
        if (newGrade < 1 || newGrade > 5) {
            throw new GradeUpdateException("Невозможно обновить оценку: новое значение " + newGrade + " вне диапазона 1-5.");
        }
        this.grade = newGrade;
    }

    public void promote() {
        if (this.grade >= 5) {
            throw new GradeUpdateException("Студент " + name + " уже имеет максимальную оценку/курс (5) и не может быть переведен дальше.");
        }
        this.grade++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + ", group='" + group + "'}";
    }
}
