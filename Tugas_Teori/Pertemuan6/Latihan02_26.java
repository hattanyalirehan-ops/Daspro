import java.util.Scanner;
public class Latihan02_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = input.nextLine();
        System.out.println("Masukkan jumlahBuku: ");
        int jumlahBuku = input.nextInt();
        System.out.println("Masukkan harga satuan buku (Rp): ");
        double hargaSatuan = input.nextDouble();
        double totalHarga = jumlahBuku * hargaSatuan;
        double diskonPersen = 0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskonPersen = 10;
            if (jumlahBuku > 2) {
                diskonPersen += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskonPersen = 7;
            if (jumlahBuku > 3) {
                diskonPersen += 2;
            } else {
                diskonPersen += 1;
            }
        } else {
            if (jumlahBuku > 3) {
                diskonPersen = 5;
            } else {
                diskonPersen = 0;
            }
        }

        double jumlahDiskon = totalHarga * (diskonPersen / 100);
        double totalBayar = totalHarga - jumlahDiskon;

        System.out.println("\n--- Rincian Diskon & Pembayaran ---");
        System.out.println("Jenis Buku         : " + jenisBuku);
        System.out.println("Jumlah Buku        : " + jumlahBuku);
        System.out.println("Persentase Diskon  : " + diskonPersen + "%");
        System.out.println("Jumlah Diskon      : Rp " + jumlahDiskon);
        System.out.println("Total yang dibayar : Rp " + totalBayar);

        input.close();
     }
     }
