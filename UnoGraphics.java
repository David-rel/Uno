import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.text.AbstractDocument.LeafElement;

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

    static int pos1 = 50; 
    static int pos2 = 100; 
    static int pos3 = 150; 
    static int pos4 = 200; 
    static int pos5 = 250; 
    static int pos6 = 300; 
    static int pos7 = 350; 
    static int pos8 = 400; 
    static int pos9 = 450; 
    static int pos10 = 500; 
    static int pos11 = 550; 
    static int pos12 = 600; 
    static int pos13 = 650; 
    static int pos14 = 700; 
    static int pos15 = 750; 
    static int pos16 = 800; 

    static String DrawnCard = "";

    static int ValueOf = 2;
    static String ColorChoice;

    static int x = 50;
    static int y = 350;

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

        RED_WILD.setIcon(red_wild);
        RED_WILD.setVisible(false);
        BLUE_WILD.setIcon(blue_wild);
        BLUE_WILD.setVisible(false);
        GREEN_WILD.setIcon(green_wild);
        BLUE_WILD.setVisible(false);
        YELLOW_WILD.setIcon(yellow_wild);
        YELLOW_WILD.setVisible(false);


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

        ListOfCards[54].setIcon(ListOfCardsIcons[54]);
        ListOfCards[54].setSize(67, 111);
        ListOfCards[54].setVisible(false);

        ListOfCards[55].setIcon(ListOfCardsIcons[55]);
        ListOfCards[55].setSize(67, 111);
        ListOfCards[55].setVisible(false);

        ListOfCards[56].setIcon(ListOfCardsIcons[56]);
        ListOfCards[56].setSize(67, 111);
        ListOfCards[56].setVisible(false);   
   
        ListOfCards[57].setIcon(ListOfCardsIcons[57]);
        ListOfCards[57].setSize(67, 111);
        ListOfCards[57].setVisible(false);      
        
        ListOfCards[58].setIcon(ListOfCardsIcons[58]);
        ListOfCards[58].setSize(67, 111);
        ListOfCards[58].setVisible(false);      
        
        ListOfCards[59].setIcon(ListOfCardsIcons[59]);
        ListOfCards[59].setSize(67, 111);
        ListOfCards[59].setVisible(false);      
        
        ListOfCards[60].setIcon(ListOfCardsIcons[60]);
        ListOfCards[60].setSize(67, 111);
        ListOfCards[60].setVisible(false);      
        
        ListOfCards[61].setIcon(ListOfCardsIcons[61]);
        ListOfCards[61].setSize(67, 111);
        ListOfCards[61].setVisible(false);      
        
        ListOfCards[62].setIcon(ListOfCardsIcons[62]);
        ListOfCards[62].setSize(67, 111);
        ListOfCards[62].setVisible(false);      
        
        ListOfCards[63].setIcon(ListOfCardsIcons[63]);
        ListOfCards[63].setSize(67, 111);
        ListOfCards[63].setVisible(false);      
        
        ListOfCards[64].setIcon(ListOfCardsIcons[64]);
        ListOfCards[64].setSize(67, 111);
        ListOfCards[64].setVisible(false);      
        
        ListOfCards[65].setIcon(ListOfCardsIcons[65]);
        ListOfCards[65].setSize(67, 111);
        ListOfCards[65].setVisible(false);      
        
        ListOfCards[66].setIcon(ListOfCardsIcons[66]);
        ListOfCards[66].setSize(67, 111);
        ListOfCards[66].setVisible(false);      
        
        ListOfCards[67].setIcon(ListOfCardsIcons[67]);
        ListOfCards[67].setSize(67, 111);
        ListOfCards[67].setVisible(false);      
        
        ListOfCards[68].setIcon(ListOfCardsIcons[68]);
        ListOfCards[68].setSize(67, 111);
        ListOfCards[68].setVisible(false);      
        
        ListOfCards[69].setIcon(ListOfCardsIcons[69]);
        ListOfCards[69].setSize(67, 111);
        ListOfCards[69].setVisible(false);      
        
        ListOfCards[70].setIcon(ListOfCardsIcons[70]);
        ListOfCards[70].setSize(67, 111);
        ListOfCards[70].setVisible(false);      
        
        ListOfCards[71].setIcon(ListOfCardsIcons[71]);
        ListOfCards[71].setSize(67, 111);
        ListOfCards[71].setVisible(false);      
        
        ListOfCards[72].setIcon(ListOfCardsIcons[72]);
        ListOfCards[72].setSize(67, 111);
        ListOfCards[72].setVisible(false);      
        
        ListOfCards[73].setIcon(ListOfCardsIcons[73]);
        ListOfCards[73].setSize(67, 111);
        ListOfCards[73].setVisible(false);      
        
        ListOfCards[74].setIcon(ListOfCardsIcons[74]);
        ListOfCards[74].setSize(67, 111);
        ListOfCards[74].setVisible(false);      
        
        ListOfCards[75].setIcon(ListOfCardsIcons[75]);
        ListOfCards[75].setSize(67, 111);
        ListOfCards[75].setVisible(false);      
        
        ListOfCards[76].setIcon(ListOfCardsIcons[76]);
        ListOfCards[76].setSize(67, 111);
        ListOfCards[76].setVisible(false);      
        
        ListOfCards[77].setIcon(ListOfCardsIcons[77]);
        ListOfCards[77].setSize(67, 111);
        ListOfCards[77].setVisible(false);      
        
        ListOfCards[78].setIcon(ListOfCardsIcons[78]);
        ListOfCards[78].setSize(67, 111);
        ListOfCards[78].setVisible(false);      
        
        ListOfCards[79].setIcon(ListOfCardsIcons[79]);
        ListOfCards[79].setSize(67, 111);
        ListOfCards[79].setVisible(false);      
        
        ListOfCards[80].setIcon(ListOfCardsIcons[80]);
        ListOfCards[80].setSize(67, 111);
        ListOfCards[80].setVisible(false);      
        
        ListOfCards[81].setIcon(ListOfCardsIcons[81]);
        ListOfCards[81].setSize(67, 111);
        ListOfCards[81].setVisible(false);      
        
        ListOfCards[82].setIcon(ListOfCardsIcons[82]);
        ListOfCards[82].setSize(67, 111);
        ListOfCards[82].setVisible(false);      
        
        ListOfCards[83].setIcon(ListOfCardsIcons[83]);
        ListOfCards[83].setSize(67, 111);
        ListOfCards[83].setVisible(false);      
        
        ListOfCards[84].setIcon(ListOfCardsIcons[84]);
        ListOfCards[84].setSize(67, 111);
        ListOfCards[84].setVisible(false);      
        
        ListOfCards[85].setIcon(ListOfCardsIcons[85]);
        ListOfCards[85].setSize(67, 111);
        ListOfCards[85].setVisible(false);      
        
        ListOfCards[86].setIcon(ListOfCardsIcons[86]);
        ListOfCards[86].setSize(67, 111);
        ListOfCards[86].setVisible(false);      
        
        ListOfCards[87].setIcon(ListOfCardsIcons[87]);
        ListOfCards[87].setSize(67, 111);
        ListOfCards[87].setVisible(false);      
        
        ListOfCards[88].setIcon(ListOfCardsIcons[88]);
        ListOfCards[88].setSize(67, 111);
        ListOfCards[88].setVisible(false);      
        
        ListOfCards[89].setIcon(ListOfCardsIcons[89]);
        ListOfCards[89].setSize(67, 111);
        ListOfCards[89].setVisible(false);      
        
        ListOfCards[90].setIcon(ListOfCardsIcons[90]);
        ListOfCards[90].setSize(67, 111);
        ListOfCards[90].setVisible(false);      
        
        ListOfCards[91].setIcon(ListOfCardsIcons[91]);
        ListOfCards[91].setSize(67, 111);
        ListOfCards[91].setVisible(false);      
        
        ListOfCards[92].setIcon(ListOfCardsIcons[92]);
        ListOfCards[92].setSize(67, 111);
        ListOfCards[92].setVisible(false);      
        
        ListOfCards[93].setIcon(ListOfCardsIcons[93]);
        ListOfCards[93].setSize(67, 111);
        ListOfCards[93].setVisible(false);      
        
        ListOfCards[94].setIcon(ListOfCardsIcons[94]);
        ListOfCards[94].setSize(67, 111);
        ListOfCards[94].setVisible(false);      
        
        ListOfCards[95].setIcon(ListOfCardsIcons[95]);
        ListOfCards[95].setSize(67, 111);
        ListOfCards[95].setVisible(false);      
        
        ListOfCards[96].setIcon(ListOfCardsIcons[96]);
        ListOfCards[96].setSize(67, 111);
        ListOfCards[96].setVisible(false);      
        
        ListOfCards[97].setIcon(ListOfCardsIcons[97]);
        ListOfCards[97].setSize(67, 111);
        ListOfCards[97].setVisible(false);      
        
        ListOfCards[98].setIcon(ListOfCardsIcons[98]);
        ListOfCards[98].setSize(67, 111);
        ListOfCards[98].setVisible(false);      
        
        ListOfCards[99].setIcon(ListOfCardsIcons[99]);
        ListOfCards[99].setSize(67, 111);
        ListOfCards[99].setVisible(false);      
        
        ListOfCards[100].setIcon(ListOfCardsIcons[100]);
        ListOfCards[100].setSize(67, 111);
        ListOfCards[100].setVisible(false);      
        
        ListOfCards[101].setIcon(ListOfCardsIcons[101]);
        ListOfCards[101].setSize(67, 111);
        ListOfCards[101].setVisible(false);      
        
        ListOfCards[102].setIcon(ListOfCardsIcons[102]);
        ListOfCards[102].setSize(67, 111);
        ListOfCards[102].setVisible(false);      
        
        ListOfCards[103].setIcon(ListOfCardsIcons[103]);
        ListOfCards[103].setSize(67, 111);
        ListOfCards[103].setVisible(false);      
        
        ListOfCards[104].setIcon(ListOfCardsIcons[104]);
        ListOfCards[104].setSize(67, 111);
        ListOfCards[104].setVisible(false);      
        
        ListOfCards[105].setIcon(ListOfCardsIcons[105]);
        ListOfCards[105].setSize(67, 111);
        ListOfCards[105].setVisible(false);      
        
        ListOfCards[106].setIcon(ListOfCardsIcons[106]);
        ListOfCards[106].setSize(67, 111);
        ListOfCards[106].setVisible(false);      
        
        ListOfCards[107].setIcon(ListOfCardsIcons[107]);
        ListOfCards[107].setSize(67, 111);
        ListOfCards[107].setVisible(false);      


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
        MainGamePanel.add(ListOfCards[54], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[55], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[56], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[57], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[58], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[59], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[60], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[61], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[62], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[63], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[64], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[65], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[66], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[67], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[68], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[69], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[70], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[71], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[72], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[73], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[74], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[75], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[76], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[77], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[78], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[79], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[80], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[81], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[82], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[83], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[84], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[85], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[86], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[87], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[88], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[89], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[90], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[91], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[92], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[93], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[94], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[95], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[96], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[97], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[98], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[99], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[100], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[101], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[102], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[103], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[104], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[105], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[106], Integer.valueOf(ValueOf));
        MainGamePanel.add(ListOfCards[107], Integer.valueOf(ValueOf));
        MainGamePanel.add(RED_WILD, Integer.valueOf(ValueOf));
        MainGamePanel.add(BLUE_WILD, Integer.valueOf(ValueOf));
        MainGamePanel.add(GREEN_WILD, Integer.valueOf(ValueOf));
        MainGamePanel.add(YELLOW_WILD, Integer.valueOf(ValueOf));
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
                index = 1;
                
                for (int i = 0; i < 7; i++) {
                    System.out.println(ListOfCards);
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

                System.out.println("Your Hand is " + PlayerHand);
                System.out.println("The Computer's hand is " + BotHand);
                Draw = DrawCard.nextInt(DeckLength);
                FirstCard = Deck.get(Draw);
                CheckCard.Check(FirstCard, ListOfCards, Deck, PlayerHandIndex).setVisible(true);
                CheckCard.Check(FirstCard, ListOfCards, Deck, PlayerHandIndex).setBounds(215, 200, 67, 111);
                // CheckCard.Check(FirstCard, ListOfCards, Deck, PlayerHandIndex).setEnabled(false);
                Deck.remove(FirstCard);
                
                break;
 
            }

    }

    public static void PlayerPlay(){
        System.out.println("test");
       for (int i = 0; i < ListOfCardsLength; i++) {
           ListOfCards[i].setEnabled(true);
        }
        UNO_CARD.setEnabled(true);
    }


    public void BotPlays(){
        System.out.println("test");
        for (int i = 0; i < ListOfCardsLength; i++) {
            ListOfCards[i].setEnabled(false);
        }
        UNO_CARD.setEnabled(false);

        int BotWildColor;
        int Draw;
        int i;

        for(i = 0; i < BotHand.toArray().length; i++){ 

            if(BotHand.get(i).charAt(0) != 'W' && BotHand.get(i).charAt(0) == FirstCard.charAt(0) || BotHand.get(i).charAt(1) == FirstCard.charAt(1)){
                //Play that card by color
                System.out.println(BotHand);
                System.out.println("Bot played: " + BotHand.get(i));

                FirstCard = BotHand.get(i);
                First = BotCheck.Check(ListOfCards, BotHandLength, BotHand, i);
                First.setBounds(215, 200, 67, 111);
                First.setVisible(true);
                
                System.out.println(FirstCard);

                ValueOf++;
                MainGamePanel.add(First, Integer.valueOf(ValueOf));

                //checks for skip  reverse and draw 2------------------------------------------------------------
                if(BotHand.get(i).contains("S") || BotHand.get(i).charAt(1) == 'R'){
                    System.out.println("bot gets to play again");
                    BotHand.remove(BotHand.get(i));
                    if(BotHand.toArray().length == 0){
                        WinOrLose W = new WinOrLose("you lose");
                    }
                    BotPlays();
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
                        CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setVisible(true);
                        CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setBounds(x, y, 67, 111);
                        CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).addActionListener(this);
                        Deck.remove(DrawnCard);
                        DeckLength = Deck.toArray().length;
                        PlayerHandLength = PlayerHand.toArray().length;
                        x = x + 50;
                    }
                    if(BotHand.toArray().length == 0){
                        WinOrLose W = new WinOrLose("you lose");
                    }
                    BotPlays();
                }
                BotHand.remove(BotHand.get(i));
                if(BotHand.toArray().length == 0){
                    WinOrLose W = new WinOrLose("you lose");
                }
                PlayerPlay();
            }
            else if(BotHand.get(i).contains("W")){
                //play that card as a wild or +4
                System.out.println("Bot played: " + BotHand.get(i));
                Draw = DrawCard.nextInt(4);
                if(Draw == 0){
                    First = RED_WILD;
                    First.setVisible(true);
                    First.setBounds(215, 200, 67, 111);
                }
                if(Draw == 1){
                    First = BLUE_WILD;
                    First.setVisible(true);
                    First.setBounds(215, 200, 67, 111);
                }
                if(Draw == 2){
                    First = GREEN_WILD;
                    First.setVisible(true);
                    First.setBounds(215, 200, 67, 111);
                }
                if(Draw == 3){
                    First = YELLOW_WILD;
                    First.setVisible(true);
                    First.setBounds(215, 200, 67, 111);
                }
                FirstCard = ColorCards.get(Draw);
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
                        CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setVisible(true);
                        CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setBounds(x, y, 67, 111);
                        CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).addActionListener(this);
                        Deck.remove(DrawnCard);
                        DeckLength = Deck.toArray().length;
                        PlayerHandLength = PlayerHand.toArray().length;
                        x = x + 50;
                    }
                }
                PlayerPlay();
            }
        }
        BotDrawCard();  
    }

    public static void BotDrawCard(){
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
            // if( DrawsCard.Draws(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).getX() > 700){
            //     x = 150;
            //     y = 425;
            //     CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).setBounds(x, y, 67, 111);
            //x = 50;
            //static int y = 350;
            // }
            CheckCard.Check(DrawnCard, ListOfCards, PlayerHand, PlayerHandIndex).addActionListener(this);
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
                    First = CardClicked.Check(ListOfCards, PlayerHand, PlayerHandLength, PlayerHandIndex, i);   
                    FirstCard = PlayerHand.get(i);
                    First.setBounds(215, 200, 67, 111);
                    System.out.println(FirstCard);

                    ValueOf++;
                    MainGamePanel.add(First, Integer.valueOf(ValueOf));

                    System.out.println("You have played a " + PlayerHand.get(i));

                    PlayerHandLength = PlayerHand.toArray().length;
                    
                    // if(PlayerHand.get(i).contains("1") || PlayerHand.get(i).contains("2") || PlayerHand.get(i).contains("3") || PlayerHand.get(i).contains("4") || PlayerHand.get(i).contains("5") || PlayerHand.get(i).contains("6") || PlayerHand.get(i).contains("7") || PlayerHand.get(i).contains("8") || PlayerHand.get(i).contains("9") || PlayerHand.get(i).contains("0")){

                    //     BotPlays();
                    //     break;

                    // }

                    //checks for skip reverse and draw2 2 --------------------------------------------------------------
                    if(FirstCard.contains("S") || FirstCard.charAt(1) == 'R'){
                        System.out.println("you get to play again");
                        PlayerHand.remove(FirstCard);
                        if(PlayerHand.toArray().length == 0){
                            WinOrLose W = new WinOrLose("you win");
                        }
                        PlayerPlay();
                        break;
                    }
                    else if(FirstCard.contains("D")){
                        System.out.println("the bot draws two and you get to play again");
                        String DrawnCard;
                        PlayerHand.remove(FirstCard);
                            
                        for(int ForLoop = 0; ForLoop < 2; ForLoop++){
                            DeckLength = Deck.toArray().length;
                            Draw = DrawCard.nextInt(DeckLength);
                            DrawnCard = Deck.get(Draw);
                            BotHand.add(DrawnCard);
                            Deck.remove(DrawnCard);
                            System.out.println("Cards Drawn");
                        }
                        if(PlayerHand.toArray().length == 0){
                            WinOrLose W = new WinOrLose("you win");
                        }
                        PlayerPlay();
                        break;
                    }
                    else if(PlayerHand.get(i).contains("W")){
                        //play that card as a wild or +4
                        FirstCard = PlayerHand.get(i);
                        System.out.println("You have played a " + PlayerHand.get(i));
                        if(PlayerHand.toArray().length == 0){
                            WinOrLose W = new WinOrLose("you win");
                        }
                        //check stuff here
                        String DrawnCard;
                        PlayerHandLength = PlayerHand.toArray().length;
                        System.out.println("What color do you want");
                        ColorChoice = S.next();
                        if (ColorChoice.equalsIgnoreCase("Red") || ColorChoice.equalsIgnoreCase("Blue") || ColorChoice.equalsIgnoreCase("Green") || ColorChoice.equalsIgnoreCase("Yellow")) {
                            FirstCard = ColorChoice.toUpperCase();
                        }

                        // if(WildCardChoose() == "Red"){
                            
                        // }

                        System.out.println("Wild");
                        System.out.println(FirstCard);

                        if (PlayerHand.get(i).contains("WP4")){
                            System.out.println("the bot draws four");
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
                    }
                    if(PlayerHand.toArray().length == 0){
                        WinOrLose W = new WinOrLose("you win");
                    }
                    PlayerHand.remove(FirstCard);
                    BotPlays();
                }    
                else {
                    System.out.println("You Cannot Play that Card");
                }
            }

        }
    }
}

