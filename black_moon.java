package black_moon;

import java.util.Scanner;

public class black_moon {
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		sub_class_User Person1 = new sub_class_User("Abdulsalam", "Aboubakar", 19, 75);

		// preset password
		Person1.setPassword("twitch");
		
		//first print out line
		System.out.println("Please enter your User name:");
		String Name_user = sc.nextLine();

		// sets the Username
		Person1.setUser_name(Name_user);

		// Password check section
		System.out.println("PLease enetr your Password:");
		String entered_password = sc.nextLine();

		String Password_used = Person1.getPassword();
		
		if (entered_password == Password_used ) {
			System.out.println("Sorry, Password is wrong. Try again (Y/N).");
		}
		
		/*
		System.out.println(Person1.getPassword());
		System.out.println(entered_password);
		*/
		
		Person1.print_text();

	}
}
