package task4;

public class Company {
    private Employee boss;
    private Employee coBoss;
    private Employee cto;

    public Company() {
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public Employee getCoBoss() {
        return coBoss;
    }

    public void setCoBoss(Employee coBoss) {
        this.coBoss = coBoss;
    }

    public Employee getCto() {
        return cto;
    }

    public void setCto(Employee cto) {
        this.cto = cto;
    }
}
