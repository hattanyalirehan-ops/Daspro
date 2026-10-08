import java.util.Scanner;

public class StudiKasus02_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        String jenis = input.nextLine().trim().toLowerCase();

        System.out.print("Jumlah dokumen yang diupload (0-4): ");
        int jumlahDok = input.nextInt();

        System.out.println("\n=== STATUS DANA PENGHARGAAN ===");
        System.out.println("Nama mahasiswa : " + nama);
        System.out.println("Jenis kegiatan : " + (jenis.equals("lainnya") ? "Lainnya" : jenis.toUpperCase()));

        if (jenis.equals("belmawa") || jenis.equals("bakorma") || jenis.equals("mandiri")) {
            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara): ");
            int peringkat = input.nextInt();
            System.out.println("Peringkat juara: " + peringkat);

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDok == 4) {
                    System.out.println("Status : DANA DIBERIKAN");
                    System.out.println("Alasan : Juara " + peringkat + " dan dokumen lengkap (4/4)");
                } else {
                    System.out.println("Status : DANA TIDAK DIBERIKAN");
                    System.out.println("Alasan : Dokumen tidak lengkap");
                    System.out.println("Dokumen yang masih kurang: " + (4 - jumlahDok));
                }
            } else {
                System.out.println("Status : DANA TIDAK DIBERIKAN");
                System.out.println("Alasan : Bukan Juara 1, 2, atau 3 (Juara Harapan/peserta)");
            }

        } 
    }
}