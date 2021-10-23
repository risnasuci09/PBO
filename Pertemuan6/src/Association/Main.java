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

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Ahmad");
        Matakuliah mk1 = new Matakuliah("PBO");
        Matakuliah mk2 = new Matakuliah("PRPL");
        
        dosen.tambahMK(mk1);                                //Association terbentuk melalui Method Matakuliah
        dosen.tambahMK(mk2);
        dosen.printInfo();
    }
}
