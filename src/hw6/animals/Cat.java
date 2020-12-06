package hw6.animals;

public class Cat extends Animal {
    static  int catCount = 0;

    public Cat(String name, String colour, int age) {
        super(name, colour, age);
        catCount++;
    }

    @Override
    public void swim(int swimDistance) {

            System.out.println("Кошки не плавают");
    }

    @Override
    public void run(int runDistance) {
        if (runDistance < 0) {
            System.out.println("Число должно быть положительным");
        } else if (runDistance <= 200) {
            System.out.println(name + " пробежал " + runDistance + " метров");
        } else {
            System.out.println("Кошка не пробежит так много");
        }
    }

    public static void cats() {
        System.out.println("Всего кошек: " + catCount);
    }
}
