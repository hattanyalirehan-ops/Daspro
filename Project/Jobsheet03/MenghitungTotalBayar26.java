import java.util.Scanner;
public class MenghitungTotalBayar26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;
        
        System.out.print("Masukkan harga barang: ");
        harga = sc.nextInt();
        
        potongan = diskon * harga;
        jml_bayar = harga - potongan;
        
        System.out.println("Besar potongan adalah Rp. " + potongan);
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);
    }
}
