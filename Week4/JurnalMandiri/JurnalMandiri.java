import java.util.Scanner;

public class JurnalMandiri{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Pilihan Bulan [1. Januari, 2.Febuari, 3.Maret, 4.April, 5.Mei, 6.Juni, 7.Juli, 8.Agustus, 9.September, 10.Oktober, 11.November, 12.Desember]: ");
		System.out.print("Bulan sekarang:");
		int bulan = input.nextInt();

		System.out.print("Tahun sekarang: ");
		int tahun = input.nextInt();

		System.out.print("Jumlah bulan target: ");
		int jumlahBulan = input.nextInt();

		String bulanIni = "";
		String bulanTarget = "";

		int totalBulan = (bulan - 1) + jumlahBulan;
		int totalTahun = tahun + (totalBulan / 12);
		int bulanBaru = (totalBulan % 12) + 1;

		switch (bulan) {
			case 1: // Januari
				bulanIni = "Januari";
				break;
			case 2: // Febuari
				bulanIni = "Febuari";
				break;
			case 3: // Maret
				bulanIni = "Maret";
				break;
			case 4: // April
				bulanIni = "April";
				break;
			case 5: // Mei
				bulanIni = "Mei";
				break;
			case 6: // Juni
				bulanIni = "Juni";
				break;
			case 7: // Juli
				bulanIni = "Juli";
				break;
			case 8: // Agustus
				bulanIni = "Agustus";
				break;
			case 9: // September
				bulanIni = "September";
				break;
			case 10: // Oktober
				bulanIni = "Oktober";
				break;
			case 11: // November
				bulanIni = "November";
				break;
			case 12: // Desember
				bulanIni = "Desember";
				break;
			default:
				System.out.println("Bulan Tidak Valid");
		}

		switch (bulanBaru) {
			case 1: // Januari
				bulanTarget = "Januari";
				break;
			case 2: // Febuari
				bulanTarget = "Febuari";
				break;
			case 3: // Maret
				bulanTarget = "Maret";
				break;
			case 4: // April
				bulanTarget = "April";
				break;
			case 5: // Mei
				bulanTarget = "Mei";
				break;
			case 6: // Juni
				bulanTarget = "Juni";
				break;
			case 7: // Juli
				bulanTarget = "Juli";
				break;
			case 8: // Agustus
				bulanTarget = "Agustus";
				break;
			case 9: // September
				bulanTarget = "September";
				break;
			case 10: // Oktober
				bulanTarget = "Oktober";
				break;
			case 11: // November
				bulanTarget = "November";
				break;
			case 12: // Desember
				bulanTarget = "Desember";
				break;
			default:
				System.out.println("Bulan Tidak Valid");
		}

		System.out.print("Sekarang bulan " + bulanIni + " " + tahun + ", ");
		System.out.print(jumlahBulan + " bulan lagi adalah bulan " + bulanTarget + " " + totalTahun);
	}
}