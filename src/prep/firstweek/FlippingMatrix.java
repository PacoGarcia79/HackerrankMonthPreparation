package prep.firstweek;

import java.util.Arrays;
import java.util.List;

public class FlippingMatrix {

	public static void main(String[] args) {
		List<List<Integer>> matriz = Arrays.asList(Arrays.asList(112, 42, 83, 119), Arrays.asList(56, 125, 56, 49),
				Arrays.asList(15, 78, 101, 43), Arrays.asList(62, 98, 114, 108));

		System.out.println(flippingMatrix(matriz));
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++)
			// Loop through all elements of current row
			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j] + " ");

				if (matrix[i].length - 1 == j) {
					System.out.println();
				}
			}

	}

	public static int flippingMatrix(List<List<Integer>> arr) {

		Integer matrixSize = arr.size();

		int[][] matriz = new int[matrixSize][matrixSize];

		System.out.println("Length -> " + matriz.length);

		// RELLENAR MATRIZ

		for (int i = 0; i < matriz.length; i++)
			// Loop through all elements of current row
			for (int j = 0; j < matriz[i].length; j++)
				// matriz[i][j] = new Random().nextInt(10);
				matriz[i][j] = arr.get(i).get(j);

		// IMPRIMIR MATRIZ

		printMatrix(matriz);

		int n = matriz.length / 2;
		int max = 0;
		int total = 0;
//
//		for (int row = 0; row < n; row++) {
//			for (int col = 0; col < n; col++) {
//				max = Integer.MIN_VALUE;
//				max = Math.max(matriz[row][col], max);
//				max = Math.max(matriz[row][2 * n - col - 1], max);
//				max = Math.max(matriz[2 * n - row - 1][col], max);
//				max = Math.max(matriz[2 * n - row - 1][2 * n - col - 1], max);
//
//				total += max;
//			}
//		}
		

		for (int row = 0; row < n; row++) {
			
			System.out.println("Row -> " + row);
			
			for (int col = 0; col < n; col++) {
				
				System.out.println("Col -> " + col);
				
				max = Integer.MIN_VALUE;
				
				System.out.println("Max 1 -> " + max);
				
				max = Math.max(matriz[row][col], max);
				
				System.out.println("matriz[row][col] -> "  + matriz[row][col]);
				
				System.out.println("Max 2 -> " + max);		
				
				max = Math.max(matriz[row][2 * n - col - 1], max);
				
				System.out.println("matriz[row][2 * n - col - 1] -> "  + matriz[row][2 * n - col - 1]);
				
				System.out.println("Max 3 -> " + max);
				
				max = Math.max(matriz[2 * n - row - 1][col], max);
				
				System.out.println("matriz[2 * n - row - 1][col] -> "  + matriz[2 * n - row - 1][col]);
				
				System.out.println("Max 4 -> " + max);
				
				max = Math.max(matriz[2 * n - row - 1][2 * n - col - 1], max);
				
				System.out.println("matriz[2 * n - row - 1][2 * n - col - 1] -> "  + matriz[2 * n - row - 1][2 * n - col - 1]);
				
				System.out.println("Max 5 -> " + max);

				total += max;
				
				System.out.println("Total -> " + total);
			}
		}

		return total;
	}
}
