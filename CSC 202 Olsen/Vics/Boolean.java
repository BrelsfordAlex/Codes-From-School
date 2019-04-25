
public class Boolean extends Vic
{
     /**
     * seesCS without error.
     * @return true if there is a slot 
     *              and a CD.
     */
    public boolean robustSeesCD()
    {
        boolean answer;  //Declare
        answer = false;  //Initialization
        
        if(seesSlot()  && seesCD()) 
        {
            answer= true;   //assignment
        }
        
        return answer;
    }
    
    public boolean robustSeesCD2()
    {
        return seesSlot()  && seesCD();
    }

}