/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author g.irakleidis
 */
public class Mathclass {
    private int a;
    private int b;

    public Mathclass(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int getSum(){
    return a+b;}
    
    public int getProduct(){
    return a*b;}
}
