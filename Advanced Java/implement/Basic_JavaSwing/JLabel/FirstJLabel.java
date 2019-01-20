import java.awt.event.*;
import javax.swing.*;
public class FirstJLabel extends JFrame implements ActionListener
{
    JButton jb = new JButton(new ImageIcon("C:\\Users\\Admin\\Desktop\\Vision_Semester_DATA\\SYBSC(I.T.) Sem-5\\Advanced Java\\Learn\\Basic_JavaSwing\\JButton\\images\\img-right.jpg"));
    JLabel t1 = new JLabel();
    JTextField t = new JTextField();
    public FirstJLabel () 
    {
        jb.setBounds(40,45,100,150);
        t1.setBounds(150,100,300,100);
        t.setBounds(150,45,100,50);
        add(jb);
        add(t);
        add(t1);
        jb.addActionListener(this);
        setTitle("Learn JButton");
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        try
        {
        String host = t.getText();
        String ip = java.net.InetAddress.getByName(host).getHostAddress();
        t1.setText("IP of "+host+" is: "+ip);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    public static void main(String... ar)
    {
        // System.out.print("Jello Worls");
        new FirstJLabel();
    }
}