import java.util.Scanner;
public class SiakadWhile_26 {
    public static void main(String[] args){
        Scanner Sc = new Scanner (System.in);

        int nilai, jml;
        int i = 0;

        System.out.print("Masukkan Jumlah Mahasiswa :");
        jml = Sc .nextInt();

        while (i < jml){
            System.out.println("Masukkan Nilai Mahasiswa ke-" + ( i + 1 ) + ": ");
            nilai = Sc.nextInt();

            if ( nilai< 0 || nilai > 100){
                System.out.println("Nilai tidak valid, Masukkan lagi nilai yang valid");
                continue;
            }
             if (nilai >= 80 && nilai <= 100){
                System.out.println("Nilai Mahasiswa ke-" + ( i + 1 ) + " = A");
                System.out.println("Bagus, Pertahankan Nilainya");
             } else if (nilai > 70 && nilai <= 80){
                System.out.println("Nilai Mahasiswa ke-" + ( i + 1 ) + " = B+");
             } else if (nilai > 65 && nilai <= 73){
                System.out.println("Nilai Mahasiswa ke-" + ( i + 1 ) + " = B");
             } else if (nilai > 60 && nilai <= 65){
                System.out.println("Nilai Mahasiswa ke-" + ( i + 1 ) + " = C+");
             } else if (nilai > 50 && nilai <= 60){
                System.out.println("Nilai Mahasiswa ke-" + ( i + 1 ) + " = C");
             } else if (nilai > 39 && nilai <= 50){
                System.out.println("Nilai Mahasiswa ke-" + ( i + 1 ) + " = D");
             } else {
                System.out.println("Nilai Mahasiswa ke-" + ( i + 1 ) + " = E");
             }
             i++;
        }
    }
}
