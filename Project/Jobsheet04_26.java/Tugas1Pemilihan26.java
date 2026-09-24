import java.util.Scanner;
public class Tugas1Pemilihan26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        String pesan = semester == 1 ? "KRS Semester 1 ditampilkan"
                : semester == 2 ? "KRS Semester 2 ditampilkan"
                : semester == 3 ? "KRS Semester 3 ditampilkan"
                : semester == 4 ? "KRS Semester 4 ditampilkan"
                : semester == 5 ? "KRS Semester 5 ditampilkan"
                : semester == 6 ? "KRS Semester 6 ditampilkan"
                : semester == 7 ? "KRS Semester 7 ditampilkan"
                : semester == 8 ? "KRS Semester 8 ditampilkan"
                : "Semester tidak valid";

        System.out.println(pesan);
    }
    
}