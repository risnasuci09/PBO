/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan13;

/**
 *
 * @author hp
 */
public class GenericsTypeOld {
    private Object t;
    
    public Object get() {
        return t;
    }
    
    public void set(Object t) {
        this.t = t;
    }
    
    public static void main(String args[]){
        GenericsTypeOld type = new GenericsTypeOld();
        type.set("Java");
        String str = (String) type.get();
        //type casting, error prone and can cause ClassCastException
    }
}
    