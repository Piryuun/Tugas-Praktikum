import java.util.Scanner;

public class TugasAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Info sekarang tanggal");
        System.out.print("tanggal : ");
        int tanggal = input.nextInt();

        System.out.print("Bulan : ");
        int bulan = input.nextInt();

        if (bulan < 1 || bulan > 12) {
            System.out.println("Input bulan tidak valid! Bulan harus antara 1 - 12.");
        } else {
        	System.out.print("Tahun : ");
	        int tahun = input.nextInt();

	        tanggal += 2;

	        int maxHari = 0;
	        switch (bulan) {
	            case 4: case 6: case 9: case 11:
	                maxHari = 30;
	            case 2:
	                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
	                    maxHari = 29;
	                } else {
	                    maxHari = 28;
	                }
	            default:
	                maxHari = 31;
	        }

	        if (tanggal < 1 || tanggal > maxHari) {
	            System.out.println("Input tanggal tidak valid!");
	            input.close();
	        } else {
		        if (tanggal > maxHari) {
		            tanggal -= maxHari;
		            bulan++;

		            if (bulan > 12) {
		                bulan = 1;
		                tahun++;
		            }
		        }

		        String namaBulan = "";
		        String[] listBulan = {
		            "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
		            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
		        };
		        namaBulan = listBulan[bulan];

		        System.out.println("Lusa tanggal " + tanggal + " " + namaBulan + " " + tahun);

		        input.close();
	        }
        }
    }
}