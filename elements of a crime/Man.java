import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends objects
{
    private final static GreenfootImage[] MAN = {new GreenfootImage("man1.png"), new GreenfootImage("man2.png"), new GreenfootImage("man3.png"), new GreenfootImage("man4.png"), new GreenfootImage("man5.png")};
    private int counter = 0;
    private int animationFrame = 0;
    private boolean right;
    private boolean birdseye = false;
    public Man(boolean bool){
        birdseye = bool;
    }
    public void act() 
    {
        ++counter;
        animation();
    } 
    public void animation(){
        if (!isMoving()){
            if (right)
                setImage(new GreenfootImage("man0.png"));
                
            else{
                GreenfootImage img2 = new GreenfootImage("man0.png");
                img2.mirrorHorizontally();
                setImage(img2);
            }
        }
        else
            updateAnimation(MAN, 5);
        if (Greenfoot.isKeyDown("A") && getOneObjectAtOffset(-15, 0, objects.class) == null){
            move(-5);
            right = false;
        }
        if (Greenfoot.isKeyDown("D") && getOneObjectAtOffset(15, 0, objects.class) == null){
            move(5);
            right = true;
        }
        if (Greenfoot.isKeyDown("S") && getOneObjectAtOffset(0, 45, objects.class) == null && birdseye){
            setLocation(getX(), getY()+3);
        }
        else if (Greenfoot.isKeyDown("W") && getOneObjectAtOffset(0, -45, objects.class) == null && birdseye){
            setLocation (getX(), getY()-3);
        }
    }
    public void updateAnimation(GreenfootImage[] animation, int skipRate)
    {
        if (animate(skipRate))
        {
            ++animationFrame;
            counter = 1;
        }
        if (animationFrame >= animation.length)
            animationFrame = 0;
        if (right){
            setImage(animation[animationFrame]);
        }
        else{
            GreenfootImage img = new GreenfootImage(animation[animationFrame]);
            img.mirrorHorizontally();
            setImage(img);
        }
    }
    public boolean animate(int skipRate)
    {
        return counter%skipRate == 0;
    }
    public boolean isMoving(){
        return Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("S") || Greenfoot.isKeyDown("D") || Greenfoot.isKeyDown("W");
    }
}
