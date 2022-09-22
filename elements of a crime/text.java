    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class text extends nonobject
{
    
    public text(String s){
        GreenfootImage image = new GreenfootImage("text.png");
        GreenfootImage text = new GreenfootImage("press space", 25, Color.WHITE, new Color(0, 0, 0, 0));
        GreenfootImage image2 = new GreenfootImage(s, 50, Color.WHITE, new Color(0, 0, 0, 0));
        image.drawImage(image2, image.getWidth()/2-image2.getWidth()/2, image.getHeight()/3);
        image.drawImage(text, image.getWidth()-150, image.getHeight()-50);
        setImage(image);
    }
    public void act() 
    {
        
    }    
    public void words(){
        
    }
}
