/**
 * This is an in class work to try to create a linked list
 * @author brelsforda382
 */
package ClassWork;
import java.util.Scanner; 
public class LinkedList <T>
{
	//Variables
	private IntNode<T> head;//thing that points to first node
	private IntNode<T> current;//helps adding and negating
	private IntNode<T> previous; //helps adding and negating
	//constructors
	public LinkedList()
	{
		
		head = null;
		current = null;
		previous = null;
		
	}
	//Getters and setters 
	
	public IntNode<T> getHead() {
		return head;
	}

	public void setHead(IntNode<T> head) {
		this.head = head;
	}

	public IntNode<T> getCurrent() {
		return current;
	}

	public void setCurrent(IntNode<T> current) {
		this.current = current;
	}

	public IntNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(IntNode<T> previous) {
		this.previous = previous;
	}
	//Methods
	/**
	 * AddNodeFirst is a method that adds the node with specific data
	 * 
	 */
	public void addNodeFirst(T data, IntNode<T> link)
	{
		
		head = new IntNode<T>(data,head);//this sets head to a new node
		
	}
	/**
	 * Adds  a node to the last slot
	 * @param data
	 * @param link
	 */
	public void addNodeLast(T data, IntNode<T> link)
	{
		
		IntNode<T> newNode = new IntNode<T>(data,null);
		if(head == null)//if head is null
		{
			
			head = newNode; //head is pointed to a new node
			
		}
		else//otherwise
		{
			
			current = head;//set current to head
			while(current != null)//and while current is NOT null
			{
				
				previous = current; //previous is set to current
				current = current.getLink();// gets the link
				
			}
		previous.setLink(newNode);	
			
		}

		
	}
	/**
	 * Removes the first node
	 */
	public void RemoveFirst()
	{
		current = head;
		
	    if(head != null)
		{
			
			head= head.getLink();
			
			
		}
		
	}
	public void removeLast()
	{
		
		if(head!=null)
		{// check to see if the list is empty.  If it is the method exits.
			current = head; // set current to head so they are pointing to the same node.
		} 
		while (current.getLink()!=null)
		{ // while current is references another node
			
			previous = current; // set previous to point to the same node as current
			current = current.getLink(); // set current to reference the next node.
		}
		previous.setLink(null); // Once current is point to null then the loop exits and we
		                        // set previous link to null which detaches the last node in the list.
	}


	public void removeAny(T key)
	{
		
		if(head == null)
			System.out.println("List is empty");
		else 
		{
			
			current = head;
			while(current!=null && current.getData()!=key)
			{
				
				previous = current;
				current = current.getLink();
			}
			if (current == head && current.getData()==key)
			{
				head=head.getLink();
			} 
			else
				if(current !=null){
					previous.setLink(current.getLink());
				}
		}
		
	}
	public T size()
	{
		
		T count = null;
		IntNode<T> position = head;
		while (position !=null)
		{
			
			position = position.getLink();
		}
		return count;
	}
	

	public void displayLinkedList()
	{
		IntNode<T> position = head;
		while(position != null)
		{
			System.out.print(position.getData() + " ");
			position = position.getLink();
			
			
		}

	}
	
	/**
	 * Test main class of Linked list
	 * @param args
	 */
	public static void main(String[] args) {
		IntNode<Integer> link = null;
		IntNode<Integer> head = null;
		

		LinkedList<Integer> test = new LinkedList<Integer>();
		test.addNodeFirst(10,  null);
		test.addNodeLast(12, null);
		test.displayLinkedList();
		System.out.println("");
		test.RemoveFirst();
		test.displayLinkedList();
		System.out.println("");
		test.addNodeLast(13, null);
		test.addNodeLast(14, null);
		test.addNodeLast(12, null);
		test.displayLinkedList();
		System.out.println("");

		test.removeLast();
		test.displayLinkedList();
		System.out.println("");
		test.removeAny(13);
		test.displayLinkedList();
		System.out.println("");
		test.size();
		
	}
}
