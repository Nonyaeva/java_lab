package mirea_lab_2;

public class second11 {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 66, 25, 40};
        int sum = 0;
        int i = 0;
        while (i <numbers.length) {
            System.out.println();
            sum += numbers[i];
            i++;
        }
        System.out.println("Сумма: " + sum);
    }
}
