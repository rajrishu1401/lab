import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculator extends JFrame {
    double a=0;
    double b=0;
    StringBuilder value=new StringBuilder("0");

    Calculator() {
        this.setTitle("Calculator");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(320, 420);
        this.setLocationRelativeTo(null);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(0,50));
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setText(value.toString());
        textField.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        ArrayList<JButton> num = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            num.add(new JButton(Integer.toString(i)));
        }
        ArrayList<JButton> operator = new ArrayList<>(Arrays.asList(new JButton("+"), new JButton("-"), new JButton("*"), new JButton("/"), new JButton("="), new JButton("<-"), new JButton("."), new JButton("AC")));

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel.setLayout(new GridLayout(4, 4));
        int j = 0;
        for (int i = 1; i <= 18; i++){
            if (j<10) {
                panel.add(num.get(j));
                j += 1;
            } else {
                panel.add(operator.get(j-10));
                j++;
            }
        }
        this.add(textField, BorderLayout.NORTH);
        this.add(panel,BorderLayout.CENTER);

        j = 0;
        for (int i = 1; i <= 18; i++){
            if (j<10) {
                num.get(j).addActionListener((ActionListener) ->{
                    JButton btn = (JButton) ActionListener.getSource();
                    String digit = btn.getText();
                    if(value.toString().equals("0")){
                        value.setLength(0);
                    }
                    value.append(digit);
                    textField.setText(value.toString());
                });

            } else {
                operator.get(j-10).addActionListener((ActionListener) ->{
                    JButton btn = (JButton) ActionListener.getSource();
                    String op = btn.getText();
                    if(op.equals("=")){
                        this.cal();
                        textField.setText(value.toString());
                    }else if(op.equals("<-")){

                    }else if(op.equals("AC")){
                        value.setLength(0);
                        value.append("0");
                        textField.setText(value.toString());
                    }else {
                        value.append(op);
                        textField.setText(value.toString());
                    }
                });
            }
            j += 1;
        }

    }

    void cal(){
        double d=0;
        char f=' ';
        double k=1;
        for(int i=0; i<value.length();i++){
            char c=value.charAt(i);
            if(Character.isDigit(c)){
                if(k==1){
                    d*=10;
                }
                d+=(c-'0')*k;
            }else if(c=='.'){
                k=0.1;
            }else{
                k=1;
                f=c;
                a=d;
                d=0;
            }
        }
        b=d;
        switch (f) {
            case '+':
                a += b;  // Add 3
                break;
            case '-':
                a -= b;
                break;
            case '*':
                a *= b;
                break;
            case '/':
                a /= b;
                break;
            default:
                a+=b;
                break;
        }
        value.setLength(0);
        value.append(a);
        a=0;
        b=0;
    }

    public static void main(String[] arg){
        SwingUtilities.invokeLater(()->{
            new Calculator().setVisible(true);
        });
    }
}
