/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.subhan.tugaspertemuan2_03;

/**
 *
 * @author user
 */
public class TugasPertemuan2_03 {

    public static void main(String[] args) {
        // Karakter '1' dan '2'
        char karakter1 = '1';
        char karakter2 = '2';

        // Mengambil nilai ASCII dari karakter
        int ascii1 = (int) karakter1;
        int ascii2 = (int) karakter2;

        // Menjumlahkan nilai ASCII
        int totalAscii = ascii1 + ascii2;

        // Menampilkan hasil
        System.out.println("Kode ASCII dari '1': " + ascii1);
        System.out.println("Kode ASCII dari '2': " + ascii2);
        System.out.println("Jumlah Kode ASCII: " + totalAscii);
    }
}
