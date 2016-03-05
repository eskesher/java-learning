//import java.lang.*;

public class runme2 {
	public static void main (String[] args) {

	String asterisk;
	String space;
	int row = 15;
	int i=0;
	int ast = 0;
	int count_asterisk = 1 ;
	int count_space = row ;
	for (i=0; i<=row; i++) {
		asterisk = new String(new char[count_asterisk]).replace("\0", "*");
		space = new String(new char[count_space]).replace("\0", " ");
		System.out.print(space+asterisk+space+asterisk+space+'\n');
		count_asterisk++;
		count_space--;
	}
	}

}
