package hw6.animals;

public abstract class Animal {
    static int animalCount;
    protected String name;
    protected String colour;
    protected  int age;

    public abstract void swim(int swimDistance);
    public abstract void run(int runDistance);

    public Animal(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        animalCount++;
    }

    public static void animals() {
        System.out.println("Всего животных: " + animalCount);
    }


}
