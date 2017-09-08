/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author ASUS
 */
public class mountaintruck extends truck {
    public int seatheight;
 
 public mountaintruck(int startheight,int startcadence,int startspeed,int startgear)
 {
     super(startcadence,startspeed,startgear);
     seatheight=startheight;
 }
 public void setheight(int newValue)
 {
     seatheight=newValue;
 }
 public static void main (String [] aku)
 {
     System.out.println("mulai berjalan");
     mountaintruck MB= new mountaintruck(0,0,0,0);
     System.out.println("gear="+MB.gear);
     System.out.println("speed="+MB.speed);
     MB.setgear(2);
     MB.speedup(2);
     System.out.println("gear="+MB.gear);
     System.out.println("speed="+MB.speed);
     MB.speedup(2);
     System.out.println("gear="+MB.gear);
     System.out.println("speed="+MB.speed);
     
 
 }
    
}
