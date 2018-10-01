/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan21.rataratanilai;

import java.util.Scanner;

/**
*Nama              :Fachrian Harits Pratama
 *NIM               :10117061  
 *kelas             :if2
 *Deskripsi program :menampilkan rata-rata dari jumalah mahasiswa 
 */
public class PBO210117061Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        double nilai;
        double jumlah = 0;
        double rataRata;

        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan banyaknya mahasiswa\t: ");
        n = masuk.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nilai mahasiswa ke-" + i + " : ");
            nilai = masuk.nextInt();
            jumlah = jumlah + nilai;

        }
        rataRata = jumlah / n;
        System.out.println("");
        System.out.println("Maka Rata - rata nya adalah : " + rataRata);
        System.out.println("Developed by - ");

    }

}
