package A1WorkingWithAbstraction.A2Exersises.A3CardsWithPower;

public enum SuitCard {
    CLUBS (0),
    DIAMONDS (13),
    HEARTS (26),
    SPADES (39);

    private int suitPower;

    SuitCard(int suitPower){
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return suitPower;
    }
}
