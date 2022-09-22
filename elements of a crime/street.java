import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class street here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class street extends World
{
    private Man man;
    private Arrow arrow = new Arrow(1);
    private Boolean gone = true;
    private Car car2;
    
    private Boolean bool = false;
    private int i = 0;
    private int counter = 0;
    private boolean leave = false;
    private boolean leave2  = false;
    private String[] voice = {"I'll use this for my great escape!"};
    /**
     * Constructor for objects of class street.
     * 
     */
    public street()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1, false);
        Car car = new Car (false);
        car2 = car;
        addObject(car2, 1150, 627);
        Man mans  = new Man(true);
        man = mans;
        addObject(man, 800, 720);
        prepare();
    }
    public void act(){
        popup();
        if (gone != null && !gone && Math.abs(man.getX()-1060) < 15 && Math.abs(man.getY()-600) < 20){
            removeObject(arrow);
            removeObject(man);
            gone = null;
        }
        if (gone == null){
            car2.setLocation(car2.getX(), car2.getY()- 10);
            if (car2.getY() < -150){
                Greenfoot.setWorld(new Road());
            }
        }
        if (!leave && Math.abs(man.getX()-1060) < 15 && Math.abs(man.getY()-600) < 20){
            bool = true;
            addObject(new text("This car looks unlocked.."), getWidth()/2, getHeight()*1/5);
            leave = true;
        }
    }
    public void popup(){
        if ( bool != null && bool){
            ++counter;
            if (counter >= 25 && Greenfoot.isKeyDown("space")){
                if (i >= voice.length){
                    bool = null;
                    removeObjects(getObjects(text.class));
                    leave = true;
                    gone = false;
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
        hblock hblock = new hblock();
        addObject(hblock,719,-35);
        addObject(arrow,1009,601);
    }
}
