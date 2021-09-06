package hillel.lesson4;

public class App {
    public static void main(String[] args) {
        sumOfSquaresOneToHundred();
    }

    public static void sumAndAverOneToHundred() {
        // Write a program to produce the sum of 1, 2, 3, ..., to 100.
        // Store 1 and 100 in variables lowerbound and upperbound, so that we can change
        // their values easily.
        // Also compute and display the average. The output shall look like:
        // The sum of 1 to 100 is 5050
        // The average is 50.5
        int start = 1;
        int end = 100;
        int sum = 0;

        for (; start <= end; start++) {
            sum += start;
        }
        System.err.println(sum);
        System.out.println((double)sum / end);
    }

    public static void sumOfSquaresOneToHundred() {
        // Modify the program to find the "sum of the squares" of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.

        int start = 1;
        int end = 100;
        int sum = 0;

        for (; start <= end; start++) {
            sum += start * start;
        }
        System.err.println(sum);
        System.out.println((double)sum / end);
    }
}
