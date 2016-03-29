package test;
import java.awt.*;
import java.applet.*;

public class apletTut extends Applet {
	
	public void paint(Graphics g){
		int x1= 0;
		int y1= 100;
		int x2= 100;
		int y2= 100;
		g.drawLine(x1,y1,x2,y2);
	}

}
