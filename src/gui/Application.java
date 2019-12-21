package gui;

import javax.swing.*;
import java.awt.*;
class MyFrame1 extends JFrame
{
	JLabel jl = new JLabel("Buona Lezione");
	public MyFrame1()	//costruttore
	{
		super("Prima finestra");	//titolo della finestra
		Container c = this.getContentPane();
		c.add(jl);
		this.setSize(200,200);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Application
{
	public static void main(String args[])
	{
		MyFrame1 frame1 = new MyFrame1();
	}
}