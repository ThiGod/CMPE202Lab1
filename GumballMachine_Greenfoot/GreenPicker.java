import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    Message m; 
    void pickBall(){
            m = new Message("I only have green gunball!");
            getWorld().addObject(m , getX(), getY());
            showGumBall(0);
    }    
}
