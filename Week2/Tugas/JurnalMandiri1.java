import java.util.Scanner;

public class JurnalMandiri1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Hari: ");
		int totalHari = input.nextInt();

		int tahun = totalHari / 365;
		int sisa = totalHari % 365;

		int bulan = sisa / 30;
		sisa = sisa % 30;

		int minggu = sisa / 7;
		sisa = sisa % 7;

		int hari = sisa / 1;
		sisa = sisa % 1;

		System.out.println("\ni. Tahun: " + tahun);
		System.out.println("ii. Bulan: " + bulan);
		System.out.println("iii. Minggu: " + minggu);
		System.out.println("iv. Sisa Hari: " + hari);
	}
}