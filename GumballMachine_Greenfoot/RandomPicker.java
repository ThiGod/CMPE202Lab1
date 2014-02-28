import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Message m;
    void pickBall(){
            m = new Message("Ramdon choose a gumball!");
            getWorld().addObject(m , getX(), getY() );          
            int type = Greenfoot.getRandomNumber(3);
            showGumBall(type);
    }   
}
