package hillel.lesson3;

import java.util.Scanner;

public class Task {
    private Scanner scanner = new Scanner(System.in);

    public void firstTask() {
        int in;
        System.out.print("Input a number: ");
        in = scanner.nextInt();
        if (in > 0) {
            System.out.println("Positive");
        } else if (in == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}
