import java.util.Scanner;
public class Latihan03_26{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Merk (Converse / Sketcher / Nike): ");
        String merk = scanner.nextLine();

        System.out.print("Masukkan Kategori (Slip On / High Top / Woman / Man / Kids / Adult): ");
        String kategori = scanner.nextLine();

        System.out.print("Masukkan Ukuran (angka): ");
        int ukuran = scanner.nextInt();

        int harga = 0;
        boolean dataDitemukan = true;

        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    } else {
                        dataDitemukan = false;
                    }
                } else {
                    dataDitemukan = false;
                }
            } else if (kategori.equalsIgnoreCase("High Top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    } else {
                        dataDitemukan = false;
                    }
                } else {
                    dataDitemukan = false;
                }
            } else {
                dataDitemukan = false;
            }
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                    } else {
                        dataDitemukan = false;
                    }
                } else {
                    dataDitemukan = false;
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    } else {
                        dataDitemukan = false;
                    }
                } else {
                    dataDitemukan = false;
                }
            } else {
                dataDitemukan = false;
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    } else {
                        dataDitemukan = false;
                    }
                } else {
                    dataDitemukan = false;
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    } else {
                        dataDitemukan = false;
                    }
                } else {
                    dataDitemukan = false;
                }
            } else {
                dataDitemukan = false;
            }
        } else {
            dataDitemukan = false;
        }
        System.out.println("----------------------------------------");
        if (dataDitemukan) {
            System.out.println("Merk     : " + merk);
            System.out.println("Kategori : " + kategori);
            System.out.println("Ukuran   : " + ukuran);
            System.out.println("Harga    : Rp " + harga);
        } else {
            System.out.println("Mohon maaf, data sepatu dengan spesifikasi tersebut tidak ditemukan.");
        }
        System.out.println("----------------------------------------");

        scanner.close();
    }
}