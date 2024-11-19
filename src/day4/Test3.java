package day4;

import java.util.Arrays;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] array = new int[12][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(50);
            }
        }
        int index = 0;
        int maxFinal = 0;
        for (int i = 0 ; i < array.length ; i++) {
            int max = 0;
            for (int j = 0 ; j < array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
                max += array[i][j];
            }
            System.out.println();
            if (max > maxFinal) {
                maxFinal = max;
                index = i;
            }
        }
        System.out.println(index);
    }
}
