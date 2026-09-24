import java.util.Scanner;
public class TugasParkir26{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan lama parkir (dalam jam): ");
        int jamParkir = scanner.nextInt();
        
        int totalTarif;
        
        // Percabangan sesuai ketentuan tarif parkir
        if (jamParkir <= 2) {
            // 2 jam pertama dikenakan tarif dasar Rp 2.000
            totalTarif = 2000;
        } else {
            // Lebih dari 2 jam dikenakan tarif dasar + Rp 1.000 untuk setiap jam berikutnya
            totalTarif = 2000 + (jamParkir - 2) * 1000;
        }
        
        // Menampilkan hasil akhir
        System.out.println("Total tarif parkir untuk " + jamParkir + " jam adalah: Rp " + totalTarif);
        
        scanner.close();
    }
}
