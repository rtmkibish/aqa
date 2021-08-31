package hillel.lesson2;

public class Task1 {
    public static void main(String[] args) {
        double first = 3.4;
        double second = 5.7;
        double third = 9;
        double result = first * second * third;

        int x1 = 3;
        int x2 = 7;
        int x3 = 0;
        int x = multiply(x1, x2, x3);
        // System.out.println(x);
    }

    static int multiply(int x,int y, int z) {
        int m  = x * y  * z;
        myText(m);
        return m;
    }

    static void myText(int t) {
        System.out.println("My t is: " + t);
    }
}
