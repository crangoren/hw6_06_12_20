package hw6.animals;

public class Animal {
    protected String name;
    protected String colour;
    protected  int age;
    int runDistance;
    int swimDistance;

    protected void run() {
        System.out.println(name + "пробежал" + runDistance + "метров");
    }
    protected void swim() {
        System.out.println(name + "проплыл" + swimDistance + "метров");
    }

}
