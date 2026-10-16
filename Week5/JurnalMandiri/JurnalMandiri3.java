public class JurnalMandiri3 {
	public static void main(String[] args) {
		int angkawhile = 10;

		System.out.println("===========Perulangan While==================");
		while (angkawhile >= 1) {
			System.out.println(angkawhile);
			angkawhile--;
		}

		int angkadowhile = 10;
		System.out.println("===========Perulangan Do-While===============");
		do{
			System.out.println(angkadowhile);
			angkadowhile--;
		} while (angkadowhile >= 1);

		System.out.println("===========Perulangan For====================");
		for (int i = 10; i >= 1; i--){
			System.out.println(i);
		}
	}
}