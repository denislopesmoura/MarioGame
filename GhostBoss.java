import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GhostBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GhostBoss extends Character
{
   
    public GhostBoss(String name, String url){
        this.name = name;
        this.urlPhoto = url;
    }
    
    public void act() 
    {
        // Add your action code here.
        moveCharacter();
        setImage();
    }    
    
    public void moveCharacter(){
        setLocation(getX()+1, getY());
    
        if(getX()>= 590){
             ((Home) getWorld()).removeObject(this);
           }
    }
}
