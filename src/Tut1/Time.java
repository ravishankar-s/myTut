package Tut1;

public class Time {
	public int hrs, mins, secs;	
	Time(){
		hrs = 0;
		mins = 0;
		secs = 0;
	}
	Time(int h, int m, int s){
		hrs = h;
		mins = m;
		secs = s;
	}
	public String toString(){
		return "hrs:"+ hrs + " mins:"+ mins + " secs:"+ secs;
	}

}
