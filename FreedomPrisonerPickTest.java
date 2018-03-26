package sjsu.Huang.cs146.project1;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * The Junit class for FreedomPrisonerPick class
 * @author michaelhuang
 */
public class FreedomPrisonerPickTest 
{
	//instinct variable
	private FreedomPrisonerPick luckyWinner;  
	@Test
	public void testluckyWinner() //test luckyWinner method
	{
		luckyWinner = new FreedomPrisonerPick(6,2);  //construct a FreedomPrisonerPick class luckyWinner
		assertEquals(1, luckyWinner.luckyWinner());  //test
	}
	
	@Test
	public void testlineUpPrisoners()  //test lineUpPrisoners method
	{
		luckyWinner = new FreedomPrisonerPick(6,2);   //construct a FreedomPrisonerPick class luckyWinner
		assertEquals(6, luckyWinner.getList().getCount());  //test
	}
}
