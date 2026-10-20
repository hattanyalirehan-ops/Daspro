import java.util.Scanner;

public class Tugas01_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        double total = 0;

        for (int i = 0; i < 7; i++) {
            double jam;
            do {
                System.out.print("Jam belajar hari " + hari[i] + ": ");
                jam = input.nextDouble();

                if (jam > 10 || jam < 0) {
                    System.out.println("Input tidak valid (maksimal 10 jam per hari). Silakan input ulang.");
                }
            } while (jam > 10 || jam < 0);

            total += jam;
        }

        System.out.println("Total jam belajar selama seminggu: " + total + " jam");
        input.close();
    }
}