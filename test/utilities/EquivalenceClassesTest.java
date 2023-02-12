package utilities;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquivalenceClassesTest {

	@Test
	void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	void testContains() {
		Comparator<Integer> c = new Comparator<Integer>() {
			// All even integers are 'equivalent' // All odd integers are 'equivalent' 
			 public int compare(Integer x, Integer y) { return x % 2 == y % 2 ? 0 : 1; }
			};
		 LinkedEquivalenceClass<Integer> a = new LinkedEquivalenceClass<>(c);
		 a.add(1);
		 a.add(2);
		 a.add(3);
				
		 LinkedEquivalenceClass<Integer> b = new LinkedEquivalenceClass<>(c);
		 b.add(5);
		 b.add(6);
		 b.add(7);
		 b.add(8);
		 
		 List<LinkedEquivalenceClasses> list = new List(a, b);
		 EquivalenceClasses<Integer> one = new EquivalenceClasses<Integer>(c, list);
		 assertTrue(one.contains(2));
		 assertTrue(one.contains(6));
		 assertTrue(one.contains(8));
		 assertFalse(one.contains(0));
		 assertFalse(one.contains(null));
		 

	}
	
	@Test 
	void testSize() {
		Comparator<Integer> c = new Comparator<Integer>() {
			// All even integers are 'equivalent' // All odd integers are 'equivalent' 
			 public int compare(Integer x, Integer y) { return x % 2 == y % 2 ? 0 : 1; }
			};
		 LinkedEquivalenceClass<Integer> a = new LinkedEquivalenceClass<>(c);
		 a.add(1);
		 a.add(2);
		 a.add(3);
				
		 LinkedEquivalenceClass<Integer> b = new LinkedEquivalenceClass<>(c);
		 b.add(5);
		 b.add(6);
		 b.add(7);
		 b.add(8);
		 
		 List<LinkedEquivalenceClasses> list = new List(a, b);
		 EquivalenceClasses<Integer> one = new EquivalenceClasses<Integer>(c, list);
		 
		 assertEquals(7, one.size());
		 
		 LinkedEquivalenceClass<Integer> c = new LinkedEquivalenceClass<>(c);
		 c.add(5);
		 c.add(10);
		 one.add(c);
		 assertEquals(9, one.size());
		 
	}
	
	@Test
	void testNumClasses() {
		Comparator<Integer> c = new Comparator<Integer>() {
			// All even integers are 'equivalent' // All odd integers are 'equivalent' 
			 public int compare(Integer x, Integer y) { return x % 2 == y % 2 ? 0 : 1; }
			};
		 LinkedEquivalenceClass<Integer> a = new LinkedEquivalenceClass<>(c);
		 a.add(1);
		 a.add(2);
		 a.add(3);
				
		 LinkedEquivalenceClass<Integer> b = new LinkedEquivalenceClass<>(c);
		 b.add(5);
		 b.add(6);
		 b.add(7);
		 b.add(8);
		 
		 List<LinkedEquivalenceClasses> list = new List(a, b);
		 EquivalenceClasses<Integer> one = new EquivalenceClasses<Integer>(c, list);
		 
		 assertEquals(2, one.numClasses());
		 
		 LinkedEquivalenceClass<Integer> c = new LinkedEquivalenceClass<>(c);
		 c.add(11);
		 c.add(12);
		 one.add(c);
		 assertEquals(3, one.numClasses());
	
	}
	
	@Test 
	void testIndexOfClass() {
		Comparator<Integer> c = new Comparator<Integer>() {
			// All even integers are 'equivalent' // All odd integers are 'equivalent' 
			 public int compare(Integer x, Integer y) { return x % 2 == y % 2 ? 0 : 1; }
			};
		 LinkedEquivalenceClass<Integer> a = new LinkedEquivalenceClass<>(c);
		 a.add(1);
		 a.add(2);
		 a.add(3);
				
		 LinkedEquivalenceClass<Integer> b = new LinkedEquivalenceClass<>(c);
		 b.add(5);
		 b.add(6);
		 b.add(7);
		 b.add(8);
		 
		 List<LinkedEquivalenceClasses> list = new List(a, b);
		 EquivalenceClasses<Integer> one = new EquivalenceClasses<Integer>(c, list);
		 
		 assertEquals(0, one.indexOfClass(1));
		 assertEquals(1, one.indexOfClass(2));
		 
		 LinkedEquivalenceClass<Integer> c = new LinkedEquivalenceClass<>(c);
		 c.add(11);
		 c.add(12);
		 one.add(c);
		 
		 assertEquals(3, one.indexOf(11));
		 assertEquals(-1, one.indexOf(1000));
		 
	}
	
	
}
