package task01.animals;

public class Fish extends Animal {

    private String sound = "Буль";

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void speak() {
        if (!isSleep) {
            System.out.println(sound);
        }
    }
}