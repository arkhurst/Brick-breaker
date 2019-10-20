import javax.swing.*;

public class Main {
    public static void main (String[]args){

        JFrame frame = new JFrame("Brick Breaker Game");
        GamePlay gp = new GamePlay();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10,10,700,600);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(gp);
    }

}
