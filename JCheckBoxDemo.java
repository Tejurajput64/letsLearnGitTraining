import  javax.swing.*;
class JCheckBoxDemo
{
	public static void main(String[]args)
	{
		JCheckBox c1=new JCheckBox("Python");
		c1.setBounds(50,100,20,20);
		JFrame f=new JFrame("Checkbox Example");
		JCheckBox c2=new JCheckBox("java");
		JLabel l=new JLabel("Select where you are master?");
		l.setBounds(50,50,600,50);
		c2.setBounds(60,110,30,20);
		f.add(c1);
		f.add(c2);
		f.add(l);
		f.setSize(700,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}