package W3;

public class MDArrayJava {
        public static void main(String[] args) {
                // One Dimensional Arrays
                int[] fisrtArray = { 2, 5, 3 }; // Deklarasi dan inisialisasi array 1 dimensi bertipe integer
                int[] secondArray = { 9, 5, 3 }; // Deklarasi dan inisialisasi array 1 dimensi bertipe integer
                int[] thirdArray = { 2, 4, 9 }; // Deklarasi dan inisialisasi array 1 dimensi bertipe integer
                int[] fourthArray = { 10, 11, 12 }; // Deklarasi dan inisialisasi array 1 dimensi bertipe integer
                int[] fifthArray = { 13, 14, 15 }; // Deklarasi dan inisialisasi array 1 dimensi bertipe integer
                int[] sixthArray = { 16, 17, 18 };// Deklarasi dan inisialisasi array 1 dimensi bertipe integer
                int[] seventhArray = { 19, 20, 21 };// Deklarasi dan inisialisasi array 1 dimensi bertipe integer
                int[] eighthArray = { 22, 23, 24 };// Deklarasi dan inisialisasi array 1 dimensi bertipe integer
                int[] ninthArray = { 25, 26, 27 };// Deklarasi dan inisialisasi array 1 dimensi bertipe integer
                // Two Dimensional Arrays
                int[][] twoDimensionalArray1 = { fisrtArray, secondArray,
                                thirdArray }; // Deklarasi dan inisialisasi array 2 dimensi bertipe integer
                int[][] twoDimensionalArray2 = { fourthArray, fifthArray,
                                sixthArray }; // Deklarasi dan inisialisasi array 2 dimensi bertipe integer
                int[][] twoDimensionalArray3 = { seventhArray, eighthArray,
                                ninthArray }; // Deklarasi dan inisialisasi array 2 dimensi bertipe integer
                // Three Dimensional Array
                int[][][] threeDimensionalArray = { twoDimensionalArray1,
                                twoDimensionalArray2, twoDimensionalArray3 }; // Deklarasi dan inisialisasi array 3
                                                                              // dimensi bertipe integer

                /* Untuk menampilkan isi dari array 3 dimensi, digunakan repetisi nested for */
                for (int i = 0; i < 3; i++) {
                        System.out.print("{");
                        for (int j = 0; j < 3; j++) {
                                for (int k = 0; k < 3; k++) {
                                        if (k == 0) {
                                                System.out.print("{");
                                        }
                                        if (k == 2) {
                                                System.out.print(threeDimensionalArray[i][j][k] + "} ");
                                        } else {
                                                System.out.print(threeDimensionalArray[i][j][k] + " ");
                                        }
                                        if (j == 2 && k == 2) {
                                                System.out.println("}");
                                        }

                                }
                        }
                }
        }

}
