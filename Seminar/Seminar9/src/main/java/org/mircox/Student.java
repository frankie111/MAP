package org.mircox;

public class Student {
    private String name;
    private String university;

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}