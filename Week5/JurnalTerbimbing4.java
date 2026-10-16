import java.util.Scanner;

public class JurnalTerbimbing4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Jumlah Mahasiswa: ");
		int jumSiswa = input.nextInt();

		double nilaiSiswa = 0;

		double jumlahNilai = 0;

		if (jumSiswa <= 0) {
			System.out.println("Jumlah Mahasiswa Tidak Valid");
		} else {
			for (int i = 1; i <= jumSiswa; i++) {
				System.out.print("Nilai Mahasiswa " + i + ": ");
				double inputNilai = input.nextDouble();

				if (inputNilai < 0 || inputNilai > 100) {
					System.out.println("Nilai Mahasiswa Tidak Valid");
					i--;
				} else {
					jumlahNilai += inputNilai;
				}
			}

			double rata = (jumlahNilai / jumSiswa);

			System.out.println("Jumlah Nilai: " + jumlahNilai);
			System.out.println("Rata-rata Nilai: " + rata);
		}
	}
}