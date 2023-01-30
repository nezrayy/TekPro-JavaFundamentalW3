/*
 * Nama     : Rayhan Fanez Fathiadi
 * NIM      : 221524027
 * Kelas    : 1A-TI4
 * Soal     : 2 / Input & Output (2)
 */

package W3;

import java.util.Scanner; //Statement import untuk memasukkan kelas Scanner dari paket java.util.

public class Soal2 {

    public static void main(String[] args) {
        String[] awal = new String[3]; // Deklarasi variabel "awal" bertipe array of string berjumlah 3 elemen.
        String[] kata = new String[3]; // Deklarasi variabel "kata" bertipe array of string berjumlah 3 elemen.
        String[] integer = new String[3]; // Deklarasi variabel "integer" bertipe array of string berjumlah 3 elemen.
        String temp; //Deklarasi variabel "temp" bertipe string.

        Scanner kb = new Scanner(System.in); // Deklarasi dan inisialisasi objek Scanner untuk membaca masukan dari
                                             // standar input (keyboard), disimpan dalam variabel "kb".
        // Repetisi for sebanyak 3 kali
        for (int i = 0; i < 3; i++) {
            awal[i] = kb.nextLine(); // Statement untuk membaca baris teks yang diterima dari input keyboard
                                     // menggunakan objek Scanner "kb", dan menyimpannya dalam variabel
                                     // "s".
            /*
             * Cek kondisi apabila jumlah character dalam string index ke-i lebih dari 10,
             * maka input akan diulang kembali.
             */
            if (awal[i].length() > 10) {
                System.out.println("Input invalid!");
                i--;
            }
        }
        kb.close(); // Statement untuk menutup sistem input yang digunakan oleh objek Scanner "kb".
        // Repetisi for sebanyak 3 kali
        for (int i = 0; i < 3; i++) {
            temp = awal[i]; // Mengisi "temp" dengan nilai array of string "awal" index ke-i.
            String S[] = temp.split(" "); // Statement untuk memecahkan string dalam variabel
                                          // "temp" menjadi bagian-bagian kecil dengan pemisah
                                          // berupa spasi (" ") dan menyimpan hasilnya dalam
                                          // array of string "S".
            kata[i] = S[0]; // Mengisi array of string "kata" index ke-i dengan nilai array of string "S"
                            // index ke-0.
            integer[i] = S[1]; // Mengisi array of string "integer" index ke-i dengan nilai array of string "S"
                               // index ke-1.
        }
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.print(kata[i]); // Menampilkan nilai pada array of string "kata" index ke-i.
            for (int j = 0; j < 15 - kata[i].length(); j++) {
                System.out.print(" "); // Membuat spasi sesuai dengan perhitungan
            }
            /*
             * Cek kondisi apabila nilai dari array of string "integer" index ke-i kurang
             * dari 3 karakter/digit atau tidak
             */
            if (integer[i].length() < 3) {
                System.out.println("0" + integer[i]); // Menampilkan "0" disambung oleh nilai pada array of string
                                                      // "integer" index ke-i.
            } else {
                System.out.println(integer[i]); //// Menampilkan nilai pada array of string "integer" index ke-i.
            }
        }
        System.out.println("================================");
    }
}
