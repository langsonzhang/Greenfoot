import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crash extends World
{
    private int counter = 0;
    /**
     * Constructor for objects of class crash.
     * 
     */
    public crash()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
    }
    public void act(){
        ++counter;
        if (counter >= 400){
            Greenfoot.setWorld(new court1(true));
        }
    }
}
