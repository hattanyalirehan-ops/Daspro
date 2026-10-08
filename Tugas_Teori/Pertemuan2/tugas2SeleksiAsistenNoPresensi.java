import java.util.Scanner;

public class tugas2SeleksiAsistenNoPresensi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEM SELEKSI CALON ASISTEN PRAKTIKUM ===");

        System.out.print("Apakah mahasiswa berstatus aktif? (ya/tidak): ");
        String statusAktif = scanner.next();

        System.out.print("Apakah sedang mendapatkan sanksi akademik? (ya/tidak): ");
        String sanksiAkademik = scanner.next();

        if (statusAktif.equalsIgnoreCase("ya")
                && sanksiAkademik.equalsIgnoreCase("tidak")) {
            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            int nilaiDasarPemrograman = scanner.nextInt();

            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (ya/tidak): ");
            String memilikiSertifikat = scanner.next();

            if (nilaiDasarPemrograman >= 80 || memilikiSertifikat.equalsIgnoreCase("ya")) {
                System.out.println("Anda lolos seleksi administrasi dan dipanggil untuk mengikuti wawancara.");

                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = scanner.nextInt();

                if (nilaiWawancara >= 75) {
                    System.out.println("Hasil: DITERIMA sebagai asisten praktikum.");
                } else {
                    System.out.println("Hasil: GAGAL. Alasan: nilai wawancara kurang dari 75.");
                }
            } else {
                System.out.println(
                        "Hasil: GAGAL. Alasan: nilai Dasar Pemrograman kurang dari 80 "
                                + "dan tidak memiliki sertifikat kompetensi pemrograman.");
            }
        } else {
            System.out.println("Hasil: GAGAL pada seleksi status akademik.");
            if (!statusAktif.equalsIgnoreCase("ya")) {
                System.out.println("Alasan: mahasiswa tidak berstatus aktif.");
            }
            if (sanksiAkademik.equalsIgnoreCase("ya")) {
                System.out.println("Alasan: mahasiswa sedang mendapatkan sanksi akademik.");
            }
        }

        scanner.close();
    }
}
