import java.util.Arrays;

public class Matrix {
	
	public int rows;
	public int cols;
	
	public double[][] constructor;
	
	public Matrix(double[][] constructor) {
		
		// initialize instance fields
		this.constructor = constructor;
		rows = constructor.length;
		cols = constructor[0].length;
		
		// check if valid matrix
		for (int i = 0; i < constructor.length; i ++) {
			for (int j = 0; j < constructor.length; j++) {
				if (constructor[i].length != constructor[j].length) {
					throw new NullPointerException("invalid matrix");
				}
			}
		}
		
	}
	
	// print matrix to console
	public void display() {
		
		for (int row = 0; row < constructor.length; row ++) {
			System.out.println(Arrays.toString(constructor[row]));
		}
		
	}
	
	// check if square
	public boolean isSquare() {
		return rows == cols;
	}
}
