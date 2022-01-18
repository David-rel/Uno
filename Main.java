import java.util.Scanner;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    static Random DrawCard = new Random();

    static ArrayList<String> Deck = new ArrayList<>();
    static String[] Cards1 = {
            "R0","R1(1)",,"R2","R3","R4","R5","R6","R7","R8","R9","RD2(1)","RD2(2)","RS(1)","RS(2)","RR(1)","RR(2)",
            "B0","B1","B2","B3","B4","R5","B6","B7","B8","B9","BD2(1)","BD2(2)","BS(1)","BS(2)","BR(1)","BR(2)",
            "Y0","Y1","Y2","Y3","Y4","Y5","Y6","Y7","Y8","Y9","YD2(1)","YD2(2)","YS(1)","YS(2)","YR(1)","YR(2)",
            "G0","G1","G2","G3","G4","G5","G6","G7","G8","G9","GD2(1)","GD2(2)","GS(1)","GS(2)","GR(1)","GR(2)",
            "W(1)","W(2)","W(3)","W(4)","WD4(1)","WD4(2)","WD4(3)","WD4(4)"};

    static ArrayList<String> PlayerHand = new ArrayList<>();
    static ArrayList<String> BotHand = new ArrayList<>();

    static int Cards1Length = Cards1.length;

    static Scanner S = new Scanner(System.in);

    public static void main(String[] args){

        for (int i = 0; i < Cards1Length; i++) {
            Deck.add(Cards1[i]);
        }

        int PlayerHandLength = Deck.toArray().length;
        int BotHandLength = Deck.toArray().length;
        int DeckLength = Deck.toArray().length;
        int Draw;
        String Action;

        for (int i = 0; i < 7; i++) {
            Draw = DrawCard.nextInt(DeckLength);
            String DrawnCard = Deck.get(Draw);
            PlayerHand.add(DrawnCard);
            Deck.remove(DrawnCard);
            DeckLength = Deck.toArray().length;
        }
        for (int i = 0; i < 7; i++) {
            Draw = DrawCard.nextInt(DeckLength);
            String DrawnCard = Deck.get(Draw);
            BotHand.add(DrawnCard);
            Deck.remove(DrawnCard);
            DeckLength = Deck.toArray().length;
        }

        System.out.println("Your Hand is " + PlayerHand);
        System.out.println("The Computer's hand is " + BotHand);


        Draw = DrawCard.nextInt(DeckLength);
        String FirstCard = Deck.get(Draw);
        System.out.println("The First card is " + FirstCard);
        Deck.remove(FirstCard);

        for (int i = 0; i < 100; i++) {
            System.out.println("You Can: \n Draw a Card \n Play a Card \n Examine Cards");
            Action = S.nextLine();

            if (Action.equalsIgnoreCase("Examine Cards")) {
                System.out.println("Your Hand is " + PlayerHand);
            }
            else if (Action.equalsIgnoreCase("Draw a Card")){
                Draw = DrawCard.nextInt(DeckLength);
                String DrawnCard = Deck.get(Draw);
                PlayerHand.add(DrawnCard);
                Deck.remove(DrawnCard);
                DeckLength = Deck.toArray().length;
                System.out.println("You Draw a " + DrawnCard);
                i = 100;
            }
            else if (Action.equalsIgnoreCase("Play a Card")){

            }
        }
    }
}
