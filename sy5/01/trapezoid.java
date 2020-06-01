package sy5_1;

import java.util.Random;


public class trapezoid {
	private int top,
				bottom,
				high;
	private double area;
	

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getBottom() {
		return bottom;
	}

	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
	public trapezoid()
	{
		Random random = new Random();
		setTop(random.nextInt(10)+1);
		setBottom(getTop()+random.nextInt(10));
		setHigh(random.nextInt(10)+1);
		setArea((getTop()+getBottom())*getHigh()/2.0);
	}
	
}
