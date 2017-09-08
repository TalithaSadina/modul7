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
public class truck {
    public int cadence;
    public int gear;
    public int speed;
    
    public truck (int startcadence,int startspeed,int startgear)
    {
    gear = startgear;
    cadence = startcadence;
    speed = startspeed;
    }
    public void setcadence (int newValue)
    {
    cadence = newValue;
    }
    public void setgear (int newValue)
    {
    gear = newValue;
    }
    public void applybrake (int decrement)
    {
    speed = decrement;
    }
    public void speedup (int newValue)
    {
    speed = newValue;
    }
    
    
}
