package Tut1;
import java.util.Random;
import java.util.ArrayList;
public class Chap11_5 {
	public static void main(String[] args){
		Random rand = new Random(System.currentTimeMillis());
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i=0; i<5;++i){
			num.add(rand.nextInt(10));			
		}
		for(int i=0; i<num.size(); ++i){
			System.out.print(num.get(i) + " ");				
		}
		System.out.println("");	
		//to get the position of the number containing 1
		if(num.contains(1))			
			System.out.println("number 1 contains at position:"+num.indexOf(1));
	
		//to get least value
		int min = 0;
		for(int i=0; i<num.size();++i)
			if(num.get(i)<num.get(min))
				min= i;
			System.out.println("Least number is:"+ num.get(min));
			
			//to get max value
			int max = 0;
		    for(int i=0; i<num.size();++i)
			if(num.get(i)>num.get(max))
				max= i;
			System.out.println("higest number is:"+ num.get(max));			
		}		   
}
