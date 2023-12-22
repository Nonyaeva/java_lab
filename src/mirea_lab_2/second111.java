package mirea_lab_2;

public class second111 {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 66, 25, 40};
        int sum = 0;
        int i = 0;
        do {
            sum += numbers[i];
            i++;
        }
        while (i < numbers.length);{
            System.out.println("Сумма: "+  sum);
        }
    }
}
