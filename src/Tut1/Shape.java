package Tut1;

public class Shape {
	private int x;
	private int y;
	
	Shape(int xcor, int ycor){
	x = xcor;
	y = ycor;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void set(int xcor, int ycor){
		setX(xcor);
		setY(ycor);
	}

}
