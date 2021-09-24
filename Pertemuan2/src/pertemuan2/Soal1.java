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

public class Soal1 {
    public static void main(String[] args) {
        System.out.print("Banyak nilai yang di cek = ");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i=0;i<T;i++) {
            try {
                System.out.print("\nNilai = ");
                long n = sc.nextLong();
                System.out.println(n + " can be fitted in :");
                if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if(n >= Long.MIN_VALUE && n <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e) {
                System.out.println(sc.next() + " can’t be fitted anywhere.");
            }
        }
    }
}
