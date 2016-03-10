import java.util.Random;
/*
TODO:	Spawn an multi-d array of random vals: 4x4 with coordinates, random range:-50 - 50
	Print out this table
	Find the smallest number of this array

EXMPL:
2(0,0) 3(0,1) 3(0,2) 7(0,3)
6(1,0) -8(1,1) 2(1,2) -30(1,3)  
3(2,0) 7(2,1) 8(2,2) 3(2,3) 
2(3,0) 3(3,1) -22(3,2) 5(3,3) 

	-30 - the smallest number of this array
	
*/

public class Summ01 {

    public static void main (String[] args) {
			
		int [][] r = new int [4][4];
		int minimum = r [0][0];
		
		for (int i = 0; i<4; i++) {
			for (int j =0; j<4; j++) {
				r [i][j] = new Random ().nextInt (101)+(-50);
				System.out.print (r [i][j]+"("+i+","+j+") ");
				if (r [i][j]<minimum) minimum = r [i][j];
			}
			
		System.out.println ("");
		
	    }
		System.out.println (minimum+" - the smallest number of this array.");
	}
}
