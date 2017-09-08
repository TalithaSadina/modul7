/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author ASUS
 */
public class gajah extends hewan {
    public static void testClassMethod()
    {
        System.out.println("The class method in Hewan...  ");
    }
    //meng-override method pada class Animal
    public void testInstanceMethod()
    {
        System.out.println("The instance method in Gajah... ");
    }
    public static void main (String [] args)
    {
        gajah mygajah = new gajah();
        hewan myhewan = mygajah;
        hewan.testClassMethod();
        myhewan.testInstanceMethod();
    
    }
    
}
