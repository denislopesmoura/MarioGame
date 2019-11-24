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
    
    //numero de GreenAnts a ser construida
    protected final int numGreenAnt = 5;
    
    //instância uma ArrayList para armazenar o Inimigo GreenAnt
    protected ArrayList<Character> greenAnt;
    
    // Construtor da classe FlyweightFactory
    public FlyweightFactory()
    {
        //cria uma ArrayList para armazenar GreenAnts
        greenAnt = new ArrayList<Character>();
        
        for(int i = 0; i < numGreenAnt; i++)
        {   
            //Constroe uma GreenAnt e a armazena na lista greenAnt
            greenAnt.add(new GreenAnt ("GreenAnt", "testando.png"));
        }
        
        
    }
    
    public Character getGreenAnt(int i){return greenAnt.get(i);}
    
    public void act(){};
        
        
}
