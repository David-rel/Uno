import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;


public class HomeScreen extends JFrame implements ActionListener{
    
    JLabel WELCOME = new JLabel();
    JLabel UNO = new JLabel();

    ImageIcon uno = new ImageIcon("pics/UnoLogo.png");

    JButton PLAY = new JButton("LETS PLAY");

    JLayeredPane MainGamePanel = new JLayeredPane();

    JPanel Background = new JPanel();

    static final int GAME_WIDTH=910;
    static final int GAME_HEIGHT= 525;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    public void HomeScreen(){
        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Uno Game");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        Background.setOpaque(true);
        Background.setSize(SCREEN_SIZE);
        Background.setLocation(-10,0);
        Background.setBackground(Color.BLACK);

        WELCOME.setBounds(200, 25, 450, 100);
        WELCOME.setText("WELCOME TOO...");
        WELCOME.setBackground(Color.RED);
        WELCOME.setForeground(Color.BLACK);
        WELCOME.setFont(new Font("Arial", Font.ITALIC, 50));
        WELCOME.setVisible(true);
        WELCOME.setOpaque(true);

        UNO.setBounds(290,150, 292, 175);
        UNO.setIcon(uno);
        UNO.setVisible(true);
        UNO.setOpaque(true);

        PLAY.setBounds(225, 350, 400, 100);
        PLAY.setBackground(new Color(250, 50, 50));
        PLAY.setForeground(Color.BLACK);
        PLAY.setFont(new Font("Arial", Font.ITALIC, 30));
        PLAY.setVisible(true);
        PLAY.setOpaque(true);
        PLAY.addActionListener(this);

        MainGamePanel.add(Background, Integer.valueOf(0));
        MainGamePanel.add(WELCOME, Integer.valueOf(1));
        MainGamePanel.add(UNO, Integer.valueOf(1));
        MainGamePanel.add(PLAY, Integer.valueOf(2));
        
        this.add(MainGamePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == PLAY){
            UnoGraphics G = new UnoGraphics();
            this.dispose();
        }
    }
}
