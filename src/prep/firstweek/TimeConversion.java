package prep.firstweek;


public class TimeConversion {

	public static void main(String[] args) {
		String time = "12:40:22AM";

		System.out.println(timeConversion(time));

	}

	public static String timeConversion(String s) {

		String newTime = "";

		if (s.contains("AM")) {
			
			if(s.substring(0, 2).equals("12")) {
				return "00" + s.substring(2, 8);
			}
			return s.substring(0, 8);
		} else {

			switch (s.substring(0, 2)) {
			case "01":
				newTime = "13";
				break;
			case "02":
				newTime = "14";
				break;
			case "03":
				newTime = "15";
				break;
			case "04":
				newTime = "16";
				break;
			case "05":
				newTime = "17";
				break;
			case "06":
				newTime = "18";
				break;
			case "07":
				newTime = "19";
				break;
			case "08":
				newTime = "20";
				break;
			case "09":
				newTime = "21";
				break;
			case "10":
				newTime = "22";
				break;
			case "11":
				newTime = "23";
				break;
			case "12":
				newTime = "12";
				break;
			}
			return newTime + s.substring(2, 8);
		}

	}
}
