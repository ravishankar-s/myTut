package Tut1;

public class Chap13_1{
	public static void main(String[] args){
		Employee test = new Employee("rv", 10);
		System.out.println(test.getName()+" "+ test.getSal());
		Manager test1 = new Manager("rg", 100, "g");	
		System.out.println(test1.getName()+" "+ test1.getSal()+" "+ test1.getDepart());
		System.out.println(test1.getEmpInfo());
		System.out.println(test.getEmpInfo());
		test1.changeSal(test1, 1000);
		System.out.println(test1.getEmpInfo());
		
		Object g = new Employee("u", 11);
		Employee e1 = (Employee)g;   //casting
		System.out.println(e1.getEmpInfo());
	}
}
