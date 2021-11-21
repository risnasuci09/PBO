/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

import java.util.*;

public class AvengedSimulator {
    public static void main(String[] args) {
        List<SuperHero> Heroes = new ArrayList<SuperHero>();

        Heroes.add(new FlyingDutchMan(225, "Shirai"));
        Heroes.add(new DirtyBubble(0, "Gennichiro"));
        Heroes.add(new FlyingDutchMan(36556, "Tatenari"));
        Heroes.add(new ManRay(553, "Gyoubu Masataka Oniwa"));
        Heroes.add(new ManRay(666, "Arnastria"));
        
     
        Collections.sort(Heroes);
        for(SuperHero sh : Heroes) {
            System.out.println("=============================================");
            sh.identity();
            System.out.println();
            sh.showPowers();
            System.out.println("=============================================");
        }   
    }
}
