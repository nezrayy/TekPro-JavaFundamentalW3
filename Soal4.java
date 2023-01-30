/*
 * Nama     : Rayhan Fanez Fathiadi
 * NIM      : 221524027
 * Kelas    : 1A-TI4
 * Soal     : 4 / Gaji Agent
 */

package W3;

import java.util.Scanner; //Statement import untuk memasukkan kelas Scanner dari paket java.util.

public class Soal4 {
    public static void main(String[] args) {
        int item; // Deklarasi variabel "item" bertipe data integer.

        int gajiPokok = 500000; // Deklarasi dan inisialisasi variabel "gajiPokok" bertipe data integer yang
                                // diisi oleh nilai 500000.

        Scanner kb = new Scanner(System.in); // Deklarasi dan inisialisasi objek Scanner untuk membaca masukan dari
                                             // standar input (keyboard), disimpan dalam variabel "kb".

        item = kb.nextInt(); // Statement untuk membaca baris teks yang diterima dari input keyboard
                             // menggunakan objek Scanner "kb", dan menyimpannya dalam variabel
                             // "item".
        kb.close(); // Statement untuk menutup sistem input yang digunakan oleh objek Scanner "kb".

        /*
         * Cek kondisi apabila "item" > 80, atau "item" < 80 && "item" > 40, atau
         * "item" < 15, atau lainnya.
         */
        if (item > 80) {
            System.out.println((int) gajiPokok + ((item * 50000) * 35 / 100)); //Menampilkan hasil dari kalkulasi
        } else if (item < 80 && item >= 40) {
            System.out.println((int) gajiPokok + ((item * 50000) * 25 / 100)); //Menampilkan hasil dari kalkulasi
        } else if (item < 15) {
            System.out.println((int) gajiPokok - (((15 - item) * 50000) * 15 / 100)); //Menampilkan hasil dari kalkulasi
        } else {
            System.out.println((int) gajiPokok + ((item * 50000) * 10 / 100)); //Menampilkan hasil dari kalkulasi
        }
    }
}
