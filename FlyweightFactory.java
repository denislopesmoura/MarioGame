import greenfoot.*;
import java.util.ArrayList;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlyweightTool here.
 * 
 * @author Denis Lopes
 * @version 24/11/2019
 */
public class FlyweightFactory extends Actor
{
    
    //numero de inimigos a serem construidos
    protected final int numGreenAnt     = 15;
    protected final int numRedAnt       = 15;
    protected final int numGhostBoss    = 5;
    protected final int numBoomBoss     = 5;
    
    //ArrayList para armazenar cada tipo de inimigo
    protected ArrayList<Character> greenAnt;
    protected ArrayList<Character> redAnt;
    protected ArrayList<Character> ghostBoss;
    protected ArrayList<Character> boomBoss;
    
    protected Mario mario;
    protected Score score;
    protected Shot shot;
    protected StartBtn startBtn;
     
    // Construtor da classe FlyweightFactory
    public FlyweightFactory()
    {
        //cria uma ArrayList para armazenar Inimigos
        greenAnt = new ArrayList<Character>();
        redAnt = new ArrayList<Character>();
        ghostBoss = new ArrayList<Character>();
        boomBoss = new ArrayList<Character>();
        
        mario = new Mario("marioP1.png");
        score = new Score();
        shot = new Shot();
        startBtn = new StartBtn();
        
        for(int i = 0; i < numGreenAnt; i++)
            greenAnt.add(new GreenAnt ("GreenAnt", "testando.png"));
        
        for(int i = 0; i < numRedAnt; i++)
            redAnt.add(new RedAnt ("RedAnt", "vermelho1.png"));
        
        for(int i = 0; i < numGhostBoss; i++)
            ghostBoss.add(new GhostBoss ("GhostBoss", "ghost2.png"));
        
        for(int i = 0; i < numBoomBoss; i++)
            boomBoss.add(new BoomBoss ("BoomBoss", "boomboss.png"));
        
        
    }
    
    public Character getGreenAnt(int i){return greenAnt.get(i);}
    
    public Character getRedAnt(int i){return redAnt.get(i);}
    
    public Character getGhostBoss(int i){return ghostBoss.get(i);}
    
    public Character getBoomBoss(int i){return boomBoss.get(i);}
    
    public Character getMario(){return mario;}
    
    public Score getScore(){return score;}
    
    public Shot getShot(){return shot;}
    
    public StartBtn getStartBtn(){return startBtn;}
    
    public void act(){};
        
        
}
