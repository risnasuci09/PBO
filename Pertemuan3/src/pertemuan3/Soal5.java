/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args){
        String plat1, plat2, plat3, plat4, totalPlat;
        Scanner scan = new Scanner(System.in);
        
        plat1 = scan.next();
	plat2 = scan.next();
	plat3 = scan.next();
	plat4 = scan.next();
        
        //penggabungan string
        totalPlat = plat1 + plat2 + plat3 + plat4;
        
        long Plat = Long.parseLong(totalPlat); //koversi string ke long
        long Hasil = ((Plat - 999999) % 5);
        if (Hasil == 0) {
            System.out.println("jalan");
        } 
        else {
            System.out.println("berhenti");
        }
    }
}
