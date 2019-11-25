import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public final class Mario extends Character
{
    int status = 1;
    ContinueBtn continueBtn;
    GameOver gameOverBtn;
    
    private static final Mario INSTANCE = new Mario();
    
    Shot shot = new Shot();
    
    public Mario(){
        
        setImage("marioP1.png");
    
    }
    
    
    public void act() 
    {
        // Add your action code here.
        moveCharacter();
    }    
    
    public static Mario getInstance(){return INSTANCE;}
    
    public void setStatus(int num){this.status = num;}
    
    public void moveCharacter(){
        if(status != 0) {
            // movimentos com as setinhas do teclado
            if(Greenfoot.isKeyDown("left")){
                move(-2);
                if (status == 1) {setImage("marioP3.png");}
                else if(status == 2){ setImage("marioG2.png");}
            }

            if(Greenfoot.isKeyDown("right")){
                move(2);
                if(status == 1){ setImage("marioP3.png");}
                else if(status == 2){ setImage("marioG2.png");}
            }

            if(Greenfoot.isKeyDown("up")){
                setLocation(getX(), getY() -2);
                if(status == 1){setImage("marioP4.png");}
                else if(status == 2){ setImage("marioG1.png");}
            }

            if(Greenfoot.isKeyDown("down")){
                setLocation(getX(), getY()+2);
                if(status == 1){setImage("marioP5.png");}
                else if(status == 2){ setImage("marioG3.png");}
            }
            
            foundEnemy();
            shootCharacter();
        }
    }
    
    public void foundEnemy(){
        if(status != 0){
            if(isTouching(Character.class)){
                if(status == 1){
                    World myWorld = getWorld();
                    
                    continueBtn = new ContinueBtn();
                    gameOverBtn = new GameOver();
                    
                    myWorld.addObject(gameOverBtn, myWorld.getWidth()/2, myWorld.getHeight()/2);
                    myWorld.addObject(continueBtn, myWorld.getWidth()/2, (myWorld.getHeight()/2)+50);

                    status = 0;
                    setImage("marioD2.png");
                }

                if(status == 2){
                    status = 1;
                    setImage("marioP1.png");
                }

            }
        }
       
    }
    
    public void shootCharacter(){
        
        if(status != 0) {
            if(Greenfoot.isKeyDown("f")){
                World myWorld = getWorld();
                myWorld.addObject(shot, 0, 0);
                shot.setLocation(getX(), getY());

            }
        }
        
    }
}
