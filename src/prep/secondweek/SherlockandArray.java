package prep.secondweek;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SherlockandArray {

	public static void main(String[] args) throws IOException {
		List<Integer> arr = Arrays.asList(1,2,3,2,1);

		System.out.println(balancedSums(arr));
	}

	public static String balancedSums(List<Integer> arr) {
		
		int x = 0;
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}

		for (int y : arr) {
			if (2 * x == sum - y) {
				return "YES";
			}
			x = x + y;
		}
		return "NO";

//		int sumLeft = 0;   //NO TAN EFICIENTE
//		int sumRight = 0;
//
//		boolean found = false;
//
//		for (int i = 0; i < arr.size()   ; i++) {
//			for (int j = i+1; j < arr.size(); j++) {
//				sumRight += arr.get(j);			
//			}
//						
//			for (int j = i-1; j >= 0; j--) {	
//				
//				if(i == 0) {
//					sumLeft = 0;
//					break;
//				}
//				sumLeft += arr.get(j);	
//			}
//			
//			if(sumRight == sumLeft) {
//				found = true;
//				break;
//			}
//						
//			sumLeft = 0;
//			sumRight = 0;
//		}
//
//		return found ? "YES" : "NO";

	}

}
