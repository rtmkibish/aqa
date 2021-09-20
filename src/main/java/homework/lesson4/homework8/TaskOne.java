package homework.lesson4.homework8;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(
                "Write a program to compute the value of Eiler number, using the following series expansion. Use the maximum denominator as the terminating condition.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the max denominator: ");
        int maxDenominator = scanner.nextInt();
        System.out.println(getElierNumber(maxDenominator));

        scanner.close();
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static double getElierNumber(int maxDenominator) {
        double elierNumber = 0;
        for (int i = 0; i < maxDenominator; i++) {
            long iFactorial = factorial(i);
            elierNumber += (double) 1 / iFactorial;
        }
        return elierNumber;
    }
}
