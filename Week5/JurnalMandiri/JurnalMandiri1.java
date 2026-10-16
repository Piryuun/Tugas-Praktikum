import java.util.Scanner;

public class JurnalMandiri1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean lanjut = false;

		int totalSubTotal = 0;

		System.out.println("===== SISTEM KASIR =====");

		do{
			System.out.println("");
			System.out.print("Nama Barang: ");
			String barang = input.next();

			System.out.print("Harga Barang: ");
			int inputharga = input.nextInt();

			System.out.print("Jumlah: ");
			int inputjumlah = input.nextInt();

			int subtotal = (inputharga * inputjumlah);

			System.out.println("");
			System.out.print("Subtotal: " + subtotal);
			System.out.println("");

			System.out.print("Tambah Transaksi(Y/N): ");
			String inputTambah = input.next();

			if (inputTambah.equals("Y") || inputTambah.equals("y")){
				lanjut = true;
			} else {
				lanjut = false;
			}

			totalSubTotal += subtotal;
		} while(lanjut);

		System.out.println("=========================");
		System.out.println("Total belanja: " + totalSubTotal);
		System.out.println("=========================");
	}
}