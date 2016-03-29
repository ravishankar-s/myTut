package Tut1;
import java.util.*;
public class Chap11_7 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String palindrome;
		System.out.println("Enter the word:");
		palindrome = input.nextLine();
		ArrayList<String> p = new ArrayList<String>();
		buildArrList(p,palindrome);
        if(isPalindrome(p))
        	System.out.println("is palindrome");
        else
        	System.out.println("is not a palindrome");
	}
	
	static void buildArrList(ArrayList<String> pword, String word){
		for(int i=0;i<word.length();++i)
			pword.add(word.charAt(i) + "");
	}
		
	static boolean isPalindrome(ArrayList<String> word){
		ArrayList<String> rword = new ArrayList<String>();
		rword.addAll(word);
		Collections.reverse(rword);
		for(int i=0;i<word.size();++i)
			if(!rword.get(i).equals(word.get(i)))
				return false;
			
				return true;
	}
	
		
}
