import java.util.Scanner;
public class JurnalMandiri1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Angka: ");
		int angka = input.nextInt();
		if (angka >= 0) {
			System.out.println("Bilangan Lebih besar dari 0");
		} else {
			System.out.println("Bilangan Lebih kecil dari 0");
		}
	}
}