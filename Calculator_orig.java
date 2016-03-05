import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {

	JPanel windowContent;
	JTextField displayField;
	
	JButton [] button = new JButton [10];
	

	/*
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9; */

	JButton buttonPoint;
	
	JButton buttonEqual;
	
	JButton buttonSum;
	JButton buttonSubtract;
	JButton buttonMult;
	JButton buttonShare;
	
	JPanel p1;
	JPanel p2;
	
	Calculator () {
		windowContent = new JPanel ();
		
		BorderLayout b1 = new BorderLayout ();
		windowContent.setLayout(b1);
		
		displayField = new JTextField (15);
		windowContent.add("North", displayField );
		
	
		/*
		button0 = new JButton ("0");
		button1 = new JButton ("1");
		button2 = new JButton ("2");
		button3 = new JButton ("3");
		button4 = new JButton ("4");
		button5 = new JButton ("5");
		button6 = new JButton ("6");
		button7 = new JButton ("7");
		button8 = new JButton ("8");
		button9 = new JButton ("9");
				 */
		buttonPoint = new JButton (".");
		buttonEqual = new JButton ("=");
		
		buttonSum = new JButton ("+");
		buttonSubtract = new JButton ("-"); 
		buttonMult = new JButton ("*");
		buttonShare = new JButton ("/");
		
		
		p1 = new JPanel ();
		GridLayout g1 = new GridLayout (4, 3);
		p1.setLayout(g1);
		
		p2 = new JPanel ();
		GridLayout g2 = new GridLayout (4, 1);
		p2.setLayout(g2);
	
		for (int x=0; x<=10; x++) { 
			button[x]= new JButton ("x");
			if (x==0){continue;}
			p1.add.button[x];}
		p1.add(button0);}
	
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		
		p2.add(buttonSum);
		p2.add(buttonSubtract);
		p2.add(buttonMult);
		p2.add(buttonShare);
		
		
		
		windowContent.add("Center", p1 );
		windowContent.add("East", p2 );
		
		JFrame frame = new JFrame ("Calculator");
		
		frame.setContentPane(windowContent);
		
		frame.pack();
		
		frame.setVisible(true);
		
	}
		
	public static void main (String [] args){
		
		Calculator calc = new Calculator ();
			
		}
	
}
