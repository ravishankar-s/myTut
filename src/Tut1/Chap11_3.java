package Tut1;
import java.util.ArrayList;

public class Chap11_3 {
	public static void main(String[] args){
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i=0; i<10; ++i)
			num.add(i);	
		display(num);
		change(num, 5);
		
		display(num);
		}

 static void display(ArrayList arr){
	 for(int i=0; i<arr.size(); ++i)
		 System.out.print(arr.get(i)+ " ");
	     System.out.println();
 }
 static void change(ArrayList<Integer> arr, int dig){
	 int value;
	 for(int i=0; i<arr.size(); ++i){
		 value = arr.get(i);
		 arr.set(i, value+dig);		 
	 }
 }
}
