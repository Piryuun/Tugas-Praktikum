import java.util.Scanner;
public class LuarJamPraktikum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Nama: ");
		String angka = input.nextLine();

		System.out.print("Nilai Tugas: ");
		double nilaiTugas = input.nextDouble();

		System.out.print("Nilai UTS: ");
		double nilaiUTS = input.nextDouble();

		System.out.print("Nilai UAS: ");
		double nilaiUAS = input.nextDouble();

		System.out.print("Persentase Kehadiran: ");
		double persentaseKehadiran = input.nextDouble();

		double nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

		if (persentaseKehadiran >= 75) {
			if (nilaiAkhir >= 60) {
				System.out.println(nilaiAkhir + " -> LULUS");
			} else {
				System.out.println(nilaiAkhir + " -> TIDAK LULUS");
			}
		} else {
			System.out.println("TIDAK LULUS");
		}
	}
}