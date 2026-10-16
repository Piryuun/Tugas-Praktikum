import java.util.Scanner;

public class JurnalMandiri4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Saldo Awal: ");
		int sa = input.nextInt();

		if (sa < 0) {
			System.out.println("Saldo Awal Tidak Boleh Negatif.");
		} else {
			System.out.print("Setoran Per Bulan: ");
			int spb = input.nextInt();

			if (spb < 0) {
				System.out.println("Setoran Per Bulan Tidak Boleh Negatif.");
			} else {
				System.out.print("Lama Menabung: ");
				int lm = input.nextInt();

				if (lm <= 0) {
					System.out.println("Lama Menabung harus lebih besar dari 0.");
				} else {
					int saldoakhir = 0;

					for (int i = 1; i <= lm; i++){
						sa += spb;
						System.out.println("Bulan " + i +": " + sa);

						saldoakhir = sa;
					}

					System.out.println("Saldo Akhir: " + saldoakhir);
				}
			}
		}
	}
}