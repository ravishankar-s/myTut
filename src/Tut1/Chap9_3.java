package Tut1;

public class Chap9_3 {
	
	public static void main(String[] args){
		double balence=5000 ;
		int years = 0;
		double rate = 1.5;
		while(balence<=10000){
			balence = balence *rate;
					++years;
		}
		System.out.println("takes " + years + "years to reach 10000");
		
	}

}
