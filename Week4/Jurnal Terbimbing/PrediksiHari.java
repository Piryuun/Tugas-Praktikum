import java.util.Scanner;
public class PrediksiHari {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Pilihan hari [0. Minggu, 1.Senin, 2.Selasa, 3.Rabu, 4.Kamis, 5.Jumat, 6.Sabtu]: ");
		int hari = input.nextInt();
		hari = (hari + 2) % 7;
		switch (hari) {
				case 0 :
					System.out.println("Lusa adalah hari minggu");
					break;

				case 1 : 
					System.out.println("Lusa adalah hari senin");
					break;

				case 2 : 
					System.out.println("Lusa adalah hari selasa");
					break;

				case 3 : 
					System.out.println("Lusa adalah hari rabu");
					break;

				case 4 :
					System.out.println("Lusa adalah hari kamis");
					break;

				case 5 : 
					System.out.println("Lusa adalah hari jumat");
					break;

				case 6 :
					System.out.println("Lusa adalah hari sabtu");
					break;
				default:
					System.out.println("Angka hari tidak valid");
			}
		input.close();
	}
}