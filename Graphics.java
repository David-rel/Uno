import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.*;

import java.awt.event.*;
import java.util.Random;

public class Graphics extends JFrame implements ActionListener{
   
    static JLayeredPane MainGamePanel = new JLayeredPane();

    ImageIcon BackgroundImage = new ImageIcon("pics/BackGround.png");
    ImageIcon Uno = new ImageIcon("pics/Uno.png");
    ImageIcon UnoLogo = new ImageIcon("pics/UnoLogo.png");

    static String[] Cards1 = {
        "R0","R1(1)","R1(2)","R2(1)","R2(2)","R3(1)","R3(2)","R4(1)","R4(2)","R5(1)","R5(2)","R6(1)","R6(2)","R7(1)","R7(2)","R8(1)","R8(2)","R9(1)","R9(2)","RD2(1)","RD2(2)","RS(1)","RS(2)","RR(1)","RR(2)",
        "B0","B1(1)","B1(2)","B2(1)","B2(2)","B3(1)","B3(2)","B4(1)","B4(2)","B5(1)","B5(2)","B6(1)","B6(2)","B7(1)","B7(2)","B8(1)","B8(2)","B9(1)","B9(2)","BD2(1)","BD2(2)","BS(1)","BS(2)","BR(1)","BR(2)",
        "Y0","Y1(1)","Y1(2)","Y2(1)","Y2(2)","Y3(1)","Y3(2)","Y4(1)","Y4(2)","Y5(1)","Y5(2)","Y6(1)","Y6(2)","Y7(1)","Y7(2)","Y8(1)","Y8(2)","Y9(1)","Y9(2)","YD2(1)","YD2(2)","YS(1)","YS(2)","YR(1)","YR(2)",
        "G0","G1(1)","G1(2)","G2(1)","G2(2)","G3(1)","G3(2)","G4(1)","G4(2)","G5(1)","G5(2)","G6(1)","G6(2)","G7(1)","G7(2)","G8(1)","G8(2)","G9(1)","G9(2)","GD2(1)","GD2(2)","GS(1)","GS(2)","GR(1)","GR(2)",
        "W(1)","W(2)","W(3)","W(4)","WP4(1)","WP4(2)","WP4(3)","Wp4(4)"};

        static int Cards1Length = Cards1.length;


    static ImageIcon GREEN_0 = new ImageIcon("pics/Green0.png");
    static ImageIcon GREEN_1 = new ImageIcon("pics/Green1.png");
    static    ImageIcon GREEN_2 = new ImageIcon("pics/Green2.png");
    static    ImageIcon GREEN_3 = new ImageIcon("pics/Green3.png");
    static    ImageIcon GREEN_4 = new ImageIcon("pics/Green4.png");
    static    ImageIcon GREEN_5 = new ImageIcon("pics/Green5.png");
    static ImageIcon GREEN_6 = new ImageIcon("pics/Green6.png");
    static ImageIcon GREEN_7= new ImageIcon("pics/Green7.png");
    static ImageIcon GREEN_8 = new ImageIcon("pics/Green8.png");
    static ImageIcon GREEN_9 = new ImageIcon("pics/Green9.png");
    static ImageIcon GREEN_SKIP = new ImageIcon("pics/GreenSkip.png");
    static ImageIcon GREEN_REVERSE = new ImageIcon("pics/GreenReverse.png");
        static ImageIcon GREEN_DRAW_2 = new ImageIcon("pics/GreenPlusTwo.png");

        static ImageIcon RED_0 = new ImageIcon("pics/Red0.png");
        static ImageIcon RED_1 = new ImageIcon("pics/Red1.png");
        static    ImageIcon RED_2 = new ImageIcon("pics/Red2.png");
        static    ImageIcon RED_3 = new ImageIcon("pics/Red3.png");
        static    ImageIcon RED_4 = new ImageIcon("pics/Red4.png");
        static    ImageIcon RED_5 = new ImageIcon("pics/Red5.png");
        static ImageIcon RED_6 = new ImageIcon("pics/Red6.png");
        static ImageIcon RED_7= new ImageIcon("pics/Red7.png");
        static ImageIcon RED_8 = new ImageIcon("pics/Red8.png");
        static ImageIcon RED_9 = new ImageIcon("pics/Red9.png");
        static ImageIcon RED_SKIP = new ImageIcon("pics/RedSkip.png");
        static ImageIcon RED_REVERSE = new ImageIcon("pics/RedReverse.png");
            static ImageIcon RED_DRAW_2 = new ImageIcon("pics/RedPlusTwo.png");


            static ImageIcon BLUE_0 = new ImageIcon("pics/Blue0.png");
            static ImageIcon BLUE_1 = new ImageIcon("pics/Blue1.png");
            static    ImageIcon BLUE_2 = new ImageIcon("pics/Blue2.png");
            static    ImageIcon BLUE_3 = new ImageIcon("pics/Blue3.png");
            static    ImageIcon BLUE_4 = new ImageIcon("pics/Blue4.png");
            static    ImageIcon BLUE_5 = new ImageIcon("pics/Blue5.png");
            static ImageIcon BLUE_6 = new ImageIcon("pics/Blue6.png");
            static ImageIcon BLUE_7= new ImageIcon("pics/Blue7.png");
            static ImageIcon BLUE_8 = new ImageIcon("pics/Blue8.png");
            static ImageIcon BLUE_9 = new ImageIcon("pics/Blue9.png");
            static ImageIcon BLUE_SKIP = new ImageIcon("pics/BlueSkip.png");
            static ImageIcon BLUE_REVERSE = new ImageIcon("pics/BlueReverse.png");
                static ImageIcon BLUE_DRAW_2 = new ImageIcon("pics/BluePlusTwo.png");

