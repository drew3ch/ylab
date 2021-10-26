package task01.animals;

public abstract class Animal {

    public boolean isSleep;

    public void sleep() {
        isSleep = true;
        System.out.println("..ZzzZzz..");
    }

    public void eat() {
        if (isSleep){
            isSleep = false;
        }
        System.out.println("Eating");
    }

    public abstract void speak();
}