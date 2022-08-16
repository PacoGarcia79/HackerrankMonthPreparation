package prep.secondweek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GridChallenge {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\prueba.txt"));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\resultadoprueba.txt"));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());

				List<String> grid = IntStream.range(0, n).mapToObj(i -> {
					try {
						return bufferedReader.readLine();
					} catch (IOException ex) {
						throw new RuntimeException(ex);
					}
				}).collect(Collectors.toList());

				String result = gridChallenge(grid);

				bufferedWriter.write(result);
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}

//	public static void main(String[] args) throws IOException {
//		//List<String> content = Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv");
//		
//		//List<String> content = Arrays.asList("mpxz","abcd","wlmf");
//		
//		//List<String> content = Arrays.asList("eibjbwsp","ptfxehaq","jxipvfga", "rkefiyub", "kalwfhfj", "lktajiaq", "srdgoros", "nflvjznh");
//		
//		List<String> content = Files.readAllLines(Paths.get("D:\\prueba.txt"));
//		
//		System.out.println(gridChallenge(content));
//	}

	public static String sort(String s) {
		char[] array = s.toCharArray();
		Arrays.sort(array);
		return new String(array);
	}

	public static String gridChallenge(List<String> grid) {

//		int n = grid.size();
//		
//        String[]grid2 = new String[n];
//        for(int i=0;i<n;i++)
//            grid2[i] = sort(grid.get(i));
//        
//        boolean ok = true;
//        
//        for(int i=0;i<n-1;i++){
//            for(int j=1;j<n;j++){
//                if(grid2[j].charAt(i) < grid2[j-1].charAt(i)){
//                    ok = false;
//                    break;
//                }
//            }
//        }
//        System.out.println(ok?"YES":"NO");
//        
//        return ok?"YES":"NO";

		List<List<Character>> matrix = new ArrayList<>();
		List<Character> lista = new ArrayList<>();

		int listaSize = 0;

		for (int i = 0; i < grid.size(); i++) {
			lista = grid.get(i).chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList());
			listaSize = lista.size();
			matrix.add(lista);
			lista = new ArrayList<>();
		}

		matrix.forEach(System.out::println);

		System.out.println("Total Size -> " + matrix.size());
		System.out.println("Lista Size -> " + listaSize);

		boolean exit = false;
		int fin = 0;

		if (listaSize >= matrix.size()) {
			fin = matrix.size();
		} else {
			fin = matrix.size() - 1;
		}

		for (int i = 0; i < fin; i++) {
			for (int j = 1; j < matrix.size(); j++) {
				if (matrix.get(j).get(i) < matrix.get(j - 1).get(i)) {
					exit = true;
				}
			}
		}

		System.out.println(!exit ? "YES" : "NO");
		return !exit ? "YES" : "NO";
	}

}
