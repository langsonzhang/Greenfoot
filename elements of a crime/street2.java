import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class street2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class street2 extends World
{
    private int counter = 0;
    private int counter2= 0;
    private boolean leave = false;
    private boolean leave2 = false;
    private Man man2;
    private Boolean bool = false;
    private int i = 0;
    private String[] voice = {"Hello?", "Hello this is the police,", "Your family died from exposure to toxins..", "that you left on the kitchen counter.", "You are under arrest for criminal negligence..", "If you do not turn yourself in..", "We'll come and get you."
    ,"***beep***", "..........", "........", "......","This is bad..", "I should run."};
    /**
     * Constructor for objects of class street2.
     * 
     */
    public street2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1, false); 
        prepare();
        setPaintOrder(nonobject.class,objects.class);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Man man = new Man(true);
        man2 = man;
        addObject(man,184,383);
        hblock hblock2 = new hblock();
        addObject(hblock2,724,514);
        hblock hblock3 = new hblock();
        addObject(hblock3,735,141);

        vblock vblock = new vblock();
        addObject(vblock,-27,366);
        vblock vblock2 = new vblock();
        addObject(vblock2,1498,339);
    }

    public void act(){
        carthing();
        popup();
        ++counter;
        ++counter2;
        if (leave && leave2){
            Arrow arrow = new Arrow(3);
            addObject(arrow,73,356);
            leave2 = false;
        }
        if (man2.getX() < 15 && leave){
                Greenfoot.setWorld(new cemetary2());
            }
        if (counter >= 200 && bool != null && bool == false){
            addObject(new text("***ringgg***"), getWidth()/2, getHeight()*4/5);
            bool = true;
            counter = 0;
        }
    }
    public void carthing(){
        if(counter2 >= 300){
           car2 car = new car2();
           addObject(car, -450, 636);
           counter2 = 0;
        }
    }

    public void popup(){
        if (bool != null && bool){

            if (counter >= 25 && Greenfoot.isKeyDown("space")){
                if (i >= voice.length){
                    bool = null;
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
}
