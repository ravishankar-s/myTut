package Tut1;
import java.util.Scanner;

public class Chap9_2 {

	public static void main(String[] args){
	 
		int number;
		int count=0;
		int total=0;
		double avg = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("To get average \nEnter the numbers(-1 to quit):");
		number = input.nextInt();
		while(number!= -1){
			total +=number;
			++count;
			System.out.println("Enter the numbers(-1 to quit):");
			number = input.nextInt();			
		}
		avg = total/count;
		System.out.println("Average is:" + avg);
		
		
	}

}
