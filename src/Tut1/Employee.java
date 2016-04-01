package Tut1;

public class Employee {
	private String name;
	protected int sal;
	
	Employee(String n, int s){
		name = n;
		sal = s;
	}
	public String getName(){
		return name;
	}
	public int getSal(){
		return sal;
	}
	
	public String getEmpInfo(){
		return name+" "+ sal;
	}

}
