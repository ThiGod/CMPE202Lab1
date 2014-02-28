import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Picker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Picker extends Alien
{
    /**
     * Act - do whatever the Picker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    boolean eject = false;
    static int greenGumball = 5;
    static int redGumball = 5;
    static int blueGumball = 5;
    
    abstract void pickBall();
  
    void ejectGumball(){
        eject = true;
    }
    
    void showGumBall ( int type ){        
        Gumball g = null ;     
        switch( type ){
            case 0:
                g = new GreenGumball();
                greenGumball--;
                break;
            case 1:
                g = new RedGumball();
                redGumball--;
                break;
            case 2:
                g = new BlueGumball();
                blueGumball--;
                break;
        }
        getWorld().addObject( g, 60, 550);
    }
    
    public void act() 
    {
        // Add your action code here.
        if (eject){
            Greenfoot.delay(100);   
            pickBall();
        }
        eject = false;
    }
}
