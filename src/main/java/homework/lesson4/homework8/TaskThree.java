package homework.lesson4.homework8;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println(
                "Write 4 programs called TriangularPatternX (X = A, B, C, D) that prompts user for the size (a non-negative integer in int); and prints each of the patterns as shown on picture below");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a size for triangules: ");
        int size = scanner.nextInt();

        TriangularPatternA(size);
        TriangularPatternB(size);
        TriangularPatternC(size);
        TriangularPatternD(size);

        scanner.close();
    }

    private static void TriangularPatternA(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.println("*".repeat(i));
        }
    }

    private static void TriangularPatternB(int size) {
        for (; size > 0; size--) {
            System.out.println("*".repeat(size));
        }
    }

    private static void TriangularPatternC(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(" ".repeat(i) + "*".repeat(size - i));
        }
    }

    private static void TriangularPatternD(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.println(" ".repeat(size - i) + "*".repeat(i));
        }
    }
}
