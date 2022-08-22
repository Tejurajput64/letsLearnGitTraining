import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Actevent extends JFrame implements ActionListener
{
	TextField tf;
	
	Actevent()
	{
		//JLabel l1=new JLabel("www.google.com");
		//l1.setBounds(100,50,100,30);

		JTextField t1=new JTextField("www.google.com");
		t1.setBounds(100,85,100,30);
	
		Button b=new Button("Display IP");
		b.setBounds(100,120,100,30);
		b.addActionListener(this);
		
		add(t1);
		//add(l1);
		add(b);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		t1.setText("IP address is");	
	}
	public static void main(String[]args)
	{
		new Actevent();
	}
}