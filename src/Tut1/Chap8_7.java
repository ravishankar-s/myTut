package Tut1;
import java.util.Scanner;

public class Chap8_7 {
	
	public static void main(String[] args){
		
		String password = "name";
		String myName = "ravi";
		String enterPass = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the password:");
		enterPass = input.nextLine();
		if(password.equals(enterPass)|| enterPass.equals(myName))
			System.out.println("correct");
		else {
			System.out.println("wrong password, try again:");
			enterPass= input.nextLine();
			if(password.equals(enterPass)|| enterPass.equals(myName))
				System.out.println("correct");		
			else {
				System.out.println("wrong password, try again:");
				enterPass= input.nextLine();
				if(password.equals(enterPass)|| enterPass.equals(myName))
					System.out.println("correct");		
				else
					System.out.println("Pls contact admin fr password");
		}
		}
		
		
		
		
	}

}
