import java.util.Arrays;

public class Matrix {
	// TODO add some more javadocs
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
				if (i == j) {
					continue;
				}
				if (j < i) {
					continue;
				}
				if (constructor[i].length != constructor[j].length) {
					throw new NullPointerException("invalid matrix");
				}
			}
		}	
	}
	
	public Matrix(int numRows, int numCols) {
		this.rows = numRows;
		this.cols = numCols;
		
		this.constructor = new double[numRows][numCols];
		
		initEmpty(numRows, numCols);
	}
	
	/**
	 * Prints matrix (one row per line).
	 */
	public void display() {
		
		for (int row = 0; row < constructor.length; row ++) {
			System.out.println(Arrays.toString(constructor[row]));
		}
		
		System.out.println(" ");
	}
	
	// initialize matrix with all zeros
	/**
	 * Initializes matrix will all values as zero.
	 * @param numRows Number of rows in matrix.
	 * @param numCols Number of columns in matrix.
	 */
	public void initEmpty(int numRows, int numCols) {
		for (int i = 0; i < numRows; i ++) {
			for (int j = 0; j < numCols; j ++) {
				this.constructor[i][j] = 0;
			}
		}
	}
	
	/**
	 * Checks if matrix is square.
	 * @return Whether matrix is square or not.
	 */
	public boolean isSquare() {
		return rows == cols;
	}
	
	/**
	 * Add matrix to given other matrix.
	 * @param other The other matrix to add to.
	 * @return The addition of the two matrices.
	 */
	public Matrix add(Matrix other) {
		
		// evaluate operation validity
		if ((this.rows != other.rows) || (this.cols != other.cols)) {
			throw new NullPointerException("matrix addition invalid");
		}
		
		Matrix total = new Matrix(other.rows, other.cols);
		
		for (int row1 = 0; row1 < this.constructor.length; row1 ++) {
			for (int col1 = 0; col1 < this.constructor[0].length; col1 ++) {
				total.constructor[row1][col1] = this.constructor[row1][col1] + other.constructor[row1][col1];
			} 
		}
		
		return total;
	}
	
	// matrix scalar multiplication
	/**
	 * Multiply matrix by given scalar.
	 * @param scalar The scalar to multiply by.
	 * @return The multiplication of the two quantities.
	 */
	public Matrix multScalar(double scalar) {
		
		Matrix total = new Matrix(this.rows, this.cols);
		
		for (int i = 0; i < this.constructor.length; i ++) {
			for (int j = 0; j < this.constructor[0].length; j ++) {
				total.constructor[i][j] = this.constructor[i][j] * scalar;
			}
		}
		
		return total;
	}
	
	// matrix-matrix multiplication
	public Matrix multMatrix(Matrix other) {
		
		// evaluate operation validity
		if (this.cols != other.rows) {
			throw new NullPointerException("matrix multiplication invalid");
		}
		
		Matrix total = new Matrix(this.rows, other.cols);
		
		for (int totalRow = 0; totalRow < this.rows; totalRow ++) {
			for (int totalCol = 0; totalCol < other.cols; totalCol ++) {
				for (int multCounter = 0; multCounter < this.cols; multCounter ++) {
					total.constructor[totalRow][totalCol] += this.constructor[totalRow][multCounter] * other.constructor[multCounter][totalCol];
				}
			}
		}
		
		return total;
	}
}
