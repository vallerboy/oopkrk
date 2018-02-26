package task3;

public class Main {
    public static void main(String[] args) {

        Game game = new Game("MC", 3);
        game.addPlayer(new Player("Oskar", "Polak", 999));
        game.addPlayer(new Player("Adam", "Polak", 299));
        game.addPlayer(new Player("Michał", "Polak", 99));

        String winner = game.winner();
        if(winner == null){
            System.out.println("Nikt nie wygrał"); //tutaj jakieś seksi okienka
        }else{
            System.out.println("Wygrywa: " + winner);
        }
    }
}
