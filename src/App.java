import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah VCD yang akan diinput: ");
        int jumlahVCD = scanner.nextInt();

        // Corrected array declaration
        VCDFilm[] vcdList = new VCDFilm[jumlahVCD];

        for (int i = 0; i < jumlahVCD; i++) {
            System.out.println("\nData VCD ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.next();
            System.out.print("Aktor: ");
            String aktor = scanner.next();
            System.out.print("Sutradara: ");
            String sutradara = scanner.next();
            System.out.print("Publisher: ");
            String publisher = scanner.next();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.next();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();

            vcdList[i] = new VCDFilm(judul, aktor, sutradara, publisher, kategori, stok);
        }

        System.out.println("\nDaftar VCD yang Telah Diinput:");

        for (VCDFilm vcd : vcdList) {
            vcd.displayInfo();
            System.out.println("----------------------");
        
        scanner.close();
        }
    }
}
