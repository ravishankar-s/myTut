package Tut1;

public class Chap5_5 {
	
	private String first;
	private String second;
	private String last;
	
	public Chap5_5(String f,String s, String l){
		first = f;
		second = s;
		last = l;
	}
	
	public Chap5_5(String f, String s){
		first = f;
		second=s;
		last = "";
	}
	public Chap5_5(String f){
		first = f;
		second = "";
		last = "";
		
	}
	public Chap5_5(){
		first = "";
		second = "";
		last = "";
	}
	public String getFirst(){
		return first;
	}
	public String getSceond(){
		return second;
	}
	public void setFirst(String fname){
		first = fname;
	}
	public void setSeconf(String sname){
		second = sname;
	}
	public String toString(){
		return first +" "+second +" "+ last;
	}
	public static void main(String[] args){
		Chap5_5 name =new Chap5_5("ravi","shankar");
		System.out.println(name.toString());
	    name.setFirst("test");
	    System.out.println(name.getFirst());
	}
	

}
