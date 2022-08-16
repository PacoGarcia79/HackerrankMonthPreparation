package prep.firstweek;

import java.util.Arrays;
import java.util.List;

public class FindMedian {
	
	public static void main(String[] args) {
		List<Integer> listaIntegers = Arrays.asList(0,1,2,4,6,5,3);
		
		System.out.println(findMedian(listaIntegers));
	}
	
	public static int findMedian(List<Integer> arr) {
        Integer[] b = arr.stream().sorted().toArray(Integer[]::new);
        
        int medianLength = b.length/2;
        
        return b[medianLength];
    }

}
