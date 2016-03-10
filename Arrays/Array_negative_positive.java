import java.util.Random;
/*
TODO:	Spawn an multi-d array of random vals: 10x10 with coordinates, random range:-50 - 50
	Print out this table
	Summ all -
	Summ all +
	Summ total

EXMPL:
2(0,0) 3(0,1) 3(0,2) 7(0,3) 7(0,4) 3(0,5) 8(0,6) 5(0,7) 4(0,8) 8(0,9) 
6(1,0) 8(1,1) 2(1,2) 3(1,3) 8(1,4) 6(1,5) 5(1,6) 6(1,7) 4(1,8) 8(1,9) 
3(2,0) 7(2,1) 8(2,2) 3(2,3) 2(2,4) 6(2,5) 4(2,6) 3(2,7) 3(2,8) 7(2,9) 
2(3,0) 3(3,1) 2(3,2) 5(3,3) 5(3,4) 2(3,5) 8(3,6) 3(3,7) 4(3,8) 7(3,9) 
8(4,0) 6(4,1) 3(4,2) 3(4,3) 2(4,4) 3(4,5) 2(4,6) 2(4,7) 3(4,8) 7(4,9) 
4(5,0) 8(5,1) 4(5,2) 8(5,3) 7(5,4) 6(5,5) 4(5,6) 2(5,7) 8(5,8) 8(5,9) 
7(6,0) 5(6,1) 6(6,2) 2(6,3) 7(6,4) 6(6,5) 8(6,6) 2(6,7) 3(6,8) 8(6,9) 
4(7,0) 4(7,1) 8(7,2) 2(7,3) 4(7,4) 7(7,5) 6(7,6) 4(7,7) 2(7,8) 2(7,9) 
2(8,0) 3(8,1) 3(8,2) 6(8,3) 2(8,4) 8(8,5) 5(8,6) 6(8,7) 7(8,8) 5(8,9) 
6(9,0) 7(9,1) 7(9,2) 4(9,3) 5(9,4) 6(9,5) 8(9,6) 6(9,7) 2(9,8) 8(9,9) 

	-1000 1000 -  sum
	29 - Total
*/

public class Summ0 {

    public static void main (String[] args) {
			
		int [][] r = new int [10][10];
		int summin = 0, summpl = 0;
		
		for (int i = 0; i<10; i++) {
			for (int j =0; j<10; j++) {
				r [i][j] = new Random ().nextInt (101)+(-50);
				System.out.print (r [i][j]+"("+i+","+j+") ");
				if (r [i][j]<0) summin += r [i] [j];
				else summpl += r [i] [j];
			}
			
			System.out.println ("");	
	    }
		System.out.println (summin+" - Summa vsekh otritsatelnykn,    "+summpl+" - Summa vsekh polozhitelnykn.");
		System.out.println ((summin+summpl)+" - Summa vsekh chisel.");
	}
}
