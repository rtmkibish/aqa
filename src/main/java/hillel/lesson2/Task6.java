package hillel.lesson2;

public class Task6 {
    public static void printRelutOFIncrementations() {
        int x = 2;
        int y = 6;
        y = x++ * ++y;
        x *= x + y;
        y = y + ++x;
        x = 1 + x + y;
        System.out.println(x + " " + y);
    }
}
