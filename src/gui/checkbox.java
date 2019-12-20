package gui;

import javax.swing.*;
import java.awt.*;
public class checkbox {
	public static void main(String args[])
		{
			JFrame win;
			win = new JFrame("Esempio di button");
			Container c = win.getContentPane();
			
			JCheckBox check1=new JCheckBox("JCheck");
			//JButton moveButton=new JButton(new ImageIcon("hand.gif"));
			c.add(check1);
			
			win.setSize(200,200);
			win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			win.setVisible(true);
			
			
			JFrame win2;
			win2 = new JFrame("Esempio di JRadioButton");
			Container c2 = win2.getContentPane();
			JRadioButton radioButton1=new JRadioButton("R1");
			JRadioButton radioButton2=new JRadioButton("R2");
			JRadioButton radioButton3=new JRadioButton("R3");
			ButtonGroup group = new ButtonGroup();
			c2.add(radioButton1);
			group.add(radioButton2);
			group.add(radioButton3);

			win2.setSize(200,200);
			win2.setLocation(200, 0);
			win2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			win2.setVisible(true);
			
			JFrame win3;
			win3 = new JFrame("Esempio di JComboBox");
			String lista[]=new String[10];
			for(int i=0;i<lista.length;i++)
				lista[i]="Elemento numero "+i;
			JComboBox cBox=new JComboBox(lista);
			Container c3 = win3.getContentPane();
			c3.add(cBox);
			win3.setSize(200,200);
			win3.setLocation(400, 0);
			win3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			win3.setVisible(true);
		}
}