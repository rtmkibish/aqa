package hillel.lesson10;

public abstract class Animal {
    public String name;

    public void breath() {
        System.out.println("I'm breathing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
