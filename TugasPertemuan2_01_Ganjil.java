/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.subhan.tugaspertemuan2;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class TugasPertemuan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Menginput 3 buah bilangan bulat
        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        int bil2 = input.nextInt();
        System.out.print("Masukkan bilangan ketiga : ");
        int bil3 = input.nextInt();
        
        //Logika untuk melakukan operasi bilangan
        System.out.println("Hasil penjumlahan : "+(bil1+bil2+bil3));
        System.out.println("Hasil pengurangan : "+(bil1-bil2-bil3));
        System.out.println("Hasil perkalian :  "+(bil1*bil2*bil3));
        System.out.println("Hasil pembagian : "+((float)bil1/bil2/bil3));
    }
}
