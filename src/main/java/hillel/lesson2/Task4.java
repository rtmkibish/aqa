package hillel.lesson2;

import java.util.Scanner;

public class Task4 {
    public static void printDecToHex() {
        Scanner scanner = new Scanner(System.in);
        int decNumber = scanner.nextInt();
        String hexResult = Integer.toHexString(decNumber);
        System.out.println(hexResult);
    }
}
