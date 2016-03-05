import java.lang.*;

public class RandomMultidimensionalArraySumm {

        public static void main (String[] args) {

/*
TODO:	Spawn an multi-d array of random vals: 3x3, random range:0-5
	Print out this table
	Summ all vertical vals and print them out below  table
	Summ all vals and print its

EXMPL:
	1 3 2
	4 3 3
	4 3 5

	9 9 10 - Col`s sum
	28 - Total
*/

	int rand_min = 0;
	int rand_max = 5;

	int i=0;
	int j=0;

	int array[][][] = new int[3][3][3];
	int array_colum_summ[] = new int[3];


	System.out.println(array_colum_summ[0]+" "+array_colum_summ[1]+" "+array_colum_summ[3]+" - Col`s sum");
	System.out.println(total_sum+" - Total");
	}
}
