package mirea_lab_2;

public class second1 {
    public static void main(String[] args){
        int[] numbers = {4, 5, 66, 25, 40};
        int sum = 0;
        for (int i = 0; i <numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Сумма: "+sum);
    }
}
