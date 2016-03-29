package Tut1;

public class Chap5_3 {

	private String first;
	private String second;
	private String last;
	
	public Chap5_3(String f,String s, String l){
		first = f;
		second = s;
		last = l;
	}
	
	public Chap5_3(String f, String s){
		first = f;
		second=s;
		last = "";
	}
	public Chap5_3(String f){
		first = f;
		second = "";
		last = "";
		
	}
	public Chap5_3(){
		first = "";
		second = "";
		last = "";
	}
	public String toString(){
		return first +" "+second +" "+ last;
	}
	
	public static void main(String[] args){
		Chap5_3 myName = new Chap5_3("Ravi", "Shankar");
		System.out.println("myName:"+ myName.toString());
	}
	
}
