package homework.lesson4.homework8;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        System.out.println("Write a program called Tribonacci to print Tribonacci numbers");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Tribonachi sequance size: ");
        int size = scanner.nextInt();
        getTribonachiSequence(size);

        scanner.close();
    }

    private static void getTribonachiSequence(int sequenceLength) {
        int[] result = new int[sequenceLength];

        for (int i = 0; i < sequenceLength; i++) {
            if (i == 0) {
                result[i] = 0;
            } else if (i < 3) {
                result[i] = 1;
            } else {
                result[i] = result[i - 1] + result[i - 2] + result[i - 3];
            }
            System.out.print(result[i] + ", ");
        }
        System.out.println();
    }
}
