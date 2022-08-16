package prep.secondweek;

import java.util.Arrays;
import java.util.List;

public class ZigZagSequence {

	public static void main(String[] args) throws java.lang.Exception {
		// List<Integer> arr = Arrays.asList(2, 3, 5, 1, 4);

		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		Integer[] a = arr.stream().toArray(Integer[]::new);

		findZigZagSequence(a, a.length);
	}

	public static void findZigZagSequence(Integer[] a, int n) {
		Arrays.sort(a);
		int mid = (n + 1) / 2 ;
		int temp = a[mid-1];
		a[mid-1] = a[n - 1];
		a[n - 1] = temp;

		int st = mid;
		int ed = n - 2;
		while (st <= ed) {
			temp = a[st];
			a[st] = a[ed];
			a[ed] = temp;
			st = st + 1;
			ed = ed - 1;
		}
		for (int i = 0; i < n; i++) {
			if (i > 0)
				System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
