import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UnoGraphics extends JFrame implements ActionListener{
   
    static JLayeredPane MainGamePanel = new JLayeredPane();

    static String ChooseColor = "";

    ImageIcon BackgroundImage = new ImageIcon("pics/BackGround.png");
    ImageIcon Uno = new ImageIcon("pics/Uno.png");
    ImageIcon UnoLogo = new ImageIcon("pics/UnoLogo.png");

    static JTextField ColorChooser = new JTextField();

    static Random DrawCard = new Random();

    static ArrayList<String> Deck = new ArrayList<>();
    static String[] Cards1 = {
            "R0(1)","R1(1)","R1(2)","R2(1)","R2(2)","R3(1)","R3(2)","R4(1)","R4(2)","R5(1)","R5(2)","R6(1)","R6(2)","R7(1)","R7(2)","R8(1)","R8(2)","R9(1)","R9(2)","RD2(1)","RD2(2)","RS(1)","RS(2)","RR(1)","RR(2)",
            "B0(1)","B1(1)","B1(2)","B2(1)","B2(2)","B3(1)","B3(2)","B4(1)","B4(2)","B5(1)","B5(2)","B6(1)","B6(2)","B7(1)","B7(2)","B8(1)","B8(2)","B9(1)","B9(2)","BD2(1)","BD2(2)","BS(1)","BS(2)","BR(1)","BR(2)",
            "Y0(1)","Y1(1)","Y1(2)","Y2(1)","Y2(2)","Y3(1)","Y3(2)","Y4(1)","Y4(2)","Y5(1)","Y5(2)","Y6(1)","Y6(2)","Y7(1)","Y7(2)","Y8(1)","Y8(2)","Y9(1)","Y9(2)","YD2(1)","YD2(2)","YS(1)","YS(2)","YR(1)","YR(2)",
            "G0(1)","G1(1)","G1(2)","G2(1)","G2(2)","G3(1)","G3(2)","G4(1)","G4(2)","G5(1)","G5(2)","G6(1)","G6(2)","G7(1)","G7(2)","G8(1)","G8(2)","G9(1)","G9(2)","GD2(1)","GD2(2)","GS(1)","GS(2)","GR(1)","GR(2)",
            "W(1)","W(2)","W(3)","W(4)","WP4(1)","WP4(2)","WP4(3)","WP4(4)"};
    static String[] Colors = {
        "Red","Blue","Yellow","Green"
    };

    static ArrayList<String> PlayerHand = new ArrayList<>();
    static ArrayList<Integer> PlayerHandIndex = new ArrayList<>();
    static ArrayList<String> BotHand = new ArrayList<>();
    static ArrayList<String> ColorCards = new ArrayList<>();
    static ArrayList<Integer> PlayerCardPos = new ArrayList<>();

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

    static ImageIcon red_wild = new ImageIcon("pics/RedWild.png");
    static ImageIcon blue_wild = new ImageIcon("pics/BlueWild.png");
    static ImageIcon yellow_wild = new ImageIcon("pics/YellowWild.png");
    static ImageIcon green_wild = new ImageIcon("pics/GreenWild.png");

    static JButton RED_WILD = new JButton();
    static JButton BLUE_WILD = new JButton();
    static JButton GREEN_WILD = new JButton();
    static JButton YELLOW_WILD = new JButton();

    static final int GAME_WIDTH=910;
    static final int GAME_HEIGHT= 525;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    static int BotHandLength = BotHand.toArray().length;
    static int DeckLength;

    static int index;

    static boolean bottomCards = true;

    static String DrawnCard = "";

    static int ValueOf = 2;
    static String ColorChoice;

    static int x = 50;
    static int y = 350;
    static String ColorChoice2 = "";
    

    public void UnoGraphics(){
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

        ColorChooser.setOpaque(true);
        ColorChooser.setBounds(500, 200, 200, 50);
        ColorChooser.setForeground(Color.BLACK);
        ColorChooser.setFont((new Font("Arial", Font.ITALIC, 15)));
        ColorChooser.setVisible(false);

        RED_WILD.setIcon(red_wild);
        RED_WILD.setVisible(false);

        BLUE_WILD.setIcon(blue_wild);
        BLUE_WILD.setVisible(false);

        GREEN_WILD.setIcon(green_wild);
        GREEN_WILD.setVisible(false);  

        YELLOW_WILD.setIcon(yellow_wild);
        YELLOW_WILD.setVisible(false);


        UNO_CARD.setOpaque(true);
        UNO_CARD.setSize(64,99);
        UNO_CARD.setIcon(Uno);
        UNO_CARD.setLocation(650,50);
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

        for(int i = 0; i < 108; i++){
            ListOfCards[i].setIcon(ListOfCardsIcons[i]);
            ListOfCards[i].setSize(67, 111);
            ListOfCards[i].setVisible(false);
            MainGamePanel.add(ListOfCards[i], Integer.valueOf(ValueOf));
        }

        MainGamePanel.add(RED_WILD, Integer.valueOf(ValueOf));
        MainGamePanel.add(BLUE_WILD, Integer.valueOf(ValueOf));
        MainGamePanel.add(GREEN_WILD, Integer.valueOf(ValueOf));
        MainGamePanel.add(YELLOW_WILD, Integer.valueOf(ValueOf));
        MainGamePanel.add(BACKGROUND_PANEL,Integer.valueOf(0));
        MainGamePanel.add(UNO_CARD,Integer.valueOf(1));
        MainGamePanel.add(EXIT_BTN,Integer.valueOf(1));
        MainGamePanel.add(ColorChooser,Integer.valueOf(1));
        this.add(MainGamePanel);

            while(true){

                for (int i = 0; i < Cards1Length; i++) {
                    Deck.add(Cards1[i]);
                }
                for (int i = 0; i < 4; i++) {
                   ColorCards.add(Colors[i]);
                }
            
                PlayerHandLength = PlayerHand.toArray().length;
                BotHandLength = BotHand.toArray().length;
                DeckLength = Deck.toArray().length;
                index = 1;
                
                for (int i = 0; i < 7; i++) {
                    Draw = DrawCard.nextInt(DeckLength);
                    DrawnCard = Deck.get(Draw);
                    PlayerHand.add(DrawnCard);
                    CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setVisible(true);
                    CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setBounds(x, y, 67, 111);
                    CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).addActionListener(this);
                    PlayerCardPos.add(x);
                    PlayerCardPos.add(y);
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

                Draw = DrawCard.nextInt(DeckLength);
                FirstCard = Deck.get(Draw);
                CheckCard.Check(FirstCard, ListOfCards, Deck, PlayerHandIndex).setVisible(true);
                CheckCard.Check(FirstCard, ListOfCards, Deck, PlayerHandIndex).setBounds(215, 50, 67, 111);
                
                Deck.remove(FirstCard);
                
                break;
 
            }
            while(true) {
                if(BotHand.toArray().length == 0){
                    WinOrLose W = new WinOrLose("you lose");
                    break;
                }
                else if(PlayerHand.toArray().length == 0){
                    WinOrLose W = new WinOrLose("you win");
                    break;
                }
            }
    }
    public static void PlayerPlay(){
       for (int i = 0; i < ListOfCardsLength; i++) {
           ListOfCards[i].setEnabled(true);
        }
        UNO_CARD.setEnabled(true);
    }


    public void BotPlays(){
        for (int i = 0; i < ListOfCardsLength; i++) {
            ListOfCards[i].setEnabled(false);
        }
        UNO_CARD.setEnabled(false);

        int BP = 0;
        int Draw;
        int i;

        for(i = 0; i < BotHand.toArray().length; i++){ 

            if(BotHand.get(i).charAt(0) != 'W' && BotHand.get(i).charAt(0) == FirstCard.charAt(0) || BotHand.get(i).charAt(1) == FirstCard.charAt(1)){

                FirstCard = BotHand.get(i);
                First = BotCheck.Check(ListOfCards, BotHandLength, BotHand, i);
                First.setBounds(215, 50, 67, 111);
                First.setVisible(true);
                
                ValueOf++;
                MainGamePanel.add(First, Integer.valueOf(ValueOf));
                

                if(BotHand.get(i).charAt(1) == 'S' || BotHand.get(i).charAt(1) == 'R' || FirstCard.charAt(1) == 'R'){
                    BotHand.remove(BotHand.get(i));
                    BP = 1;
                    BotPlays();
                    break;
                }
                else if(BotHand.get(i).charAt(1) == 'D' || BotHand.get(i).contains("D") || FirstCard.contains("D") || FirstCard.charAt(1) == 'D'){
                    String DrawnCard;
                    for(int ForLoop = 0; ForLoop < 2; ForLoop++){
                        DeckLength = Deck.toArray().length;
                        Draw = DrawCard.nextInt(DeckLength);
                        DrawnCard = Deck.get(Draw);
                        PlayerHand.add(DrawnCard);
                        

                        
                        CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setVisible(true);
                        CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setBounds(x, y, 67, 111);
                        CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).addActionListener(this);
                        if (CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).getX() > 800){
                            x = 50;
                            y = 250;
                            if(CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).getX() > 800 && CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).getY() == 250){
                                x = 50;
                                y = 350;
                            }
                            CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setBounds(x, y, 67, 111);
                        }
                        PlayerCardPos.add(x);
                        PlayerCardPos.add(y);
                        Deck.remove(DrawnCard);
                        DeckLength = Deck.toArray().length;
                        PlayerHandLength = PlayerHand.toArray().length;
                        x = x + 50;
                    }
                    BP = 1;
                    BotHand.remove(BotHand.get(i));
                    BotPlays();
                    break;
                }
                BotHand.remove(BotHand.get(i));
                BP = 1;
                PlayerPlay();
                break;
            }
            else if(BotHand.get(i).contains("W") || BotHand.get(i).charAt(0) == 'W'){
                Draw = DrawCard.nextInt(4);
                if(Draw == 0){
                    First = RED_WILD;
                    First.setVisible(true);
                    First.setBounds(215, 50, 67, 111);
                    MainGamePanel.add(First, Integer.valueOf(ValueOf));
                    FirstCard = "Red";
                }
                else if(Draw == 1){
                    First = BLUE_WILD;
                    First.setVisible(true);
                    First.setBounds(215, 50, 67, 111);
                    MainGamePanel.add(First, Integer.valueOf(ValueOf));
                    FirstCard = "Blue";
                }
                else if(Draw == 2){
                    First = GREEN_WILD;
                    First.setVisible(true);
                    First.setBounds(215, 50, 67, 111);
                    MainGamePanel.add(First, Integer.valueOf(ValueOf));
                    FirstCard = "Green";
                }
                else if(Draw == 3){
                    First = YELLOW_WILD;
                    First.setVisible(true);
                    First.setBounds(215, 50, 67, 111);
                    MainGamePanel.add(First, Integer.valueOf(ValueOf));
                    FirstCard = "Yellow";
                }
                if (BotHand.get(i).contains("WP4")){
                    for(int ForLoop = 0; ForLoop < 4; ForLoop++){
                        DeckLength = Deck.toArray().length;
                        Draw = DrawCard.nextInt(DeckLength);
                        DrawnCard = Deck.get(Draw);
                        PlayerHand.add(DrawnCard);
                        CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setVisible(true);
                        CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setBounds(x, y, 67, 111);
                        CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).addActionListener(this);
                        if (CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).getX() > 800){
                            x = 50;
                            y = 250;
                            if(CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).getX() > 800 && CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).getY() == 250){
                                x = 50;
                                y = 350;
                            }
                            CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setBounds(x, y, 67, 111);
                        }
                        PlayerCardPos.add(x);
                        PlayerCardPos.add(y);
                        Deck.remove(DrawnCard);
                        DeckLength = Deck.toArray().length;
                        PlayerHandLength = PlayerHand.toArray().length;
                        x = x + 50;
                    }
                    BP = 1;
                    BotHand.remove(BotHand.get(i));
                    BotPlays();
                    break;
                }
                BotHand.remove(BotHand.get(i));
                BP = 1;
                PlayerPlay();
                break;
            }
        }
        if (BP == 0) {
            BotDrawCard(); 
        }
         
    }

    public static void BotDrawCard(){
        DeckLength = Deck.toArray().length;
        
        Random DrawCard = new Random();
        BotHandLength = BotHand.toArray().length;

        Draw = DrawCard.nextInt(DeckLength);
        String DrawnCard = Deck.get(Draw);
        BotHand.add(DrawnCard);
        Deck.remove(DrawnCard);
        DeckLength = Deck.toArray().length;
        BotHandLength = BotHand.toArray().length;

        PlayerPlay();
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == EXIT_BTN){
            System.exit(0);
        } 

        if (e.getSource() == First){   
        }

        if (e.getSource() == UNO_CARD){
            DeckLength = Deck.toArray().length;
            Draw = DrawCard.nextInt(DeckLength);
            DrawnCard = Deck.get(Draw);
            PlayerHand.add(DrawnCard);
            CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setVisible(true);
            CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setBounds(x, y, 67, 111);
            if (CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).getX() > 800){
                x = 50;
                y = 250;
                if(CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).getX() > 800 && CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).getY() == 250){
                    x = 50;
                    y = 350;
                }
                CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setBounds(x, y, 67, 111);
            }
            CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).addActionListener(this);
            PlayerCardPos.add(x);
            PlayerCardPos.add(y);
            Deck.remove(DrawnCard);
            DeckLength = Deck.toArray().length;
            PlayerHandLength = PlayerHand.toArray().length;
            x = x + 50;
            BotPlays();
        }

        for (int i = 0; i < PlayerHandLength; i++) {

            if (e.getSource() == CardClicked.Check(ListOfCards, PlayerHand, PlayerHandLength, PlayerHandIndex, i)){
                
                if(PlayerHand.get(i).charAt(0) == FirstCard.charAt(0) || PlayerHand.get(i).charAt(1) == FirstCard.charAt(1)){

                    First = CardClicked.Check(ListOfCards, PlayerHand, PlayerHandLength, PlayerHandIndex, i);
                    FirstCard = PlayerHand.get(i);
                    First.setBounds(215, 50, 67, 111);
                    ValueOf++;
                    MainGamePanel.add(First, Integer.valueOf(ValueOf));
                    PlayerHandLength = PlayerHand.toArray().length;
                    if(FirstCard.contains("S") || FirstCard.charAt(1) == 'R'){
                        PlayerHand.remove(FirstCard);
                        PlayerPlay();
                        break;
                    }
                    else if(FirstCard.contains("D")){
                        String DrawnCard;
                        PlayerHand.remove(FirstCard);
                            
                        for(int ForLoop = 0; ForLoop < 2; ForLoop++){
                            DeckLength = Deck.toArray().length;
                            Draw = DrawCard.nextInt(DeckLength);
                            DrawnCard = Deck.get(Draw);
                            BotHand.add(DrawnCard);
                            Deck.remove(DrawnCard);
                        }
                        PlayerPlay();
                        break;
                    }
                    PlayerHand.remove(FirstCard);
                    BotPlays();
                }
                else if(PlayerHand.get(i).charAt(0) == 'W'){
                    First = CardClicked.Check(ListOfCards, PlayerHand, PlayerHandLength, PlayerHandIndex, i);   
                    First.setBounds(215, 50, 67, 111);
                    First.setVisible(true);
                    ValueOf++;
                    MainGamePanel.add(First, Integer.valueOf(ValueOf));
                    FirstCard = PlayerHand.get(i);
                    String DrawnCard;
                    PlayerHandLength = PlayerHand.toArray().length;
                    while(true){
                        ChooseColor = JOptionPane.showInputDialog("What Color Do You Want");
                        if(ChooseColor.equalsIgnoreCase("red")){
                            First = RED_WILD;
                            First.setVisible(true);
                            First.setBounds(215, 50, 67, 111);
                            MainGamePanel.add(First, Integer.valueOf(ValueOf));
                            FirstCard = "Red";
                            break;
                        }
                        if(ChooseColor.equalsIgnoreCase("blue")){
                            First = BLUE_WILD;
                            First.setVisible(true);
                            First.setBounds(215, 50, 67, 111);
                            MainGamePanel.add(First, Integer.valueOf(ValueOf));
                            FirstCard = "Blue";
                            break;
                        }
                        if(ChooseColor.equalsIgnoreCase("green")){
                            First = GREEN_WILD;
                            First.setVisible(true);
                            First.setBounds(215, 50, 67, 111);
                            MainGamePanel.add(First, Integer.valueOf(ValueOf));
                            FirstCard = "Green";
                            break;
                        }
                        if(ChooseColor.equalsIgnoreCase("yellow")){
                            First = YELLOW_WILD;
                            First.setVisible(true);
                            First.setBounds(215, 50, 67, 111);
                            MainGamePanel.add(First, Integer.valueOf(ValueOf));
                            FirstCard = "Yellow";
                            break;
                        }
                        else{
                            continue;
                        }
                    }

                    
                    ColorChooser.setVisible(false);
                    if (PlayerHand.get(i).contains("WP4")){
                        PlayerHand.remove(PlayerHand.get(i));
                        for(int ForLoop = 0; ForLoop < 2; ForLoop++){
                            DeckLength = Deck.toArray().length;
                            Draw = DrawCard.nextInt(DeckLength);
                            DrawnCard = Deck.get(Draw);
                            BotHand.add(DrawnCard);
                            Deck.remove(DrawnCard);
                        }
                    }
                    else {
                        PlayerHand.remove(PlayerHand.get(i));
                    }
                    PlayerPlay();
                }    
                else {
                    System.out.println("You Cannot Play that Card");
                }
            }
        }
    }
}

