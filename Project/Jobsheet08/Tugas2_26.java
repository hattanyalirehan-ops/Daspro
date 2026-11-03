import java.util.Scanner;

public class Tugas2_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        while (n < 3) {
            System.out.print("n minimal 3, masukkan lagi: ");
            n = sc.nextInt();
        }

        int jumlah = 0; 
        for (int baris = 1; baris <= n; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                int hasil = baris * kolom;
                System.out.printf("%4d", hasil);
                jumlah += hasil;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + jumlah);
        sc.close();
    }
}