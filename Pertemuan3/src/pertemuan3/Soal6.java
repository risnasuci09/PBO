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

import java.math.BigInteger;
import java.util.Scanner;
public class Soal6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.next());
        BigInteger b = new BigInteger(scan.next());

        BigInteger  tambah, kali;
        tambah = a.add(b);
        kali = a.multiply(b);
        System.out.println(tambah);
        System.out.println(kali);
    } 
}
