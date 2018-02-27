package company;

public class Worker extends Employee {

    private boolean isWorking;

    public Worker(String name, String lastname, float salary, boolean isWorking) {
        super(name, lastname, salary);
        this.isWorking = isWorking;
    }


    public Worker(String name, String lastname, float salary) {
        this(name, lastname, salary, false);
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public void speak() {
        System.out.println("Hejo ho, do roboty by sie szło");
    }
}
