package sjsu.Huang.cs146.project1;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * The Junit class for CircularLinkedList class
 * @author michaelhuang
 */
public class CircularLinkedListTest 
{
    CircularLinkedList list = new CircularLinkedList();  //initialize a CircularLinkedList list
	@Test
	public void testEmpty()   // test empty method
	{
		assertTrue(list.isEmpty());  //test
	}
	
	@Test
	public void testLength()  //test length method
	{
		assertEquals(1, list.getCount());	//test
	}
	
	@Test
	public void testAdd()  //test add method
	{
		Node newNode = new Node(1);  //construct a new node 
		list.sortedInsert(newNode);  //add the new node to the list
		assertFalse(list.isEmpty()); //test empty
		assertEquals(1, list.getCount()); //test the size
	}
	
	@Test
	public void testDelete()  //test delete method
	{
		Node newNode = new Node(1); //construct new node 1
		Node second = new Node(2);  //construct new node 2
		list.sortedInsert(newNode); //insert new node
		list.sortedInsert(second);  //insert the second node
		list.deleteNode(2);    //delete node 2
		assertEquals(1, list.getCount());  //test 
		assertFalse(list.isEmpty());  //test
	}
}
