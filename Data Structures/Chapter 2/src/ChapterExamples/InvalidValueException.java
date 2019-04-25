package ChapterExamples;
/**
 * Exception that says if a value depositid is greater than 0
 * @author brelsforda382
 *
 */
public class InvalidValueException extends Exception 
{

	public InvalidValueException()
	{
		
	}
	public InvalidValueException(String message)
	{
		super("Invalid Value Deposited");
	}
	
}
