package prep.secondweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class DrawingBook {

	public static void main(String[] args) {
		 //System.out.println(pageCount(5, 4));
		System.out.println(pageCount(10, 4));
	}

	public static int pageCount(int n, int p) {

		List<List<Integer>> paginas = new ArrayList<>();

		paginas.add(Arrays.asList(1));

		IntStream.range(2, n + 1).forEach(v -> {
			if (v % 2 != 0 && v != n) {
				paginas.add(Arrays.asList(v - 1, v));
			} else if (v % 2 != 0 && v == n) {
				paginas.add(Arrays.asList(v - 1, v));
			} else if (v == n) {
				paginas.add(Arrays.asList(v));
			}
		});
		
		if(p > n/2) {
			Collections.reverse(paginas);
		}

		for (int i = 0; i < paginas.size(); i++) {
			System.out.println(paginas.get(i));
		}

		int numPaginas = 0;

		for (int i = 0; i < paginas.size(); i++) {
			if (paginas.get(i).contains(p)) {
				System.out.println("Está en -> " + i);
				numPaginas = i;
			}
		}
				
		return numPaginas;

	}

}
