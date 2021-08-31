package hillel.lesson2;

public class Task5 {
    public static void printIncrement() {
        int x = 9;
        int y;
        y = ++x;
        y = x++;
        y = --x;
        y = --x;
        y = x--;
        System.out.println("The x is:" + x);
        System.out.println("The y is:" + y);
    }
}
