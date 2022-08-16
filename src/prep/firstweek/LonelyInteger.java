package prep.firstweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LonelyInteger {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 3, 2, 1);

		/*
		 * result = original.stream() .filter(e -> Collections.frequency(original, e) >
		 * 1) .distinct() .collect(Collectors.toList()); // returns {1,3} // returns
		 * only numbers which occur more than once
		 * 
		 * result = original.stream() .filter(e -> Collections.frequency(original, e) ==
		 * 1) .collect(Collectors.toList()); // returns {2,6,8,7} // returns numbers
		 * which occur only once
		 * 
		 * result = original.stream() .distinct() .collect(Collectors.toList()); //
		 * returns {1,2,3,6,8,7} // returns the list without duplicates
		 */

		System.out.println(lonelyinteger(numeros));
	}

	public static int lonelyinteger(List<Integer> a) {

		List<Integer> result = new ArrayList<>();

		result = a.stream().filter(e -> Collections.frequency(a, e) == 1).distinct().collect(Collectors.toList());
		
		return result.stream().findFirst().orElseThrow();
		
		//return result.get(0);
	}

}
