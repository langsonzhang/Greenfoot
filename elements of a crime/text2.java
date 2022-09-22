    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class text2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class text2 extends nonobject
{
    
    public text2(String s){
        GreenfootImage image = new GreenfootImage("text.png");
        GreenfootImage text2 = new GreenfootImage("press space", 25, Color.WHITE, new Color(0, 0, 0, 0));
        GreenfootImage image2 = new GreenfootImage(s, 1, Color.WHITE, new Color(0, 0, 0, 0));
        image.drawImage(image2, image.getWidth()/2-image2.getWidth()/2, image.getHeight()/3);
        image.drawImage(text2, image.getWidth()-150, image.getHeight()-50);
        setImage(image);
    }
    public void act() 
    {
        
    }    
    public void words(){
        
    }
}
