import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road extends World
{
    private GreenfootImage road = new GreenfootImage("road.png");
    private int counter = 0;
    private Car car;

    private boolean start = false;

    private int counter2 = 0;
    private int i = 0;
    private boolean cop = true;
    private boolean asd = false;
    private Boolean bool = true;
    private String[] voice = {"PULL OVER NOW", "DRIVER HALT YOUR VEHICLE"};
    /**
     * Constructor for objects of class Road.
     * 
     */
    public Road()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1, false); 
        setPaintOrder(text.class, explosion.class,objects.class, Pic.class);
        addObject(new Pic(), 750, 400);
        Car car2 = new Car(true);
        car = car2;
        addObject(car, 1300, 600);
        addObject(new text("THIS IS THE POLICE"), getWidth()/2, getHeight()*1/5);
        
    }

    public void act(){
        scroll();
        popup();
        ++counter;
        if (start){
            start();
            start = false;
        }
        if ( asd && getObjects(text.class) != null && Greenfoot.isKeyDown("space")){
            removeObjects(getObjects(text.class));
        }
        if (asd && cop){
            car3 car3 = new car3();
            for (int i = 0; i <= getWidth()/car3.getImage().getWidth(); ++i){
    
                addObject(new car3(), i*car3.getImage().getWidth(), -20000);
            }
            cop = false;
        }
    }

    public void scroll(){
        if (counter%20 == 0){
            Pic pic = new Pic();
            int w = getWidth();
            int h = getHeight();
            addObject(pic, w/2, -400);
        }

    }

    private void start()
    {
        grandma grandma = new grandma();
        for (int i = 0; i <= getWidth()/grandma.getImage().getWidth(); ++i){

            addObject(new grandma(), i*grandma.getImage().getWidth(), -5000);
        }
    }

    public int grandma(){
        return getObjects(grandma.class).size();
    }

    public void popup(){
        if (bool != null && bool){
            ++counter2;

            if (counter2 >= 25 && Greenfoot.isKeyDown("space")){
                if (i >= voice.length){
                    bool = false;
                    start = true;
                    removeObjects(getObjects(text.class));
                    asd = true;
                    return;
                }
                removeObjects(getObjects(text.class));
                addObject(new text(voice[i]), getWidth()/2, getHeight()*1/5);
                ++i;
                counter2 = 0;
            }

        }
    }

}
