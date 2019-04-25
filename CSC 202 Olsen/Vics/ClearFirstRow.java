/**\
 * This program will clear the first row
 */
public class ClearFirstRow
{
    public static void main(String[] args)
    {
        Vic.reset(args);
        Vic clearFirstRow;
        clearFirstRow = new Vic();
        
        while(clearFirstRow.seesSlot())
        {
            clearFirstRow.takeCD();  /** Correct */
            clearFirstRow.moveOn();
        }
    }
}