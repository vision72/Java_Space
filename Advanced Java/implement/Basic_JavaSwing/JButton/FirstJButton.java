import java.awt.event.*;
import javax.swing.*;
public class FirstJButton extends JFrame implements ActionListener
{
    JButton jb = new JButton(new ImageIcon("C:\\Users\\Admin\\Desktop\\Vision_Semester_DATA\\SYBSC(I.T.) Sem-5\\Advanced Java\\Learn\\Basic_JavaSwing\\JButton\\images\\img-right.jpg"));
    JTextField t = new JTextField();
    public FirstJButton () 
    {
        jb.setBounds(40,45,100,150);
        t.setBounds(150,45,100,50);
        add(jb);
        add(t);
        jb.addActionListener(this);
        setTitle("Learn JButton");
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        t.setText("Jello Worls");
    }
    public static void main(String... ar)
    {
        // System.out.print("Jello Worls");
        new FirstJButton();
    }
}