import java.util.Scanner;
public class Tugas02SeleksiAsisten_26{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEM SELEKSI CALON ASISTEN PRAKTIKUM ===");

        System.out.print("Apakah mahasiswa berstatus aktif? (y/n): ");
        char statusAktif = scanner.next().charAt(0);

        System.out.print("Apakah sedang mendapatkan sanksi akademik? (y/n): ");
        char sanksiAkademik = scanner.next().charAt(0);

        if ((statusAktif == 'y' || statusAktif == 'Y') && (sanksiAkademik == 'n' || sanksiAkademik == 'N')) {
            
            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            int nilaiDP = scanner.nextInt();

            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (y/n): ");
            char sertifikat = scanner.next().charAt(0);

            if (nilaiDP >= 80 || (sertifikat == 'y' || sertifikat == 'Y')) {
                System.out.println("\n-> Selamat! Anda lolos tahap administrasi dan dipanggil untuk mengikuti wawancara.");

                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = scanner.nextInt();

                if (nilaiWawancara >= 75) {
                    System.out.println("-> Hasil: Selamat, Anda DITERIMA sebagai asisten praktikum!");
                } else {
                    System.out.println("-> Hasil: GAGAL. Alasan: Nilai wawancara (" + nilaiWawancara + ") kurang dari minimum 75.");
                }

            } else {
                System.out.println("-> Hasil: GAGAL. Alasan: Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi pemrograman.");
            }

        } else {

            if (statusAktif == 'n' || statusAktif == 'N') {
                System.out.println("-> Hasil: GAGAL. Alasan: Mahasiswa tidak berstatus aktif.");
            } else {
                System.out.println("-> Hasil: GAGAL. Alasan: Mahasiswa sedang mendapatkan sanksi akademik.");
            }
        }

        scanner.close();
    }
}

