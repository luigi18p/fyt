package gui;

import javax.swing.*;
import java.awt.*;
public class Application {
public static void main(String args[])
	{
		//STRUTTURA:	FRAME(finestra)->CONTAINER->
		JFrame win;
		win = new JFrame("Prima finestra");
		win.setSize(300,300);
		//win.setLocation(600,200);
		//win.setResizable(false);	//non permette resize finestra all'utente
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//ci sono altri comandi consentiti
		win.setVisible(true); //permette di visualizzare e di nascondere la finestra
	
		Container c = win.getContentPane();
		c.add(new JLabel("Buona Lezione"));
	
	
		JFrame win2;
		win2 = new JFrame("Esempio di button");
		Container c2 = win2.getContentPane();
		
		//JLabel xField=new JLabel("x = ");	//etichetta + compo per scrivere
		//JTextField xField=new JTextField(5); //per costruire un campo di testo
		
		JButton moveButton=new JButton("Move");
		//JButton moveButton=new JButton(new ImageIcon("hand.gif"));
		
		c2.add(moveButton);
		win2.setLocation(600,200);
		win2.setSize(200,200);
		win2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win2.setVisible(true);
	}
}