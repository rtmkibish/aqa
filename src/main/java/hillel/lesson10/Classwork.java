package hillel.lesson10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classwork {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(3);
        coll.add("Hello");
        System.out.println(coll);

        List coll2 = new ArrayList();
        coll2.add(2);
        coll2.add("bye");
        coll2.set(1, "WOW");
        System.out.println(coll2);

        Map collection = new HashMap();
        collection.put("2", 2);
        collection.put(coll, "hello");
        System.out.println(collection);

        Car car = Car.Audi;

        switch (car) {
            case BMW:
                System.out.println("It's BMW");
                break;
            case Audi:
                System.out.println("It's Audi");
                break;
            case Toyota:
            System.out.println("It's Toyota");
        }

        Person p1 = new Student();
        p1.repr();
        System.out.println(p1.name);

        // Student s1 = new Person();

    }
}
