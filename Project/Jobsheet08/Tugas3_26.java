import java.util.Scanner;

public class Tugas3_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko = ");
        int jumlahToko = sc.nextInt();

        while (jumlahToko < 1) {
            System.out.print("Jumlah toko minimal 1, masukkan lagi: ");
            jumlahToko = sc.nextInt();
        }

        String rekap = "";          
        int totalSemuaBarang = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;   

        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.print("Jumlah pelanggan Toko " + toko + " = ");
            int pelanggan = sc.nextInt();

            while (pelanggan < 0) {
                System.out.print("Tidak boleh negatif, masukkan lagi: ");
                pelanggan = sc.nextInt();
            }

            int totalBarangToko = 0;

            for (int p = 1; p <= pelanggan; p++) {
                System.out.print("  Jumlah barang pelanggan " + p + " = ");
                int barang = sc.nextInt();

                while (barang < 0) {
                    System.out.print("  Tidak boleh negatif, masukkan lagi: ");
                    barang = sc.nextInt();
                }

                totalBarangToko += barang;
            }

            rekap += "Toko " + toko + " - pelanggan: " + pelanggan
                    + ", total barang: " + totalBarangToko + "\n";

            totalSemuaBarang += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println();
        System.out.print(rekap);
        System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}