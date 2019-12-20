package gui;

import javax.swing.*;
import java.awt.*;
public class Application {
	public static void main(String args[])
		{
		JFrame win;
		win = new JFrame("Prima√finestra");
		Container c = win.getContentPane();
		c.add(new JLabel("Buona√Lezione"));
		win.setSize(200,200);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);
	}
}