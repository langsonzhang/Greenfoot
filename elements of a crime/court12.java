import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class court12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class court12 extends World
{
    private int counter  = 0;
    private int i = 0;
    private Boolean bool = true;
    private String[] voice = {"........", "......", "....", "..", "."};
    
    public Cementary cemetary = new Cementary();
    /**
     * Constructor for objects of class court12.
     * 
     */
    public court12()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
        addObject(new text(".........."), getWidth()/2, getHeight()*1/5);
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
                    Greenfoot.setWorld(new court2());
                    return;
                }
                removeObjects(getObjects(text.class));
                addObject(new text(voice[i]), getWidth()/2, getHeight()*1/5);
                ++i;
                counter = 0;
            }

        }
    }
}
