package ChapterExamples;
/**
 * Exception for if you take out to much money 
 * @author brelsforda382
 *
 */
public class InvalidWithdrawException extends Exception
{
	public InvalidWithdrawException()
	{
		
	}
	public InvalidWithdrawException(String message)
	{
		super("Invalid Value Withdrawn");
	}
}