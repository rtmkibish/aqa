package hillel.lesson5;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int)(Math.random() * 100) + 1;
        // boolean isGuessed = false;
        System.err.println("Guess the number");
        int number;
        while(true) {
            System.out.print("Give me a number: ");
            number = scanner.nextInt();
            if (number > random) {
                System.out.println("Less");
            } else  if (number < random) {
                System.out.println("Grater");
            } else {
                System.out.println("Congrats it is: " + random);
                break;
            }
        }
    }
}
