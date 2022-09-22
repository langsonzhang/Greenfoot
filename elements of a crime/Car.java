import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends objects
{
    private int counter = 0;
    private Boolean on = false;
    public Car(boolean b){
        setImage(new GreenfootImage("car.png"));
        if (b)
            on = true;
    }
    public void act() 
    {
        if (on){
            shake();
            car();
            ++counter;
        }
        if (getOneIntersectingObject(car3.class) != null){
            Greenfoot.setWorld(new crash());
        }
    }    
    public void shake(){
        if(counter%2 == 0){
            move(1);
        }
        if(counter%2 != 0){
            move(-1);
        }
    }
    public void car(){
        if (Greenfoot.isKeyDown("A")){
            move(-5);
        }
        if (Greenfoot.isKeyDown("D")){
            move(5);
        }
    }
}
