import java.util.Scanner;
public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner (System.in);

        String nama, next;
        int baris, kolom;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc26.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc26.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc26.nextInt();
            sc26.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc26.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
