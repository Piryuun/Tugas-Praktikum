import java.util.Scanner;

public class JurnalTerbimbing3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nilai = 0;
		do {
			System.out.print("Masukan Nilai: ");
			int nilaiInput = input.nextInt();
			nilai = nilaiInput;
			if (nilai < 0 || nilai > 100) {
				System.out.println("");
				System.out.println("Nilai Tidak Valid");
			}
		} while (nilai < 0 || nilai > 100);

		System.out.println("");
		System.out.print("Nilai diterima: " + nilai);
	}
}