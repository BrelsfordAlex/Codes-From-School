
/**
 *This is a program that will draw 3 diamonds overlapping eachother. at 45 degree angles. 
 * @author Alex Brelsford
 * @version 9/13/16
 */
public class OverlaidDiamonds
{
    /**
     * This is the main methof of OverlaidDiamonds
     * Where the drawing will happen
    */
    public static void main(String[] args) 
    {
        //(1) Declaration
        Turtle diamond;
        //(2) Initialization
        diamond = new Turtle();
        
        diamond.switchTo(Turtle.BLUE);
        
        diamond.move (45,0); //moves diamond 45 degrees upwards
        
        diamond.fillBox (100,100); //creates box 100x100 facing upper right hand corner
        
        diamond.move (-45,0); //moves program back to start facing center right
        
        diamond.move (-90,75); //moves the centner 100 down at a -90 angle
        
        diamond.move (45,0); //moves drawing to a 45 degraa angle from -90
        
        diamond.fillBox (100,100); //makes a second diamon 100x100 facing lowwer right
        
        diamond.move (135,0); //faces up 
        
        diamond.move (0,150); //moves up 150 px to close to the up
        
        diamond.move (-45,0); ///puts tutle facing the upper right corner
        
        diamond.fillBox (100,100); //tutle draws a square 100x100 facing upper right
        
        //diamond.mark(Turtle.GREEN); //last line
    }

}
