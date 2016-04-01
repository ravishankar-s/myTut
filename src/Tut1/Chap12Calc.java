package Tut1;

public class Chap12Calc {

	private double number;
	
	Chap12Calc(double n){
		number = n;
	}
	
	public void sum(double n){
		number+= n;
	}
	public double disp(){
		return number;
	}
}
