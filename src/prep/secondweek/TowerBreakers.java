package prep.secondweek;

public class TowerBreakers {

	public static void main(String[] args) {
		// NO INTERESANTE
	}

	public static int towerBreakers(int n, int m) {
		return (n % 2 == 0 || m == 1) ? 2 : 1;
	}

}
