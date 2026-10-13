import java.util.Scanner;
public class JurnalTerbimbing2 {
	 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Status mahasiswa (1. aktif/ 2. tidak): ");
		int status = input.nextInt();
		System.out.print("Persentase kehadiran: ");
		double kehadiran = input.nextDouble();
		
		if (status == 1) {
			if (kehadiran >= 75) {
				System.out.println("Mahasiswa dapat mengikuti ujian");
			} else {
				System.out.println("Kehadiran kurang, Tidak dapat ujian");
			}
		} else {
			System.out.println("Mahasiswa tidak aktif");
		}
	 }
}