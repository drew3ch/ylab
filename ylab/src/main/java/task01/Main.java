package task01;

import task01.animals.Cat;
import task01.animals.Dog;
import task01.animals.Fish;

public class Main {

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.eat();
        tom.speak();
        tom.sleep();
        tom.speak();

        Dog rex = new Dog();
        rex.eat();
        rex.speak();
        rex.sleep();
        rex.speak();

        Fish nemo = new Fish();
        nemo.eat();
        nemo.speak();
        nemo.sleep();
        nemo.speak();
    }
}