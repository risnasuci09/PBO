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

abstract class SuperHero implements Comparable<SuperHero> {
    private int powerLevel;
    private String name;
    private List<Power> powerList;

    public SuperHero(int powerLevel, String name) {
        this.powerLevel = powerLevel;
        this.name = name;
        this.powerList = new ArrayList<Power>();
    }

    public int getPowerLevel(){
        return this.powerLevel;
    }

    public String getName(){
        return this.name;
    }

    public void addPower(Power pwr){
        this.powerList.add(pwr);
    }

    abstract void identity();

    public void showPowers() {
        System.out.println(".....HEED ME.....");
        System.out.println("FOR MY NAME IS " + getName().toUpperCase());
        System.out.println("TIME TO SHOW YOU MY POWERS");
        for(Power power : powerList){
            power.doPower();
        }
    }

    @Override
    public int compareTo(SuperHero sh) {
        if(this.powerLevel > sh.getPowerLevel()){
            return 1;
        } else if (this.powerLevel < sh.getPowerLevel()){
            return -1;
        } else{
            return 0;
        }
    }
}
