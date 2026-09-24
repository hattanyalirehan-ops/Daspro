import java.util.Scanner;
public class Tugas1_26{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan lama parkir (dalam jam): ");
        int jamParkir = scanner.nextInt();
        
        int totalTarif;
        
        if (jamParkir <= 2) {
            totalTarif = 2000;
        } else {
            totalTarif = 2000 + (jamParkir - 2) * 1000;
        }
        
        System.out.println("Total tarif parkir untuk " + jamParkir + " jam adalah: Rp " + totalTarif);
        
        scanner.close();
    }
}