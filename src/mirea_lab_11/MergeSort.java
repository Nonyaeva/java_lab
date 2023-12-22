package mirea_lab_11;
import java.util.*;

public class MergeSort {


    public static void mergeSort(List<Student> arr, int start, int end) {
        if (start != end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(List<Student> arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;

        Student[] temp = new Student[end - start + 1];

        while ((i <= mid) && (j <= end)) {
            if (arr.get(i).getGPA() < arr.get(j).getGPA())
                temp[k++] = arr.get(i++);
            else
                temp[k++] = arr.get(j++);
        }

        while (i <= mid) {
            temp[k++] = arr.get(i++);
        }

        while (j <= end) {
            temp[k++] = arr.get(j++);
        }

        for (i = start; i <= end; i++) {
            arr.remove(i);
            Student e = temp[i - start];
            arr.add(i, e);
        }
    }

    public static void main(String[] args) {

        List<Student> arr1 = new ArrayList<Student>();
        List<Student> arr2 = new ArrayList<Student>();

        //for (int i = 0; i < 100; i++) {
        arr1.add(new Student("Катя", 1234, 4.3));
        arr1.add(new Student("Петя", 5678, 5));

        //}
        //for (int i = 0; i < 100; i++) {
        arr2.add(new Student("Lana", 5677, 2));
        arr2.add(new Student("Зина", 5678, 3));

        //}
        List<Student> finale = new ArrayList<Student>();

        finale.addAll(arr1);
        finale.addAll(arr2);

        mergeSort(finale, 0, finale.size() - 1);

        for (int i = 0; i < finale.size(); i++) {
            System.out.println(finale.get(i).getGPA() + " " + finale.get(i).getName()+ " " +finale.get(i).getIDNumber());
        }
    }
}         