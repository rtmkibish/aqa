package hillel.lesson2;

import java.util.Random;

public class Task7 {
    public static void printRandomResult() {
        Random random = new Random();
        int randomint = random.nextInt(1000) + 1;
        System.out.println(randomint);
    }
}
