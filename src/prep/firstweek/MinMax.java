package prep.firstweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class MinMax {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(396285104, 573261094, 759641832, 819230764, 364801279);

		//List<Integer> arr = Arrays.asList(5, 5, 5, 5, 5);

		if (arr.stream().distinct().count() <= 1) {

			Long sum = arr.stream().limit(arr.size() - 1).mapToLong(Integer::intValue).sum();

			System.out.println(sum + " " + sum);
		} else {
			Integer maxInteger = arr.stream().max(Integer::compare).get();

			Integer minInteger = arr.stream().min(Integer::compare).get();

			Long sumMax = arr.stream().filter(v -> !v.equals(minInteger)).mapToLong(Integer::intValue).sum();

			System.out.println(sumMax);

			Long sumMin = arr.stream().filter(v -> !v.equals(maxInteger)).mapToLong(Integer::intValue).sum();

			System.out.println(sumMin);

			System.out.println(sumMin + " " + sumMax);
		}

	}
}
