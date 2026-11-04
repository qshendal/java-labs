package org.example;

public class StudentNotFoundException extends RuntimeException {
    private final String studentIdentifier;

    public StudentNotFoundException(String studentIdentifier, String message) {
        super(message);
        this.studentIdentifier = studentIdentifier;
    }

    public String getStudentIdentifier() {
        return studentIdentifier;
    }
}
