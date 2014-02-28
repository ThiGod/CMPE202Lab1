import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    Inspector in = null ;
    Coin co = null ;
    Message m;
    boolean waitingForCrank = false;

    public void setInspector( Inspector ins ){
        in = ins;
    }
    
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        // Add your action code here.        
             if ( null != co ) {        
                 if ( !waitingForCrank ){
                     m = new Message("Click to crank");
                     getWorld().addObject(m , getX(), getY());
                     co.setisLocked(true);
                     co.setLocation( getX(), getY() );
                     waitingForCrank = true; 
                 }else if ( Greenfoot.mouseClicked( this ) ){
                     in.inspectCoin(co); 
                     co.setLocation(in.getX(), in.getY() );
                     co = null;
                     waitingForCrank = false;
                 }
             }else {
                  co = (Coin)this.getOneIntersectingObject( Coin.class );
             }
            
    }    
}
