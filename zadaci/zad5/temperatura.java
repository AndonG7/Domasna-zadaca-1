package zad5;

public class temperatura {
	public static void main (String args[]) {
		String unit = "степен";
		String value = "2.5";
		
		System.out.println("Температурата изнесува "+(int)(Double.parseDouble(value)*10)+ " " + unit + "и.");
	}
}
