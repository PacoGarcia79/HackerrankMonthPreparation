package prep.firstweek;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pangrams {

	public static String pangrams(String s) {
		List<Character> abecedario = Arrays.asList('a','b','c','d','e','f','g','h','i','j'
				,'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
		
		List<Character> chars = s.trim().toLowerCase().replaceAll(" ","").chars()
				  .mapToObj(c -> (char) c).collect(Collectors.toList());
		
		System.out.println(abecedario.stream().allMatch(chars::contains));
				
		chars.forEach(System.out::print);		
		
		return abecedario.stream().allMatch(chars::contains) ? "pangram" : "not pangram";

	}

	public static void main(String[] args) {		

		String test = "We promptly judged antique ivory buckles for the prize";
		
		pangrams(test);		
	}

}
