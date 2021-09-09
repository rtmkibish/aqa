package homework.lesson4.homework8;

public class TaskFive {
    public static void main(String[] args) {
        System.out.println("Write program which print out next image using loops: (triangle: base 5)");

        int triangleBaseSize = 5;
        for (int i = 1; i <= triangleBaseSize; i++) {
            System.out.println(" ".repeat(triangleBaseSize - i) + "* ".repeat(i));
        }
    }
}