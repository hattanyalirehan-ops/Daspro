
public class Latihansoal01B_26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int s = 1; s <= 10 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
