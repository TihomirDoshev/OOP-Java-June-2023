package OOP.Lesson_1_Working_With_Abstraction.Exercise_1.CardSuit_01;

public class Main {
    public static void main(String[] args){

        System.out.println("Card Suits:");
        for (CardSuits element : CardSuits.values()){
            System.out.printf("Ordinal value: %d; Name value: %s",element.ordinal(),element);

            System.out.println();
        }
    }
}
