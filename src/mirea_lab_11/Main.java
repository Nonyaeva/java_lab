package mirea_lab_11;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("John", 12345, 3.8);
        students[1] = new Student("Alice", 54321, 3.5);
        students[2] = new Student("Bob", 98765, 4.0);
        students[3] = new Student("Emily", 67890, 3.9);
        students[4] = new Student("David", 13579, 3.7);

        // Сортировка массива по iDNumber с использованием алгоритма сортировки вставками
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }

        System.out.println("Sorted by iDNumber:");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getIDNumber());
        }

        // Создание объекта SortingStudentsByGPA
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();

        // Сортировка массива по GPA с использованием алгоритма быстрой сортировки
        Arrays.sort(students, sortingStudentsByGPA);

        System.out.println("\nSorted by GPA:");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getGPA());
        }
    }
}
