/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.subhan.tugaspertemuan2_02;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class TugasPertemuan2_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Membuat inputan dari user
        System.out.print("Masukkan jumlah uang : ");
        int uang = input.nextInt();
        System.out.print("Apakah hujan? (true/false) : ");
        boolean hujan = input.nextBoolean();
        
        //Logika untuk menentukan keputusan akhir
        if(uang > 5000 && !hujan){
            System.out.println("Sekarang saya akan membeli gorengan");
        }else{
            System.out.println("Saya tidak akan membeli gorengan");
        }
        
    }
}
