package utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest 
{
	@Test
	void testConstruction()
	{
		LinkedList<String> list = new LinkedList<String>();
		assertEquals(0, list._size);
		assertTrue(list.isEmpty());
		assertTrue(list._head._next == list._tail);
	}

	@Test 
	void testAddToFront()
	{
		LinkedList<String> list = new LinkedList<String>();
		assertEquals(0, list._size); assertTrue(list.isEmpty());

		list.addToFront(null);
		list.addToFront("good");
		list.addToFront("is");
		list.addToFront("fundip");

		assertEquals("[fundip, is, good]", list.toString());
		assertEquals(3, list._size); assertFalse(list.isEmpty());
	}

	@Test
	void testAddToBack()
	{
		LinkedList<String> list = new LinkedList<String>();
		assertEquals(0, list._size); assertTrue(list.isEmpty());

		list.addToBack(null);
		list.addToBack("fundip");
		list.addToBack("is");
		list.addToBack("good");

		assertEquals("[fundip, is, good]", list.toString());
		assertEquals(3, list._size); assertFalse(list.isEmpty());
	}

	@Test 
	void testAddDeleteAdd()
	{
		LinkedList<String> list = new LinkedList<String>();
		assertEquals(0, list._size); assertTrue(list.isEmpty());


		//add 
		list.addToBack("good");
		list.addToFront("is");
		list.addToFront("fundip");
		list.addToBack("!!!");

		//check
		assertEquals(4, list._size);
		assertEquals("[fundip, is, good, !!!]", list.toString());

		//clear and check for reset
		list.clear();
		assertEquals(0, list._size);
		assertTrue(list.isEmpty());
		assertEquals("[]", list.toString());

		//second add
		list.addToBack("a");
		list.addToFront("is");
		list.addToFront("this");
		list.addToBack("new");
		list.addToBack("entry");

		//check
		assertEquals(5, list._size);
		assertEquals("[this, is, a, new, entry]", list.toString());
	}

	@Test
	void testContains()
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.addToBack("A");
		list.addToBack("B");
		list.addToBack("C");
		list.addToBack("D");
		list.addToBack("E");
		list.addToBack("F");

		//not in list
		assertFalse(list.contains(null));
		assertFalse(list.contains("fundip"));
		assertFalse(list.contains("AB"));

		//in list
		assertTrue(list.contains("A"));
		assertTrue(list.contains("D"));
		assertTrue(list.contains("F"));
	}

	@Test
	void testRemove()
	{
		LinkedList<String> list = new LinkedList<String>();
		
		//remove from empty list
		assertFalse(list.remove("fundip"));

		list.addToBack("A");
		list.addToBack("B");
		list.addToBack("C");
		list.addToBack("D");
		list.addToBack("E");
		list.addToBack("F");
		
		//not in list
		assertFalse(list.remove(null));
		assertFalse(list.remove("AB"));
		assertFalse(list.remove("a"));
		
		//first
		assertTrue(list.remove("A")); assertEquals(5, list.size());
		
		//last
		assertTrue(list.remove("F")); assertEquals(4, list.size());
		
		//middle
		assertTrue(list.remove("C")); assertEquals(3, list.size());
		
		//try to remove something that is already removed
		assertFalse(list.remove("A"));
		
		list.addToBack("Z");
		assertEquals("[B, D, E, Z]", list.toString());
	}
	
	@Test
	void testReverseSingleList()
	{
		LinkedList<String> list = new LinkedList<String>();
		list.addToBack("A");
	
		assertEquals("[A]", list.toString());
		list.reverse();
		assertEquals("[A]", list.toString());
		list.reverse();
		assertEquals("[A]", list.toString());
	}
	
	@Test
	void testReverseDoubleList()
	{
		LinkedList<String> list = new LinkedList<String>();
		list.addToBack("A");
		list.addToBack("B");
	
		assertEquals("[A, B]", list.toString());
		list.reverse();
		assertEquals("[B, A]", list.toString());
		list.reverse();
		assertEquals("[A, B]", list.toString());
	}
	
	@Test
	void testReverseDuplicates()
	{
		LinkedList<String> list = new LinkedList<String>();
		list.addToBack("A");
		list.addToBack("A");
		list.addToBack("a");
		list.addToBack("B");
		list.addToBack("bb");
		list.addToBack("C");
		list.addToBack("c");

		assertEquals("[A, A, a, B, bb, C, c]", list.toString());
		list.reverse();
		assertEquals("[c, C, bb, B, a, A, A]", list.toString());
		list.reverse();
		assertEquals("[A, A, a, B, bb, C, c]", list.toString());
	}
	
	@Test
	void testReverseLongIntList()
	{
		LinkedList<Integer> forward = new LinkedList<Integer>();
		LinkedList<Integer> backward = new LinkedList<Integer>();

		
		for(int x = -1000; x <= 1000; x++)
		{
			//creates a list with increasing order
			forward.addToBack(x);
			
			//creates a list of opposite order
			backward.addToFront(x);
		}
		
		forward.reverse();
		assertEquals(backward.toString(), forward.toString());
	}
	
	
}
