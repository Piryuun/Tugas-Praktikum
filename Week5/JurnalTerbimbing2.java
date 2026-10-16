import java.util.Scanner;

public class JurnalTerbimbing2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan N: ");
		int bilangan = input.nextInt();

		int jumlah = 0;

		System.out.print("Hasil: ");
		for (int i = 1; i <= bilangan; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
				jumlah += i;
			}
		}

		System.out.println("Jumlah: " + jumlah);
	}
}