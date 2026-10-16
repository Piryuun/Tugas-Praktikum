import java.util.Scanner;

public class JurnalTerbimbing1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan Angka Awal: ");
		int awal = input.nextInt();

		System.out.print("Masukan Angka Awal: ");
		int akhir = input.nextInt();

		System.out.print("Hasil: ");
		while (awal <= akhir) {
			System.out.print(awal + " ");
			awal++;
		}
	}
}