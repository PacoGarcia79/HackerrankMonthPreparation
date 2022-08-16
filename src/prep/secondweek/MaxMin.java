package prep.secondweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.runner.notification.StoppedByUserException;

public class MaxMin {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(20, 30, 40, 100, 200, 1, 2, 3, 4, 10);
		int k = 4;

//		List<Integer> arr = Arrays.asList(4504, 1520, 5857, 4094, 4157, 3902, 822, 6643, 2422, 7288, 8245, 9948, 2822,
//				1784, 7802, 3142, 9739, 5629, 5413, 7232);
//		int k = 5;

		System.out.println("Resultado: " + maxMin(k, arr));
	}

	public static int maxMin(int k, List<Integer> arr) {

		/*   ///FUNCIONA, PERO NO ES EFICIENTE
		List<Integer> values = arr.stream().sorted().collect(Collectors.toList());

		List<Integer> groups = new ArrayList<>();

		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < values.size() - k + 1; i++) {
			for (int j = i; j < i + k; j++) {
				groups.add(values.get(j));
			}

			//Integer maxInteger = groups.stream().max(Integer::compare).get();
			Integer maxInteger = Collections.max(groups);

			//Integer minInteger = groups.stream().min(Integer::compare).get();
			
			Integer minInteger = Collections.min(groups);


			result.add(maxInteger - minInteger);

			groups.clear();
		}

		//return result.stream().min(Integer::compare).get();
		
		return Collections.min(result);
		*/
		
		Integer[] values = arr.stream().toArray(Integer[]::new);
		
		int min=1000000000;
        Arrays.sort(values);
        for(int i=0;i<values.length-k+1;i++){
        	System.out.println("i ->" + i);
        	System.out.println("values[i+k-1] ->" + values[i+k-1]);
        	System.out.println("values[i] ->" + values[i]);
        	
            min=Math.min(min,values[i+k-1]-values[i]);
            
            System.out.println("min -> " + min);
        }
        return min;
	}

}
