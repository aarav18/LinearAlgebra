
public class Main {

	public static void main(String[] args) {
		
		double[][] parameter = {{1, 0, 0}, {0, 1, 0}, {0, 0 , 1}};
		
		Matrix mtr = new Matrix(parameter);
		
		mtr.display();
		System.out.println(mtr.rows + " " + mtr.cols);
		System.out.println(mtr.isSquare());
	}

}
