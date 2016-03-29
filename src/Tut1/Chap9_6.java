package Tut1;

import java.util.Scanner;

public class Chap9_6 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = 10;
		int guess = 0;
		while(true){
			System.out.println("Guess the number:");
			guess = input.nextInt();
			if(guess==number)				
				break;

		}
		
	}
}
