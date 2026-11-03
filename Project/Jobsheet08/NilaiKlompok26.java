import java.util.Scanner;

public class NilaiKlompok26 {
    public static void main (String[] main){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Klompok : ");
        int JumlahKlompok = sc.nextInt();
        System.out.print("Masukkan Jumlah Penilaian : ");
        int JumlahPenilaian = sc.nextInt();

         if (JumlahKlompok <= 0 || JumlahPenilaian <= 0 ){
            System.out.println(" Jumlah Klompok Dan Penilaian Harus > 0 : ");
         } else {
            int nomorKlompok = 1;  
            double rataTertinggi = -1;
            int KlompokTerbaik = 0;

            while (nomorKlompok <= JumlahKlompok){
                System.out.println("Klompok" + nomorKlompok);
                double totalNilai = 0;
               
            for (int j = 1; j <= JumlahPenilaian; j++){
                int nilai;
                do {
                    System.out.print("Nilai Penilaian" + j + " : ");
                    nilai = sc.nextInt();
                    if (nilai < 0 || nilai > 100){
                        System.out.println("Nilai Harus 0 - 100, Ulangi Output!");
                    }
                } while (nilai < 0 || nilai > 100);
                 totalNilai += nilai;
              }
              
                 double rataNilai = totalNilai / JumlahPenilaian; 
                 System.out.println("Kelompok " + nomorKlompok        
                        + ":nilai rata-rata = " + rataNilai); 

             if (rataNilai > rataTertinggi) { 
                rataTertinggi = rataNilai;
                KlompokTerbaik = nomorKlompok;
             }
             nomorKlompok++;
            }
             System.out.println("=============================="); 
             System.out.println("Kelompok terbaik    : " + KlompokTerbaik);
             System.out.println("Rata-rata tertinggi : " + rataTertinggi); 

         }     

    sc.close();
    }
}