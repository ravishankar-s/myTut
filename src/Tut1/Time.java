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

	public boolean equals(Time t1){
		int tseconds = (hrs*60*60)+(mins*60)+ secs;
		int t1secnds = (t1.hrs*60*60)+(t1.mins*60)+t1.secs;
		if(tseconds==t1secnds)
			return true;
		else 
			return false;
	}
}
