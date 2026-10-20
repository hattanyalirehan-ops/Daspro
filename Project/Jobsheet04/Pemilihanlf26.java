import java.util.Scanner;
public class Pemilihanlf26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.print("Apakah UKT Sudah lunas? (true/false):");
        boolean UKTLunas = sc.nextBoolean();

        if (UKTLunas){
            System.out.println("Pembayarn UKT Terverifikasi");
            System.out.println("Silahkan Cetak KRS Dan Minta Tanda Tangan DPA");
        } else {
            System.out.println("Registrasi Ditolak");
            System.out.println("Silahkan Membayar UKT Terlebih Dahulu");
        }
    }
    
}
