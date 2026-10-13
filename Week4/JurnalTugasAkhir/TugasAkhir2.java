import java.util.Scanner;

public class TugasAkhir2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] satuan = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};

        System.out.print("Masukkan Angka (1 - 999): ");
        int angka = input.nextInt();

        String hasil = "";

        if (angka < 0 || angka > 999) {
            System.out.println("Input tidak valid! Angka harus antara 0 sampai 999.");
        } else if (angka == 0) {
            hasil = "Nol";
        } else {
            int ratusan = angka / 100;
            int sisaRatusan = angka % 100;
            if (ratusan == 1) {
                hasil += "Seratus ";
            } else if (ratusan > 1) {
                hasil += satuan[ratusan] + " Ratus ";
            }
            if (sisaRatusan < 12) {
                hasil += satuan[sisaRatusan];
            } else if (sisaRatusan < 20) {
                hasil += satuan[sisaRatusan - 10] + " Belas";
            } else {
                int puluhan = sisaRatusan / 10;
                int sisaSatuan = sisaRatusan % 10;
                hasil += satuan[puluhan] + " Puluh " + satuan[sisaSatuan];
            }
        }
        System.out.println("Output : " + hasil);

        input.close();
    }
}