import java.util.Scanner;
public class Latihan01_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1;
        int bil2;
        int bil3;
        int terbesar;

        System.out.println("Masukkan bil1= ");
        bil1 = input.nextInt();
        System.out.println("Masukkan bil2= ");
        bil2 = input.nextInt();
        System.out.println("Masukkan bil3= ");
        bil3 = input.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                terbesar = bil1;
            } else {
                terbesar = bil3;
            }
        } else {
            if (bil2 > bil3) {
                terbesar = bil2;
            } else {
                terbesar = bil3;
            }
        }

        System.out.println("Bilangan terbesar adalah: " + terbesar);
        input.close();

    }
}
