package task01;

import task01.animals.cat;
import task01.animals.dog;
import task01.animals.fish;
import task01.animals.rabbit;

public class Main {

    public static void main(String[] args) {
        cat tom = new cat();
        tom.eat();
        tom.speak();
        tom.sleep();
        tom.speak();

        dog rex = new dog();
        rex.eat();
        rex.speak();
        rex.sleep();
        rex.speak();

        fish nemo = new fish();
        nemo.eat();
        nemo.speak();
        nemo.sleep();
        nemo.eat();
        nemo.speak();

        rabbit oswald = new rabbit();
        oswald.eat();
        oswald.speak();
        oswald.sleep();
        oswald.speak();
    }
}