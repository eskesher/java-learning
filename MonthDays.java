import javax.swing.JOptionPane;
import java.util.Calendar;
class MonthDays {
	public static void main (String [] args) {

		int year = Calendar.getInstance().get(Calendar.YEAR);
		String feb;

		if (year%4 == 0) { 
			feb="29";
		} else {
			feb="28";
		}

		Object[][] month = new Object[][] {
{"January","31"},
{"Febrary",feb},
{"March","31"},
{"April","30"},
{"May","31"},
{"June","30"},
{"July","31"},
{"August","31"},
{"September","30"},
{"October","31"},
{"November","30"},
{"December","31"}
};
		
		String xString = JOptionPane.showInputDialog ("Enter the month number");
	try {
		Integer x = Integer.valueOf (xString);

		JOptionPane.showMessageDialog (null, "There are "+month[x-1][1]+" days in "+month[x-1][0]+".");

	} catch (IndexOutOfBoundsException | NumberFormatException e) {
		JOptionPane.showMessageDialog (null, "There are only 12 months in a year. Please enter a number from 1 to 12.");	
	} 
}
}
