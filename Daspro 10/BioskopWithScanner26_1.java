import java.util.Scanner;

public class BioskopWithScanner26_1 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);

        int pilihan; 
        int kolom, baris;
        String nama, next;

        String[][] penonton = new String[4][2];

        boolean menu = true;
        while (menu) {
            System.out.println("BioskopWithScanner");
            System.out.println("Pilihan Menu");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.println("Masukkan Pilihan");
            pilihan = sc26.nextInt();

            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan Nama  : ");
                        nama = sc26.next();
                        System.out.print("Masukkan Baris : ");
                        baris = sc26.nextInt();
                        System.out.print("Masukkan Kolom : ");
                        kolom = sc26.nextInt();
                        sc26.nextLine();

                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Silakan pilih kursi lain.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi telah ditempati. Silakan pilih kursi lain.");

                            System.out.print("Masukkan Baris Lain : ");
                            baris = sc26.nextInt();
                            System.out.print("Masukkan Kolom Lain : ");
                            kolom = sc26.nextInt();
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi telah ditempati. Masukkan kembali nomor baris dan kolom.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Penempatan kursi berhasil");
                        }

                        System.out.print("Input Penonton Lainnya? y/n : ");
                        next = sc26.nextLine();

                        if (next.equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                penonton[i][j] = "***";
                            }
                        }
                        System.out.println("Penonton pada baris ke-" + (i + 1) + " : " + String.join(",", penonton[i]));
                    }
                    break;
                case 3:
                    System.out.println("              TERIMA KASIH");
                    menu = false;
                    break;
                default:
                    System.out.println("Masukkan Pilihan Yang Benar");
                    break;
            }
        }
    }
}
