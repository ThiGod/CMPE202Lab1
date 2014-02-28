import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    boolean isReal = true;
    boolean isLocked = false;
    int value;
    
    public boolean isReal(){
        return isReal;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setisLocked( boolean lock ){
        isLocked = lock;
    }
    
    public void act() 
    {
        int mouseX, mouseY ;
        if ( !isLocked ){                
            if(Greenfoot.mouseDragged(this)) {          
                MouseInfo mouse = Greenfoot.getMouseInfo();  
                mouseX=mouse.getX();  
                mouseY=mouse.getY();  
                setLocation(mouseX, mouseY);
            }
        }        
    }    
}
