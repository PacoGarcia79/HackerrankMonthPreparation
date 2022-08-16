package prep.firstweek;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PermutingTwoArrays {

	public static void main(String[] args) {
		
		List<Integer> A = Arrays.asList(2,1,3);
		List<Integer> B = Arrays.asList(7,8,9);
		
		System.out.println(twoArrays(10, A, B));
		
		List<Integer> A1 = Arrays.asList(1, 2, 2, 1);
		List<Integer> B1 = Arrays.asList(3, 3, 3, 4);
		
		System.out.println(twoArrays(5, A1, B1));

	}

	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
				
		// Sort the array a[] in decreasing order.
		
		List<Integer> sortedReverse = A.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
				
		Integer[] a = sortedReverse.stream().toArray(Integer[]::new);
				
		// Sort the array b[] in increasing order.
		
		Integer[] b = B.stream().toArray(Integer[]::new);
		
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		// Checking condition on each index.
		for (int i = 0; i < A.size(); i++)
			if (a[i] + b[i] < k)
				return "NO";

		return "YES";

	}

}
