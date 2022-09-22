import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class court22 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class court22 extends World
{
    private int counter  = 0;
    private int i = 0;
    private Boolean bool = true;
    private String[] voice = {"OK..", "We now deem Mr. A Aikenhead to be guilty..","for the manslaughter for 5 poeple,","the theft of a $500,000 vehicle..", "and evading police.",
        "We, the Supreme Court of Canada..", "have decided that a 5 life-time sentence..", "is a reasonable punishment.", "***slams gavel***", "Case closed."};
    /**
     * Constructor for objects of class court22.
     * 
     */
    public court22()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
        addObject(new text("Nothing?"), getWidth()/2, getHeight()*4/5);
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
                    Greenfoot.setWorld(new court1(null));
                    return;
                }
                removeObjects(getObjects(text.class));
                addObject(new text(voice[i]), getWidth()/2, getHeight()*4/5);
                ++i;
                counter = 0;
            }

        }
    }
}
