package homework.lesson3.homework6;

import java.util.Scanner;

public class Homework6 {
    private Scanner scanner = new Scanner(System.in);

    public void done() {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();
        sixthTask();
        seventhTask();
        eighthTask();
        ninethTask();
        tenthTask();
        eleventhTask();
        twelfthTask();
        thirteenthTask();
        forteenthTask();
        fifteenthTask();
    }

    public void firstTask() {
        System.out.println("Task #1\n Определить четность вводимого с клавиатуры числа.");

        int targetNumber;

        System.out.print("Input a number: ");
        targetNumber = scanner.nextInt();

        if (0 == (targetNumber % 2)) {
            System.out.println("The nuber is even.");
        } else {
            System.out.println("The nuber is odd.");
        }
    }

    public void secondTask() {
        System.out.println("Task #2\nВвести два числа и найти меньшее из них.");

        double firstNumber;
        double secondNumber;

        System.out.print("Input the first number: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Input the second number: ");
        secondNumber = scanner.nextDouble();

        if (firstNumber > secondNumber) {
            System.out.println("The first number: " + firstNumber + " is grater.");
        } else if (secondNumber > firstNumber) {
            System.out.println("The second number: " + secondNumber + " is grater.");
        } else {
            System.out.println("The numbers are equal.");
        }
    }

    public void thirdTask() {
        System.out.println("Task #3\nОпределить знак введённого числа.");

        double targetNumber;

        System.out.print("Input a number: ");
        targetNumber = scanner.nextDouble();

        if (targetNumber > 0) {
            System.out.println("The number is positive.");
        } else if (targetNumber < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public void fourthTask() {
        System.out.println("Task #4\nВвести три числа и найти наибольшее из них.");

        double firstNumber;
        double secondNumber;
        double thirdNumber;

        System.out.print("Input the first number: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Input the second number: ");
        secondNumber = scanner.nextDouble();
        System.out.print("Input the third number: ");
        thirdNumber = scanner.nextDouble();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("The " + firstNumber + " is gratest.");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("The " + secondNumber + " is gratest.");
        } else if (thirdNumber >= firstNumber && thirdNumber >= secondNumber) {
            System.out.println("The " + thirdNumber + " is gratest.");
        }
    }

    public void fifthTask() {
        System.out.println(
                "Task #5\nРеализовать калькулятор. Вводятся 2 дробных числа a и b. Необходимо вывести на экран меню с пунктами.При выборе соответствующего пункта меню происходит вывод результата вычисления.");

        double firstNumber;
        double secondNumber;
        int operation;

        System.out.print("Input the first number: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Input the second number: ");
        secondNumber = scanner.nextDouble();

        System.out.println("Select an operation:\n1) add(+)\n2) subtract(-)\n3) multiply(*)\n4) divide(/)");
        operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println(firstNumber + secondNumber);
                break;
            case 2:
                System.out.println(firstNumber - secondNumber);
                break;
            case 3:
                System.out.println(firstNumber * secondNumber);
                break;
            case 4:
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Unknown operation: " + operation);
        }
    }

    public void sixthTask() {
        System.out.println("Task #6\nВвести с клавиатуры символ. Определить является ли он цифрой.");

        char targetSymbol;

        System.out.print("Input the character: ");
        targetSymbol = scanner.next().charAt(0);

        if (targetSymbol >= 48 && targetSymbol <= 53) {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character IS NOT a digit.");
        }
    }

    public void seventhTask() {
        System.out.println(
                "Task #7\nВвести с клавиатуры число и проверить, принадлежит ли это число диапазону от 1 до 30.");

        double targetNumber;

        System.out.print("Input a number: ");
        targetNumber = scanner.nextDouble();

        if (targetNumber >= 1 && targetNumber < 30) {
            System.out.println("The number is in range from 1 to 30.");
        } else {
            System.out.println("The number IS NOT in range from 1 to 30.");
        }
    }

