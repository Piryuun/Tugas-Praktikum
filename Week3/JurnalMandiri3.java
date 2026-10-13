import java.util.Scanner;
public class JurnalMandiri3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String username = "admin";
		String password = "java123";

		System.out.print("Input Username: ");
		String inputUsername = input.nextLine();
		System.out.print("Input Password: ");
		String inputPassword = input.nextLine();

		if (inputUsername.equals(username)) {
			if (inputPassword.equals(password)) {
				System.out.println("Login berhasil");
			} else {
				System.out.println("Password Salah");
			}
		} else {
			System.out.println("Username tidak ditemukan");
		}
	} 
}