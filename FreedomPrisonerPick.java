package sjsu.Huang.cs146.project1;
/**
 * Pick a freedom prisoner from all the prisoners
 * @author michaelhuang
 */
public class FreedomPrisonerPick 
{
	//instinct variables
	private CircularLinkedList prisoners;
	private int amountOfPrisoners;
	private int count;
	
	/**
	 * constructor of FreedomPrisonerPick
	 * @param numberOfPrisoners
	 * @param eliminatePrisoner
	 */
	public FreedomPrisonerPick(int numberOfPrisoners, int eliminatePrisoner)
	{
		this.prisoners = new CircularLinkedList();
		this.amountOfPrisoners = numberOfPrisoners;
		this.count = eliminatePrisoner;
		lineUpPrisoners();  //invoke lineUpPrisoners method
	}
	
	/**
	 * line up of all the prisoners
	 */
	public void lineUpPrisoners()
	{
		if(this.amountOfPrisoners > 0)  //check if the number of prisoners is greater than 0
		{
			for(int i = 1; i <= this.amountOfPrisoners; i++)  //for loop i from 1 to total prisoners
			{
				Node temp = new Node(i);  //construct a Node temp with data i
				prisoners.sortedInsert(temp);  //add the node to the circular linked list
			}
		}
		else
		{
			System.out.println("Number of prisoners must be positive");  //alert the illegal number
		}
	}
	
	/**
	 * eliminate the kth prisoner until the last lucky winner
	 * @param k each kth prisoner to be eliminate
	 * @return the lucky prisoner's number
	 */       
	public int luckyWinner()    
	{
		while(prisoners.getCount() > 1)  //check if more than one prisoners
		{
			Node current = prisoners.getHead();
			for(int i = 1; i <= this.count; i++)  //for loop i from 1 to count
			{
				current = current.advance();  //assign the next node of the current node to current
			}
			prisoners.setHead(current.advance());
			prisoners.deleteNode(current.getData());  //remove the current node
			//System.out.println(prisoners.getHead().getData());
			//prisoners.printList();
			//System.out.println();
		}
		return prisoners.getHead().getData(); //return the lucky prisoner's number	 
	}
	/**
	 * get the number of prisoners
	 * @return the number    15
	 */
	public CircularLinkedList getList()
	{
		return this.prisoners;  //return the prisoners' list
	}
	
}
