
/**
 *This program draws a scary face.
 * 
 * Face will have squares for eyes round nose and a long rectangle for a mouth.
 * 
 * @author Alex Brelsford 
 * @version 9/6/16
 */ 
public class FreakyFace
{
    /**
     * This is the main method of the FreakyFace program.
     * This method is where the drawing of the face happens
     */
    public static void main (String[] args) {
        //(1) Declaration
        Turtle jeff;
        //(2) Initialization
        jeff = new Turtle();
        
        jeff.swingAround(100);  //draw the perimeter of the face
        
        jeff.fillCircle(15); // nose Facing:Right
        
        jeff.move(90,45); //jeff is now @ (0,45) Facing:UP
        
        jeff.move(90,45);//jeff moved to  (-45,45) Facing:LEFT 
        
        jeff.fillBox(25,25); // left eye facing:LEFT
        
        jeff.move(180,90); //jeff is now facing:Right
        
        jeff.fillBox(25,25); //RIGHT EYE Facing:Right
        
        
    }
}
