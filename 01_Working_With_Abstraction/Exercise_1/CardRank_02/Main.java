package OOP.Lesson_1_Working_With_Abstraction.Exercise_1.CardRank_02;

public class Main {
    public static void main(String[] args){
        System.out.println("Card Ranks:");
        for (CardRanks element : CardRanks.values()){
            System.out.printf("Ordinal value: %d; Name value: %s",element.ordinal(),element.name());
            System.out.println();
        }

    }
}
