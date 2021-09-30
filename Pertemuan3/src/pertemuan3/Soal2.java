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


import java.util.*;
public class Soal2 {
    public static void main(String[] args) {
        String[] kata = new String[3];
        int[] angka = new int[3];
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            kata[i] = input.next();
            angka[i] = input.nextInt();
            if(kata[i].length() > 10){
                System.out.println("Melebihi Maksimal 10 Karakter");
            }
            if(angka[i] < 0 && angka[i] > 999 ) {
                System.out.println("Melebihi batas angka");
            }
        }
        System.out.println("================================");
        int j = 0;
        while(j < 3){
            System.out.printf("%-15s    %03d\n", kata[j], angka[j]);
            j++;
        }
        System.out.println("================================");
    }
}
