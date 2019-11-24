import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenAnt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenAnt extends Character
{
    
    
    public GreenAnt(String name, String url){
        
        this.name = name;
        this.urlPhoto = url;
    
    }
    
    
    public void act() 
    {
        // Add your action code here.
        moveCharacter();
        setImage();
    }    
}
