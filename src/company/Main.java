package company;

public class Main {
    public static void main(String[] args) {
        Worker oskar = new Worker("Oskar", "Polak", 2300, true);
        Manager ula = new Manager("Ula", "Swiatlowska", 2400);
        oskar.speak();

        if(oskar.isWorking()){
            System.out.println("Pracuje");
        }else{
            System.out.println("Nie pracuje");
        }

        Employee employee = oskar;
        ((Worker) employee).isWorking();

        //Manager manager = (Manager) oskar;

        ula.kickOut(oskar);

        Management[] managements = new Management[2];
        managements[0] = ula;
        managements[1] = new Boss("Michal", "Makaruk");

        for (Management management : managements) {
            management.voteYes();
        }
    }
}
