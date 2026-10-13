import java.util.Scanner;

public class JurnalMandiri2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Sisi: ");
		int s = input.nextInt();
		System.out.print("Masukan Panjang: ");
		int p = input.nextInt();
		System.out.print("Masukan Lebar: ");
		int l = input.nextInt();
		System.out.print("Masukan Tinggi: ");
		int t = input.nextInt();

		int luasPersegi = s * s;
		int kelilingPersegi = 4 * s;

		int luasKubus = 6 * s * s;
		int kelilingKubus = 12 * s;
		int volumeKubus = s * s * s;

		int luasBalok = 2 * ((p * l) + (p*t) + (l*t));
		int kelilingBalok = (p + l + t) * 4;
		int volumeBalok = p * l * t;

		System.out.println("\nLuas Persegi: " + luasPersegi);
		System.out.println("Keliling Persegi: " + kelilingPersegi);

		System.out.println("\nLuas Kubus: " + luasKubus);
		System.out.println("Keliling Kubus: " + kelilingKubus);
		System.out.println("Volume Kubus: " + volumeKubus);

		System.out.println("\nLuas Balok: " + luasBalok);
		System.out.println("Keliling Balok: " + kelilingBalok);
		System.out.println("Volume Balok: " + volumeBalok);
	}
}