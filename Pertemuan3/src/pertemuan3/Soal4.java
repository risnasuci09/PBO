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
public class Soal4 {
    public static void main(String[] args){
        final int gajiPokok = 500000;
        final int hargaItem = 50000;
        final double bonus1=0.25, bonus2=0.35, bonusItem=0.10, denda=0.15, totalGaji;
        int jumlahItem;
        Scanner scan = new Scanner(System.in);
        
        jumlahItem = scan.nextInt();
        if(jumlahItem < 15){
            totalGaji = gajiPokok - (hargaItem * -(jumlahItem-15) * denda);
        }
        else if(jumlahItem > 40) {
            totalGaji = gajiPokok + (hargaItem * jumlahItem * bonus1);
        }
        else if(jumlahItem > 80) {
            totalGaji = gajiPokok + (hargaItem * jumlahItem * bonus2);
        }
        else {
            totalGaji = gajiPokok + (hargaItem * jumlahItem * bonusItem);
        }
        System.out.println((int)totalGaji);
    }
}
