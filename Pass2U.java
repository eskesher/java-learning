import javax.swing.JOptionPane;

class Pass2U {
	public static void main (String [] args) {
		String[][] users = new String[][] {{"vst","vpass"},{"vr", "vrpass"},{"root","toor"},{"admin","admin"}};

		while(true) {
			String user = JOptionPane.showInputDialog ("Enter your user name");

			if  (!seach_login(user)); {
				JOptionPane.showMessageDialog ("No such user..");
			}
		}

		String pass = JOptionPane.showInputDialog ("Enter your password");

			if  (!seach_pass(login,pass)); {
				int fail=0;
				while(fail<10) {
					JOptionPane.showMessageDialog (null, "Wrong password. Try again.");
					fail++;
				}
			}
		JOptionPane.showMessageDialog (null, "Your signing in is successful");
	}

	public static String search_login (String login) {
		for ( int i=0; i < users.lenght(); i++) {
			if (login == users[i]) {
				return val;
			}
		}
	}

	public static String search_pass (String login,String pass) {
		for ( int i=0; i < users.lenght(); i++) {
			if (login == users[i] && pass == users[k][]) {
				return true;
			}
		}
	}
}
