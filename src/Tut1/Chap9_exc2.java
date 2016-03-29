package Tut1;
import java.util.Scanner;
public class Chap9_exc2 {
	public static void main(String[] args){
		Double num1, num2;
		Scanner inputNum = new Scanner(System.in);
		Scanner inputOp = new Scanner(System.in);
		String op;
		while(true){
		System.out.println("Enter first digit:");
		num1 = inputNum.nextDouble();
		System.out.println("Enter second digit:");
		num2 = inputNum.nextDouble();
		System.out.println("Enter the operator:");
		op = inputOp.next();
		
			if(op.equals("+"))
				System.out.println(num1+num2);
			else if(op.equals("-"))
				System.out.println(num1-num2);
			else if(op.equals("*"))
				System.out.println(num1*num2);
			else if(op.equals("/"))
				System.out.println(num1/num2);
		}
		
	}

}
