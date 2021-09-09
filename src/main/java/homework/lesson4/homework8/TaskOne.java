package homework.lesson4.homework8;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(getElierNumber(67));
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
