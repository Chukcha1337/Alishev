package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public static int getMaxStamina() {
        return MAX_STAMINA;
    }

    public int getStamina() {
        return stamina;
    }

    public static void info() {
        if (countPlayers < 6)
            System.out.println("Команды неполные. На поле еще " + (6 - countPlayers) + " свободных мест");
        else
            System.out.println("На поле нет свободных мест");
    }

    Random rand = new Random();

    public Player() {
        this.stamina = rand.nextInt(11) + 90;
        if (countPlayers < 6)
            countPlayers++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == MIN_STAMINA)
            return;

        stamina--;

        if (this.stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

}
