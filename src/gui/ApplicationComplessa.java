package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class FrameComplesso extends JFrame{
	JPanel centroPnl = new JPanel();
	JPanel sudPnl = new JPanel();

	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	
	JButton calcola = new JButton("calcola");
	JButton annulla = new JButton("annulla");
	
	FrameComplesso(){
		
		for(int i = 1; i<10; i++) 
			centroPnl.add(new JButton(String.valueOf(i)));
		
		centroPnl.setLayout(new GridLayout(4,4));
		centroPnl.add(new JButton("0"));

		sudPnl.setLayout(new FlowLayout());
		sudPnl.add(calcola);
		sudPnl.add(annulla);
		
		getContentPane().add(centroPnl,BorderLayout.CENTER);
		getContentPane().add(sudPnl,BorderLayout.SOUTH);
		pack();
		setVisible(true);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}

}

class FrameComplesso1 extends JFrame
{
	JPanel nordPnl = new JPanel();
	JPanel centroPnl = new JPanel();
	JPanel sudPnl = new JPanel();
	JLabel infoLbl = new JLabel("Selezionare:");
	JCheckBox opz1Chk = new JCheckBox("Opz1");
	JCheckBox opz2Chk = new JCheckBox("Opz2");
	JButton okBtn=new JButton("OK");
	JButton cancBtn=new JButton("Annulla");
	public FrameComplesso1() {
		super("Esempio");
		centroPnl.setLayout(new GridLayout(2,1));
		centroPnl.add(opz1Chk);
		centroPnl.add(opz2Chk);
		nordPnl.add(infoLbl);
		sudPnl.add(okBtn);
		sudPnl.add(cancBtn);
		getContentPane().add(nordPnl,BorderLayout.NORTH);
		getContentPane().add(centroPnl,BorderLayout.CENTER);
		getContentPane().add(sudPnl,BorderLayout.SOUTH);
		pack();
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(dim);
		setLocation((int)(dim.getWidth()-this.getWidth())/2,(int)(dim.getHeight()-this.getHeight())/2);
		setVisible(true);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
}

class FrameComplesso2 extends JFrame
{
	JPanel nordPnl = new JPanel();
	JPanel centroPnl = new JPanel();
	JPanel sudPnl = new JPanel();
	JLabel infoLbl = new JLabel("Selezionare:");
	JCheckBox opz1Chk = new JCheckBox("Opz1");
	JCheckBox opz2Chk = new JCheckBox("Opz2");
	JButton okBtn=new JButton("OK");
	JButton cancBtn=new JButton("Annulla");
	
	JMenuBar bar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenu editMenu = new JMenu("Edit");
	JMenu moveMenu = new JMenu("Move");
	public FrameComplesso2() {
		super("Esempio");
		centroPnl.setLayout(new GridLayout(2,1));
		centroPnl.add(opz1Chk);
		centroPnl.add(opz2Chk);
		nordPnl.add(infoLbl);
		sudPnl.add(okBtn);
		sudPnl.add(cancBtn);
		getContentPane().add(nordPnl,BorderLayout.NORTH);
		getContentPane().add(centroPnl,BorderLayout.CENTER);
		getContentPane().add(sudPnl,BorderLayout.SOUTH);
		pack();
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(dim);
		setLocation((int)(dim.getWidth()-this.getWidth())/2,(int)(dim.getHeight()-this.getHeight())/2);
		
		setJMenuBar(bar);
		bar.add(fileMenu);
		bar.add(editMenu);
		editMenu.add(moveMenu);
		editMenu.add(new JMenuItem("Random"));
		moveMenu.add(new JMenuItem("Up"));
		moveMenu.add(new JMenuItem("Down"));
		
		setVisible(true);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
}

public class ApplicationComplessa
{
	public static void main(String args[])
	{
		FrameComplesso FrameComplesso = new FrameComplesso();
		FrameComplesso.setTitle("calcolatrice");
		FrameComplesso.setSize(400, 400);
		
		FrameComplesso2 FrameComplesso2 = new FrameComplesso2();
		//FrameComplesso.setTitle("selezionare");
		FrameComplesso2.setSize(230, 230);
		
	}
}