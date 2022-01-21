import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.*;

import java.awt.event.*;

public class Graphics extends JFrame implements ActionListener{
   
    JLayeredPane MainGamePanel;

    ImageIcon BackgroundImage = new ImageIcon("pics/BackGround.png");
    ImageIcon Uno = new ImageIcon("pics/Uno.png");
    ImageIcon UnoLogo = new ImageIcon("pics/UnoLogo.png");


    JLabel BACKGROUND_PANEL = new JLabel();
    JLabel UNO_LOGO_PANEL = new JLabel();

    JButton EXIT_BTN = new JButton("EXIT");
    JButton UNO_CARD = new JButton();

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

        MainGamePanel=new JLayeredPane();

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
        EXIT_BTN.setBounds(50,50,75,50);
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

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == EXIT_BTN){
            System.exit(0);
        }
    }

}

