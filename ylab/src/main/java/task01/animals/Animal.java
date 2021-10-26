package task01.animals;

public abstract class Animal {

    private boolean isSleeping = false;
    private boolean isEating = false;
    private String sound = "";

    public void eat(){
        isEating = true;
    }
    abstract void speak();

    public void sleep(){
        isSleeping = true;
        isEating = false;
    }

    protected void setEating(boolean eating){
        isEating = eating;
    }

    protected void setSleeping(boolean sleeping){
        isSleeping = sleeping;
    }

    protected boolean getSleeping() {
        return isSleeping;
    }
}