package prep.firstweek;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DiagonalDiference {

	public static void main(String[] args) {

		List<List<Integer>> arr = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(5, 6, 7),
				Arrays.asList(9, 10, 11));

		diagonalDifference(arr);
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

	public static int diagonalDifference(List<List<Integer>> arr) {

		Integer matrixSize = arr.size();

		int[][] matriz = new int[matrixSize][matrixSize];

		System.out.println(matriz.length);

		// RELLENAR MATRIZ

		for (int i = 0; i < matriz.length; i++)
			// Loop through all elements of current row
			for (int j = 0; j < matriz[i].length; j++)
				// matriz[i][j] = new Random().nextInt(10);
				matriz[i][j] = arr.get(i).get(j);

		printMatrix(matriz);

		int sumaIzqDer = 0;
		int sumaDerIzq = 0;

		// SUMAS

		Integer posicion = matriz.length - 1;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				if (i == j) {
					sumaIzqDer += matriz[i][j];
				}
			}

			sumaDerIzq += matriz[i][posicion];
			posicion--;
		}

		System.out.println("Suma izquierda derecha -> " + sumaIzqDer);
		System.out.println("Suma derecha izquierda -> " + sumaDerIzq);

		Integer resultado = Math.abs(sumaIzqDer - sumaDerIzq);
		System.out.println(resultado);
		
		return resultado;

	}

}
