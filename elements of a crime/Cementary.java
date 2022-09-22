import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cementary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cementary extends World
{
    private Man mans;
    private Boolean bool = null;
    private int counter = 0;
    private String[] voice = {"I don't remember a cemetary being here..","I just commited a summary offense..","even though its not that serious..", "I could face up to a 2000$ fine..", "and 6 months in jail..", "I should probably get out of here..", "before anyone sees me."};
    private int i = 0;
    private boolean leave = false;
    private boolean leave2 = false;
    public Cementary()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
        Man man = new Man(true);
        mans = man;
        addObject(mans, 0, 250);
    }

    public void act(){
        popup();
        
        if (leave && leave2){
            Arrow arrow2 = new Arrow(1);
            addObject(arrow2,1427,490);
            leave2 = false;
        }
        if (leave){
            if (mans.getY() > 443 && mans.getY() < 567 && mans.getX() > 1485){
                Greenfoot.setWorld(new street2());
            }
        }
    }

    public void popup(){
        if (mans.getX() == 150 && bool == null){
            addObject(new text("oops I just trespassed.."), getWidth()/2, getHeight()*4/5);
            bool = true;
        }
        if (bool != null && bool){
            ++counter;

            if (counter >= 25 && Greenfoot.isKeyDown("space")){
                if (i >= voice.length){
                    bool = false;
                    removeObjects(getObjects(text.class));
                    leave = true;
                    leave2 = true;
                    return;
                }
                removeObjects(getObjects(text.class));
                addObject(new text(voice[i]), getWidth()/2, getHeight()*4/5);
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
        
        
    }
}
