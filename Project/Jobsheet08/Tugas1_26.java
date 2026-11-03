import java.util.Scanner;

public class Tugas1_26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        while (n < 1){
            System.out.print("n minimal 1, masukkan lagi: ");
            n = sc.nextInt();
        }

        int total = 0;

        for (int baris = 1; baris <= n; baris++) {
            for(int kolom = 1; kolom <= baris; kolom++) {
                System.out.print(kolom + " ");
                total++;
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + total);
        sc.close();
    }
}