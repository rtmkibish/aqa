package hillel.lesson10;

public class Student extends Person{
    public int age;
    public String name = "Artem";

    public void greet() {
        System.out.println("Hi, I'm " + name);
    }
}
