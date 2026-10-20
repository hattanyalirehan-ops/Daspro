import java.util.Scanner;

public class Tugas02_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan jam kerja (negatif untuk berhenti): ");
            double jamKerja = input.nextDouble();

            if (jamKerja < 0) {
                System.out.println("Program berhenti.");
                break;
            }

            System.out.print("Masukkan gaji harian: ");
            double gajiHarian = input.nextDouble();

            double bonus = 0;
            if (jamKerja > 8) {
                bonus = 0.20 * gajiHarian;
            }

            System.out.println("Bonus pegawai: Rp" + bonus);
            System.out.println();
        }

        input.close();
    }
}