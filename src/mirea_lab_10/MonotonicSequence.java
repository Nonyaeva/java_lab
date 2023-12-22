package mirea_lab_10;
//1.Дана монотонная последовательность, в которой каждое натуральное
//число k встречается ровно k раз: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4,...


import java.util.Scanner;

public class MonotonicSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        printMonotonicSequence(n);
    }

    public static void printMonotonicSequence(int n) {
        printMonotonicSequence1(n, 1);
    }

    public static void printMonotonicSequence1(int n, int num) {
        if (n == 0) {
            return;
        }

        for (int i = 0; i < num; i++) {
            System.out.print(num + " ");
            n--;
            if (n == 0) {
                return;
            }
        }

        printMonotonicSequence1(n, num + 1);
    }
}
