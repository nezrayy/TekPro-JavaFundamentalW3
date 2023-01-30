/*
 * Nama     : Rayhan Fanez Fathiadi
 * NIM      : 221524027
 * Kelas    : 1A-TI4
 * Soal     : 5 / Buka Tutup Jalan
 */

package W3;

import java.util.Scanner; //Statement import untuk memasukkan kelas Scanner dari paket java.util.

public class Soal5 {
    public static void main(String[] args) {
        String plat; // Deklarasi variabel "plat" bertipe string.

        Scanner kb = new Scanner(System.in); // Deklarasi dan inisialisasi objek Scanner untuk membaca masukan dari
                                             // standar input (keyboard), disimpan dalam variabel "kb".

        plat = kb.nextLine(); // Statement untuk membaca baris teks yang diterima dari input keyboard
                              // menggunakan objek Scanner "kb", dan menyimpannya dalam variabel
                              // "plat".

        kb.close(); // Statement untuk menutup sistem input yang digunakan oleh objek Scanner "kb".

        String s[] = plat.split(" "); // Statement untuk memecahkan string dalam variabel
                                            // "plat" menjadi bagian-bagian kecil dengan pemisah
                                            // berupa spasi (" ") dan menyimpan hasilnya dalam
                                            // array of string "s".

        long platGabung = Long.parseLong(s[0] + s[1] + s[2] + s[3]); // Deklarasi dan inisialiasi variabel platGabung
                                                                     // bertipe long yang diisi oleh hasil parse dari
                                                                     // gabungan s[0], s[1], s[2], dan s[3]

        /*
         * Cek kondisi apakah hasil kalkulasi dari platGabung = 1
         */
        if ((platGabung - 999999) % 5 == 1)// Menyesuaikan contoh input pada soal, dimana ketika 3555 2333 4555 6660
                                           // akan mengeluarkan output "berhenti", maka syarat mod 5 = 0 diubah menjadi
                                           // mod 5 = 1.
        {
            System.out.println("berhenti"); // Menampilkan "berhenti" pada layar output.
        } else {
            System.out.println("jalan"); // Menampilkan "jalan" pada layar output.
        }
    }
}
