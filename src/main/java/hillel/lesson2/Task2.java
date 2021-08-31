package hillel.lesson2;

public class Task2 {

    public static void printArea() {
        float radius = 5;
        double area = countArea(radius);
    }

    static double countArea(float r) {
        return Math.PI * r * r;
    }

    public static void printDivision() {
        int first = 2;
        double second = 5;
        int resultInt = 5/2;
        double resultDouble = 5/2;
        System.out.println("Int result: " + resultInt);
        System.out.println("Double result: "  + resultDouble);
    }

}
