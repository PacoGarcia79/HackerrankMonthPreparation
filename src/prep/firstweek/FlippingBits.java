package prep.firstweek;

import java.util.List;
import java.util.stream.Collectors;

public class FlippingBits {

	public static void main(String[] args) {
		Long input = 3L;
		String result = Long.toBinaryString(input);
		String resultWithPadding = String.format("%32s", result).replaceAll(" ", "0"); // 32-bit Integer
		System.out.println(resultWithPadding);
		
		List<Character> chars = resultWithPadding.chars()
				  .mapToObj(c -> (char) c).collect(Collectors.toList());
		
		chars.forEach(System.out::println);
		
		System.out.println("-----------------------------");
		String stringLong = chars.stream()
				.map(v -> {
					System.out.println("Antes -> " + v);
					
					if(v.equals('0')) {
						v = '1';
					}
					else {
						v = '0';
					}
					
					System.out.println("Después -> " + v);
					return v;
				})
                .map(String::valueOf)
                .collect(Collectors.joining());
		
		System.out.println(stringLong);
		
		long number = Long.parseLong(stringLong, 2);
		
		System.out.println(number);
		
		
	}

}
