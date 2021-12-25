/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KASUS3;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
 */

class KelasSatu {
    //initializer block
    {
        System.out.println(11); 
    }
    
    //static block
    static
    {
        System.out.println(2);
    }
    
    //constructor overloading
    public KelasSatu(int i)
    {
        System.out.println(3);
    }
    
    public KelasSatu()
    {
        System.out.println(4);
    }
}
