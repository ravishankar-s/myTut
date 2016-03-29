package Tut1;
import java.util.ArrayList;
import java.util.Random;

public class Chap11_4 {
	public static void main(String[] args){
		Random rand = new Random(System.currentTimeMillis());
		int number;		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<5;++i){		
			number = rand.nextInt(10);
		arr.add(number);
		}
		disp(arr);	
		disp(arr);	
			}
	static void disp(ArrayList arr){
	for(int i=0; i<arr.size(); ++i)
		System.out.print(arr.get(i) + " ");		
	    System.out.println("");
	}

}
