
public class Main {

	public static void main(String[] args) {
		
		double[][] parameter1 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
		double[][] parameter2 = {{2, 0, 0}, {0, 2, 0}, {0, 0, 2}};
		
		Matrix mtr1 = new Matrix(parameter1);
		Matrix mtr2 = new Matrix(parameter2);
		
		Matrix addTot = mtr1.add(mtr2);
		addTot.display();
		
		Matrix multTot = mtr1.multScalar(10);
		multTot.display();
		
	}

}
