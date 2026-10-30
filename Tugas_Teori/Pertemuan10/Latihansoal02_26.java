public class Latihansoal02_26 {
public static void main(String[] args) {
        char huruf = 'a';
        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(huruf);
                huruf++;
            }
            System.out.println();
        }
    }
}