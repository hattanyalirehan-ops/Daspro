import java.util.Scanner;

public class kafedowhile_26 {
    public static void main(String[] args) {
         int hargaKopi = 12000;
         int hargaTeh = 7000;
         int hargaRoti = 20000;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
                String namaPelanggan = sc.nextLine();
                if (namaPelanggan.equalsIgnoreCase("batal")) {
                    System.out.println("Transaksi dibatalkan.");
                    break;
                }

                System.out.print("Jumlah kopi: ");
                int kopi = sc.nextInt();
                System.out.print("Jumlah teh: ");
                int teh = sc.nextInt();
                System.out.print("Jumlah roti: ");
                int roti = sc.nextInt();

                int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
                System.out.println("Total harga untuk " + namaPelanggan + ": Rp " + totalHarga);
                sc.nextLine();
            } while (true);

            System.out.println("Semua transaksi selesai.");
        }
    }
}