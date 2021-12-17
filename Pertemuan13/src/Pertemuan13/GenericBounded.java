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
public class GenericBounded<T> {
    private T t;
    
    public void add(T t){
        this.t = t;
    }
    
    public T get(){
        return t;
    }
    
    public <U extends Number> void inspect(U u){
        System.out.println("T: "+t.getClass().getName());
        System.out.println("U: "+u.getClass().getName());
    }
    
    public static void main(String[] args){
        GenericBounded<Integer> IntegerBounded = new GenericBounded<Integer>();
        IntegerBounded.add(new Integer(10));
        IntegerBounded.inspect(20);
    }
}
