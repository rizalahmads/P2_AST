
package P2_AST;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        int jumlahBarang;

        // Input jumlah barang
        System.out.print("Masukkan jumlah barang: ");
        jumlahBarang = sc.nextInt();

        // Deklarasi array
        ListBarang[] barang = new ListBarang[jumlahBarang];

        // Input nama, harga, dan jumlah barang
        for (int i = 0; i < barang.length; i++) {
            System.out.println("Barang ke-" + (i + 1));
            System.out.print("Nama barang: ");
            String namaBarang = sc.next();
            System.out.print("Harga barang: ");
            int hargaBarang = sc.nextInt();
            System.out.print("Jumlah barang: ");
            int jumlahBarang2 = sc.nextInt();
            barang[i] = new ListBarang(namaBarang, hargaBarang, jumlahBarang2);
        }

        // Sorting
        System.out.println("====================================");
        System.out.println("Nama barang\tHarga barang\tJumlah barang");
        for (int i = 0; i < barang.length; i++) {
            System.out.println(barang[i].getNamaBarang() + "\t\t" + barang[i].getHargaBarang() + "\t\t" + barang[i].getJumlahBarang());
        }
        System.out.println("====================================");
    }

}

