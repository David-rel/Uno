import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.*;

public class Graphics extends JFrame{
   

    JLayeredPane MainGamePanel;
    ImageIcon BackgroundImage = new ImageIcon("pics/BackGround.png");
    ImageIcon Uno = new ImageIcon("pics/Uno.png");
    JLabel BACKGROUND_PANEL = new JLabel();
    JButton UNO_CARD = new JButton();

    static final int GAME_WIDTH=910;
    static final int GAME_HEIGHT= 525;
    static final Dimension SCREEN_SIZE =  new Dimension(GAME_WIDTH, GAME_HEIGHT);

    public void Graphics(){
        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Gun Fight 1");
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
        UNO_CARD.setLocation(545,100);



        MainGamePanel.add(BACKGROUND_PANEL,Integer.valueOf(0));
        MainGamePanel.add(UNO_CARD,Integer.valueOf(1));
        this.add(MainGamePanel);

    }

}
