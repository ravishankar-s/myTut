package Tut1;
import java.util.Scanner;

public class Chap10_2 {
 
	public static void main(String[] args){
		double num1, num2;
		String op;
		Scanner inputNum = new Scanner(System.in);
		Scanner inputOp = new Scanner(System.in);
		while(true){
		System.out.println("Enter num1:");
		num1 = inputNum.nextDouble();
		System.out.println("Enter num2:");
		num2 = inputNum.nextDouble();	
		System.out.println("Enter operator:");
		op = inputOp.next();
		
		if(op.equals("+"))
			System.out.println(add(num1,num2));
		else if(op.equals("-"))
			System.out.println(sub(num1, num2));	
		else{
			System.out.println("Invalid operator:");
		}
		break;			
		}	
	}
	static Double add(Double x, Double y){
		return x+y;
	}
	static Double sub(Double x, Double y){
		return x-y;
	}
}
