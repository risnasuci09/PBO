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
public class GenericsType<T> {
    private T t;
    
    public T get(){
        return this.t;
    }
    
    public void set(T t1){
        this.t=t1;
    }
    
    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("Java"); //valid
        GenericsType type1 = new GenericsType(); //raw type
        type1.set("Java"); //valid
        type1.set(10); //valid and autoboxing support
    }
}
