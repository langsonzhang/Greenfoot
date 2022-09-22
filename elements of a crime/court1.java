import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class court1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class court1 extends World
{
    private int counter  = 0;
    private int i = 0;
    private Boolean bool = true;
    private String[] voice = {"........", "......", "....", "..", "."};
    
    public Cementary cemetary = new Cementary();
    
    private Boolean first;
    /**
     * Constructor for objects of class court1.
     * 
     */
    public court1(Boolean bool)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
        addObject(new text(".........."), getWidth()/2, getHeight()*1/5);
        first = bool;
    }
    public void act(){
        popup();
    }
    public void popup(){
        if (bool != null && bool){
            ++counter;

            if (counter >= 25 && Greenfoot.isKeyDown("space")){
                if (i >= voice.length){
                    bool = false;
                    removeObjects(getObjects(text.class));
                    if (first != null && !first){
                        Greenfoot.setWorld(new court22());
                    }
                    else if (first != null && first)
                        Greenfoot.setWorld(new court2());
                    else
                        Greenfoot.setWorld(new end());
                    return;
                }
                removeObjects(getObjects(text.class));
                addObject(new text(voice[i]), getWidth()/2, getHeight()*1/5);
                ++i;
                counter = 0;
            }

        }
    }
    public Boolean bool(){
        return first;
    }
}
