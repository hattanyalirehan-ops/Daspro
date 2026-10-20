import java.util.Scanner;
public class Tugas01_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaLaptop, uangMuka,hargaDitambahBunga, cicilanPerBulan;
        int bulan;

        System.out.print("Masukan harga laptop: ");
        hargaLaptop = sc.nextDouble();

        System.out.print("Masukan uang muka: ");
        uangMuka = sc.nextDouble();

        System.out.print("Masukan jumlah bulan: ");
        bulan = sc.nextInt();

        double bunga = (hargaLaptop - uangMuka) * 0.02;
        cicilanPerBulan = (hargaLaptop - uangMuka) / bulan;
        hargaDitambahBunga = cicilanPerBulan + bunga;

        System.out.println("Harga bayar per bulan adalah : "+ hargaDitambahBunga);

        sc.close();
    }
}