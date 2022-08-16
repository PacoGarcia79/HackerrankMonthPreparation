package prep.secondweek;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

	public static void main(String[] args) {
			// ENUNCIADO DIFUSO, NI LO HE INTENTADO. LA SOLUCIÓN ES CORRECTA.
	}

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

		ArrayList<ArrayList<Integer>> seqs = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int lastAns = 0;

		for (int i = 0; i < n; i++) {
			seqs.add(new ArrayList<Integer>());
		}

		for (List<Integer> arr : queries) {
			int seq = (arr.get(1) ^ lastAns) % n;

			int size = seqs.get(seq).size();

			switch (arr.get(0)) {
			case 1:
				seqs.get(seq).add(arr.get(2));
				break;

			case 2:
				lastAns = seqs.get(seq).get(arr.get(2) % size);
				temp.add(lastAns);
			}
		}
		return temp;

	}

}
