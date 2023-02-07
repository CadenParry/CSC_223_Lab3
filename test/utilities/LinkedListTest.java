package utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testContainsPreviousRemove() 
	{
		LinkedList<String> list = new LinkedList<String>();

		assertEquals(0, list._size);
		assertTrue(list.isEmpty());
		
		list.addToFront("z");
		list.addToFront("y");
		list.addToFront("b");
		list.addToFront("A");
		list.addToFront("a");
		list.addToFront("A");
		
		assertEquals(6, list._size);
		assertFalse(list.isEmpty());

		assertEquals("[A, a, A, b, y, z]", list.toString());
		
		assertFalse(list.contains(null));
		assertTrue(list.contains("z"));
		assertTrue(list.contains("a"));
		assertTrue(list.contains("A"));
		assertFalse(list.contains("cA"));
		assertFalse(list.contains("Ac"));
		
		assertEquals("y", list.previous("z")._data);
		assertEquals(list._head, list.previous("A"));
		assertEquals("b", list.previous("y")._data);

		assertTrue(list.remove("z"));
		assertEquals("[A, a, A, b, y]", list.toString());
		assertTrue(list.remove("A"));
		assertEquals("[a, A, b, y]", list.toString());
	}
	
	@Test
	void testPrevious()
	{
		LinkedList<String> list = new LinkedList<String>();
		list.addToBack("bad");
		list.addToBack("me");
		list.addToBack("good");
		list.addToBack("me");
		list.addToBack("me");
		
		System.out.println(list.previous(list._head._next._next._data)._data);
		System.out.println(list.previous(list._head._next._next._next._next._data)._data);

		

	}
	
	@Test
	void testLast()
	{
		LinkedList<String> list = new LinkedList<String>();
		assertEquals(list._head, list.last());

		list.addToFront("z");
		
		assertEquals("z", list.last()._data);

		list.addToFront("y");
		
		assertEquals("z", list.last()._data);

		list.addToFront("b");
		list.addToFront("A");
		list.addToFront("a");
		list.addToFront("A");
		assertEquals("[A, a, A, b, y, z]", list.toString());
		
		assertEquals("z", list.last()._data.toString());
	}
	
	@Test
	void testAddToBack()
	{
		LinkedList<String> list = new LinkedList<String>();
		list.addToBack("A");
		list.addToBack("a");
		list.addToBack("A");
		list.addToBack("b");
		list.addToBack("y");
		list.addToBack("z");
		
		assertEquals("[A, a, A, b, y, z]", list.toString());
	}
	
	@Test
	void testReverse()
	{
		LinkedList<String> list = new LinkedList<String>();
		list.addToBack("A");
		list.addToBack("A");
		list.addToBack("a");
		list.addToBack("B");
		list.addToBack("b");
		list.addToBack("C");
		list.addToBack("c");
		
		System.out.println(list.toString());
//		assertEquals("[A, a, B, b, C, c]", list.toString());
		list.reverse();
//		assertEquals("[c, C, b, B, a, A]", list.toString());
		System.out.println(list.toString());
		
		System.out.println(list.last()._data);
		
		
	}
}
