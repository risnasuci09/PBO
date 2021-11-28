/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

import java.util.*;

public class TextFieldInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Masukkan angka: ");
        //int input = scan.nextInt();
        //System.out.println(input + " adalah Integer.");
        
        try {
            System.out.print("Masukkan angka: ");
            int input = scan.nextInt();
            System.out.println(input + " adalah Integer.");
        }catch(Exception ex) {
            System.out.println("Yang Anda Inputkan bukan Integer!");
        }
    }
}
