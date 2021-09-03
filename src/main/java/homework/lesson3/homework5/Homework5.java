package homework.lesson3.homework5;

import java.util.Scanner;

public class Homework5 {

    private Scanner scanner = new Scanner(System.in);

    public void done() {
        firstTask();
        secondtTask();
        thirdTask();
        fourthTask();
        fifthTask();
    }

    public void firstTask() {
        System.out.println(
                "Task #1\nWrite a program which take four numbers from the user and print out just that few of them which divide by 3 or 5 without remainder");

        int first;
        int second;
        int third;
        int fourth;

        System.out.print("Input 4 numbers: ");
        first = scanner.nextInt();
        second = scanner.nextInt();
        third = scanner.nextInt();
        fourth = scanner.nextInt();

        if ((first % 3) == 0 || (first % 5) == 0) {
            System.out.print(first + " ");
        }
        if ((second % 3) == 0 || (second % 5) == 0) {
            System.out.print(second + " ");
        }
        if ((third % 3) == 0 || (third % 5) == 0) {
            System.out.print(third + " ");
        }
        if ((fourth % 3) == 0 || (fourth % 5) == 0) {
            System.out.print(fourth + " ");
        }
        System.out.println("");
    }

    public void secondtTask() {
        System.out.println(
                "Task #2\nWrite a program which take string from console and print out whether it contains numbers, uppercase symbols, lowercase symbols, special characters (!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~)");

        String target;

        System.out.print("Input a string: ");
        target = scanner.next();

        if (target.contains("0") || target.contains("1") || target.contains("2") || target.contains("3")
                || target.contains("4") || target.contains("5") || target.contains("6") || target.contains("7")
                || target.contains("8") || target.contains("9")) {
            System.out.println("The string contains numbers");
        }
        if (target.contains("a") || target.contains("b") || target.contains("c") || target.contains("d")
                || target.contains("e") || target.contains("f") || target.contains("g") || target.contains("h")
                || target.contains("i") || target.contains("j") || target.contains("k") || target.contains("l")
                || target.contains("m") || target.contains("n") || target.contains("o") || target.contains("p")
                || target.contains("q") || target.contains("r") || target.contains("s") || target.contains("t")
                || target.contains("u") || target.contains("v") || target.contains("w") || target.contains("x")
                || target.contains("y") || target.contains("z")) {
            System.out.println("The string contains lowercase symbols");
        }
        if (target.contains("A") || target.contains("B") || target.contains("C") || target.contains("D")
                || target.contains("E") || target.contains("F") || target.contains("G") || target.contains("H")
                || target.contains("I") || target.contains("J") || target.contains("K") || target.contains("L")
                || target.contains("M") || target.contains("N") || target.contains("O") || target.contains("P")
                || target.contains("Q") || target.contains("R") || target.contains("S") || target.contains("T")
                || target.contains("U") || target.contains("V") || target.contains("W") || target.contains("X")
                || target.contains("Y") || target.contains("Z")) {
            System.out.println("The string contains uppercase symbols");
        }
        if (target.contains("!") || target.contains("\"") || target.contains("#") || target.contains("$")
                || target.contains("%") || target.contains("&") || target.contains("\'") || target.contains("(")
                || target.contains(")") || target.contains("*") || target.contains("+") || target.contains(",")
                || target.contains("-") || target.contains(".") || target.contains("/") || target.contains(":")
                || target.contains(";") || target.contains("<") || target.contains("=") || target.contains(">")
                || target.contains("?") || target.contains("@") || target.contains("[") || target.contains("\\")
                || target.contains("]") || target.contains("^") || target.contains("_") || target.contains("`")
                || target.contains("{") || target.contains("|") || target.contains("}") || target.contains("~")) {
            System.out.println("The string contains special characters");
        }

    }

    public void thirdTask() {
        System.out.println(
                "Task #3\nWrite a Java program that takes a year from user and print whether that year is a leap year or not.");

        int year;

        System.out.print("Input a year: ");
        year = scanner.nextInt();
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.printf("The year %d is NOT leap.\n", year);
        } else {
            System.out.printf("The year %d is leap.\n", year);
        }
    }

    public void fourthTask() {
        System.out.println(
                "Task #4\nWrite a program which take number of month from user and print out name of season (summer, winter ...)");

        String monthNumber;

        System.out.print("Input a month number: ");
        monthNumber = scanner.next();

        if ("1 2 12".contains(monthNumber)) {
            System.out.println("It's a winter month.");
        } else if ("3 4 5".contains(monthNumber)) {
            System.out.println("It's a spring month.");
        } else if ("6 7 8".contains(monthNumber)) {
            System.out.println("It's a summer month.");
        } else if ("9 10 11".contains(monthNumber)) {
            System.out.println("It's an autumn month.");
        } else {
            System.out.println("Invalid month number!");
        }
    }

    public void fifthTask() {
        System.out.println(
                "Task #5\nWrite the program which take name of color from user (red, blue, green, yellow, orange, black, white, pink) and print out length of this word.");

        String color;

        System.out.print("Input color: ");
        color = scanner.next().toLowerCase();

        switch (color) {
            case "red":
                System.out.println("The color " + color + " has 3 characters long.");
                break;
            case "blue":
                System.out.println("The color " + color + " has 4 characters long.");
                break;
            case "green":
                System.out.println("The color " + color + " has 5 characters long.");
                break;
            case "yellow":
                System.out.println("The color " + color + " has 6 characters long.");
                break;
            case "orange":
                System.out.println("The color " + color + " has 6 characters long.");
                break;
            case "black":
                System.out.println("The color " + color + " has 5 characters long.");
                break;
            case "white":
                System.out.println("The color " + color + " has 5 characters long.");
                break;
            case "pink":
                System.out.println("The color " + color + " has 4 characters long.");
                break;
            default:
                System.out.println("I do not know such color!");
        }
    }
}
