package day8;

public class Task1_2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            s.append(i + " ");
        }
        System.out.println(s);

        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);
    }
}
