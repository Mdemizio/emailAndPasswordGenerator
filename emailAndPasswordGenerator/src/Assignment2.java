import java.util.Scanner;
public class Assignment2 {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("\nEnter your first name:");
		String firstName = input.nextLine();
		System.out.println("\nEnter your last name:");		
		String lastName = input.nextLine();
		System.out.println("\n(Security Question) Enter your favorite city");
		String securityQuestionAnswer = input.nextLine();
		System.out.println("\nEnter your birth year");
		int birthYear = input.nextInt();
		String password = 	generatePassword(firstName,securityQuestionAnswer,birthYear);
		String email = generateEmail(firstName, lastName);
		resultScreen(firstName, lastName, email, password);	
		}

public static String generateEmail(String firstName, String lastName){
	char firstInitial = firstName.charAt(0);
	String email = firstInitial +  "."  +lastName +  "@kean.edu";
	return email;
}

public static String generatePassword(String firstName, String securityQuestionAnswer, int birthYear) {
	String firstThreeInitials = firstName.substring(0,3);
	String firstThreeInitialsFromSecurityQuestion = securityQuestionAnswer.substring(0,3);
	String passWord = firstThreeInitials + birthYear +firstThreeInitialsFromSecurityQuestion; 
	return passWord.toUpperCase();	
}

public static void resultScreen(String firstName, String lastName, String email,String password) {
System.out.println("==================================================");
String FNcapitalized = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
String LNoutputcapitalizaed = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
System.out.println(FNcapitalized + " " + LNoutputcapitalizaed);
System.out.println("Kean email: " + email);
System.out.println("Kean password: " + password );
System.out.println("==================================================");
	}
}













