package task01.animals;

public abstract class Animal {

    public boolean isSleep;
    public abstract void voice();

    public void sleep() {
        isSleep = true;
        System.out.println("..ZzzZzz..");
    }

    public void eat() {
        if (isSleep){
            isSleep = false;
        }
        System.out.println("Ем");
    }

    public void speak() {
        if (!isSleep){
            voice();
        }
    };
}