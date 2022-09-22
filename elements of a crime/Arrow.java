import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends nonobject
{
    private int i = 1;
    private int n2;
    private int counter = 0;
    public Arrow(int n){
        n2 = n;
        setRotation(n*90);
    }
    public void act() 
    {
        if (n2%2 == 0){
            ++counter;
            if (counter >= 10){
                counter = 0;
                i = -i;
            }
            setLocation(getX(), getY()+i);
        }
        else {
            ++counter;
            if (counter >= 10){
                counter = 0;
                i = -i;
            }
            setLocation(getX()+i, getY());
        }
    }   
    public int test(){
        return n2%2;
    }
}
