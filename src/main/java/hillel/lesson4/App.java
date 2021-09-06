package hillel.lesson4;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        quarterNumber();
    }

    private static void luckyTicket() {
        System.out.print("input a train ticket: ");
        int tramTicketId = scanner.nextInt();
        int lastDigit = tramTicketId % 10;
        int secondFromEndDigit = (tramTicketId % 100 - lastDigit) / 10;
        int thirdFromEndDigit = ((tramTicketId % 1000) - (tramTicketId % 100)) / 100;

        int firstDigit = tramTicketId / 100000;
        int secondDigit = (tramTicketId / 10000) % 10;
        int thirdDigit = (tramTicketId / 1000) % 10;

        if ((firstDigit + secondDigit + thirdDigit) == (thirdFromEndDigit + secondFromEndDigit + lastDigit)) {
            System.out.println("You are lucky one!");
        } else {
            System.out.println("Better luck next time!");
        }
    }

    private static void quarterNumber() {
        System.out.print("input x: ");
        int x = scanner.nextInt();
        System.out.print("input y: ");
        int y = scanner.nextInt();

        if (x <= 0 && y > 0) {
            System.out.println("First");
        } else if (x > 0 && y >= 0) {
            System.out.println("Second");
        } else if (x < 0 && y <= 0) {
            System.out.println("Third");
        } else if (x >= 0 && y < 0) {
            System.out.println("Fourth");
        } else {
            System.out.println("Zero");
        }
    }
}
