package prep.firstweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SparseArrays {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");

		List<String> strings2 = Arrays.asList("lekgdisnsbfdzpqlkg", "eagemhdygyv", "jwvwwnrhuai", "urcadmrwlqe",
				"mpgqsvxrijpombyv", "mpgqsvxrijpombyv", "urcadmrwlqe", "mpgqsvxrijpombyv", "eagemhdygyv", "eagemhdygyv",
				"jwvwwnrhuai", "urcadmrwlqe", "jwvwwnrhuai", "kvugevicpsdf", "kvugevicpsdf", "mpgqsvxrijpombyv",
				"urcadmrwlqe", "mpgqsvxrijpombyv", "exdafbnobg", "qhootohpnfvbl", "suffrbmqgnln", "exdafbnobg",
				"exdafbnobg", "eagemhdygyv", "mpgqsvxrijpombyv", "urcadmrwlqe", "jwvwwnrhuai", "lekgdisnsbfdzpqlkg",
				"mpgqsvxrijpombyv", "lekgdisnsbfdzpqlkg", "jwvwwnrhuai", "exdafbnobg", "mpgqsvxrijpombyv",
				"kvugevicpsdf", "qhootohpnfvbl", "urcadmrwlqe", "kvugevicpsdf", "mpgqsvxrijpombyv",
				"lekgdisnsbfdzpqlkg", "mpgqsvxrijpombyv", "kvugevicpsdf", "qhootohpnfvbl", "lxyqetmgdbmh",
				"urcadmrwlqe", "urcadmrwlqe", "kvugevicpsdf", "lxyqetmgdbmh", "urcadmrwlqe", "lxyqetmgdbmh",
				"jwvwwnrhuai", "qhootohpnfvbl", "qhootohpnfvbl", "jwvwwnrhuai", "lekgdisnsbfdzpqlkg", "kvugevicpsdf",
				"mpgqsvxrijpombyv", "exdafbnobg", "kvugevicpsdf", "lekgdisnsbfdzpqlkg", "qhootohpnfvbl", "exdafbnobg",
				"qhootohpnfvbl", "exdafbnobg", "mpgqsvxrijpombyv", "suffrbmqgnln", "mpgqsvxrijpombyv", "qhootohpnfvbl",
				"jwvwwnrhuai", "mpgqsvxrijpombyv", "qhootohpnfvbl", "lekgdisnsbfdzpqlkg", "eagemhdygyv", "jwvwwnrhuai",
				"kvugevicpsdf", "eagemhdygyv", "eagemhdygyv", "lxyqetmgdbmh", "qhootohpnfvbl", "lxyqetmgdbmh",
				"exdafbnobg", "qhootohpnfvbl", "qhootohpnfvbl", "exdafbnobg", "suffrbmqgnln", "mpgqsvxrijpombyv",
				"urcadmrwlqe", "eagemhdygyv", "lxyqetmgdbmh", "urcadmrwlqe", "suffrbmqgnln", "qhootohpnfvbl",
				"kvugevicpsdf", "lekgdisnsbfdzpqlkg", "lxyqetmgdbmh", "mpgqsvxrijpombyv", "jwvwwnrhuai", "lxyqetmgdbmh",
				"lxyqetmgdbmh", "lekgdisnsbfdzpqlkg", "qhootohpnfvbl");

		List<String> queries = Arrays.asList("aba", "xzxb", "ab");

		List<String> queries2 = Arrays.asList("exdafbnobg", "eagemhdygyv", "mpgqsvxrijpombyv", "kvugevicpsdf",
				"lekgdisnsbfdzpqlkg", "kvugevicpsdf", "exdafbnobg", "qhootohpnfvbl", "eagemhdygyv", "kvugevicpsdf",
				"suffrbmqgnln", "jwvwwnrhuai", "lekgdisnsbfdzpqlkg", "lekgdisnsbfdzpqlkg", "mpgqsvxrijpombyv",
				"jwvwwnrhuai", "kvugevicpsdf", "lekgdisnsbfdzpqlkg", "exdafbnobg", "suffrbmqgnln", "qhootohpnfvbl",
				"eagemhdygyv", "exdafbnobg", "suffrbmqgnln", "jwvwwnrhuai", "qhootohpnfvbl", "eagemhdygyv",
				"exdafbnobg", "exdafbnobg", "jwvwwnrhuai", "qhootohpnfvbl", "lxyqetmgdbmh", "qhootohpnfvbl",
				"suffrbmqgnln", "lxyqetmgdbmh", "qhootohpnfvbl", "eagemhdygyv", "jwvwwnrhuai", "eagemhdygyv",
				"qhootohpnfvbl", "mpgqsvxrijpombyv", "qhootohpnfvbl", "jwvwwnrhuai", "exdafbnobg", "eagemhdygyv",
				"eagemhdygyv", "kvugevicpsdf", "kvugevicpsdf", "jwvwwnrhuai", "urcadmrwlqe", "lxyqetmgdbmh",
				"qhootohpnfvbl", "exdafbnobg", "exdafbnobg", "eagemhdygyv", "qhootohpnfvbl", "exdafbnobg", "exdafbnobg",
				"lekgdisnsbfdzpqlkg", "jwvwwnrhuai", "eagemhdygyv", "urcadmrwlqe", "kvugevicpsdf", "lekgdisnsbfdzpqlkg",
				"jwvwwnrhuai", "eagemhdygyv", "lekgdisnsbfdzpqlkg", "exdafbnobg", "kvugevicpsdf", "jwvwwnrhuai",
				"exdafbnobg", "lxyqetmgdbmh", "exdafbnobg", "lxyqetmgdbmh", "jwvwwnrhuai", "mpgqsvxrijpombyv",
				"eagemhdygyv", "urcadmrwlqe", "kvugevicpsdf", "qhootohpnfvbl", "jwvwwnrhuai", "eagemhdygyv",
				"urcadmrwlqe", "urcadmrwlqe", "exdafbnobg", "qhootohpnfvbl", "exdafbnobg", "eagemhdygyv", "exdafbnobg",
				"jwvwwnrhuai", "eagemhdygyv", "jwvwwnrhuai", "mpgqsvxrijpombyv", "urcadmrwlqe", "urcadmrwlqe",
				"eagemhdygyv", "eagemhdygyv", "jwvwwnrhuai", "suffrbmqgnln", "eagemhdygyv"

		);

		matchingStrings(strings2, queries2);
	}

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {


		int[] t = new int[queries.size()];
		
		for (int j = 0; j < queries.size(); j++) {
			t[j] = (int) strings.stream().filter(queries.get(j)::equals).count();	
		}

		System.out.println(Arrays.toString(t));

		return Arrays.stream(t).boxed().collect(Collectors.toList());
	}
}
