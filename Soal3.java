/*
 * Nama     : Rayhan Fanez Fathiadi
 * NIM      : 221524027
 * Kelas    : 1A-TI4
 * Soal     : 3 / Berhitung
 */

package W3;

import java.util.Scanner; //Statement import untuk memasukkan kelas Scanner dari paket java.util.

public class Soal3 {
    public static void main(String[] args) {
        String s; //Deklarasi variabel 's' bertipe string.
        Scanner kb = new Scanner(System.in); // Deklarasi dan inisialisasi objek Scanner untuk membaca masukan dari
                                             // standar input (keyboard), disimpan dalam variabel "kb".

        s = kb.nextLine(); // Statement untuk membaca baris teks yang diterima dari input keyboard
                           // menggunakan objek Scanner "kb", dan menyimpannya dalam variabel
                           // 's'.

        kb.close();// Statement untuk menutup sistem input yang digunakan oleh objek Scanner "kb".

        String S[] = s.split(" "); // Statement untuk memecahkan string dalam variabel
                                   // "plat" menjadi bagian-bagian kecil dengan pemisah
                                   // berupa spasi (" ") dan menyimpan hasilnya dalam
                                   // array of string 'S';.

        int a = Integer.parseInt(S[0]); // Deklarasi dan insialisasi variabel 'a' bertipe integer yang diisi oleh hasil
                                        // parse dari array of string 'S' index ke-0.
        int b = Integer.parseInt(S[2]); // Deklarasi dan insialisasi variabel 'b' bertipe integer yang diisi oleh hasil
                                        // parse dari array of string 'S' index ke-2.

        /*
         * Cek kondisi jika S[1] bernilai sama dengan "+" atau "-" atau "*" atau "/"
         * atau "%"
         */
        if (S[1].equals("+")) {
            System.out.println(a + b); // Menampilkan hasil dari a + b.
        } else if (S[1].equals("-")) {
            System.out.println(a - b); // Menampilkan hasil dari a - b.
        } else if (S[1].equals("*")) {
            System.out.println(a * b); // Menampilkan hasil dari a * b.
        } else if (S[1].equals("/")) {
            System.out.println(a / b); // Menampilkan hasil dari a / b.
        } else if (S[1].equals("%")) {
            System.out.println(a % b); // Menampilkan hasil dari a % b.
        }
    }

}
