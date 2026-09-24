import java.util.Scanner;
public class Tugas2Pemilihan26 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

            int jumlahSks;
            System.out.println("Masukkan jumlah Sks: ");
                jumlahSks = sc.nextInt();

            if(jumlahSks > 24){ 
                System.out.println("Melebihi Batas SKS");
            } else {
                System.out.println("KRS valid");
         }

         sc.close();
    }
}