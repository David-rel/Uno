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
            "W(1)","W(2)","W(3)","W(4)","WP4(1)","WP4(2)","WP4(3)","WP4(4)"};
    static String[] Colors = {
        "Red","Blue","Yellow","Green"
    };

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
            

    static ArrayList<String> PlayerHand = new ArrayList<>();
    static ArrayList<String> BotHand = new ArrayList<>();
    static ArrayList<String> ColorCards = new ArrayList<>();

    static int Cards1Length = Cards1.length;

    static Scanner S = new Scanner(System.in);

    static String FirstCard = "";
    static int Draw;
    static int DeckLength;
    static int PlayerHandLength;
    static int BotHandLength;

    public static void main(String[] args){
        for (int i = 0; i < Cards1Length; i++) {
            Deck.add(Cards1[i]);
        }
        for (int i = 0; i < 4; i++) {
            ColorCards.add(Colors[i]);
        }
    
        PlayerHandLength = PlayerHand.toArray().length;
        BotHandLength = BotHand.toArray().length;
        DeckLength = Deck.toArray().length;
        String Action;
        String DrawnCard;
    
        for (int i = 0; i < 7; i++) {
            Draw = DrawCard.nextInt(DeckLength);
            DrawnCard = Deck.get(Draw);
            PlayerHand.add(DrawnCard);
            Deck.remove(DrawnCard);
            DeckLength = Deck.toArray().length;
            PlayerHandLength = PlayerHand.toArray().length;
        }
        for (int i = 0; i < 7; i++) {
            Draw = DrawCard.nextInt(DeckLength);
            DrawnCard = Deck.get(Draw);
            BotHand.add(DrawnCard);
            Deck.remove(DrawnCard);
            DeckLength = Deck.toArray().length;
            PlayerHandLength = PlayerHand.toArray().length;
        }
    
        System.out.println("Your Hand is " + PlayerHand);
        System.out.println("The Computer's hand is " + BotHand);
    
        Draw = DrawCard.nextInt(DeckLength);
        FirstCard = Deck.get(Draw);
        Deck.remove(FirstCard);

        PlayerPlay();
    }


    public static void PlayerPlay(){
 
        PlayerHandLength = PlayerHand.toArray().length;
        BotHandLength = BotHand.toArray().length;
        DeckLength = Deck.toArray().length;
        int Draw;
        String Action;
    

        System.out.println("Your Hand is " + PlayerHand);
        System.out.println("The card is " + ANSI_YELLOW + FirstCard + ANSI_RESET);
        for (int i = 0; i < 100; i++) {
            System.out.println("You Can: \n Draw a Card \n Play a Card \n Examine Cards");
            Action = S.nextLine();

            //if statement for stopping the program
            if(Action.equalsIgnoreCase("stop")){
                System.exit(0);
            }

            if (Action.equalsIgnoreCase("Examine Cards")) {
                System.out.println("Your Hand is " + ANSI_YELLOW + PlayerHand + ANSI_RESET);
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
                BotPlay(BotHand, Deck);
            }
            else if (Action.equalsIgnoreCase("Play a Card")){
                int PlayChoice;
                String ColorChoice;
                int PlayChoice2;
                
                System.out.println(ANSI_YELLOW + PlayerHand + ANSI_RESET);
                System.out.println("Which card do you want to play: 1-" + PlayerHandLength);
                
                PlayChoice = S.nextInt();
                PlayChoice--;
                

                if (PlayChoice <= PlayerHandLength){
                    if(PlayerHand.get(PlayChoice).charAt(0) == FirstCard.charAt(0) || PlayerHand.get(PlayChoice).charAt(1) == FirstCard.charAt(1) && PlayerHand.get(PlayChoice).charAt(0) != 'W'){
                        //we need to change this so its 1-7 not 0-6
                        FirstCard = PlayerHand.get(PlayChoice);

                        System.out.println("You have played a " + PlayerHand.get(PlayChoice));
                        PlayerHandLength = PlayerHand.toArray().length;
                        //checks for skip reverse and draw2 2 --------------------------------------------------------------
                        if(PlayerHand.get(PlayChoice).contains("S") || PlayerHand.get(PlayChoice).charAt(1) == 'R'){
                            System.out.println("you get to play again");
                            PlayerHand.remove(PlayerHand.get(PlayChoice));
                            PlayerPlay();
                        }
                        else if(PlayerHand.get(PlayChoice).contains("D")){
                            System.out.println("the bot draws two and you get to play again");
                            String DrawnCard;
                            PlayerHand.remove(PlayerHand.get(PlayChoice));
                            
                            for(int ForLoop = 0; ForLoop < 2; ForLoop++){
                                DeckLength = Deck.toArray().length;
                                Draw = DrawCard.nextInt(DeckLength);
                                DrawnCard = Deck.get(Draw);
                                BotHand.add(DrawnCard);
                                Deck.remove(DrawnCard);
                                System.out.println("Card Drawn");
                                
                            }
                            PlayerPlay();
                        }
                        PlayerHand.remove(PlayerHand.get(PlayChoice));

                        // to right here -----------------------------------------------------------------------------
                        if(CheckWin(PlayerHand, 1) == true){
                            System.out.println("you win");
                            System.exit(0);
                        }
                        BotPlay(BotHand, Deck);
                    }
                    else if(PlayerHand.get(PlayChoice).contains("W")){
                        //play that card as a wild or +4
                        FirstCard = PlayerHand.get(PlayChoice);
                        System.out.println("You have played a " + PlayerHand.get(PlayChoice));
                        String DrawnCard;
                        PlayerHandLength = PlayerHand.toArray().length;
                        System.out.println("What color do you want");
                        ColorChoice = S.next();
                        if (ColorChoice.equalsIgnoreCase("red") || ColorChoice.equalsIgnoreCase("Blue") || ColorChoice.equalsIgnoreCase("Green") || ColorChoice.equalsIgnoreCase("Yellow")) {
                            FirstCard = ColorChoice.toUpperCase();
                        }

                        System.out.println("Wild");
                        System.out.println(FirstCard);

                        if (PlayerHand.get(PlayChoice).contains("WP4")){
                            System.out.println("the bot draws four and you play again");
                            PlayerHand.remove(PlayerHand.get(PlayChoice));
                            for(int ForLoop = 0; ForLoop < 2; ForLoop++){
                                DeckLength = Deck.toArray().length;
                                Draw = DrawCard.nextInt(DeckLength);
                                DrawnCard = Deck.get(Draw);
                                BotHand.add(DrawnCard);
                                Deck.remove(DrawnCard);
                            }
                            PlayerPlay();     
                        }
                        else {
                            PlayerHand.remove(PlayerHand.get(PlayChoice));
                        }
                        
                
                        if(CheckWin(PlayerHand, 1) == true){
                            System.out.println("you win");
                            System.exit(0);
                        }
                        BotPlay(BotHand, Deck);
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


    public static void BotPlay(ArrayList<String> BotHand, ArrayList<String> Deck){
        System.out.println(FirstCard.charAt(0)+ "\n");
        System.out.println(BotHand);
        int BotWildColor;
        int Draw;

        for(int i = 0; i < BotHand.toArray().length; i++){

            System.out.println(BotHand.get(i).charAt(0));  

            if(BotHand.get(i).charAt(0) != 'W' && BotHand.get(i).charAt(0) == FirstCard.charAt(0) || BotHand.get(i).charAt(1) == FirstCard.charAt(1)){
                //Play that card by color
                System.out.println("Bot played: " + BotHand.get(i));
                FirstCard = BotHand.get(i);
                System.out.println("Normal");
                //checks for skip  reverse and draw 2------------------------------------------------------------
                if(BotHand.get(i).contains("S") || BotHand.get(i).charAt(1) == 'R'){
                    System.out.println("bot gets to play again");
                    BotHand.remove(BotHand.get(i));
                    BotPlay(BotHand, Deck);
                }
                else if(BotHand.get(i).contains("D")){
                    System.out.println("you draw two and bot gets to play again");
                    String DrawnCard;
                    BotHand.remove(BotHand.get(i));
                    for(int ForLoop = 0; ForLoop < 2; ForLoop++){
                        DeckLength = Deck.toArray().length;
                        Draw = DrawCard.nextInt(DeckLength);
                        DrawnCard = Deck.get(Draw);
                        PlayerHand.add(DrawnCard);
                        Deck.remove(DrawnCard);
                    }
                    BotPlay(BotHand, Deck);
                }
                BotHand.remove(BotHand.get(i));
                if(CheckWin(BotHand, 2) == true){
                    System.out.println("bot wins");
                    System.exit(0);
                }
                NextPlayer();
            }
            else if(BotHand.get(i).contains("W")){
                //play that card as a wild or +4
                System.out.println("Bot played: " + BotHand.get(i));
                Draw = DrawCard.nextInt(4);
                BotWildColor = Draw--;
                FirstCard = ColorCards.get(BotWildColor);
                System.out.println("Wild");
                System.out.println(FirstCard);
                String DrawnCard;
                if (BotHand.get(i).contains("WP4")){
                    System.out.println("you draws four and the bot plays again");
                    BotHand.remove(BotHand.get(i));
                    for(int ForLoop = 0; ForLoop < 4; ForLoop++){
                        DeckLength = Deck.toArray().length;
                        Draw = DrawCard.nextInt(DeckLength);
                        DrawnCard = Deck.get(Draw);
                        PlayerHand.add(DrawnCard);
                        Deck.remove(DrawnCard);
                    }
                    BotPlay(BotHand, Deck);     
                }
                else {
                    BotHand.remove(BotHand.get(i));
                }
                if(CheckWin(BotHand, 2) == true){
                    System.out.println("bot wins");
                    System.exit(0);
                }
                NextPlayer();
                
            }
        }
        DeckLength = Deck.toArray().length;
        System.out.println(DeckLength);
        
        Random DrawCard = new Random();
        BotHandLength = BotHand.toArray().length;

        Draw = DrawCard.nextInt(DeckLength);
        String DrawnCard = Deck.get(Draw);
        BotHand.add(DrawnCard);
        Deck.remove(DrawnCard);
        DeckLength = Deck.toArray().length;
        BotHandLength = BotHand.toArray().length;

        System.out.println("bot did not have the card");
        System.out.println("The bot drew a " + DrawnCard);
        System.out.println(BotHand);
        NextPlayer();

    }

    public static void NextPlayer(){
        System.out.println("call next player");
        PlayerPlay();
    }

    public static boolean CheckWin(ArrayList<String> PlayerHand, int Playing){
        if(Playing == 1){
            if(PlayerHand.toArray().length == 0){
                return true;
            } else{
                return false;
            }
        } else if(Playing == 2){
            if(PlayerHand.toArray().length == 0){
                return true;
            } else{
                return false;
            }
        }
        return false;
    }
}

//deck problems
//if bot plays 2 and qwe have a 2 we have the ability to play that 2
//change the wild