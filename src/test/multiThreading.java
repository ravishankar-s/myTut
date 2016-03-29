package test;

public class multiThreading implements Runnable{
	
	public void run(){
		System.out.println("it is running");
		
	}
	public static void main(String[] args){
		multiThreading obj = new multiThreading();
		Thread tobj = new Thread(obj);
		tobj.start();		
		
	}

}
