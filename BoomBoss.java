import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoomBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoomBoss extends Character
{
    /**
     * Act - do whatever the BoomBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
    public void moveCharacter(){
    
        setLocation(getX()+4, getY());
        
        if(getX()>= 590){
            ((Home) getWorld()).removeObject(this);
            
            //isso faz os baloes das respostas sumir no final do cenario
        }
    }
}
