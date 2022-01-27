import java.util.ArrayList;
import java.util.Random;

public class BotPlays {

    static Random DrawCard = new Random();
    static String[] Cards = {
            "R0","R1(1)","R1(2)","R2(1)","R2(2)","R3(1)","R3(2)","R4(1)","R4(2)","R5(1)","R5(2)","R6(1)","R6(2)","R7(1)","R7(2)","R8(1)","R8(2)","R9(1)","R9(2)","RD2(1)","RD2(2)","RS(1)","RS(2)","RR(1)","RR(2)",
            "B0","B1(1)","B1(2)","B2(1)","B2(2)","B3(1)","B3(2)","B4(1)","B4(2)","B5(1)","B5(2)","B6(1)","B6(2)","B7(1)","B7(2)","B8(1)","B8(2)","B9(1)","B9(2)","BD2(1)","BD2(2)","BS(1)","BS(2)","BR(1)","BR(2)",
            "Y0","Y1(1)","Y1(2)","Y2(1)","Y2(2)","Y3(1)","Y3(2)","Y4(1)","Y4(2)","Y5(1)","Y5(2)","Y6(1)","Y6(2)","Y7(1)","Y7(2)","Y8(1)","Y8(2)","Y9(1)","Y9(2)","YD2(1)","YD2(2)","YS(1)","YS(2)","YR(1)","YR(2)",
            "G0","G1(1)","G1(2)","G2(1)","G2(2)","G3(1)","G3(2)","G4(1)","G4(2)","G5(1)","G5(2)","G6(1)","G6(2)","G7(1)","G7(2)","G8(1)","G8(2)","G9(1)","G9(2)","GD2(1)","GD2(2)","GS(1)","GS(2)","GR(1)","GR(2)",
            "W(1)","W(2)","W(3)","W(4)","WP4(1)","WP4(2)","WP4(3)","WP4(4)"};
    

    public static void BotPlay(ArrayList<String> BotHand, String FirstCard, ArrayList<String> Deck){
        System.out.println(FirstCard.charAt(0)+ "\n");
        System.out.println(BotHand);

        for(int i = 0; i < BotHand.toArray().length; i++){

            System.out.println(BotHand.get(i).charAt(0));  

            if(BotHand.get(i).charAt(0) == FirstCard.charAt(0)){
                //Play that card by color
                System.out.println("Bot played: " + BotHand.get(i));
                BotHand.remove(BotHand.get(i));
                NextPlayer(BotHand);
            }
            else if(BotHand.get(i).charAt(1) == FirstCard.charAt(1)){
                //Play that card by number
                System.out.println("Bot played: " + BotHand.get(i));
                BotHand.remove(BotHand.get(i));
                NextPlayer(BotHand);
            }

            else if(BotHand.get(i).contains("W")){
                //play that card as a wild or +4
                System.out.println("Bot played: " + BotHand.get(i));
                BotHand.remove(BotHand.get(i));
                NextPlayer(BotHand);
            }
        }
        int DeckLength = Deck.toArray().length;
        System.out.println(DeckLength);
        int Draw;
        Random DrawCard = new Random();

        Draw = DrawCard.nextInt(DeckLength);
        String DrawnCard = Deck.get(Draw);
        BotHand.add(DrawnCard);
        Deck.remove(DrawnCard);
        DeckLength = Deck.toArray().length;
        // int BotHandLength = BotHand.toArray().length;

        System.out.println("bot did not have the card");
        System.out.println("The bot drew a " + DrawnCard);
        System.out.println(BotHand); 
        NextPlayer(BotHand);

    }

    public static void NextPlayer(ArrayList<String> BotHand){
        System.out.println("call next player");
        System.out.println(BotHand);
        System.exit(0);
    }

}
