package gui;

import javax.swing.*;
import java.awt.*;
class MyFrame1 extends JFrame
{
	JButton uno=new JButton("Uno");
	JButton due=new JButton("Due");
	JButton tre=new JButton("Tre");
	JButton quattro=new JButton("Quattro");
	JButton cinque = new JButton("Cinque");
	public MyFrame1()
	{
		super("Flow Layout");
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(uno);
		c.add(due);
		c.add(tre);
		c.add(quattro);
		c.add(cinque);
		setSize(300,100);
		setVisible(true);
	}
}
public class Application1
{
	public static void main(String args[])
	{
		MyFrame1 MyFrame = new MyFrame1();
	}
}