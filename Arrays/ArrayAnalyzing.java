import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class ArrayAnalyzing {

    public static void main (String[] args) {
		
	/**
	* 1. Parameters of the array
	*
	* int a - numbers of lines of the array, creating by user.
	* int b - numbers of columns of the array, creating by user.
	*/
	    out.println (""); 
		
		out.println ("Enter numbers of lines of the array");
		Scanner s1 = new Scanner (in); 
		int a = s1.nextInt (); 
		out.println (""); 
		
		out.println ("Enter numbers of columns of the array");
		Scanner s2 = new Scanner (in);
		int b = s2.nextInt (); 
		out.println (""); 
		
	/**
	* int c - min number of element that can be in the array, creating by user.
	* int d - max number of element that can be in the array, creating by user.
    */
		out.println ("Enter min possible num of an element");
		Scanner s3 = new Scanner (in);
		int c = s3.nextInt ();
		out.println (""); 
		
		out.println ("Enter max possible num of an element");
		Scanner s4 = new Scanner (in);
		int d = s4.nextInt (); 
		out.println (""); 
		out.println ("*********************"); 
		
    /**
	* 2. Array's data
	*
    * int [] [] r - The array, that will be created.
    */
		int [][] r = new int [a][b];
		
	/**
	* int num - numbers of elements of the array r [][].
	* int num1 - numbers of elements, which sum will be calculated in the point 7. (for even-numbered numbers of 
	elements in r [][] - the half of its num, for odd-numbered - rounded up half of num.
	*/
		int num = a*b, num1 = num/2; 
		
		if ((num)%2==1) ++num1;
		
		out.println ("");
	
    /**
	* 3. Creating of the array with user parameters.
	*
    * Elements take on values of a given range. Print a matrix.
    */	
		for (int i = 0; i<a; i++) {
			for (int j =0; j<b; j++) {
				r [i][j] = new Random ().nextInt ((d-c+1))+c;
		        out.print (r [i][j]+"  ");
	
			}
			
		    out.println ("");
	    }
		
		out.println (""); 
	
	/**
	* 4. Creating of list with elements of r [][] in ascending order.
	*
    * int [] list - is array of this list. 
	* count is number of an element from 0 until (num-1).
	* Print list of r [][] elements in ascending order.
    */	
	    int [] list = new int [num]; 	
	    int count = 0;
	
	out.println ("Matrix elements in ascending order"); 
		while (c<=d) {
		    for (int k = 0; k<a; k++) {
			    for (int l = 0; l<b; l++) {
					if (r [k][l]==c) {
					    list [count] = r [k][l];
						out.print (r [k][l]+" ");
						
					    count++;
					}
				
				}
			}
		c++;
		}	
		
		out.println (""); 
		out.println (""); 	
		
	/**
	* 5. Printing a list from point 4. without doubles.
	*
    * int [] list - is this array. 
	* count1 - numbers  of doubles.
	* Print list [].
    */
		out.println ("Matrix elements in ascending order without doubles"); 
		
		int count1 = 0; 
		
		for (int m = 0; m<count; m++) {
			int n = m;
			
			while (n>=0) {
				
				if (n==0) {
					out.print (list[m]+" ");
					
					break;
				}
				else if (list [m] == list [n-1]) {
					//int doublesList [p] = new int ();
					//int doublesList [p] = list [n-1];
					//p++;
					count1++;
					break;
				}
				else n--;
			}
		}
		
		//int [] doublesList = new int [p+1];
		out.println (""); 
		out.println (""); 
		out.println (count1+" doubles of elements"); 
		//out.println (count2+" elements without doubles");		
		out.println ("");
	
	/**
	* 7. Counting of sum from num1 biggest elements of list[].
	*
    * int sum - sum from num1 biggest elements of list[].
    * Print sum.	
    */
		int sum = 0;
		
		int num2= num1;
		
		if (num%2==1) {
			num2 = num1 - 1;
		}
		
		while (num2<num) {
			sum += list [num2]; 
			num2++;
		}
		
		out.println (sum+" is summ of the "+num1+" biggest elements of the array");	
		
	}
	
}

