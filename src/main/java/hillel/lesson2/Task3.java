package hillel.lesson2;

import java.util.Scanner;

public class Task3 {
    public static void printUserTriangleArea() {
        Scanner scaner = new Scanner(System.in);
        double a = scaner.nextDouble();
        double b = scaner.nextDouble();
        double alpha = scaner.nextDouble();
        System.out.println("The tringle area: " + a * b * Math.sin(alpha)/2);
        scaner.close();
    }
}
