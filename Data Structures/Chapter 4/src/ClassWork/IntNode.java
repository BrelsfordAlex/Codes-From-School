package ClassWork;

public class IntNode <T>
{

	//Variables
		private T data;
		private IntNode<T> link;// the IntNode is the classname. when usiong replace it
	
		//constructors
		/**
		 * Default constructor that is used to set link to null and data to 0 as default
		 * 
		 */
		public IntNode()
		{
			
			link = null;//sets link to null
			data=null ;//sets data to 0
			
		}
		/**
		 * constructor that sets data to data
		 * and link to link
		 * to set the variables
		 * @param data
		 * @param link
		 */
		public IntNode(T data, IntNode<T> link)
		{
			
			this.data=data;//private data set to method data
			this.link = link;
			
		}
		/**
		 * Getters and setters for Data and link
		 */
		public T getData()
		{
			return data;
		}
		public void setData(T data) 
		{
			this.data = data;
		}
		public IntNode<T> getLink() 
		{
			return link;
		}
		public void setLink(IntNode<T> link) 
		{
			this.link = link;
		}
		

		

}
     

		