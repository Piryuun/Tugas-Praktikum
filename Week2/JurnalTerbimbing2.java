import java.util.Scanner;

public class JurnalTerbimbing2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Suhu dalam Celcius: ");
		double celcius = input.nextDouble();

		double reamur = (celcius * 4) / 5;
		double fahrenheit = (celcius * 9) / 5 + 32;
		double kelvin = celcius + 273.15;

		System.out.println("\nHasil Konversi: ");
		System.out.println("Reamur: " + reamur + "R");
		System.out.println("Fahrenheit: " + fahrenheit + "F");
		System.out.println("Kelvin: " + kelvin + "K");
	}
}