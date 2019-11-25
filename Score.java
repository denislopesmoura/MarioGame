import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Object
{
    protected int valueScore = 0;
    protected String msg;
    
    public Score(){
       GreenfootImage scoreImage = new GreenfootImage("SCORE", 24, Color.GREEN, Color.BLACK);
       setImage(scoreImage);
    }
    public void act() 
    {
        // Add your action code here.
    }    
    
    public int setScore(int ponto){
        valueScore += ponto;
        msg = "SCORE:" + valueScore;
        
        GreenfootImage scoreImage = new GreenfootImage(msg, 24, Color.GREEN, Color.BLACK);
        setImage(scoreImage);
        
        return valueScore;
    }
}
