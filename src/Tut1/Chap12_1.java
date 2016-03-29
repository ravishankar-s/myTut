package Tut1;

public class Chap12_1 {
	public static void main(String[] args){
	Time test = new Time();
	test.hrs = 10;
	test.mins = 30;
	test.secs = 60;
	Time rv = new Time(10,10,10);
	System.out.println(rv.toString());
	}
	

}
