package Final_2nd.Final_2021.Problem2;

public class Circle extends Shape {
	
	private int radius; // 원의 반지름  
	
	public Circle(int m, int n, int r) {
		super(m,n);
		radius = r;
	}
	
	public int radius() { return radius; }
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
