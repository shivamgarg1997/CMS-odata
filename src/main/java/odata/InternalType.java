package odata;

import model.Professor;

public enum InternalType {
    COURSE("Course"),
    DEPARTMENT("Department"),
    PROFESSOR("Professor"),
    STUDENT("Student");

    private final String name;

    InternalType(String name) {
        this.name = name;
    }
}
