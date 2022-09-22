import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class court2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class court2 extends World
{
    private int counter  = 0;
    private int i = 0;
    private Boolean bool = true;
    private String[] voice = {"You've commited manslaughter,","..criminal negligence,", "..and theft over 5 thousand.", "All of which are indictable offenses..","(serious)", "So that means you won't get an easy way out..", 
        "Unlike summary offenses,","..there will be no statute of limitations..", "(what the government can and can't do)", "..and we can sentence you as we please", "(as long as it is within limits..","..set by the criminal code)",
    "Understand?", "OK good.", "Now we will have to prove actus reus..","..and mens rea beyond a reasonable doubt.", "The former can be proven very easily,","..but the latter a pain", "Nonetheless we can prove it by..", "--------- ------------ since..",
    "-------- ------- and -----", " because of your recklessness","(the careless disregard..","..of the results of your actions)","while driving the stolen vehicle..", " we can automatically prove mens rea for..","the manslaughter of an..","elderly woman and young adult.", "Therefore actus reus and men rea.." ,"..are proven.", "With both actus reus,","the wrongful deed,","..and mens rea,","the guilty mind proven.."
    , "we can move on.", "since you were under the criminal state of mind,","..and since we proved mens rea..", "for one of your crimes,","it automatically means we prove mens rea..","for all your crimes,","while under the criminal state of mind."
    , "in summary, you had the intent..","(the delibrate mind to commit a crime)","to escape from police,","meanwhile commiting crimes..","..under the criminal mind.","Furthemore, because of your negligence.."," you left poison..","out on the counter,","..which killed your whole family.", "Do you have anything..", "to say for yourself?"};
    /**
     * Constructor for objects of class court2.
     * 
     */
    public court2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
        addObject(new text("Let us begin."), getWidth()/2, getHeight()*4/5);
    }
    public void act(){
        popup();
    }
    public void popup(){
        if (bool != null && bool){
            ++counter;

            if (counter >= 25 && Greenfoot.isKeyDown("space")){
                if (i >= voice.length){
                    bool = false;
                    removeObjects(getObjects(text.class));
                    Greenfoot.setWorld(new court1(false));
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
