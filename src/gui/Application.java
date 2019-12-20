package gui;

import javax.swing.*;
import java.awt.*;
public class Application {
public static void main(String args[])
	{
		JFrame win;
		win = new JFrame("Esempio di button");
		Container c = win.getContentPane();
		
		//JLabel xField=new JLabel("x = ");	//etichetta + compo per scrivere
		//JTextField xField=new JTextField(5); //per costruire un campo di testo
		
		JButton moveButton=new JButton("Move");
		//JButton moveButton=new JButton(new ImageIcon("hand.gif"));
		
		c.add(moveButton);
		win.setSize(200,200);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);
	}
}