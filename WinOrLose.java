import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.*;
import java.awt.event.*;



public class WinOrLose extends JFrame implements ActionListener{

    JLayeredPane MainGamePanel = new JLayeredPane();

    static final int GAME_WIDTH=500;
    static final int GAME_HEIGHT= 250;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    JLabel text = new JLabel();
    JButton EXIT_BTN = new JButton("EXIT...");

    public WinOrLose(String info){
        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Results");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);


        text.setOpaque(true);
        text.setSize(300,100);
        text.setLocation(100,25);
        text.setFont(new Font("Arial", Font.ITALIC, 15));
        text.setText(info + "... play a agin");


        
        EXIT_BTN.setVisible(true);
        EXIT_BTN.setBounds(50,150,100,50);
        EXIT_BTN.setBackground(Color.BLACK);
        EXIT_BTN.setFocusable(false);
        EXIT_BTN.setFont(new Font("Arial", Font.ITALIC, 15));
        EXIT_BTN.setForeground(Color.WHITE);
        EXIT_BTN.addActionListener(this);

        MainGamePanel.add(EXIT_BTN, Integer.valueOf(1));
        MainGamePanel.add(text, Integer.valueOf(1));
        

        this.add(MainGamePanel);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == EXIT_BTN){
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            System.exit(0);
        }
    }

}
