package sjsu.Huang.cs146.project1;
/**
 * Node class has data and next and previous reference
 * @author michaelhuang
 */
public class Node 
{
	//instinct variables
	private int data;
	private Node next;
	private Node previous;
	/**
	 * constructor of Node
	 * @param n
	 */
	public Node(int n)
	{
		this.data = n;   // assign the n to the data
		this.next = null;  //initialize next of the node is null
		this.previous = null;  //initialize previous of the node is null
	}
	
	/**
	 * return the data of the node
	 * @return the data
	 */
	public int getData()
	{
		return this.data; //return data
	}
	/**
	 * return the next node
	 * @return the next node
	 */
	public Node advance()
	{
		return this.next;  //return the next node
	}
	/**
	 * return the previous node
	 * @return previous node
	 */
	public Node backward()
	{
		return this.previous;  //return the previous node
	} 
	/**
	 * set the next node
	 * @param next is the next node
	 */
	public void setNext(Node next)
	{
		this.next = next;  //set next node to next
	}
	/**
	 * set the previous node
	 * @param previous
	 */
	public void setPrevious(Node previous)
	{
		this.previous = previous;  //set previous node to previous 
	}
}
