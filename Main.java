
public class Main {

	public static void main(String[] args) {
		
		double[][] parameter1 = {{1, 0}, {0, 1}};
		double[][] parameter2 = {{1, 2}, {3, 4}};
		
		Matrix mtr1 = new Matrix(parameter1);
		Matrix mtr2 = new Matrix(parameter2);
		
		Matrix mult = mtr1.multMatrix(mtr2);
		mult.display();
		
	}

}
