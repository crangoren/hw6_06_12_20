package hw6;

import hw6.animals.Animal;
import hw6.animals.Cat;
import hw6.animals.Dog;

public class Main {

    public static void main(String[] args) {

        Cat cat2 = new Cat("odin", "red", 3);
        Cat cat1 = new Cat("barsik", "white", 4);
        Dog dog1 = new Dog ("barbos", "black", 4);
        Dog dog2 = new Dog ("muhtar", "red-black", 6);

        cat1.swim(100);
        cat1.swim(0);
        cat1.run(50);
        cat1.run(300);
        cat1.run(199);
        cat2.swim(100);

        dog1.swim(20);
        dog1.swim(-3);
        dog1.swim(10);
        dog1.run(501);
        dog1.run(-1);
        dog1.run(0);
        dog1.run(186);

        Cat.cats();
        Dog.dogs();
        Animal.animals();
    }
}
