import java.util.Scanner;

public class JurnalTerbimbing3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Total Belanja: ");
		int totalbeli = input.nextInt();

		System.out.print("Masukan jumlah uang yang dibayarkan: ");
		int uangDibayar = input.nextInt();

		int kembalian = uangDibayar - totalbeli;

		int lembar10000 = kembalian / 10000;
		int sisa = kembalian % 10000;

		int lembar5000 = sisa / 5000;
		sisa = kembalian % 5000;

		int lembar1000 = sisa / 1000;
		sisa = kembalian % 1000;

		int keping500 = sisa / 500;
		sisa = kembalian % 500;

		int keping100 = sisa / 100;
		sisa = kembalian % 100;

		System.out.println("\nTotal Kembalian: Rp. " + kembalian);
		System.out.println("i. 10.000: " + lembar10000 + " Lembar");
		System.out.println("ii. 5.000: " + lembar5000 + " Lembar");
		System.out.println("iii. 1.000: " + lembar1000 + " Lembar");
		System.out.println("iv. 500: " + keping500 + " Lembar");
		System.out.println("v. 100: " + keping100 + " Lembar");
	}
}