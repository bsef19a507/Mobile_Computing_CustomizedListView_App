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

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getStudentId() {
        return studentId;
    }

//    public void setStudentId(String studentId) {
//        this.studentId = studentId;
//    }

    public String getSection() {
        return section;
    }

//    public void setSection(String section) {
//        this.section = section;
//    }

    public String getDegree() {
        return degree;
    }

//    public void setDegree(String degree) {
//        this.degree = degree;
//    }

    public int getImageID() {
        return imageID;
    }

//    public void setImageID(int imageID) {
//        this.imageID = imageID;
//    }
}
