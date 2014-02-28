import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    RandomPicker rp = null ;    
    GreenPicker gp = null ;    
    Coin co = null;    
    Message m;
    final int delay = 100;    
    
    public void setRP( RandomPicker rpi ){
        rp = rpi;
    }
    
    public void setGP( GreenPicker gpi ){
        gp = gpi;
    }
    
    public void inspectCoin( Coin c ){       
        co = c;
    }

    public void act() 
    {
        // Add your action code here.
        try {
            if ( null != co ){
                 m = new Message("Check coin");
                 getWorld().addObject(m , getX(), getY());
                 Greenfoot.delay(delay);
                 getWorld().removeObject(m);                
                if ( co.isReal){
                    m = new Message("Coin is real");
                    getWorld().addObject(m , getX(), getY() );
                    Greenfoot.delay(delay);
                    getWorld().removeObject(m);
                    if ( co.getValue() == 25 ) {                    
                        m = new Message( "Thanks! Here is your gumball!");
                        getWorld().addObject( m , getX(), getY() );                    
                        if(Greenfoot.getRandomNumber(2) == 1){
                            gp.ejectGumball();
                        }else {
                            rp.ejectGumball();
                        }
                        Greenfoot.delay(100);
                    }else{                    
                        m = new Message( "Coin is less than quarter! Bye!" );
                        getWorld().addObject( m , getX(), getY() );               
                    }
                }else{
                    m = new Message( "Coin is fake! Bye!" );
                    getWorld().addObject( m , getX(), getY() );  
                }
                co = null;
            }
        } catch ( Exception e ){
            e.printStackTrace();
            m = new Message( "Something is Wrong");
            getWorld().addObject( m , getX(), getY() );
        }
    }    
}
