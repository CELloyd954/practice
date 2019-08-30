import java.util.Scanner;
public class SignUp
{
	public static void main(String[] args) {
		System.out.println("Welcome user! Please create username: ");
		Scanner scan = new Scanner(System.in);
		String username = scan.nextLine();
		if (username.equals("admin") || username.equals("person") || username.equals("jimbob234") || username.equals("skatergurl17") || username.equals("gary")) {
			System.out.println("Username is taken. Try a different username: ");
			username = scan.nextLine();
		}
		System.out.println("Now create a password: ");
		String password = scan.nextLine();
		char[] array2 = password.toCharArray();
		boolean vowel = false;
		boolean specialCharacters = false;
		boolean noUsername = false;
		boolean numbersInLastTwo = false;
		String subPassword = password.substring(0, password.length() - 2);
		if (array2[0] == 'a' || array2[0] == 'e' || array2[0] == 'i' || array2[0] == 'o' || array2[0] == 'u') vowel = true;
		if (password.indexOf('#') != -1 || password.indexOf('!') != -1 || password.indexOf('$') != -1 || password.indexOf('&') != -1) specialCharacters = true;
		if (password.indexOf(username) == -1) noUsername = true;
		if (subPassword.indexOf('0') == -1 && subPassword.indexOf('1') == -1 && subPassword.indexOf('2') == -1 && subPassword.indexOf('3') == -1 && subPassword.indexOf('4') == -1 && subPassword.indexOf('5') == -1 && subPassword.indexOf('6') == -1 && subPassword.indexOf('7') == -1 && subPassword.indexOf('8') == -1 && subPassword.indexOf('9') == -1) numbersInLastTwo = true;
		if (vowel && specialCharacters && noUsername && numbersInLastTwo) {
			System.out.println("Password works!");
		}else {
			System.out.println("Password does not meet requirements.");
		}
	}
}