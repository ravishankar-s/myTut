package Tut1;

import java.util.Scanner;

public class Chap9_exc1 {

	public static void main(String[] args){
		String password = "test";
		Scanner input = new Scanner(System.in);
		String enterPassword="";
		int countTries = 0;
		while(countTries<=4){
			System.out.println("Enter the password:");
			enterPassword = input.nextLine();
			++countTries;
			if(enterPassword.equals(password)){
				System.out.println("Login");
				break;
			}
			else if(countTries>=5){
				System.out.println("Sorry, U have exceede max limit");
			}
			else {
				System.out.println("Sorry, try again");
			}
				
		}
		
	}
}
