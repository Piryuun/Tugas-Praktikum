import java.util.Scanner;
import java.util.Random;

public class JurnalMandiri5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random gen = new Random();

		int nilai = gen.nextInt(100);

		int nilaibawah = 0;
		int nilaiatas = 100;
		int jumlahtebakan = 0;
		boolean belumketebak = true;

		while (belumketebak) {
			System.out.print("Tebak angka antara " + nilaibawah + "-" + nilaiatas + ": ");
			int tebakan = input.nextInt();
			if (tebakan < nilaibawah || tebakan > nilaiatas) {
				System.out.println("Tebakan di luar rentang");
			} else {
				jumlahtebakan++;
				if (tebakan < nilai) {
					System.out.println("Tebakan anda lebih kecil.");
					nilaibawah = tebakan;
				} else if (tebakan > nilai){
					System.out.println("Tebakan anda lebih besar.");
					nilaiatas = tebakan;
				} else {
					System.out.println("Tebakan anda benar");
					System.out.println("Nilai yang dicari adalah: " + tebakan);
					System.out.println("Berhasil menebak dalam: " + jumlahtebakan + " kali");
					belumketebak = false;
				}
			}
		}
	}
}