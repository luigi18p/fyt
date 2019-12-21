package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
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

//classe frame creata utilizzando un Bolder Layout
class MyFrameBL extends JFrame
{
	JButton nord = new JButton("Nord");
	JButton centro = new JButton("Centro");
	JButton ovest=new JButton("Ovest");
	public MyFrameBL()
	{
		super("Border Layout");
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(nord,BorderLayout.NORTH);
		c.add(centro,BorderLayout.CENTER);
		c.add(ovest,BorderLayout.WEST);
		setSize(300,300);
		setVisible(true);
	}
}

class RadioDemo1 extends JFrame {
    //========================================================== constructor
    RadioDemo1() {
        //... Create the buttons.
        JRadioButton yesButton   = new JRadioButton("Yes", true);
        JRadioButton noButton    = new JRadioButton("No");
        JRadioButton maybeButton = new JRadioButton("Maybe");

        //... Create a button group and add the buttons.
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(yesButton);
        bgroup.add(noButton);
        bgroup.add(maybeButton);
        
        //... Arrange buttons vertically in a panel
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3, 1));
        radioPanel.add(yesButton);
        radioPanel.add(noButton);
        radioPanel.add(maybeButton);
        
        //... Add a titled border to the button panel.
        radioPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Married?"));

        //... Set window attributes.
        setContentPane(radioPanel);  // Button panel is only content.
        pack();                      // Layout window.
        
        //setSize(300,300);
		setVisible(true);
    }
}

class checkBox extends JFrame {
    //========================================================== constructor
    public checkBox() {
        //... Create the buttons.
    	JCheckBox check1=new JCheckBox("JCheck1");
    	JCheckBox check2=new JCheckBox("JCheck2");
    	JCheckBox check3=new JCheckBox("JCheck3");
    	JCheckBox check4=new JCheckBox("JCheck4");
    	JCheckBox check5=new JCheckBox("JCheck5");
        
        //... Arrange buttons vertically in a panel
        JPanel radioPanel = new JPanel();
        //radioPanel.setLayout(new GridLayout(3, 1));
        radioPanel.setLayout(new FlowLayout());
        radioPanel.add(check1);
        radioPanel.add(check2);
        radioPanel.add(check3);
        
        //... Add a titled border to the button panel.
        radioPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Seleziona piu campi"));

        //... Set window attributes.
        setContentPane(radioPanel);  // Button panel is only content.
        pack();                      // Layout window.
        
        setSize(300,300);
		setVisible(true);
    }
}

	
public class MyFrame
{
	public static void main(String args[])
	{
		MyFrameFL MyFrameFL = new MyFrameFL();
		MyFrameGL MyFrameGL = new MyFrameGL();
		MyFrameGL.setLocation(200,200);
		RadioDemo1 RadioDemo1 = new RadioDemo1();
		RadioDemo1.setTitle("RadioButton");
		RadioDemo1.setLocation(500,200);
		
		checkBox checkBox = new checkBox();
		checkBox.setTitle("checkBox");
		checkBox.setLocation(700,200);
		
		MyFrameBL MyFrameBL=new MyFrameBL();
		MyFrameBL.setLocation(800, 0);
	}
}