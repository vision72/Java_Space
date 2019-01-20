package main;
import Project.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener{
	Button b1 = new Button("Execute Addition");
	Button b2 = new Button("Store");
	Button b3 = new Button("Create Backup");
	Button b4 = new Button("Display");
	Button b5 = new Button("Leave");
	Label l = new Label("");
	public Main() {
		b1.setBounds(50,150,100,20);
		b2.setBounds(150,150,100,20);
		b3.setBounds(250,150,100,20);
		b4.setBounds(100,250,100,20);
		b5.setBounds(200,250,100,20);
		l.setBounds(50,100,200,20);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(l);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		setTitle("Matrix AdditionGUI");
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			l.setText("Button1 Clicked");
		}
		if(e.getSource()==b2) {
			l.setText("Button2 Clicked");
		}
		if(e.getSource()==b3) {
			l.setText("Button3 Clicked");
		}
		if(e.getSource()==b4) {
			l.setText("Button4 Clicked");
		}
		if(e.getSource()==b5) {
			l.setText("Button5 Clicked");
		}
	}
	public static void main(String[] args) {
		new Main();
	}

}
