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
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//comandi consentiti
		win.setVisible(true); //permette di visualizzare e di nascondere la finestra

		Container c = win.getContentPane();
		c.add(new JLabel("Buona Lezione"));
	}
}