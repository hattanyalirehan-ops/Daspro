import java.util.Scanner;
public class Tugas02_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input jumlah lembar (x)
        System.out.print("Masukkan jumlah lembar dokumen (x): ");
        int x = scanner.nextInt();

        // Proses perhitungan
        long biayaCetak = (long) x * 500;
        long totalBiaya = biayaCetak + 5000;

        // Menampilkan hasil
        System.out.println("Total biaya yang harus dibayar: Rp" + totalBiaya);
        
        scanner.close();
    }
}

