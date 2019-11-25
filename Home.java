import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{
    int idxGreenAnt;
    int idxRedAnt;
    int idxGhostBoss;
    int idxBoomBoss;
    
    FlyweightFactory factory = new FlyweightFactory();
    
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        //Inicializa variáveis
        idxGreenAnt = 0;
        idxRedAnt = 0;
        idxGhostBoss = 0;
        idxBoomBoss = 0;
        
        factory.getMario().setStatus(1);
        factory.getMario().setImage("marioP1.png");
        
        addObject(factory.getMario(), 487, 192);
        addObject(factory.getScore(), getWidth()/2, 15);

    }
    
    public void act(){
        
        buildCharacter();
    
    }
    
    public Score getScore(){return factory.getScore();}
    
    public void buildCharacter()
    {
        if((Greenfoot.getRandomNumber(100) < 2)){buildGreenAnt();}
        
        if((Greenfoot.getRandomNumber(100) < 1)){buildRedAnt();}
        
        if((Greenfoot.getRandomNumber(100) == 45)){buildGhostBoss();}
        
        if((Greenfoot.getRandomNumber(100) == 35)){buildBoomBoss();}
        
      
    }
    
    public void buildGreenAnt()
    {
        if(idxGreenAnt == factory.numGreenAnt){idxGreenAnt = 0;}
        
        addObject(factory.getGreenAnt(idxGreenAnt), 0, MygetRandomNumber(70,400));
        idxGreenAnt++;
        
    }
    
    public void buildRedAnt()
    {
        if(idxRedAnt == factory.numRedAnt){idxRedAnt = 0;}

        addObject(factory.getRedAnt(idxRedAnt), 0, MygetRandomNumber(70,400));
        idxRedAnt++;
        
    }
    
    public void buildGhostBoss()
    {
        if(idxGhostBoss == factory.numGhostBoss){idxGhostBoss = 0;}
        
        addObject(factory.getGhostBoss(idxGhostBoss), 0, MygetRandomNumber(70,400));
        idxGhostBoss++;
        
    }
    
    public void buildBoomBoss()
    {
        if(idxBoomBoss == factory.numBoomBoss){idxBoomBoss = 0;}
        
        addObject(factory.getBoomBoss(idxBoomBoss), 0, MygetRandomNumber(70,400));
        idxBoomBoss++;
        
    }
    
    
    public int MygetRandomNumber(int start,int end){

       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
       
       //metodo para gerar numeros aleatorios entre valores
    }
    
}