                static ImageIcon YELLOW_0 = new ImageIcon("pics/Yellow0.png");
                static ImageIcon YELLOW_1 = new ImageIcon("pics/Yellow1.png");
                static    ImageIcon YELLOW_2 = new ImageIcon("pics/Yellow2.png");
                static    ImageIcon YELLOW_3 = new ImageIcon("pics/Yellow3.png");
                static    ImageIcon YELLOW_4 = new ImageIcon("pics/Yellow4.png");
                static    ImageIcon YELLOW_5 = new ImageIcon("pics/Yellow5.png");
                static ImageIcon YELLOW_6 = new ImageIcon("pics/Yellow6.png");
                static ImageIcon YELLOW_7= new ImageIcon("pics/Yellow7.png");
                static ImageIcon YELLOW_8 = new ImageIcon("pics/Yellow8.png");
                static ImageIcon YELLOW_9 = new ImageIcon("pics/Yellow9.png");
                static ImageIcon YELLOW_SKIP = new ImageIcon("pics/YellowSkip.png");
                static ImageIcon YELLOW_REVERSE = new ImageIcon("pics/YellowReverse.png");
                    static ImageIcon YELLOW_DRAW_2 = new ImageIcon("pics/YellowPlusTwo.png");


        static    ImageIcon WILD_PLUS_4 = new ImageIcon("pics/PlusFour.png");
        static    ImageIcon WILD = new ImageIcon("pics/Wild.png");


    JLabel BACKGROUND_PANEL = new JLabel();
    JLabel UNO_LOGO_PANEL = new JLabel();

    JButton EXIT_BTN = new JButton("EXIT");
    JButton UNO_CARD = new JButton();
    JButton FirstCard = new JButton();


    static final int GAME_WIDTH=910;
    static final int GAME_HEIGHT= 525;
    static final Dimension SCREEN_SIZE =  new Dimension(GAME_WIDTH, GAME_HEIGHT);

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


            MainGamePanel.add(BACKGROUND_PANEL,Integer.valueOf(0));
            MainGamePanel.add(UNO_CARD,Integer.valueOf(1));
            MainGamePanel.add(EXIT_BTN,Integer.valueOf(1));
            MainGamePanel.add(UNO_LOGO_PANEL,Integer.valueOf(1));
            this.add(MainGamePanel);

            while(true){
                FirstCard.setVisible(true);
                FirstCard.setBounds(215,200, 67, 111);
                FirstCard.setIcon(RandomCard());
                MainGamePanel.add(FirstCard, Integer.valueOf(2));
                System.out.println(Cards1Length);
                MainGamePanel.add(FirstCard, Integer.valueOf(2));
                UNO_CARD.addActionListener(this);
                break;
            }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == EXIT_BTN){
            System.exit(0);
        }

        if(e.getSource()==UNO_CARD){
            newCard.setVisible(true);
            newCard.setBounds(300,200, 67, 111);
            MainGamePanel.add(newCard, Integer.valueOf(2));
        }
    }

    public static ImageIcon RandomCard(int FirstCard){
        switch(FirstCard){
            case 0:
                return RED_1;
            case 1:
                return RED_2;
            case 2:
                return RED_3;
            case 3:
                return RED_4;
            case 4:
                return RED_5;
            case 5:
                return RED_6;
            case 6:
                return RED_7;
            case 7:
                return RED_8;
            case 8:
                return RED_9;
            case 9:
                return RED_SKIP;
            case 10:
                return RED_REVERSE;
            case 11:
                return RED_DRAW_2;
            case 12:
                return RED_0;
            case 13:
                return RED_0;
            case 14:
                return BLUE_0;
            case 15:
                return BLUE_1;
            case 16:
                return BLUE_2;                
            case 17:
                return BLUE_3;
            case 18:
                return BLUE_4;
            case 19:
                return BLUE_5;
            case 20:
                return BLUE_6;
            case 21:
                return BLUE_7;
            case 22:
                return BLUE_8;
            case 23:
                return BLUE_9;
            case 24:
                return BLUE_SKIP;
            case 25:
                return BLUE_REVERSE;
            case 26:
                return BLUE_DRAW_2;
            case 27:
                return GREEN_0;
            case 28:
                return GREEN_1;
            case 29:
                return GREEN_2;
            case 30:
                return GREEN_3;
            case 31:
                return GREEN_4;
            case 32:
                return GREEN_5;
            case 33:
                return GREEN_6;
            case 34:
                return GREEN_7;
            case 35:
                return GREEN_8;
            case 36:
                return GREEN_9;
            case 37:
                return GREEN_SKIP;
            case 38:
                return GREEN_REVERSE;
            case 39:
                return GREEN_DRAW_2;
            case 40:
                return YELLOW_DRAW_2;
            case 41:
                return YELLOW_3;
            case 42:
                return YELLOW_4;
            case 43:
                return YELLOW_5;
            case 44:
                return YELLOW_6;
            case 45:
                return YELLOW_7;
            case 46:
                return YELLOW_8;
            case 47:
                return YELLOW_9;
            case 48:
                return YELLOW_SKIP;
            case 49:
                return YELLOW_REVERSE;
             case 50:
                return YELLOW_2;
            case 51:
                return YELLOW_0;
            case 52:
                return YELLOW_1;
            case 53:
                return WILD_PLUS_4;
            case 54:
                return WILD;
        }
        return RED_0;
    }

}

