//listato 14
package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

//creare una classe “ascoltatore” per ogni oggetto e per ogni classe di eventi da gestire per quello oggetto.
// NON SI USA QUESTO MOTODO
//VEDI MYFRAME_EVENTFINALE

class FrameComplesso4 extends JFrame {
	JPanel centro = new JPanel();
	JPanel sud = new JPanel();
	JTextField txt = new JTextField(20);
	JButton button = new JButton("Premi");
	Listen ascolt=new Listen(this);
	

	public FrameComplesso4() {
		super("Esempio");
		
		centro.add(txt);
		sud.add(button);
		
		getContentPane().add(centro,BorderLayout.NORTH);
		getContentPane().add(sud,BorderLayout.CENTER);
		pack();
		
		button.addActionListener(ascolt);
		txt.addActionListener(ascolt);
		setVisible(true);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
}

class Listen implements ActionListener {
	FrameComplesso4 finestra;
	
	public Listen(FrameComplesso4 aFrame)
	{ finestra = aFrame; }
	
	public void actionPerformed(ActionEvent e) {
		JTextField text = finestra.txt;
		JOptionPane.showMessageDialog(
		null,text.getText());
	}
}

public class MyFrameMouseEvent2
{
	public static void main(String args[])
	{		
		FrameComplesso4 FrameComplesso4 = new FrameComplesso4();
		//FrameComplesso.setTitle("selezionare");
		FrameComplesso4.setSize(300, 230);
	}
}