package Tut1;


public class Chap8_1 {
	public static void main(String[] args){
		System.out.println("test"=="Test");
		System.out.println(3<=7);
		int num=10;
		int sal=5000;
		boolean tee;
		tee=(num<=15) && (sal>=3000);
		String x = Boolean.toString(tee);
			System.out.println(x);
		String r = Integer.toString(sal);	
		System.out.println(num);
	}

}
