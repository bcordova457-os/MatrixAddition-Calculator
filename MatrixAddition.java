import java.util.*;

public class MatrixAddition{

	public static void main(String [] args){

		int [][] matrix = null;
		int rows;
		int columns;

		Scanner in = new Scanner(System.in);

		System.out.println("Create Matrix One: \n");
		System.out.println("Enter row size of matrix: ");
		rows = in.nextInt();
		System.out.println("Enter column size of matrix");
		columns = in.nextInt();
		int [][] matrix1 = createMatrix(matrix, rows, columns, in);
		
		System.out.println("\nCreate Matrix Two: \n");
		System.out.println("Enter row size of matrix: ");
		rows = in.nextInt();
		System.out.println("Enter column size of matrix");
		columns = in.nextInt();
 
		int [][] matrix2 = createMatrix(matrix, rows, columns, in);

		int [][]result = addMatrices(matrix1, matrix2, rows, columns);
		display(result);
	}

	public static int [][] createMatrix(int [][] matrix, int rows, int columns, Scanner in){
		matrix = new int[rows][columns];
		System.out.println("You've selected a " + rows + "x" + columns + " matrix.");
		System.out.println("Enter in values for matrix: ");

		for(int x = 0; x < rows; x++){
				for(int i = 0; i < columns; i++){
					matrix[x][i] = in.nextInt();
				}
			}
			System.out.println();
		for(int x = 0; x < rows; x++){
			for(int i = 0; i < columns; i++){
				System.out.print(matrix[x][i] + " ");
			}
			System.out.println();
		}

		return matrix;
	}

	public static int [][] addMatrices(int [][] matrix1, int [][] matrix2, int rows, int columns){
		
		/// condition to check if matrix sizes match; if not , exit program.
		if(matrix1.length != matrix2.length){
			System.out.println("Matrix sizes do not match. Please try again.");
			System.exit(0);
		}
		int result[][] = new int[rows][columns];
		for(int x = 0; x < rows;x++){
			for(int i = 0; i < columns; i++){
				result[x][i] = (matrix1[x][i] + matrix2[x][i]);
			}
		}
		return result;
	}
	public static void display(int [][] result){

		System.out.println("\nResult of matrices 1 and 2: \n");

		for(int [] temp1: result){
			for(int i: temp1){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}