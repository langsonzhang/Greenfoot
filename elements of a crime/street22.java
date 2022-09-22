import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class street22 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class street22 extends World
{
    private int counter = 0;
    private int counter2= 0;
    private Man man2;
    /**
     * Constructor for objects of class street22.
     * 
     */
    public street22()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1, false); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Arrow arrow = new Arrow(3);
        addObject(arrow,73,356);

        Man man = new Man(true);
        man2 = man;
        addObject(man,184,383);
        hblock hblock2 = new hblock();
        addObject(hblock2,724,514);
        hblock hblock3 = new hblock();
        addObject(hblock3,735,141);
        
    }

    public void act(){
        carthing();
        
    }
    public void carthing(){
        if(counter >= 300){
           car2 car = new car2();
           addObject(car, -450, 636);
           counter = 0;
        }
    }
}
