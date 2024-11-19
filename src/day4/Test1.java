package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {

    private static void moreThan (int max, int[] array){
        int counter = 0;
        for (int i: array) {
            if (i > max)
                counter++;
        }
        System.out.println("Количество чисел больше " + max + ": " + counter);
    }
    private static void countingOddsOrEven (int[] array){
        int counterOdds = 0;
        int counterEvens = 0;
        for (int i: array) {
            if (i % 2 == 0)
                counterOdds++;
            else counterEvens++;
        }
        System.out.println("Количество четных чисел: " + counterEvens);
        System.out.println("Количество четных чисел: " + counterOdds);
    }
    private static int sum (int[] array){
        int sum = 0;
        for (int i: array) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int [] array = new int[sc.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        moreThan(8, array);
        moreThan(1, array);
        countingOddsOrEven(array);
        System.out.println("Сумма всех чисел в массиве: " + sum(array));


    }
}
