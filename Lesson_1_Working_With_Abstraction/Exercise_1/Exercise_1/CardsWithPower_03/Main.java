package OOP.Lesson_1_Working_With_Abstraction.Exercise_1.Exercise_1.CardsWithPower_03;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        Card card = new Card(CardRanks.valueOf(rank),CardSuits.valueOf(suit));
        System.out.printf("Card name: %s of %s; Card power: %d",card.getCardRank(),card.getCardSuit(),card.getPower());



    }
}
