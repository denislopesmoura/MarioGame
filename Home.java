import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{
    int count;
    
    FlyweightFactory factory = new FlyweightFactory();
    
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        //Inicializa variáveis
        count = 0;
        

    }
    
    public void act(){
        
        buildCharacter();
    
    }
    
    public void buildCharacter()
    {
         if((Greenfoot.getRandomNumber(100) < 2))
        {
            buildGreenAnt();
        }
      
    }
    
    public void buildGreenAnt()
    {
        if(count == 5){count = 0;}
        
        //delayTime(500);
        addObject(factory.getGreenAnt(count), 0, MygetRandomNumber(70,400));
        count++;
        
    }
    
    public int MygetRandomNumber(int start,int end){

       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
       
       //metodo para gerar numeros aleatorios entre valores
    }
}
