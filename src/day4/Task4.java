package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));
        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 2; i < array.length; i++) {
            int sum = array[i-2]+array[i-1]+array[i];
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i-2;
            }
        }
        System.out.println(maxIndex);

    }
}
