package Tut1;
import java.util.ArrayList;
public class Chap11_1 {
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int total = 0;
		double avg;
		numbers.add(10);
		numbers.add(50);
		numbers.add(100);
		
		for(int i=0; i<numbers.size();++i)
			total+=numbers.get(i);
		avg = total/numbers.size();
		System.out.println("average:"+ avg);
		
	}

	

}
