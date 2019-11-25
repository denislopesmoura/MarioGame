import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soundtrack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soundtrack extends Object
{
    // GreenfootSound song = new GreenfootSound("Overworld Theme - Super Mario World.mp3");
    boolean canPlay = true;
    
    public void act() 
    {
        if(canPlay){
            
            // song.playLoop();
            // canPlay = false;
        }    
    
        if(Greenfoot.mouseClicked(ContinueBtn.class)){
        // song.pause();
        }
    }    
}
