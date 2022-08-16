package prep.secondweek;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CaesarCipher {

	public static void main(String[] args) {
//		System.out.println(caesarCipher("middle-Outz", 2));

//		System.out.println(
//				caesarCipher("1X7T4VrCs23k4vv08D6yQ3S19G4rVP188M9ahuxB6j1tMGZs1m10ey7eUj62WV2exLT4C83zl7Q80M", 27));
		
		System.out.println(caesarCipher("www.abc.xy", 87));

	}

	public static String caesarCipher(String s, int k) {

		List<Character> alfabeto = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

		List<Character> alfabetoTemp = new ArrayList<Character>(alfabeto);

		IntStream.range(0, k).forEach(v -> {

			if (v > alfabeto.size()-1) {	
				v = v % alfabeto.size();
			}

			alfabetoTemp.add(alfabeto.get(v));
			alfabetoTemp.remove(alfabeto.get(v));
		});

		List<Character> chars = s.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());

		List<Integer> posicionesAbecedario = chars.stream().mapToInt(v -> alfabeto.indexOf(v)).boxed()
				.collect(Collectors.toList());

		List<Integer> mays = new ArrayList<>();

		char[] alpha = s.toCharArray();

		for (int i = 0; i < alpha.length; i++) {
			if (Character.isUpperCase(alpha[i])) {
				mays.add(i);
			}
		}

		for (int i = 0; i < posicionesAbecedario.size(); i++) {
			if (posicionesAbecedario.get(i) != -1) {
				alpha[i] = alfabetoTemp.get(posicionesAbecedario.get(i));
			}

		}

		mays.forEach(v -> {
			;
			char upperCase = Character.toUpperCase(alpha[v]);
			alpha[v] = upperCase;
		});

		String nueva = String.valueOf(alpha);

		return nueva;

	}
	
	
	@Test
	public void test() {
		assertEquals("1Y7U4WsDt23l4ww08E6zR3T19H4sWQ188N9bivyC6k1uNHAt1n10fz7fVk62XW2fyMU4D83am7R80N", caesarCipher("1X7T4VrCs23k4vv08D6yQ3S19G4rVP188M9ahuxB6j1tMGZs1m10ey7eUj62WV2exLT4C83zl7Q80M", 27));
		
		assertEquals("fff.jkl.gh", caesarCipher("www.abc.xy", 87));
	}

}
