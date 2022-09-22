import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class grandma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class grandma extends objects
{
    private int counter = 0;
    public void act() 
    {
        setLocation(getX(), getY()+40);
        if (getOneIntersectingObject(Car.class) != null){
            setLocation(getOneIntersectingObject(Car.class).getX(), 450);
            ++counter;
            if (counter >= 100){
                getWorld().addObject(new explosion(), getX(), getY());
                getWorld().addObject(new explosion(), getX()-140, getY()-145);
                getWorld().addObject(new explosion(), getX()+300, getY()+60);
                getWorld().addObject(new text("Achievement: manslaughter"), 750, 160);
                getWorld().removeObject(this);
            }
            
        }
    }    
}
