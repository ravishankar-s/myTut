package Tut1;
import java.util.Scanner;

public class Chap10_3 {
	public static void main(String[] args){
		int num1, num2;
		String op;
		Scanner input = new Scanner(System.in);
		Scanner inputOp= new Scanner(System.in);
		System.out.println("Enter num1:");
		num1 = input.nextInt();
		System.out.println("Enter num2:");
		num2 = input.nextInt();
		System.out.println("Enter the op:");
		op = inputOp.next();
		if((op.equals("+"))||(op.equals("-")))
		System.out.println("output is:"+ result(num1,num2,op));
		else{
			System.out.println("Error");
		}
			
	}
	static int result(int x, int y, String opr){
		if(opr.equals("+"))
			return x+y;
		else{
			return x-y;
		}
		
	}

}
