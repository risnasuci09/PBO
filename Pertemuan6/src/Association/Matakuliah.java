/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Association;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

public class Matakuliah {
    String namaMK;

    public Matakuliah(String namaMK) {
        this.namaMK = namaMK;
    }
    
    public void printMK() {
        System.out.println(this.namaMK);
    }
}
