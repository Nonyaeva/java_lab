package mirea_lab_2;

import java.util.Random;

public class second4 {
    public static void main(String[] args){
        int[] numb = new int[10];
        Random random = new Random();

        for (int i = 0; i < numb.length; i++){
            numb[i] = random.nextInt(10);
        }
        printArray(numb);
        SelectionSort(numb);
        printArray(numb);
    }

    public static void printArray (int[] array){
        for (int j = 0; j< array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println("");
    }
    public static void SelectionSort (int[] array){
        for (int j = 0; j < array.length; j++){
            int min = array[j];
            int min_j = j;
            for(int k = j+1; k < array.length; k++){
                if(array[k] < min){
                    min = array[k];
                    min_j = k;
                }
            }
            if (j != min_j){
                int tmp = array[j];
                array[j] = array[min_j];
                array[min_j] = tmp;
            }
        }
    }
}

