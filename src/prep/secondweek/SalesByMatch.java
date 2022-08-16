package prep.secondweek;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalesByMatch {

	public static void main(String[] args) {

		// List<Integer> socks = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);

		// List<Integer> socks = Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);

		List<Integer> socks = Arrays.asList(4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5);

		System.out.println(sockMerchant(socks.size(), socks));
	}

	public static int sockMerchant(int n, List<Integer> ar) {

		int count = 0;

		Map<Integer, List<Integer>> map = ar.stream().collect(Collectors.groupingBy(Integer::intValue));

		for (Integer key : map.keySet()) {

			System.out.println(key + " = " + map.get(key));

			if (map.get(key).size() >= 2) {
				count += map.get(key).size() / 2;
			}
		}

		return count;
	}

}
