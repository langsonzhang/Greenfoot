import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends World
{
    private Man man = new Man(false);
    private int counter  = 0;
    private int i = 0;
    private Boolean bool = true;
    private String[] voice = {"I should go for a walk.", "WASD to move."};
    
    public Cementary cemetary = new Cementary();
    /**
     * Constructor for objects of class start.
     * 
     */
    public start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
        addObject(man, 530, 676);
        addObject(new text("What good weather today.."), getWidth()/2, getHeight()*1/5);
        prepare();
    }

    public void act(){
        popup();
        if (man.getX() >= 1480){
            Greenfoot.setWorld(cemetary);
        }
    }

    public void popup(){
        if (bool != null && bool){
            ++counter;

            if (counter >= 25 && Greenfoot.isKeyDown("space")){
                if (i >= voice.length){
                    bool = false;
                    removeObjects(getObjects(text.class));
                    return;
                }
                removeObjects(getObjects(text.class));
                addObject(new text(voice[i]), getWidth()/2, getHeight()*1/5);
                ++i;
                counter = 0;
            }

        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Arrow arrow = new Arrow(1);
        addObject(arrow,1399,683);
    }
}
