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
public class Soal3 {
    public static void main(String[] args) {
        int A, B, Hasil=0;
        String Operator;
        Scanner scan = new Scanner(System.in);
        
        A = scan.nextInt();
        Operator = scan.next();
        B = scan.nextInt();
        
        switch(Operator) {
            case "+": Hasil = A+B; System.out.println(Hasil); break;
            case "-": Hasil = A-B; System.out.println(Hasil); break;
            case "*": Hasil = A*B; System.out.println(Hasil); break;
            case "/": Hasil = A/B; System.out.println(Hasil); break;
            case "%": Hasil = A%B; System.out.println(Hasil); break;
        }
    }
}
