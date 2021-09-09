package homework.lesson4.homework8;

public class TaskThree {
    public static void main(String[] args) {
        TriangularPatternA(9);
        TriangularPatternB(9);
        TriangularPatternC(9);
        TriangularPatternD(9);
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
