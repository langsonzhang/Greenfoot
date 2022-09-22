import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car2 extends objects
{
    public car2(){
        setRotation(90);
    }
    public void act() 
    {
        setLocation(getX()+25, getY());
        if (this.getX() > 2000 || this.getX() < -500){
            getWorld().removeObject(this);
        }
    }    
}
