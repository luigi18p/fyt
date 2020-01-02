package learning;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

class eventFinale extends JFrame {
	
	JMenuBar bar = new JMenuBar();
	JMenu editMenu = new JMenu("Edit");
	
	JMenuItem UpOpt = new JMenuItem("Up");
	JMenuItem DownOpt = new JMenuItem("Down");
	JMenuItem RandomOpt = new JMenuItem("Random");
	Listener ascolt = new Listener();
	public eventFinale() {
		setJMenuBar(bar);
		bar.add(editMenu);
		editMenu.add(UpOpt);
		editMenu.add(DownOpt);
		editMenu.add(RandomOpt);

		UpOpt.addActionListener(ascolt);
		UpOpt.setActionCommand(ascolt.UPOPT);
		DownOpt.addActionListener(ascolt);
		DownOpt.setActionCommand(ascolt.DOWNOPT);
		RandomOpt.addActionListener(ascolt);
		RandomOpt.setActionCommand(ascolt.RANDOMOPT);	
		
		setVisible(true);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
}

class Listener implements ActionListener
{
	public final static String UPOPT = "up";
	public final static String DOWNOPT = "down";
	public final static String RANDOMOPT = "random";
	public void actionPerformed(ActionEvent e)
	{
		String com = e.getActionCommand();
		if (com == UPOPT)
		upOpt();
		else if (com == DOWNOPT)
		downOpt();
		else if (com == RANDOMOPT)
		randomOpt();
	}
	private void upOpt()
	{ System.out.println("upOpt"); }
	private void randomOpt()
	{ System.out.println("randomOpt"); }
	private void downOpt()
	{ System.out.println("downOpt"); }
}

public class MyFrame_eventFinale3 {
	
	public static void main(String args[])
	{
		eventFinale eventFinale = new eventFinale();
		eventFinale.setSize(400, 400);
	}
}
