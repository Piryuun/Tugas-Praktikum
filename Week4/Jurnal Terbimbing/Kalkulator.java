import java.util.Scanner;
public class Kalkulator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Angka Pertama: ");
		double a = input.nextDouble();

		System.out.print("Masukan Angka Kedua: ");
		double b = input.nextDouble();

		System.out.println("=== MENU OPERASI ===");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");

		System.out.print("Pilih Operasi: ");
		int operasi = input.nextInt();

		switch (operasi) {
				case 1:
					System.out.println("Hasil: " + (a + b));
					break;
				case 2:
					System.out.println("Hasil: " + (a - b));
					break;
				case 3:
					System.out.println("Hasil: " + (a * b));
					break;
				case 4:
					if (b != 0) {
						System.out.println("Hasil: " + (a / b));
					} else {
						System.out.println("Tidak dapat membagi dengan nol");
					}
					break;
				default:
					System.out.println("Pilihan tidak tersedia");
			}
		input.close();
	}
}