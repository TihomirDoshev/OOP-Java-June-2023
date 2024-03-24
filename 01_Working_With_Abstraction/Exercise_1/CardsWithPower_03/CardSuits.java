package OOP.Lesson_1_Working_With_Abstraction.Exercise_1.CardsWithPower_03;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    private int suitPower;
    CardSuits (int suitPower){
        this.suitPower = suitPower;

    }
    public int getSuitPower(){
        return this.suitPower;
    }
}
