package hw6.animals;

public class Dog extends Animal {
    static int dogCount;

    public Dog(String name, String colour, int age) {
        super(name, colour, age);
        dogCount++;
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance <= 0) {
            System.out.println("Число должно быть положительным");

        } else if (swimDistance <= 10) {
            System.out.println(name + " проплыл " + swimDistance + " метров");
        } else {
            System.out.println("Собака не проплывет так много");
        }
    }

    @Override
    public void run(int runDistance) {
        if (runDistance < 0) {
            System.out.println("Число должно быть положительным");
        } else if (runDistance <= 500) {
            System.out.println(name + " пробежал " + runDistance + " метров");
        } else {
            System.out.println("Собака не пробежит так много");
        }
    }

    public static void dogs() {
        System.out.println("Всего собак: " + dogCount);
    }
}
