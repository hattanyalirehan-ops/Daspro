import java.util.Scanner;
public class operatorLogikaWifi26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean Mahasiswa;
        boolean Dosen;
        boolean akunDiBlokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): "); Mahasiswa = sc.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false): "); Dosen = sc.nextBoolean();
        System.out.print("Apakah akun sedang diblokir? (true/false): "); akunDiBlokir = sc.nextBoolean();
        if ((Mahasiswa || Dosen) && !akunDiBlokir) { System.out.println("Akses WiFi diberikan");
    } else { System.out.println("Akses WiFi ditolak");

}
    }
}