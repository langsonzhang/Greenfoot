import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cemetary2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cemetary2 extends World
{
    private Man mans;
    private Boolean bool = null;
    private int counter = 0;
    
    public cemetary2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
        Man man = new Man(true);
        mans = man;
        addObject(mans, 1470, 450);
        prepare();
    }

    public void act(){
        if (mans.getX() > 794 && mans.getX() < 936 && mans.getY() < 15){
            Greenfoot.setWorld(new street());
        }
    }


    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Arrow arrow = new Arrow(0);
        addObject(arrow,870,63);
        
    }
}
