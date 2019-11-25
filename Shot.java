    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Shot here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Shot extends Object
    {
      
    
    public void act() 
    {
        Actor greenAntActor = getOneIntersectingObject(GreenAnt.class);
        Actor redAntActor = getOneIntersectingObject(RedAnt.class);
        Actor ghostBossActor = getOneIntersectingObject(GhostBoss.class);
        Actor boomBossActor = getOneIntersectingObject(BoomBoss.class);
        
        move(-5);
        
        if( greenAntActor != null) {
            
            World myWorld = getWorld();
            Home home =(Home) myWorld;
            
            Score score = home.getScore();
            score.setScore(2);
            myWorld.removeObject(greenAntActor);
            myWorld.removeObject(this);
        
        }
        else if(redAntActor != null){
            World myWorld = getWorld();
            Home home =(Home) myWorld;
            
            Score score = home.getScore();
            score.setScore(6);
            myWorld.removeObject(redAntActor);
            myWorld.removeObject(this);
        }
        else if(ghostBossActor != null){
            World myWorld = getWorld();
            Home home =(Home) myWorld;
            
            Score score = home.getScore();
            score.setScore(10);
            myWorld.removeObject(ghostBossActor);
            myWorld.removeObject(this);
        }
        else if(boomBossActor != null){
            World myWorld = getWorld();
            Home home =(Home) myWorld;
            
            Score score = home.getScore();
            score.setScore(10);
            myWorld.removeObject(boomBossActor);
            myWorld.removeObject(this);
        }
        
    }    
}
