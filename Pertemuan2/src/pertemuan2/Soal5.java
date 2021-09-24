/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Soal5 {
     public static void main(String[] args) {
        String A;
        String B;
        Scanner sc;
        
        sc = new Scanner(System.in);
        System.out.print("A = ");
        A = sc.next();
        System.out.print("B = ");
        B = sc.next();
        sc.close();
        
        System.out.print("\nJumlah Huruf = ");
        System.out.println( + A.length() + B.length() );
        System.out.print("A > B = ");
        System.out.println( (A.compareTo(B) > 0) ? "Yes" : "No");
        System.out.println(
            A.substring(0, 1).toUpperCase() + A.substring(1) + " " +
            B.substring(0, 1).toUpperCase() + B.substring(1)
        );
    }
}
