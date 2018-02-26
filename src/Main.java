public class Main {
    public static void main(String[] args) {


        Person personOskar = new Person("Oskar", "Polak", "green");
        Person personAdam = new Person("Adam", "Mis");


        System.out.println(personOskar.getName());
        System.out.println(personAdam.getLastname());
    }
}
