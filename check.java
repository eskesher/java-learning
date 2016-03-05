public class check {
	public static void main (String[] args) {

	System.out.print(min(12,11));
	}
	public static int min (int a,int b) {
		int ret = 0;
		if (a>b) {
			ret = b;
		}
		if (a<b) {
			ret = a;
		}

		return ret;
	}
}
