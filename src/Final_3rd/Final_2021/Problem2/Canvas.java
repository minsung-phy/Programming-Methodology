package Final_3rd.Final_2021.Problem2;

public class Canvas {

	private Shape[] shapes;
	private int counter = 0;

	public Canvas(int n) {
		shapes = new Shape[n];
	}

	public void add(Shape s) {
		if (counter == shapes.length) {
			Shape[] temp = new Shape[counter*2];
			for (int i = 0; i < counter; i++)
				temp[i] = shapes[i];
			shapes = temp;
		}
		shapes[counter] = s;
		counter += 1;
	}

	public double totalArea() {
		double total = 0;
		for (int i = 0; i < counter; i++) {
			Shape m = shapes[i];
			if (m instanceof Circle) {
				total =+ ((Circle) m).area();
			}
			if (m instanceof Rectangle)
				total =+ ((Rectangle) m).area();
		}
		return total;
	}

	public static void main(String[] args) {
		new Canvas(4);
	}

}
