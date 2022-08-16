package prep.firstweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayDivision1 {

	public static void main(String[] args) {

//		List<Integer> s = Arrays.asList(2, 2, 1, 3, 2);
//
//		System.out.println("Cuenta -> " + birthday(s, 4, 2));

		List<Integer> s = Arrays.asList(1, 2, 1, 3, 2);

		System.out.println("Cuenta -> " + birthday(s, 3, 2));

//		List<Integer> s = Arrays.asList(4);
//
//		System.out.println("Cuenta -> " + birthday(s, 4, 1));
	}

	public static int birthday(List<Integer> s, int d, int m) {

		/*
		 * Integer[] squares = s.stream().toArray(Integer[]::new);
		 * 
		 * int result = 0;
		 * 
		 * for (int i = 0; i < s.size() - m + 1; i++) { int tmpSum = 0; for (int j = i;
		 * j < i + m; j++) { tmpSum += squares[j]; } if (tmpSum == d) { result++; } }
		 * System.out.println(result);
		 * 
		 * return result;
		 */

		Integer[] squares = s.stream().toArray(Integer[]::new);

		int result = 0;

		for (int i = 0; i < s.size() - m + 1; i++) { 
			System.out.println("i primer bucle = " + i);
			System.out.println("fin -> " + (s.size() - m + 1));
			int tmpSum = 0;
			System.out.println("BUCLE J  ------------------------");
			for (int j = i; j < i + m; j++) {
				System.out.println("i segundo bucle = " + i);
				System.out.println("j = " + j);
				System.out.println("i + m = " + (i + m));
				tmpSum += squares[j];
				System.out.println("tmpSum -> " + tmpSum);
				System.out.println("FIN VUELTA J --------------");
			}
			if (tmpSum == d) {
				result++;
				System.out.println("result -> " + result);
			}

			System.out.println("FIN VUELTA I ----------");
		}
		System.out.println(result);

		return result;

	}

}
