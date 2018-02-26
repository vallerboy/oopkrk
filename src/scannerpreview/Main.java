package scannerpreview;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SumOfElements sumOfElements = new SumOfElements(scanner);
        sumOfElements.sum();


        Multiply multiply = new Multiply(scanner);
        multiply.multiply();

    }
}
