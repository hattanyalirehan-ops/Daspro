import java.util.Scanner;

public class SegiTiga26 {
    public static void main(String[] args) {

        // Membuat deklarasi Scanner di dalam fungsi main()
        Scanner sc = new Scanner(System.in);
        
        // Membuat variabel int untuk alas dan tinggi, kemudian variabel float untuk luas
        int alas, tinggi;
        float luas;
        
        // Perintah untuk menginputkan alas dan tinggi
        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextInt();
        
        // Perintah untuk menghitung luas segitiga
        luas = alas * tinggi / 2;
        
        // Menampilkan hasil output luas
        System.out.println("Luas segitiga: " + luas);
    }
}