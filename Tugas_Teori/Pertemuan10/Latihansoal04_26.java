import java.util.Scanner;
public class Latihansoal04_26 {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        int JumlahProduk;
        int JumlahHari;

        do {
            System.out.print("Masukkan Jumlah Produk (Minimal 1) : ");
            JumlahProduk = sc.nextInt();
            if (JumlahProduk < 1  ){
                System.out.println("Masukkan Jumlah Produk (Minimal 1 ) : ");
            }
        } while (JumlahProduk < 1);

        do {
            System.out.print("Masukkan Jumlah Hari (Minimal 1) : ");
            JumlahHari = sc.nextInt();
            if (JumlahHari < 1 ){
                System.out.println("Masukkan Jumlah Hari (Minimal 1) : ");
            }
        } while (JumlahHari < 1 );

        int totalSemua = 0;
        int p = 1;

        while (p <= JumlahProduk) {
            System.out.println();
            System.out.println("Produk " + p);
            int totalProduk = 0;

            for (int h = 1; h <= JumlahHari; h++) {
                int jumlah;

                do {
                    System.out.print("  Hari " + h + ": ");
                    jumlah = sc.nextInt();
                    if (jumlah < 0) {
                        System.out.println("  Jumlah terjual tidak boleh negatif, ulangi!");
                    }
                } while (jumlah < 0);

                totalProduk += jumlah;
            }

            double rata = (double) totalProduk / JumlahHari;
            System.out.println("Total produk " + p + " = " + totalProduk);
            System.out.printf("Rata-rata harian produk %d = %.2f%n", p, rata);

            totalSemua += totalProduk;
            p++;
        }

        System.out.println();
        System.out.println("Total seluruh produk = " + totalSemua);


    }
}
