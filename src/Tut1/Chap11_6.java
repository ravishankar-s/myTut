package Tut1;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Chap11_6 {
//sorting using collections
	public static void main(String[] args){
		Random rand = new Random(System.currentTimeMillis());
		ArrayList<Integer> numb = new ArrayList<Integer>();
		for(int i = 0; i<10; ++i)
			numb.add(rand.nextInt(100));
		display(numb);
		Collections.sort(numb);
		display(numb);
	}
	
	static void display(ArrayList x){
	for(int i=0;i<x.size();++i)
		System.out.print(x.get(i)+ " ");
	    System.out.println(" "); 
	}
}
