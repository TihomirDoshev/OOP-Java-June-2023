package OOP.Lesson_1_Working_With_Abstraction.Exercise_1.CardsWithPower_03;

public class Card {
    private CardRanks cardRank;
    private CardSuits cardSuit;
    private int power;

    public Card(CardRanks cardRank, CardSuits cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
        this.power = cardSuit.getSuitPower()+cardRank.getPowerRank();
    }

    public CardRanks getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRanks cardRank) {
        this.cardRank = cardRank;
    }

    public CardSuits getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuits cardSuit) {
        this.cardSuit = cardSuit;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
