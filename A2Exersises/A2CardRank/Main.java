package A1WorkingWithAbstraction.A2Exersises.A2CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(input + ":");

        for (CardRanks card:CardRanks.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",card.ordinal(),card.toString());
        }

    }
}
