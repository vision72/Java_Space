import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class FirstJTextField extends JFrame implements ActionListener
{
    JButton b = new JButton("Click Change");
    JTextField t = new JTextField("");
    JTextField t2 = new JTextField("");
    FirstJTextField ()
    {
        t.setBounds(45, 55, 100, 70);
        t2.setBounds(45, 200, 100, 70);
        b.setBounds(50,300,100,40);
        add(t);
        add(t2);
        add(b);
        b.addActionListener(this);        
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        String f1 = t.getText();
        StringBuilder sb = new StringBuilder();
        sb.append(f1);
        String s1 = sb.reverse().toString();
        t2.setText(s1);
    }
    public static void main(String... ar)
    {
        new FirstJTextField();
    }
}