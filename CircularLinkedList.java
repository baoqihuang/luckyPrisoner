package sjsu.Huang.cs146.project1;
/**
 * circular linked list class
 * @author michaelhuang
 */
public class CircularLinkedList 
{
	//instinct variable
	private Node head;
	private int count;
	/**
	 * constructor of CircularLinkedList
	 */
	public CircularLinkedList()
	{
		head = null;  //initialize the head of the circular linked list
	}
	/**
	 * function to insert a new node in a list in sorted way.
	 * @param newNode
	 */
	public void sortedInsert(Node newNode)  //insert method
	{
		count ++;  //advance the count
		Node current = head;  //assign the head to the current
		if(isEmpty())  //check if the list is empty
		{
			//if empty set the new node to head
			newNode.setNext(newNode); 
			newNode.setPrevious(newNode);
			head = newNode;
		}
		//if value is smaller than head's value, let the new node as the last node
		else if(current.getData() >= newNode.getData())
		{
			while(current.advance() != head)  //if current is not the end node
			{
				current = current.advance();  //advance the node
			}
			//connect the new node between the current and next node
			current.setNext(newNode);  
			newNode.setPrevious(current);  
			newNode.setNext(head);
			head.setPrevious(newNode);
			head = newNode;  // set the new node as the head
		}
		else  //if value is greater than head's value
		{
			//locate the node before the point of insertion
			while(current.advance() != head && current.advance().getData() < newNode.getData())
			{
				current = current.advance();
			}
			//connect the new node between the current and next node
			newNode.setNext(current.advance());
			current.advance().setPrevious(newNode);
			newNode.setPrevious(current);
			current.setNext(newNode);
		}
	}
	
	/**
	 * delete the target node by matching the data
	 * @param number
	 */
	public void deleteNode(int target)
	{
		if(isEmpty())  //check empty
		{
			System.out.println("The list is empty");  //alert
			return;
		}
		Node current = head; //assign the head to the current node
		int position = this.count;  //assign the count to position
		while(current.getData() != target && position > 0)  //if not found before back to the original position
		{
			current = current.advance();  //move to next
			position --;  //decending the position
		}
		if(position > 0)  //if found
		{
			if(this.getCount() == 1) //if has only one node
			{
				//empty the list
				head = null; 
				free(current); //free the current node
			}
			else if(this.getCount() > 1)  //if the list has more than one node
			{
				//remove the current node
				current.backward().setNext(current.advance());
				current.advance().setPrevious(current.backward());
				free(current);  //free the current node
			}
			count --;  //decend the count
		}
		else  //if not found
		{
			System.out.println("Not found!");
			return;
		}
	}
	/**
	 * print the whole list of prisoners
	 */
	public void printList()
	{
		if(head != null) //check if empty
		{
			Node current = head; //assign the head to the current node
			do
			{
				System.out.print(current.getData() + " ");  //print the data
				current = current.advance();  //advance the node
			}while(current != head);  //end loop if reach the end node
		}
	}
	/**
	 * check if the list is empty
	 * @return true if empty, false otherwise
	 */
	public boolean isEmpty()
	{
		return head == null; //if the head is null return empty
	}
	
	/**
	 * return the number of nodes
	 * @return the number
	 */
	public int getCount()
	{
		return this.count;  //return the number of node
	}
	/**
	 * return the head of the list
	 * @return
	 */
	public Node getHead()
	{
		return this.head;  //return the head node
	}
	/**
	 * set the node to the head of the list
	 * @param node
	 */
	public void setHead(Node node)
	{
		this.head = node;  //set the head
	}
	/**
	 * free the node memory
	 * @param node
	 */
	public void free(Node node)
	{
		//set the next and previous to null
		node.setNext(null); 
		node.setPrevious(null);  
	}
}
