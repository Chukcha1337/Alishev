package day8;

public class Task1_1 {


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i <= 20000; i++) {
             s = s + i + " ";
        }
        System.out.println(s);

        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);
    }
}
