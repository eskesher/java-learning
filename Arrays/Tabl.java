import javax.swing.*;
import java.awt.GridLayout;
class Tabl { 

public static void main (String [] args) {

int tabl [] [] = new int [8] [8];
JPanel panel = new JPanel ();
GridLayout  gL = new GridLayout (8, 8);

panel.setLayout(gL); 
	
/*for (int i=0; i<8; i++){
	for (int j=0; j<8; j++){
		int a = i + 2, b = j + 2;
		tabl [i] [j] = a * b;
		System.out.print (b+" * "+a+" = "+tabl[i] [j] +"    ");
		if (a<5 && b<4) {
			System.out.print (" ");
		}
		if (a==4 && b>3) {continue;}
		System.out.print (" ");
	}
	System.out.println ("");
}*/
	JLabel [][]label = new JLabel [8] [8];

for (int i=0; i<8; i++){
	for (int j=0; j<8; j++){
		int a = i + 2, b = j + 2;
		tabl [i] [j] = a * b;
		label[i] [j] = new JLabel (b+" * "+a+" = "+tabl[i] [j] +"    ");
		panel.add(label[i][j]);
		}
		
	}
JFrame frame = new JFrame ("Tabl");
frame.setContentPane(panel);
frame.setSize (700, 200);
frame.setVisible (true);
frame.setResizable(false);
}
}