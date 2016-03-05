import java.lang.*;

public class runme {
	public static void main (String[] args) {
	
	int a,b;
	int row = 15;
	for (a=0; a<row; a++) {
		for (b=0; b <=4*row; b++)	{
			double d = Math.sqrt(Math.pow(a-row,2) + Math.pow(b-row,2));
			double e = Math.sqrt(Math.pow(a-row,2) + Math.pow(b-3*row,2));
	
			if (d < row + 0.5 || e < row + 0.5 ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
	System.out.print("\n");
	}
	
	for (b = row*2; b >= 1; b--) {
		for (a = 0; a < row*2 - b; a++)
	                System.out.print(' ');
		for (a = (2 - b); a < (2 - b) + (2 * b - 1); a++)
			System.out.print('*');
			System.out.print('\n');
	        }
	String bin = "01010111011011110111010101101100011001000010000001110101001000000110001001100101001000000110110101111001001000000111000001110010011010010111011001100001011101000110010100100000011100110111010001100001011101000110100101100011001000000101011001100001011011000110010101101110011101000110100101101110011001010011111100100001";
	String str = "";

	for (int i = 0; i < bin.length()/8; i++) {
		int g = Integer.parseInt(bin.substring(8*i,(i+1)*8),2);
		str += (char)(g);
	}

	System.out.println(str);
	}
}
