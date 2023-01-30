/*
 * Nama     : Rayhan Fanez Fathiadi
 * NIM      : 221524027
 * Kelas    : 1A-TI4
 * Soal     : 1 / Input & Output
 */

package W3;

import java.util.Scanner; //Statement import untuk memasukkan kelas Scanner dari paket java.util.

public class Soal1 {
    public static void main(String[] args) {
        String s; //Deklarasi variabel 's' bertipe string.
        Scanner kb = new Scanner(System.in); // Deklarasi dan inisialisasi objek Scanner untuk membaca masukan dari
                                             // standar input (keyboard), disimpan dalam variabel "kb".

        s = kb.nextLine(); // Statement untuk membaca baris teks yang diterima dari input keyboard
                           // menggunakan objek Scanner "kb", dan menyimpannya dalam variabel
                           // 's'.

        kb.close(); // Statement untuk menutup sistem input yang digunakan oleh objek Scanner "kb".

        String S[] = s.split("[!',.?_ @]"); // Statement untuk memecahkan string dalam variabel
                                                  // "s" menjadi bagian-bagian kecil dengan pemisah
                                                  // berupa salah satu dari "!',.?_ @" dan menyimpan hasilnya dalam
                                                  // array of string 'S'.

        System.out.println(S.length); // Menampilkan banyaknya string pada array of string "S".
        // Repetisi for sebanyak jumlah elemen dari 'S'
        for (int i = 0; i < S.length; i++) {
            System.out.println(S[i]); // Menampilkan nilai dari array of string 'S' index ke-i.
        }
    }
}
