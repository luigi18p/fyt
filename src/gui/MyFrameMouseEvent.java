package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

class MouseSpy implements MouseListener
{
	public void mouseClicked(MouseEvent e) {
		System.out.println
		("Click su ("+e.getX()+","+e.getY()+")");
	}
	public void mousePressed(MouseEvent e) {
		System.out.println
		("Premuto su ("+e.getX()+","+e.getY()+")");
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println
		("Rilasciato su ("+e.getX()+","+e.getY()+")");
	}
	// La ragione per cui `e stata comunque dichiarata la gestione di tali eventi (mouseEntered, mouseExited) 
	// `e legata al linguaggio Java: affinch´e una classe implementi una interfaccia, tale classe deve implentare
	// tutti i metodi dell’interfaccia.
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}

//ALTRI ASCOLTATORI
//	ActionListener, ComponentListener, FocusListener, KeyListener, MouseMotionListener, TextListener, WindowsListener

//	actionListener va bene quando dobbiamo catturare un evento come la pressione di un pulsante, checkbox ecc (è 1 solo metodo)
//		public interface ActionListener
//		{
//			public void actionPerformed(ActionEvent ae);
//		}
//	windowsListener va bene quando vogliamo catturare degli eventi dovuti a chiusura della finestra, attivazione ecc (sono 7 metodi)

class MyFrameEvent extends JFrame
{
	public MyFrameEvent()
	{
		super("MouseTest");
		this.addMouseListener(new MouseSpy());
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
}

//la classe creata di seguito va bene solo per sorgenti che sono jbutton, quindi bisogna modificare per chackbox ecc
class Ascoltatore implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		JButton b = (JButton)event.getSource();
		JOptionPane.showMessageDialog(null,"è stato premuto "+b.getText());
	}
}

// ho copiato il FrameComplesso2 e ho aggiunto l'ActionListener
class FrameComplesso3 extends JFrame
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
	
	Ascoltatore listener = new Ascoltatore();				//nuovo
	
	public FrameComplesso3() {
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
		
		okBtn.addActionListener(listener);				//nuovo
		
		setVisible(true);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
}

public class MyFrameMouseEvent
{
	public static void main(String args[])
	{
		MyFrameEvent MyFrameEvent = new MyFrameEvent();
		MyFrameEvent.setTitle("mouse event");
		MyFrameEvent.setSize(400, 400);
		
		FrameComplesso3 FrameComplesso3 = new FrameComplesso3();
		FrameComplesso3.setTitle("scatena evento");
		FrameComplesso3.setSize(230, 230);
	}
}