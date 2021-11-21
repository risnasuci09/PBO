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

public class ManRay extends SuperHero {
    public ManRay(int powerLevel, String name) {
        super(powerLevel, name); 
        super.addPower(new LaserEye()); //tambah power Flying 
        super.addPower(new Strength()); //tambah power Strength
    }

    @Override
    public void identity(){
        System.out.print("It's " + this.getName() 
                + ", the ManRay! It has the power level of " 
                + this.getPowerLevel());
    }
}
