import java.util.Scanner;
public class JurnalTerbimbing {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double saldo = 1000000;
		System.out.println("Saldo: Rp " + saldo);
		System.out.print("Jumlah penarikan: Rp ");
		double tarik = input.nextDouble();
		//penarikan jika saldo lebih dari 0
		if (tarik > 0) {
			//penarikan jika jumlah penarikan lebih dari saldo
			if (tarik <= saldo) {
				double saldoAkhir = saldo - tarik;
				if (saldoAkhir >= 50000) {
					saldo = saldoAkhir;
					System.out.println("Transaksi berhasil");
					System.out.println("Saldo akhir: Rp " + saldo);
				} else {
					System.out.println("Transaksi ditolak.");
					System.out.println("Saldo minimum Rp50.000");
				}
			} else {
				System.out.println("Saldo tidak mencukupi");
			}
		} else {
			System.out.println("Jumlah penarikan tidak valid");
		}
	}
}