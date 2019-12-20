package gui;

import javax.swing.*;
import java.awt.*;
class MyFrame extends JFrame
{
	JButton uno=new JButton("Uno");
	JButton due=new JButton("Due");
	JButton tre=new JButton("Tre");
	JButton quattro=new JButton("Quattro");
	JButton cinque = new JButton("Cinque");
	public MyFrame()
	{
		super("Flow√Layout");
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
		MyFrame MyFrame = new MyFrame();
	}
}