import java.util.Scanner;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    static Random DrawCard = new Random();

    static ArrayList<String> Deck = new ArrayList<>();
    static String[] Cards1 = {
            "R0","R1(1)","R1(2)","R2(1)","R2(2)","R3(1)","R3(2)","R4(1)","R4(2)","R5(1)","R5(2)","R6(1)","R6(2)","R7(1)","R7(2)","R8(1)","R8(2)","R9(1)","R9(2)","RD2(1)","RD2(2)","RS(1)","RS(2)","RR(1)","RR(2)",
            "B0","B1(1)","B1(2)","B2(1)","B2(2)","B3(1)","B3(2)","B4(1)","B4(2)","B5(1)","B5(2)","B6(1)","B6(2)","B7(1)","B7(2)","B8(1)","B8(2)","B9(1)","B9(2)","BD2(1)","BD2(2)","BS(1)","BS(2)","BR(1)","BR(2)",
            "Y0","Y1(1)","Y1(2)","Y2(1)","Y2(2)","Y3(1)","Y3(2)","Y4(1)","Y4(2)","Y5(1)","Y5(2)","Y6(1)","Y6(2)","Y7(1)","Y7(2)","Y8(1)","Y8(2)","Y9(1)","Y9(2)","YD2(1)","YD2(2)","YS(1)","YS(2)","YR(1)","YR(2)",
            "G0","G1(1)","G1(2)","G2(1)","G2(2)","G3(1)","G3(2)","G4(1)","G4(2)","G5(1)","G5(2)","G6(1)","G6(2)","G7(1)","G7(2)","G8(1)","G8(2)","G9(1)","G9(2)","GD2(1)","GD2(2)","GS(1)","GS(2)","GR(1)","GR(2)",
            "W(1)","W(2)","W(3)","W(4)","WD4(1)","WD4(2)","WD4(3)","WD4(4)"};

    static ArrayList<String> PlayerHand = new ArrayList<>();
    static ArrayList<String> BotHand = new ArrayList<>();

    static int Cards1Length = Cards1.length;

    static Scanner S = new Scanner(System.in);

    public static void main(String[] args){

        for (int i = 0; i < Cards1Length; i++) {
            Deck.add(Cards1[i]);
        }

        int PlayerHandLength = PlayerHand.toArray().length;
        int BotHandLength = BotHand.toArray().length;
        int DeckLength = Deck.toArray().length;
        int Draw;
        String Action;

        for (int i = 0; i < 7; i++) {
            Draw = DrawCard.nextInt(DeckLength);
            String DrawnCard = Deck.get(Draw);
            PlayerHand.add(DrawnCard);
            Deck.remove(DrawnCard);
            DeckLength = Deck.toArray().length;
            PlayerHandLength = PlayerHand.toArray().length;
        }
        for (int i = 0; i < 7; i++) {
            Draw = DrawCard.nextInt(DeckLength);
            String DrawnCard = Deck.get(Draw);
            BotHand.add(DrawnCard);
            Deck.remove(DrawnCard);
            DeckLength = Deck.toArray().length;
            PlayerHandLength = PlayerHand.toArray().length;
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
                PlayerHandLength = PlayerHand.toArray().length;
                System.out.println("You Draw a " + DrawnCard);
                i = 100;
            }
            else if (Action.equalsIgnoreCase("Play a Card")){
                String DownCardColor = "";
                String DownCardType = "";
                String PlayerCardColor = "";
                String PlayerCardType = "";
                int PlayChoice;
                int PlayChoice2;
                switch (FirstCard){
                    case "R0","R1(1)","R1(2)","R2(1)","R2(2)","R3(1)","R3(2)","R4(1)","R4(2)","R5(1)","R5(2)","R6(1)","R6(2)","R7(1)","R7(2)","R8(1)","R8(2)","R9(1)","R9(2)","RD2(1)","RD2(2)","RS(1)","RS(2)","RR(1)","RR(2)":
                        DownCardColor = "Red";
                        break;
                    case "B0","B1(1)","B1(2)","B2(1)","B2(2)","B3(1)","B3(2)","B4(1)","B4(2)","B5(1)","B5(2)","B6(1)","B6(2)","B7(1)","B7(2)","B8(1)","B8(2)","B9(1)","B9(2)","BD2(1)","BD2(2)","BS(1)","BS(2)","BR(1)","BR(2)":    
                        DownCardColor = "Blue";
                        break;
                    case "Y0","Y1(1)","Y1(2)","Y2(1)","Y2(2)","Y3(1)","Y3(2)","Y4(1)","Y4(2)","Y5(1)","Y5(2)","Y6(1)","Y6(2)","Y7(1)","Y7(2)","Y8(1)","Y8(2)","Y9(1)","Y9(2)","YD2(1)","YD2(2)","YS(1)","YS(2)","YR(1)","YR(2)":
                        DownCardColor = "Yellow";
                        break;
                    case "G0","G1(1)","G1(2)","G2(1)","G2(2)","G3(1)","G3(2)","G4(1)","G4(2)","G5(1)","G5(2)","G6(1)","G6(2)","G7(1)","G7(2)","G8(1)","G8(2)","G9(1)","G9(2)","GD2(1)","GD2(2)","GS(1)","GS(2)","GR(1)","GR(2)":
                        DownCardColor = "Greed";
                        break;
                    case "W(1)","W(2)","W(3)","W(4)","WD4(1)","WD4(2)","WD4(3)","WD4(4)":
                        DownCardColor = "Wild";
                        break;
                }
                switch (FirstCard){
                    case "R0","B0","Y0","G0":
                        DownCardType = "0";
                        break;
                    case "R1(1)","R1(2)","B1(1)","B1(2)","Y1(1)","Y1(2)","G1(1)","G1(2)":    
                        DownCardType = "1";
                        break;
                    case "R2(1)","R2(2)","B2(1)","B2(2)","Y2(1)","Y2(2)","G2(1)","G2(2)":
                        DownCardType = "2";
                        break;
                    case "R3(1)","R3(2)","B3(1)","B3(2)","Y3(1)","Y3(2)","G3(1)","G3(2)":
                        DownCardType = "3";
                        break;
                    case "R4(1)","R4(2)","B4(1)","B4(2)","Y4(1)","Y4(2)","G4(1)","G4(2)":
                        DownCardType = "4";
                        break;
                    case "R5(1)","R5(2)","B5(1)","B5(2)","Y5(1)","Y5(2)","G5(1)","G5(2)":
                        DownCardType = "5";
                        break;    
                    case "R6(1)","R6(2)","B6(1)","B6(2)","Y6(1)","Y6(2)","G6(1)","G6(2)":
                        DownCardType = "6";
                        break;  
                    case "R7(1)","R7(2)","B7(1)","B7(2)","Y7(1)","Y7(2)","G7(1)","G7(2)":
                        DownCardType = "7";
                        break;      
                    case "R8(1)","R8(2)","B8(1)","B8(2)","Y8(1)","Y8(2)","G8(1)","G8(2)":
                        DownCardType = "8";
                        break;    
                    case "R9(1)","R9(2)","B9(1)","B9(2)","Y9(1)","Y9(2)","G9(1)","G9(2)":
                        DownCardType = "9";
                        break;  
                    case "RD2(1)","RD2(2)","BD2(1)","BD2(2)","YD2(1)","YD2(2)","GD2(1)","GD2(2)":      
                        DownCardType = "Draw 2";
                        break;
                    case "RS(1)","RS(2)","BS(1)","BS(2)","YS(1)","YS(2)","GS(1)","GS(2)":      
                        DownCardType = "Skip";
                        break; 
                    case "RR(1)","RR(2)","BR(1)","BR(2)","YR(1)","YR(2)","GR(1)","GR(2)":      
                        DownCardType = "Reverse";
                        break;
                }
                      
                System.out.println("Which card do you want to play: 1-" + PlayerHandLength);
                PlayChoice = S.nextInt();
                PlayChoice2 = PlayChoice--;

                if (PlayChoice <= PlayerHandLength){
                    switch (PlayerHand.get(PlayChoice2)){
                        case "R0","R1(1)","R1(2)","R2(1)","R2(2)","R3(1)","R3(2)","R4(1)","R4(2)","R5(1)","R5(2)","R6(1)","R6(2)","R7(1)","R7(2)","R8(1)","R8(2)","R9(1)","R9(2)","RD2(1)","RD2(2)","RS(1)","RS(2)","RR(1)","RR(2)":
                            PlayerCardColor = "Red";
                            break;
                        case "B0","B1(1)","B1(2)","B2(1)","B2(2)","B3(1)","B3(2)","B4(1)","B4(2)","B5(1)","B5(2)","B6(1)","B6(2)","B7(1)","B7(2)","B8(1)","B8(2)","B9(1)","B9(2)","BD2(1)","BD2(2)","BS(1)","BS(2)","BR(1)","BR(2)":    
                            PlayerCardColor = "Blue";
                            break;
                        case "Y0","Y1(1)","Y1(2)","Y2(1)","Y2(2)","Y3(1)","Y3(2)","Y4(1)","Y4(2)","Y5(1)","Y5(2)","Y6(1)","Y6(2)","Y7(1)","Y7(2)","Y8(1)","Y8(2)","Y9(1)","Y9(2)","YD2(1)","YD2(2)","YS(1)","YS(2)","YR(1)","YR(2)":
                            PlayerCardColor = "Yellow";
                            break;
                        case "G0","G1(1)","G1(2)","G2(1)","G2(2)","G3(1)","G3(2)","G4(1)","G4(2)","G5(1)","G5(2)","G6(1)","G6(2)","G7(1)","G7(2)","G8(1)","G8(2)","G9(1)","G9(2)","GD2(1)","GD2(2)","GS(1)","GS(2)","GR(1)","GR(2)":
                            PlayerCardColor = "Greed";
                            break;
                        case "W(1)","W(2)","W(3)","W(4)","WD4(1)","WD4(2)","WD4(3)","WD4(4)":
                            PlayerCardColor = "Wild";
                            break;
                    }
                    switch (PlayerHand.get(PlayChoice2)){
                        case "R0","B0","Y0","G0":
                            PlayerCardType = "0";
                            break;
                        case "R1(1)","R1(2)","B1(1)","B1(2)","Y1(1)","Y1(2)","G1(1)","G1(2)":    
                            PlayerCardType = "1";
                            break;
                        case "R2(1)","R2(2)","B2(1)","B2(2)","Y2(1)","Y2(2)","G2(1)","G2(2)":
                            PlayerCardType = "2";
                            break;
                        case "R3(1)","R3(2)","B3(1)","B3(2)","Y3(1)","Y3(2)","G3(1)","G3(2)":
                            PlayerCardType = "3";
                            break;
                        case "R4(1)","R4(2)","B4(1)","B4(2)","Y4(1)","Y4(2)","G4(1)","G4(2)":
                            PlayerCardType = "4";
                            break;
                        case "R5(1)","R5(2)","B5(1)","B5(2)","Y5(1)","Y5(2)","G5(1)","G5(2)":
                            PlayerCardType = "5";
                            break;    
                        case "R6(1)","R6(2)","B6(1)","B6(2)","Y6(1)","Y6(2)","G6(1)","G6(2)":
                            PlayerCardType = "6";
                            break;  
                        case "R7(1)","R7(2)","B7(1)","B7(2)","Y7(1)","Y7(2)","G7(1)","G7(2)":
                            PlayerCardType = "7";
                            break;      
                        case "R8(1)","R8(2)","B8(1)","B8(2)","Y8(1)","Y8(2)","G8(1)","G8(2)":
                            PlayerCardType = "8";
                            break;    
                        case "R9(1)","R9(2)","B9(1)","B9(2)","Y9(1)","Y9(2)","G9(1)","G9(2)":
                            PlayerCardType = "9";
                            break;  
                        case "RD2(1)","RD2(2)","BD2(1)","BD2(2)","YD2(1)","YD2(2)","GD2(1)","GD2(2)":      
                            PlayerCardType = "Draw 2";
                            break;
                        case "RS(1)","RS(2)","BS(1)","BS(2)","YS(1)","YS(2)","GS(1)","GS(2)":      
                            PlayerCardType = "Skip";
                            break; 
                        case "RR(1)","RR(2)","BR(1)","BR(2)","YR(1)","YR(2)","GR(1)","GR(2)":      
                            PlayerCardType = "Reverse";
                            break;
                    }
                    if (PlayerCardColor == DownCardColor || PlayerCardType == DownCardType) {
                        FirstCard = PlayerHand.get(PlayChoice2);
                        System.out.println("You have played a " + PlayerHand.get(PlayChoice2));
                        PlayerHand.remove(PlayChoice2);
                        PlayerHandLength = PlayerHand.toArray().length;
                        
                    }
                    else {
                        System.out.println("You Cannot Play that Card");
                    }
                }
                else{
                    System.out.println("That is not an option");
                }
                
                
            
        }
    }
    }
}
