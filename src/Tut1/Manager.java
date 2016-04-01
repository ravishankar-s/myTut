package Tut1;

public class Manager extends Employee {
	private String depart;
	
	Manager(String n, int s, String d){
		super(n,s);
		depart = d; 
	}
	public String getDepart(){
		return depart;
	}
	public String getEmpInfo(){
		String empinfo = 	super.getEmpInfo();
		return depart +" " +empinfo;
	}
	public void changeSal(Employee e,int s){
	    e.sal = s;
	}

}
