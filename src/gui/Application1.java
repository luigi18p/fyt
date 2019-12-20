package gui;

import javax.swing.*;
import java.awt.*;

//classe frame creata utilizzando un Flow Layout
class MyFrameFL extends JFrame
{
	JButton uno=new JButton("Uno");
	JButton due=new JButton("Due");
	JButton tre=new JButton("Tre");
	JButton quattro=new JButton("Quattro");
	JButton cinque = new JButton("Cinque");
	public MyFrameFL()
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

//classe frame creata utilizzando un Grid Layout
class MyFrameGL extends JFrame
{
	public MyFrameGL()
	{
		super("Grid Layout");
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(4,4));
		for(int i = 0; i<15; i++)
			c.add(new JButton(String.valueOf(i)));
		setSize(300,300);
		setVisible(true);
	}
}

public class Application1
{
	public static void main(String args[])
	{
		MyFrameFL MyFrameFL = new MyFrameFL();
		MyFrameGL MyFrameGL = new MyFrameGL();
		MyFrameGL.setLocation(200,200);
	}
}