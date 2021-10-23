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

public class Dosen {
    String Nama;
    Matakuliah MK[];                                         //Mendeklarasikan variabel MK bertipe Matakuliah dengan array; menunjukan bahwa q dosen dapat mengampu lebih dari 1 MK
    int jml;

    public Dosen(String Nama) {
        this.Nama = Nama;
        MK = new Matakuliah[2];                                //Membuat objek Matakuliah sebanyak 2. //MK dari class Matakuliah dijadikan Variabel lokal pada class Dosen
        jml = 0;
    }
    
    //Method untuk menambahkan Matakuliah bagi dosen
    public void tambahMK(Matakuliah mk) {                       //Dependensi yaitu parameter dari class Matakuliah
        MK[jml] = mk;
        jml++;
    }
    
    public void printInfo() {
        System.out.println(this.Nama);
        System.out.println("Mengampu Matakuliah : ");
        for(int i=0; i<jml; i++) {                              //Membuat Array dengan perulangan for. 
            MK[i].printMK();                                    //Method kelas Matakuliah dipanggil di class Dosen
        }
    }
}
