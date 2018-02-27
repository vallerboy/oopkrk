package company;

public class Manager extends Worker implements Management{

    public Manager(String name, String lastname, float salary) {
        super(name, lastname, salary, true);
    }

    @Override
    public void speak() {
        System.out.println("Do pracy lenie!");
    }

    public void kickOut(Worker worker){
        worker.setWorking(false);
        System.out.println("Widzicie? Wlasnie Wasz kolega " + worker.getName() + " wylecial!");
    }

    @Override
    public void voteNo(String reason) {
        System.out.println("Panie Szefie ja ja ja ja to ja mam inne zdanie troche");
        System.out.println(reason);
    }

    @Override
    public void voteYes() {
        System.out.println("Szefie Ty to masz najlepsze pomysly pod sloncem");
    }
}
