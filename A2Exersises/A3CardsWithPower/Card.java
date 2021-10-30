package A1WorkingWithAbstraction.A2Exersises.A3CardsWithPower;

public class Card {
    private RankCard rankCard;
    private SuitCard suitCard;

    public Card(RankCard rankCard, SuitCard suitCard) {
        this.rankCard = rankCard;
        this.suitCard = suitCard;
    }

    public int getPower(){
        return rankCard.getRankPower() + suitCard.getSuitPower();
    }

}
