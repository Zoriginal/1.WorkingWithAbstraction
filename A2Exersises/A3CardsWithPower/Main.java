package A1WorkingWithAbstraction.A2Exersises.A3CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rankName = scan.nextLine();
        String suitName = scan.nextLine();
        Card card = new Card(RankCard.valueOf(rankName),SuitCard.valueOf(suitName));

        System.out.printf("Card name: %s of %s; Card power: %d",RankCard.valueOf(rankName),SuitCard.valueOf(suitName),card.getPower());
    }
}