    public void eighthTask() {
        System.out.println(
                "Task #8\nНаписать программу для проверки кратности числа X числу Y (оба числа вводятся с клавиатуры).");

        int firstNumber;
        int secondNumber;

        System.out.print("Input the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        secondNumber = scanner.nextInt();

        if ((firstNumber % secondNumber) == 0) {
            System.out.println("The " + firstNumber + " is multiple to " + secondNumber + " number.");
        } else {
            System.out.println("The " + firstNumber + " IS NOT multiple to " + secondNumber + " number.");
        }
    }

    public void ninethTask() {
        System.out.println(
                "Task #9\nВвести с клавиатуры символ. Определить, является ли введённый символ буквой либо знаком пунктуации.");

        char targetSymbol;

        System.out.print("Input a character: ");
        targetSymbol = scanner.next().charAt(0);

        if ((targetSymbol >= 32 && targetSymbol <= 47) || (targetSymbol >= 58 && targetSymbol <= 64)
                || (targetSymbol >= 91 && targetSymbol <= 96) || targetSymbol >= 123 && targetSymbol <= 126) {
            System.out.println("The character is a punctuation sign.");
        } else if ((targetSymbol >= 65 && targetSymbol <= 90) || (targetSymbol >= 87 && targetSymbol <= 122)) {
            System.out.println("The character is a letter sign.");
        } else {
            System.out.println("The character is neither a letter or a punctuation sign.");
        }
    }

    public void tenthTask() {
        System.out.println("Task #10\nВвести число и определить кратно ли оно 3, 5, 7.");

        int targetNumber;

        System.out.print("Input a number: ");
        targetNumber = scanner.nextInt();

        if ((targetNumber % 3) == 0) {
            System.out.println("The number is multiple to 3.");
        }
        if ((targetNumber % 5) == 0) {
            System.out.println("The number is multiple to 5.");
        }
        if ((targetNumber % 7) == 0) {
            System.out.println("The number is multiple to 7.");
        }
    }

    public void eleventhTask() {
        System.out.println("Task #11\nОпределить модуль введённого числа.");

        double targetNumber;

        System.out.print("Input a number: ");
        targetNumber = scanner.nextDouble();

        if (targetNumber >= 0) {
            System.out.println("The absolute value is: " + targetNumber);
        } else {
            // the check is implemented only to ensure the multiplication for -1 won't
            // change the original value.
            // I'm not good in math =)
            if (Math.abs(targetNumber) - (targetNumber * -1) == 0) {
                System.out.println("The absolute value is: " + (targetNumber * -1));
            } else {
                System.out.println("The absolute value is: " + Math.abs(targetNumber));
            }
        }
    }

    public void twelfthTask() {
        System.out.println("Task #12\nВводится целое число (не более 4 разрядов). Определить количество цифр в нём.");

        int targetNumber;

        System.out.print("Input a number: ");
        targetNumber = scanner.nextInt();

        targetNumber = (targetNumber > 0) ? targetNumber : targetNumber * -1;

        if (targetNumber > 0 && targetNumber <= 9) {
            System.out.println("The number has one digit.");
        } else if (targetNumber >= 10 && targetNumber <= 99) {
            System.out.println("The number has two digits.");
        } else if (targetNumber >= 100 && targetNumber <= 999) {
            System.out.println("The number has three digits.");
        } else if (targetNumber >= 1000 && targetNumber <= 9999) {
            System.out.println("The number has four digits.");
        } else {
            System.out.println("The numbers more than 4 digits long cannot be handled.");
        }
    }

    public void thirteenthTask() {
        System.out.println(
                "Task #13\nВвести с клавиатуры пятизначное число и определить, является ли оно палиндромом, т.е. одинаково читается в обоих направлениях (например, 12321 – палиндром, 12345 – не палиндром).");

        int targetNumber;
        int firstDigit;
        int secondDigit;
        int fourthDigit;
        int fifthDigit;
        String resultToDisplay;

        System.out.print("Input a number: ");
        targetNumber = scanner.nextInt();
        if (targetNumber < 10000 || targetNumber > 99999) {
            System.out.println("The number should be 5 digits long");
            return;
        }

        int last4Digits = targetNumber % 10000;
        firstDigit = (targetNumber - last4Digits) / 10000;
        int last3Digits = last4Digits % 1000;
        secondDigit = last3Digits / 1000;
        fifthDigit = targetNumber % 10;
        fourthDigit = ((last3Digits % 100) - fifthDigit) / 100;

        resultToDisplay = (firstDigit == fifthDigit && secondDigit == fourthDigit) ? "The number is a palindrome."
                : "The number IS NOT a palindrome.";
        System.out.println(resultToDisplay);
    }

    public void forteenthTask() {
        System.out.println(
                "Task #14\nПользователь задаёт координаты вершин прямоугольника, а также координаты точки (X,Y) в декартовой системе координат. Принадлежит ли точка этому прямоугольнику?");

        int rectangleX;
        int rectangleY;
        int userX;
        int userY;

        System.out.print("Input the rectangle top point on the X axis: ");
        rectangleX = scanner.nextInt();
        System.out.print("Input the rectangle top point on the Y axis: ");
        rectangleY = scanner.nextInt();
        System.out.print("Input the user top point on the X axis: ");
        userX = scanner.nextInt();
        System.out.print("Input the user top point on the Y axis: ");
        userY = scanner.nextInt();

        if (userX <= rectangleX && userY <= rectangleY) {
            System.out.println("The point belongs to the rectangle.");
        } else {
            System.out.println("The point does not belong to the rectangle.");
        }
    }

    public void fifteenthTask() {
        System.out.println("Task #15\nВыполнить задания №1,№2,№3,№6,№11, используя условную тернарную операцию.");

        ternaryfirstTask();
        ternarySecondTask();
        ternaryThirdTask();
        ternarySixthtask();
        ternaryEleventhtask();
    }

    private void ternaryfirstTask() {
        System.out.println("Task #15.1\n Определить четность вводимого с клавиатуры числа.");

        int targetNumber;
        String resultToDisplay;

        System.out.print("Input a number: ");
        targetNumber = scanner.nextInt();

        resultToDisplay = (0 == (targetNumber % 2)) ? "The nuber is even." : "The nuber is odd.";
        System.out.println(resultToDisplay);
    }

    private void ternarySecondTask() {
        System.out.println("Task #15.2\nВвести два числа и найти меньшее из них.");

        double firstNumber;
        double secondNumber;
        String resultToDisplay;

        System.out.print("Input the first number: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Input the second number: ");
        secondNumber = scanner.nextDouble();

        resultToDisplay = firstNumber > secondNumber ? "The first number: " + firstNumber + " is grater."
                : "The second number: " + secondNumber + " is grater.";
        System.out.println(resultToDisplay);
    }

    private void ternaryThirdTask() {
        System.out.println("Task #15.3\nОпределить знак введённого числа.");

        double targetNumber;
        String resultToDisplay;

        System.out.print("Input a number: ");
        targetNumber = scanner.nextDouble();

        resultToDisplay = targetNumber > 0 ? "The number is positive." : "The number is negative.";
        System.out.println(resultToDisplay);
    }

    private void ternarySixthtask() {
        System.out.println("Task #15.6\nВвести с клавиатуры символ. Определить является ли он цифрой.");

        char targetSymbol;
        String resultToDisplay;

        System.out.print("Input the character: ");
        targetSymbol = scanner.next().charAt(0);

        resultToDisplay = (targetSymbol >= 48 && targetSymbol <= 53) ? "The character is a digit."
                : "The character IS NOT a digit.";
        System.out.println(resultToDisplay);
    }

    private void ternaryEleventhtask() {
        System.out.println("Task #15.11\nОпределить модуль введённого числа.");

        double targetNumber;
        String resultToDisplay;

        System.out.print("Input a number: ");
        targetNumber = scanner.nextDouble();

        resultToDisplay = targetNumber >= 0 ? "The absolute value is: " + targetNumber
                : "The absolute value is: " + Math.abs(targetNumber);
        System.out.println(resultToDisplay);
    }
}
