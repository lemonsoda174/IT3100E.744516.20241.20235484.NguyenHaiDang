import java.util.Scanner; 

public class Matrix { 
	public static void main(String[] args) {
		int m, n, i, j; 
		Scanner keyboard = new Scanner(System.in); 

		System.out.println("Enter the number of rows:"); 
		m = keyboard.nextInt(); 
		System.out.println("Enter the number of columns:"); 
		n = keyboard.nextInt(); 

		int matrix[][] = new int[m][n]; 

		System.out.println("Enter the elements of the first matrix:"); 
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				matrix[i][j] = keyboard.nextInt(); 
			}
		}
		
		System.out.println("Enter the elements of the second matrix:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				matrix[i][j] = matrix[i][j] + keyboard.nextInt(); 
			}
		}

		System.out.println("The sum matrix is:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) 
				System.out.print(matrix[i][j] + " "); 
			System.out.println();

		keyboard.close();
		}
	} 
}