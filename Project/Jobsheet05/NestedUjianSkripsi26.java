import java.util.Scanner;

public class NestedUjianSkripsi26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Apakah Mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebaskompen = sc.nextLine().trim();
        System.out.println("Masukkan jumlah LOG Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukkan jumlah LOG Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        String pesan;

        if (bebaskompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }

        System.out.println(pesan);
    }
}
