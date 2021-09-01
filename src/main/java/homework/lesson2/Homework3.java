package homework.lesson2;

import java.util.Scanner;

public class Homework3 {
    public void done() {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();
    }

    public void firstTask() {
        System.out.println("Task #1");

        double firstNumber = 23.6;
        double secondNumber = 0.4;
        double result = firstNumber / secondNumber;
        System.out.println(result);
    }

    public void secondTask() {
        System.out.println("Task #2\nWe are going to calculate a volume of a cilinder!");

        double cilinderHeight;
        double cilinderRadius;
        double cilinderVolume;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide the height of the cilinder: ");
        cilinderHeight = scanner.nextDouble();
        System.out.print("Provide the radius of the cilinder: ");
        cilinderRadius = scanner.nextDouble();
        cilinderVolume = Math.PI * Math.pow(cilinderRadius, 2) * cilinderHeight;
        System.out.println("The volume of the cilinder is: " + cilinderVolume);
        scanner.close();
    }

    public void thirdTask() {
        System.out.println("Task #3\nWe are going to convert a hexadecimal value into the decimal!");

        String hexValue;
        int decimalValue;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide the hexadecimal value: ");
        hexValue = scanner.next();
        decimalValue = Integer.parseInt(hexValue, 16);
        System.out.printf("The hexadecimal value '%s' has the next decimal value: %d\n", hexValue, decimalValue);
        scanner.close();
    }

    public void fourthTask() {
        System.out.println("Task #4\nWe are going to increment and decrement two values - x=5 and=1!");

        int x = 5;
        int y = 1;
        x = ++x - y--;
        y *= ++y - x--;
        y += y++ + --x;
        x -= x++ + x--;
        y = x++;
        x = --y;
        y = x + y;
        x = y - x;
        y = y + --x;
        x = x + x++;
        System.out.printf(
                "Initial value for 'x' variable was: 5 and now it's: %d.\nInitial value for 'y' valuer was: 1 and now it's: %d",
                x, y);
    }

    public void fifthTask() {
        System.out.println("Task #5\nWe are going to calculate a quadratic equation(ax^2 + bx + c = 0)!");

        int a;
        int b;
        int c;
        double x1;
        double x2;
        double descriminant;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a value for the 'a' number: ");
        a = scanner.nextInt();
        System.out.print("Input a value for the 'b' number: ");
        b = scanner.nextInt();
        System.out.print("Input a value for the 'c' number: ");
        c = scanner.nextInt();
        scanner.close();
        descriminant = calculateDescriminant(a, b, c);
        if (0 == b && 0 == c) {
            x1 = 0;
            System.out.printf("The root of the %dx^2 + %dx + %d equation is: x=%.4f", a, b, c, x1);
            return;
        }
        if (descriminant > 0) {
            x1 = (-b + Math.sqrt(descriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(descriminant)) / (2 * a);
            System.out.printf("The roots of the %dx^2 + %dx + %d equation is: x1=%.4f and x2=%.4f\n", a, b, c, x1, x2);
        } else if (descriminant == 0) {
            x1 = -b / (2 * a);
            System.out.printf("The root of the %dx^2 + %dx + %d equation is: x=%.4f", a, b, c, x1);
        } else {
            System.err.println("The equation does not have roots!");
        }
    }

    private double calculateDescriminant(int a, int b, int c) {
        double descriminant = Math.pow(b, 2) - (4 * a * c);
        return descriminant;
    }
}
