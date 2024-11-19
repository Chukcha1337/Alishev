package day4;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[100];
        int max = 0;
        int min = 10000;
        int counterOfTens = 0;
        int sumOfTens = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }

        for (int i : array) {
        if (i > max)
            max = i;
        }
        for (int i : array) {
            if (i < min)
                min = i;
        }
        for (int i : array) {
            if (i % 10 == 0) {
                counterOfTens++;
                sumOfTens += i;
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sumOfTens);
        System.out.println(counterOfTens);

    }
}
