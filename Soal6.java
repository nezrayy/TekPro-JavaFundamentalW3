/*
 * Nama     : Rayhan Fanez Fathiadi
 * NIM      : 221524027
 * Kelas    : 1A-TI4
 * Soal     : 6 / Big Number
 */

package W3;

import java.math.BigInteger; //Statement import untuk memasukkan kelas BigInteger dari paket java.math.

import java.util.Scanner; //Statement import untuk memasukkan kelas Scanner dari paket java.util.

public class Soal6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // Deklarasi dan inisialisasi objek Scanner untuk membaca masukan dari
                                             // standar input (keyboard), disimpan dalam variabel "kb".
        BigInteger a = kb.nextBigInteger(); // Deklarasi variabel 'a' bertipe BigInteger dan diisi oleh hasil input
                                            // keyboard menggunakan objek "kb".
        BigInteger b = kb.nextBigInteger(); // Deklarasi variabel 'b' bertipe BigInteger dan diisi oleh hasil input
                                            // keyboard menggunakan objek "kb".

        kb.close(); // Statement untuk menutup sistem input yang digunakan oleh objek Scanner "kb".

        System.out.println(a.add(b)); // Menampilkan hasil dari 'a' ditambah oleh 'b'.
        System.out.println(a.multiply(b)); // Menampilkan hasil dari 'a' dikali oleh 'b'.
    }
}
