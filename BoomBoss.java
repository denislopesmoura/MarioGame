import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoomBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoomBoss extends Character
{
    
    public BoomBoss(String name, String url){
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
    
        setLocation(getX()+4, getY());
        
        if(getX()>= 590){
            ((Home) getWorld()).removeObject(this);
            
            //isso faz os baloes das respostas sumir no final do cenario
        }
    }
}
