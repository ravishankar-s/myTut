package Tut1;
import java.util.Scanner;
public class Chap8_8 {
	public static void main(String[] args){
	Scanner inputNum = new Scanner(System.in);
	Scanner inputOp = new Scanner(System.in);
	double num1, num2;
	String op;
	
	System.out.println("Enter the first num:");
	num1 = inputNum.nextDouble();
	System.out.println("Enter the secnd num:");
	num2 = inputNum.nextDouble();
	System.out.println("Enter the op sign:");
	op = inputOp.nextLine();
	if(op.equals("+"))
	System.out.println("Addition of "+ num1 +"+"+num2 +"is:"+ (num1 + num2) );
	else if(op.equals("-"))
	System.out.println("Substraction of "+ num1 +"-"+num2 +"is:"+ (num1 - num2) );
	
	}
}
