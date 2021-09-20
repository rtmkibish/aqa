package homework.lesson4.homework8;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        System.out.println(
                "Write a program to extract each digit from a double, in the reverse order. For example, if the double is 2522.43034, the output shall be \" 4 3 0 3 4 . 2 2 5 2\", with a space separating the digits.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a floating point number: ");
        double number = scanner.nextDouble();
        String stringifiedNumber = String.valueOf(number);
        String reversedStringifiedNumber = "";
        for (int i = stringifiedNumber.length() - 1; i >= 0; i--) {
            reversedStringifiedNumber += stringifiedNumber.charAt(i) + " ";
        }
        System.out.println(reversedStringifiedNumber);

        scanner.close();
    }
}
