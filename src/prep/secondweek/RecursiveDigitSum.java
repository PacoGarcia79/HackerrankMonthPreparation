package prep.secondweek;

public class RecursiveDigitSum {

	public static void main(String[] args) {
		String number = "1234";
		
		System.out.println(superDigit(number, 2));
	}
	
	static int superDigit(String n, int k) {
	    long superDigit = getSuperDigit(n);
	    long n1 = getSuperDigit(superDigit);
	    long k1 = getSuperDigit(k);

	    long result = n1 * k1;

	    while (result / 10 != 0) {
	      result = getSuperDigit(result);
	    }

	    return (int) result;
	  }

	  private static long getSuperDigit(String n) {
	    if (n == null || n.isEmpty()) return 0;
	    return (n.charAt(0) - '0') + getSuperDigit(n.substring(1));
	  }

	  private static long getSuperDigit(long n) {
	    if (n / 10 != 0) return (n % 10) + getSuperDigit(n / 10);
	    return (n % 10);
	  }
	  
	/*
	public static int superDigit(String n, int k) {   //NO TAN EFICIENTE
		
		String newString = "";
		int superDigit = 0;
		
		for (int i = 0; i < k; i++) {
			newString = newString.concat(n);
		}
		
		System.out.println(newString);
		
		int number = Integer.valueOf(newString);
		
		System.out.println(number);
		
		while(newString.length() > 1) {
			superDigit = newString.chars()
					.mapToObj(v -> (char)v )
					.mapToInt(c -> Character.getNumericValue(c))
					.reduce(Integer::sum).orElseThrow();
			
			System.out.println(superDigit);
			
			newString = String.valueOf(superDigit);
			
			System.out.println(newString);
		}
				
		return superDigit;
	}
	*/
	
}
