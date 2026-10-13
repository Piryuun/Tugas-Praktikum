import java.util.Scanner;
public class JurnalMandiri2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Bilangan: ");
		int angka = input.nextInt();
		if (angka % 2 == 0) {
			System.out.println(angka + " adalah bilangan genap");
		} else {
			System.out.println(angka + " adalah bilangan ganjil");
		}
	}
}