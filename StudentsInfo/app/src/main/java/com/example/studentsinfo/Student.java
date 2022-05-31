package com.example.studentsinfo;

public class Student {
    public String name;
    public String studentId;
    public String section;
    public String degree;
    public int imageID;

    public Student(String name, String studentId, String section, String degree, int imageID) {
        this.name = name;
        this.studentId = studentId;
        this.section = section;
        this.degree = degree;
        this.imageID = imageID;
    }
}
