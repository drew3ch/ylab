package task01.animals;

public class Cat extends Animal {

    private String sound = "Мяу";

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void voice() {
        System.out.println(sound);
    }
}