import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UnoGraphics extends JFrame implements ActionListener{
   
    static JLayeredPane MainGamePanel = new JLayeredPane();

    ImageIcon BackgroundImage = new ImageIcon("pics/BackGround.png");
    ImageIcon Uno = new ImageIcon("pics/Uno.png");
    ImageIcon UnoLogo = new ImageIcon("pics/UnoLogo.png");

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

    static ArrayList<String> PlayerHand = new ArrayList<>();
    static ArrayList<Integer> PlayerHandIndex = new ArrayList<>();
    static ArrayList<String> BotHand = new ArrayList<>();
    static ArrayList<String> ColorCards = new ArrayList<>();

    static int Cards1Length = Cards1.length;

    static Scanner S = new Scanner(System.in);

    static String FirstCard = "";
    static int Draw;
    static int PlayerHandLength = PlayerHand.toArray().length;

    static JButton[] ListOfCards = CreateCards.Create();
    static ImageIcon[] ListOfCardsIcons = CreateCardIcons.Create();

    static int ListOfCardsLength = ListOfCards.length;

    static JLabel BACKGROUND_PANEL = new JLabel();
    static JLabel UNO_LOGO_PANEL = new JLabel();

    static  JButton EXIT_BTN = new JButton("EXIT");
    static JButton UNO_CARD = new JButton();
    static JButton First = new JButton();


    static final int GAME_WIDTH=910;
    static final int GAME_HEIGHT= 525;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    static int BotHandLength = BotHand.toArray().length;
    static int DeckLength;

    static int index;

    static String DrawnCard = "";

    static int ValueOf = 2;

    public void Graphics(){
        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Uno Game");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        BACKGROUND_PANEL.setOpaque(true);
        BACKGROUND_PANEL.setSize(SCREEN_SIZE);
        BACKGROUND_PANEL.setLocation(-10,0);
        BACKGROUND_PANEL.setIcon(BackgroundImage);


        UNO_CARD.setOpaque(true);
        UNO_CARD.setSize(64,99);
        UNO_CARD.setIcon(Uno);
        UNO_CARD.setLocation(650,200);
        UNO_CARD.addActionListener(this);
        
        UNO_LOGO_PANEL.setOpaque(true);
        UNO_LOGO_PANEL.setSize(292,175);
        UNO_LOGO_PANEL.setIcon(UnoLogo);
        UNO_LOGO_PANEL.setLocation(300,25);

        
        EXIT_BTN.setVisible(true);
        EXIT_BTN.setBounds(50,50,100,50);
        EXIT_BTN.setBackground(Color.BLACK);
        EXIT_BTN.setFocusable(false);
        EXIT_BTN.setFont(new Font("Arial", Font.ITALIC, 15));
        EXIT_BTN.setForeground(Color.WHITE);
        EXIT_BTN.addActionListener(this);

        ListOfCards[0].setIcon(ListOfCardsIcons[0]);
        ListOfCards[0].setSize(67, 111);
        ListOfCards[0].setVisible(false);

        ListOfCards[1].setIcon(ListOfCardsIcons[1]);
        ListOfCards[1].setSize(67, 111);
        ListOfCards[1].setVisible(false);

        ListOfCards[2].setIcon(ListOfCardsIcons[2]);
        ListOfCards[2].setSize(67, 111);
        ListOfCards[2].setVisible(false);

        ListOfCards[3].setIcon(ListOfCardsIcons[3]);
        ListOfCards[3].setSize(67, 111);
        ListOfCards[3].setVisible(false);

        ListOfCards[4].setIcon(ListOfCardsIcons[4]);
        ListOfCards[4].setSize(67, 111);
        ListOfCards[4].setVisible(false);

        ListOfCards[5].setIcon(ListOfCardsIcons[5]);
        ListOfCards[5].setSize(67, 111);
        ListOfCards[5].setVisible(false);

        ListOfCards[6].setIcon(ListOfCardsIcons[6]);
        ListOfCards[6].setSize(67, 111);
        ListOfCards[6].setVisible(false);

        ListOfCards[7].setIcon(ListOfCardsIcons[7]);
        ListOfCards[7].setSize(67, 111);
        ListOfCards[7].setVisible(false);

        ListOfCards[8].setIcon(ListOfCardsIcons[8]);
        ListOfCards[8].setSize(67, 111);
        ListOfCards[8].setVisible(false);

        ListOfCards[9].setIcon(ListOfCardsIcons[9]);
        ListOfCards[9].setSize(67, 111);
        ListOfCards[9].setVisible(false);

        ListOfCards[10].setIcon(ListOfCardsIcons[10]);
        ListOfCards[10].setSize(67, 111);
        ListOfCards[10].setVisible(false);

        ListOfCards[11].setIcon(ListOfCardsIcons[11]);
        ListOfCards[11].setSize(67, 111);
        ListOfCards[11].setVisible(false);

        ListOfCards[12].setIcon(ListOfCardsIcons[12]);
        ListOfCards[12].setSize(67, 111);
        ListOfCards[12].setVisible(false);

        ListOfCards[13].setIcon(ListOfCardsIcons[13]);
        ListOfCards[13].setSize(67, 111);
        ListOfCards[13].setVisible(false);

        ListOfCards[14].setIcon(ListOfCardsIcons[14]);
        ListOfCards[14].setSize(67, 111);
        ListOfCards[14].setVisible(false);

        ListOfCards[15].setIcon(ListOfCardsIcons[15]);
        ListOfCards[15].setSize(67, 111);
        ListOfCards[15].setVisible(false);

        ListOfCards[16].setIcon(ListOfCardsIcons[16]);
        ListOfCards[16].setSize(67, 111);
        ListOfCards[16].setVisible(false);

        ListOfCards[17].setIcon(ListOfCardsIcons[17]);
        ListOfCards[17].setSize(67, 111);
        ListOfCards[17].setVisible(false);

        ListOfCards[18].setIcon(ListOfCardsIcons[18]);
        ListOfCards[18].setSize(67, 111);
        ListOfCards[18].setVisible(false);

        ListOfCards[19].setIcon(ListOfCardsIcons[19]);
        ListOfCards[19].setSize(67, 111);
        ListOfCards[19].setVisible(false);

        ListOfCards[20].setIcon(ListOfCardsIcons[20]);
        ListOfCards[20].setSize(67, 111);
        ListOfCards[20].setVisible(false);

        ListOfCards[21].setIcon(ListOfCardsIcons[21]);
        ListOfCards[21].setSize(67, 111);
        ListOfCards[21].setVisible(false);

        ListOfCards[22].setIcon(ListOfCardsIcons[22]);
        ListOfCards[22].setSize(67, 111);
        ListOfCards[22].setVisible(false);

        ListOfCards[23].setIcon(ListOfCardsIcons[23]);
        ListOfCards[23].setSize(67, 111);
        ListOfCards[23].setVisible(false);

        ListOfCards[24].setIcon(ListOfCardsIcons[24]);
        ListOfCards[24].setSize(67, 111);
        ListOfCards[24].setVisible(false);

        ListOfCards[25].setIcon(ListOfCardsIcons[25]);
        ListOfCards[25].setSize(67, 111);
        ListOfCards[25].setVisible(false);

        ListOfCards[26].setIcon(ListOfCardsIcons[26]);
        ListOfCards[26].setSize(67, 111);
        ListOfCards[26].setVisible(false);

        ListOfCards[27].setIcon(ListOfCardsIcons[27]);
        ListOfCards[27].setSize(67, 111);
        ListOfCards[27].setVisible(false);

        ListOfCards[28].setIcon(ListOfCardsIcons[28]);
        ListOfCards[28].setSize(67, 111);
        ListOfCards[28].setVisible(false);

        ListOfCards[29].setIcon(ListOfCardsIcons[29]);
        ListOfCards[29].setSize(67, 111);
        ListOfCards[29].setVisible(false);

        ListOfCards[30].setIcon(ListOfCardsIcons[30]);
        ListOfCards[30].setSize(67, 111);
        ListOfCards[30].setVisible(false);

        ListOfCards[31].setIcon(ListOfCardsIcons[31]);
        ListOfCards[31].setSize(67, 111);
        ListOfCards[31].setVisible(false);

        ListOfCards[32].setIcon(ListOfCardsIcons[32]);
        ListOfCards[32].setSize(67, 111);
        ListOfCards[32].setVisible(false);

        ListOfCards[33].setIcon(ListOfCardsIcons[33]);
        ListOfCards[33].setSize(67, 111);
        ListOfCards[33].setVisible(false);

        ListOfCards[34].setIcon(ListOfCardsIcons[34]);
        ListOfCards[34].setSize(67, 111);
        ListOfCards[34].setVisible(false);

        ListOfCards[35].setIcon(ListOfCardsIcons[35]);
        ListOfCards[35].setSize(67, 111);
        ListOfCards[35].setVisible(false);

        ListOfCards[36].setIcon(ListOfCardsIcons[36]);
        ListOfCards[36].setSize(67, 111);
        ListOfCards[36].setVisible(false);

        ListOfCards[37].setIcon(ListOfCardsIcons[37]);
        ListOfCards[37].setSize(67, 111);
        ListOfCards[37].setVisible(false);

        ListOfCards[38].setIcon(ListOfCardsIcons[38]);
        ListOfCards[38].setSize(67, 111);
        ListOfCards[38].setVisible(false);

        ListOfCards[39].setIcon(ListOfCardsIcons[39]);
        ListOfCards[39].setSize(67, 111);
        ListOfCards[39].setVisible(false);

        ListOfCards[40].setIcon(ListOfCardsIcons[40]);
        ListOfCards[40].setSize(67, 111);
        ListOfCards[40].setVisible(false);

        ListOfCards[41].setIcon(ListOfCardsIcons[41]);
        ListOfCards[41].setSize(67, 111);
        ListOfCards[41].setVisible(false);

        ListOfCards[42].setIcon(ListOfCardsIcons[42]);
        ListOfCards[42].setSize(67, 111);
        ListOfCards[42].setVisible(false);

        ListOfCards[43].setIcon(ListOfCardsIcons[43]);
        ListOfCards[43].setSize(67, 111);
        ListOfCards[43].setVisible(false);

        ListOfCards[44].setIcon(ListOfCardsIcons[44]);
        ListOfCards[44].setSize(67, 111);
        ListOfCards[44].setVisible(false);

        ListOfCards[45].setIcon(ListOfCardsIcons[45]);
        ListOfCards[45].setSize(67, 111);
        ListOfCards[45].setVisible(false);

        ListOfCards[46].setIcon(ListOfCardsIcons[46]);
        ListOfCards[46].setSize(67, 111);
        ListOfCards[46].setVisible(false);

        ListOfCards[47].setIcon(ListOfCardsIcons[47]);
        ListOfCards[47].setSize(67, 111);
        ListOfCards[47].setVisible(false);

        ListOfCards[48].setIcon(ListOfCardsIcons[48]);
        ListOfCards[48].setSize(67, 111);
        ListOfCards[48].setVisible(false);

        ListOfCards[49].setIcon(ListOfCardsIcons[49]);
        ListOfCards[49].setSize(67, 111);
        ListOfCards[49].setVisible(false);

        ListOfCards[50].setIcon(ListOfCardsIcons[50]);
        ListOfCards[50].setSize(67, 111);
        ListOfCards[50].setVisible(false);

        ListOfCards[51].setIcon(ListOfCardsIcons[51]);
        ListOfCards[51].setSize(67, 111);
        ListOfCards[51].setVisible(false);

        ListOfCards[52].setIcon(ListOfCardsIcons[52]);
        ListOfCards[52].setSize(67, 111);
        ListOfCards[52].setVisible(false);

        ListOfCards[53].setIcon(ListOfCardsIcons[53]);
        ListOfCards[53].setSize(67, 111);
        ListOfCards[53].setVisible(false);

        

        MainGamePanel.add(ListOfCards[0], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[1], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[2], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[3], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[4], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[5], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[6], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[7], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[8], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[9], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[10], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[11], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[12], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[13], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[14], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[15], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[16], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[17], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[18], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[19], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[20], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[21], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[22], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[23], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[24], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[25], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[26], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[27], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[28], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[29], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[30], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[31], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[32], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[33], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[34], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[35], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[36], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[37], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[38], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[39], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[40], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[41], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[42], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[43], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[44], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[45], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[46], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[47], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[48], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[49], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[50], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[51], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[52], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[53], Integer.valueOf(ValueOf));
        MainGamePanel.add(BACKGROUND_PANEL,Integer.valueOf(0));
        MainGamePanel.add(UNO_CARD,Integer.valueOf(1));
        MainGamePanel.add(EXIT_BTN,Integer.valueOf(1));
        MainGamePanel.add(UNO_LOGO_PANEL,Integer.valueOf(1));
        this.add(MainGamePanel);

            while(true){

                for (int i = 0; i < Cards1Length; i++) {
                    Deck.add(Cards1[i]);
                }
                for (int i = 0; i < 4; i++) {
                   ColorCards.add(Colors[i]);
                }
            
                //now its just implementation 
                //good job me
                PlayerHandLength = PlayerHand.toArray().length;
                BotHandLength = BotHand.toArray().length;
                DeckLength = Deck.toArray().length;
                String Action;
                int x = 150;
                int y = 350;
                index = 1;
                
                for (int i = 0; i < 7; i++) {
                    Draw = DrawCard.nextInt(DeckLength);
                    DrawnCard = Deck.get(Draw);
                    PlayerHand.add(DrawnCard);
                    PlayerHandIndex.add(index);
                    CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setVisible(true);
                    CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setBounds(x, y, 67, 111);
                    CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).addActionListener(this);
                    Deck.remove(DrawnCard);
                    DeckLength = Deck.toArray().length;
                    PlayerHandLength = PlayerHand.toArray().length;
                    x = x + 50;
                    index++;
                }
                for (int i = 0; i < 7; i++) {
                    Draw = DrawCard.nextInt(DeckLength);
                    DrawnCard = Deck.get(Draw);
                    BotHand.add(DrawnCard);
                    Deck.remove(DrawnCard);
                    DeckLength = Deck.toArray().length;
                    PlayerHandLength = PlayerHand.toArray().length;
                }
                
                PlayerPlay();
                break;
 
            }

    }

    public static void PlayerPlay(){
        System.out.println("Your Hand is " + PlayerHand);
        System.out.println("The Computer's hand is " + BotHand);
        Draw = DrawCard.nextInt(DeckLength);
        FirstCard = Deck.get(Draw);
        CheckCard.Check(FirstCard, ListOfCards, Deck, PlayerHandIndex).setVisible(true);
        CheckCard.Check(FirstCard, ListOfCards, Deck, PlayerHandIndex).setBounds(215, 200, 67, 111);
        CheckCard.Check(FirstCard, ListOfCards, Deck, PlayerHandIndex).setEnabled(false);
        Deck.remove(FirstCard);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == EXIT_BTN){
            System.exit(0);
        } 

        for (int i = 0; i < PlayerHandLength; i++) {

            if(e.getSource() == CardClicked.Check(ListOfCards, PlayerHand, PlayerHandLength, PlayerHandIndex, i)){
                First = CardClicked.Check(ListOfCards, PlayerHand, PlayerHandLength, PlayerHandIndex, i);
                
                FirstCard = PlayerHand.get(i);

                //add logic

                
                First.setBounds(215, 200, 67, 111);
                First.setEnabled(false); 
                System.out.println(FirstCard);
                PlayerHand.remove(FirstCard);
                ValueOf++;
                MainGamePanel.add(First, Integer.valueOf(ValueOf));


            }
        }
    }

    public static JButton CreateCard(){

        Random r = new Random();
        int RandCard = r.nextInt(ListOfCardsLength);

        return ListOfCards[RandCard];
    }


}

//add draw card
//fix errors
//add requirments for playing cards
//fix errors
//add bot and not being able to play cards during their turn
//fix errors
//add bots actual things
//fix errors
//
