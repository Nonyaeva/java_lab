package mirea_lab_10;
// 17.Дана последовательность натуральных чисел (одно число в строке),
//завершающаяся числом 0. Определите наибольшее значение числа в этой
//последовательности.
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int MaxNumber = 0;
        System.out.print("Введите последовательность:");

        int MaxNumber = findMaxNumber(scanner);

        System.out.println("Наибольшее число: " + MaxNumber);
    }

    public static int findMaxNumber(Scanner scanner) {
        int number = scanner.nextInt();

        if (number == 0) {
            return 0;
        }

        int MaxNumber = findMaxNumber(scanner);

        if (number > MaxNumber) {
            return number;
        }
        else {
            return MaxNumber;
        }
    }
}



