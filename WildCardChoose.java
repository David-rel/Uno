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
import java.util.logging.Handler;


public class WildCardChoose extends JFrame implements ActionListener{

    static JLayeredPane MainGamePanel = new JLayeredPane();

    static final int GAME_WIDTH=500;
    static final int GAME_HEIGHT= 250;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    static ImageIcon red_wild = new ImageIcon("pics/RedWild.png");
    static ImageIcon blue_wild = new ImageIcon("pics/BlueWild.png");
    static ImageIcon yellow_wild = new ImageIcon("pics/YellowWild.png");
    static ImageIcon green_wild = new ImageIcon("pics/GreenWild.png");

    static JButton RED_WILD = new JButton();
    static JButton BLUE_WILD = new JButton();
    static JButton GREEN_WILD = new JButton();
    static JButton YELLOW_WILD = new JButton();

    static int wait = 0;

    static JLabel text = new JLabel();

    public int WildCardChoose(){
        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Choose");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        text.setOpaque(true);
        text.setSize(300,50);
        text.setLocation(100,10);
        text.setFont(new Font("Arial", Font.ITALIC, 15));
        text.setText("what color do you want");

        MainGamePanel.add(text, Integer.valueOf(1));
        MainGamePanel.add(RED_WILD, Integer.valueOf(1));
        MainGamePanel.add(GREEN_WILD, Integer.valueOf(1));
        MainGamePanel.add(BLUE_WILD, Integer.valueOf(1));
        MainGamePanel.add(YELLOW_WILD, Integer.valueOf(1));

        this.add(MainGamePanel);
        Scanner i = new Scanner(System.in);

        return wait;

    }

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == RED_WILD){
                wait = 1;
                return;
            }
            if(e.getSource() == BLUE_WILD){
                wait = 2;
                return;
            }
            if(e.getSource() == GREEN_WILD){
                wait = 3;
                return;
            }
            if(e.getSource() == YELLOW_WILD){
                wait = 4;
                return;
            }

        }
}