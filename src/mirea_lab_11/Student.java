package mirea_lab_11;

public class Student {
    private int iDNumber;
    private String name;
    private double gpa;

    public Student(String name, int iDNumber, double gpa) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return gpa;
    }
}