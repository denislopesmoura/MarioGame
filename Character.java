import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inimigos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Character extends Actor
{
    //Dados sobre o inimigo
    String name;
    String urlPhoto;
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void moveCharacter(){
        setLocation(getX()+1, getY());
    
        if(getX()>= 590){
             ((Home) getWorld()).removeObject(this);
           }
    }
    
    public void setImage(){
        setImage(urlPhoto);
    }
}
