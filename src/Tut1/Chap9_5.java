package Tut1;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Chap9_5 {

	public static void main(String[] args){
	
		String sentance = "to count the spaces present in sentance";
		int countSpace = 0;
		for(int i=0; i<sentance.length();++i){
			if(sentance.charAt(i)!=' ')
				continue;
			   ++countSpace; 				
		}
		System.out.println(countSpace);
		
		
		   System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
	}
	}