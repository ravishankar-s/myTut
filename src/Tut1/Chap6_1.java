package Tut1;
import java.util.Scanner;

public class Chap6_1 {

	public static void main(String[] args){
		System.out.println("to find the reminder when 50/9:" + 50%9);
		System.out.println("to find the quotent:"+ 10/10);
		System.out.println("to find the quotent(wiht floting)50/9:" + 50/9.0);
		final int num=9;
		double x = 90/num;
		System.out.println(Math.max(100,20));
		System.out.println(Math.round(12.69));
		System.out.println("Enter sal:");
		Scanner input = new Scanner(System.in);
		double sal, hike, result;
		sal = input.nextDouble();
		System.out.println("Enter the %:");
		Scanner hikeper = new Scanner(System.in);
		hike = hikeper.nextDouble();
		result = ((((sal*12)*hike)/100)/12)+sal;
		System.out.println(result);
		
		
	}
}
