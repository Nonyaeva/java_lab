package mirea_lab_2;
import java.util.Random;
public class pppp {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numbers = new int[11];
        for (int i = 0; i < numbers.length; i++) { //заполнение массива случайными числами
            numbers[i] = rnd.nextInt(20);
            System.out.print(numbers[i] + " ");
        }
        for (int i = numbers.length - 1; i > 0; i--) { //сортировка
            for (int g = 0; g < i; g++) {
                if (numbers[g] > numbers[g + 1]) {
                    int tmp = numbers[g];
                    numbers[g] = numbers[g + 1];
                    numbers[g + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) { //вывод сортрованного массива
            System.out.print(numbers[i] + " ");

        }


    }
}
