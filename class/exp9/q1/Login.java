import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Login {
    public static void main(String[] arg){
        Border border = BorderFactory.createLineBorder(Color.GRAY,3);
        JLabel label =new JLabel();
        label.setText("Login");
        label.setFont(new Font("Roman",Font.BOLD,30));
        label.setBounds(100, 0, 420, 50);


        JFrame frame = new JFrame();
        frame.setTitle("Login");
        frame.setSize(620,620);
        frame.setForeground(Color.BLACK);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(label);
    }
}
