import java.util.Scanner;
public class StudiKasus01_26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup,UangBayar;
        int totalHarga,Diskon,totalBayar;
        int kembalian,Kurang;

        System.out.print("Masukkan jumlah Cup yang dibeli: ");
        jumlahCup = scanner.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayar: ");
        UangBayar = scanner.nextInt();
        
        totalHarga = hargaPerCup * jumlahCup;
        Diskon = 0;
        if (totalHarga >= 100000){
            Diskon = totalHarga * 10/100;
        }
        totalBayar = totalHarga - Diskon;

        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + Diskon);
        System.out.println("Total Bayar: " + totalBayar);
     
        if (UangBayar >= totalBayar){
            kembalian = UangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            Kurang = totalBayar - UangBayar;
            System.out.println("Uang tidak cukup,kurang Rp " + Kurang);
        }
        scanner.close();
    }
}