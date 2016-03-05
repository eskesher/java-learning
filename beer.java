class beer{

	public static String plural (int n) {
	int n1;
		if (n==0) {
			return ("Ne ostalos bolshe piva");
		}
	
		n = n%100;
		n1 = n % 10;
	
		if (n > 10 && n < 20) {
			return (" butylok");
		}
		if (n1 > 1 && n1 < 5) {
			return (" butylki");
		}
		if (n1 == 1) {
			return (" Butylka");
		}
	return (" butylok");
	}
	
	public static void main (String [] args) {
		for (int i = 99; i >= 0; i--) {
			if (i==0) {
				System.out.println (plural(i));
				break;
			}
			System.out.println (i+plural(i)+" na stene");
		}
	}
}
