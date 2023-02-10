package utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

class LinkedEquivalenceClassTest {
	@Test
    public void testClearNonCanonical() {
		Comparator<Integer> c = new Comparator<Integer>() {
			// All even integers are 'equivalent' // All odd integers are 'equivalent' 
			 public int compare(Integer x, Integer y) { return x % 2 == y % 2 ? 0 : 1; }
			};
		 LinkedEquivalenceClass<Integer> equivalenceClass = new LinkedEquivalenceClass<>(c);
			 equivalenceClass.add(1);
			 equivalenceClass.add(2);
			 equivalenceClass.add(3);
			 equivalenceClass.add(4);
			 equivalenceClass.add(5);
			 equivalenceClass.add(6);
			 equivalenceClass.add(7);
			 equivalenceClass.add(8);
			 equivalenceClass.add(9);
			 equivalenceClass.add(10);
			 //print 1 | [3, 5, 7, 9]
			 equivalenceClass.clearNonCanonical();
			 assertEquals(1, equivalenceClass.size());
	}
	
	 @Test
    public void testAdd() {
		 Comparator<Integer> c = new Comparator<Integer>() {
			// All even integers are 'equivalent' // All odd integers are 'equivalent' 
			 public int compare(Integer x, Integer y) { return x % 2 == y % 2 ? 0 : 1; }
			};
		 LinkedEquivalenceClass<Integer> equivalenceClass = new LinkedEquivalenceClass<>(c);
			 equivalenceClass.add(1);
			 equivalenceClass.add(2);
			 equivalenceClass.add(3);
			 equivalenceClass.add(4);
			 equivalenceClass.add(5);
			 equivalenceClass.add(6);
			 equivalenceClass.add(7);
			 equivalenceClass.add(8);
			 equivalenceClass.add(9);
			 equivalenceClass.add(10);
			 //print 1 | [3, 5, 7, 9]
			 assertEquals(5, equivalenceClass.size());
			 
			 LinkedEquivalenceClass<Integer> equivalenceClass1 = new LinkedEquivalenceClass<>(c);
			 equivalenceClass1.add(2);
			 equivalenceClass1.add(1);
			 equivalenceClass1.add(3);
			 equivalenceClass1.add(4);
			 equivalenceClass1.add(5);
			 equivalenceClass1.add(6);
			 equivalenceClass1.add(7);
			 equivalenceClass1.add(8);
			 equivalenceClass1.add(9);
			 equivalenceClass1.add(10);
			//print 2 | [4, 6, 8, 10]
			 assertEquals(5, equivalenceClass.size());
    }
	 @Test
	    public void testContains() {
		 Comparator<Integer> c = new Comparator<Integer>() {
				// All even integers are 'equivalent' // All odd integers are 'equivalent' 
				 public int compare(Integer x, Integer y) { return x % 2 == y % 2 ? 0 : 1; }
				};
			 LinkedEquivalenceClass<Integer> equivalenceClass = new LinkedEquivalenceClass<>(c);
				 equivalenceClass.add(1);
				 equivalenceClass.add(2);
				 equivalenceClass.add(3);
				 equivalenceClass.add(4);
				 equivalenceClass.add(5);
				 equivalenceClass.add(6);
				 equivalenceClass.add(7);
				 equivalenceClass.add(8);
				 equivalenceClass.add(9);
				 equivalenceClass.add(10);
				 //print 1 | [3, 5, 7, 9]
				 assertTrue(equivalenceClass.contains(5));
				 assertFalse(equivalenceClass.contains(2));
				 
				 LinkedEquivalenceClass<Integer> equivalenceClass1 = new LinkedEquivalenceClass<>(c);
				 equivalenceClass1.add(2);
				 equivalenceClass1.add(1);
				 equivalenceClass1.add(3);
				 equivalenceClass1.add(4);
				 equivalenceClass1.add(5);
				 equivalenceClass1.add(6);
				 equivalenceClass1.add(7);
				 equivalenceClass1.add(8);
				 equivalenceClass1.add(9);
				 equivalenceClass1.add(10);
				//print 2 | [4, 6, 8, 10]
				 assertTrue(equivalenceClass1.contains(6));
				 assertFalse(equivalenceClass1.contains(1));
	    }
	 
	 @Test
	    public void testBelongs() {
		 Comparator<Integer> c = new Comparator<Integer>() {
				// All even integers are 'equivalent' // All odd integers are 'equivalent' 
				 public int compare(Integer x, Integer y) { return x % 2 == y % 2 ? 0 : 1; }
				};
			 LinkedEquivalenceClass<Integer> equivalenceClass = new LinkedEquivalenceClass<>(c);
				 equivalenceClass.add(1);
				 equivalenceClass.add(2);
				 equivalenceClass.add(3);
				 equivalenceClass.add(4);
				 equivalenceClass.add(5);
				 equivalenceClass.add(6);
				 equivalenceClass.add(7);
				 equivalenceClass.add(8);
				 equivalenceClass.add(9);
				 equivalenceClass.add(10);
				 //print 1 | [3, 5, 7, 9]
				 assertTrue(equivalenceClass.belongs(5));
				 assertFalse(equivalenceClass.belongs(2));
				 
				 LinkedEquivalenceClass<Integer> equivalenceClass1 = new LinkedEquivalenceClass<>(c);
				 equivalenceClass1.add(2);
				 equivalenceClass1.add(1);
				 equivalenceClass1.add(3);
				 equivalenceClass1.add(4);
				 equivalenceClass1.add(5);
				 equivalenceClass1.add(6);
				 equivalenceClass1.add(7);
				 equivalenceClass1.add(8);
				 equivalenceClass1.add(9);
				 equivalenceClass1.add(10);
				//print 2 | [4, 6, 8, 10]
				 assertTrue(equivalenceClass1.belongs(6));
				 assertFalse(equivalenceClass1.belongs(1));
	    }
	 @Test
	    public void testRemove() {
		 Comparator<Integer> c = new Comparator<Integer>() {
				// All even integers are 'equivalent' // All odd integers are 'equivalent' 
				 public int compare(Integer x, Integer y) { return x % 2 == y % 2 ? 0 : 1; }
				};
			 LinkedEquivalenceClass<Integer> equivalenceClass = new LinkedEquivalenceClass<>(c);
				 equivalenceClass.add(1);
				 equivalenceClass.add(2);
				 equivalenceClass.add(3);
				 equivalenceClass.add(4);
				 equivalenceClass.add(5);
				 equivalenceClass.add(6);
				 equivalenceClass.add(7);
				 equivalenceClass.add(8);
				 equivalenceClass.add(9);
				 equivalenceClass.add(10);
				 //print 1 | [3, 5, 7, 9]
				 assertEquals(5, equivalenceClass.size());
				 equivalenceClass.remove(7);
				//print 1 | [3, 5, 9]
				 assertEquals(4, equivalenceClass.size());
				
				 
				 LinkedEquivalenceClass<Integer> equivalenceClass1 = new LinkedEquivalenceClass<>(c);
				 equivalenceClass1.add(2);
				 equivalenceClass1.add(1);
				 equivalenceClass1.add(3);
				 equivalenceClass1.add(4);
				 equivalenceClass1.add(5);
				 equivalenceClass1.add(6);
				 equivalenceClass1.add(7);
				 equivalenceClass1.add(8);
				 equivalenceClass1.add(9);
				 equivalenceClass1.add(10);
				//print 2 | [4, 6, 8, 10]
				 assertEquals(5, equivalenceClass1.size());
				 equivalenceClass1.remove(6);
				//print 2 | [4, 8, 10]
				 assertEquals(4, equivalenceClass1.size());
	    }
	 @Test
	    public void testRemoveCanonical() {
		 Comparator<Integer> c = new Comparator<Integer>() {
				// All even integers are 'equivalent' // All odd integers are 'equivalent' 
				 public int compare(Integer x, Integer y) { return x % 2 == y % 2 ? 0 : 1; }
				};
			 LinkedEquivalenceClass<Integer> equivalenceClass = new LinkedEquivalenceClass<>(c);
				 equivalenceClass.add(1);
				 equivalenceClass.add(2);
				 equivalenceClass.add(3);
				 equivalenceClass.add(4);
				 equivalenceClass.add(5);
				 equivalenceClass.add(6);
				 equivalenceClass.add(7);
				 equivalenceClass.add(8);
				 equivalenceClass.add(9);
				 equivalenceClass.add(10);
				 //print 1 | [3, 5, 7, 9]
				 assertEquals(1, equivalenceClass.canonical());
				 equivalenceClass.removeCanonical();
				//print 1 | [3, 5, 9]
				 assertEquals(3, equivalenceClass.canonical());
				
				 
				 LinkedEquivalenceClass<Integer> equivalenceClass1 = new LinkedEquivalenceClass<>(c);
				 equivalenceClass1.add(2);
				 equivalenceClass1.add(1);
				 equivalenceClass1.add(3);
				 equivalenceClass1.add(4);
				 equivalenceClass1.add(5);
				 equivalenceClass1.add(6);
				 equivalenceClass1.add(7);
				 equivalenceClass1.add(8);
				 equivalenceClass1.add(9);
				 equivalenceClass1.add(10);
				//print 2 | [4, 6, 8, 10]
				 assertEquals(2, equivalenceClass1.canonical());
				 equivalenceClass1.removeCanonical();
				//print 2 | [4, 6, 8, 10]
				//print 4 | [ 6, 8, 10]
				 assertEquals(4, equivalenceClass1.canonical());
	 }
	 @Test
	    public void testDemoteAndSetCanonical() {
		 Comparator<Integer> c = new Comparator<Integer>() {
				// All even integers are 'equivalent' // All odd integers are 'equivalent' 
				 public int compare(Integer x, Integer y) { return x % 2 == y % 2 ? 0 : 1; }
				};
			 LinkedEquivalenceClass<Integer> equivalenceClass = new LinkedEquivalenceClass<>(c);
				 equivalenceClass.add(1);
				 equivalenceClass.add(2);
				 equivalenceClass.add(3);
				 equivalenceClass.add(4);
				 equivalenceClass.add(5);
				 equivalenceClass.add(6);
				 equivalenceClass.add(7);
				 equivalenceClass.add(8);
				 equivalenceClass.add(9);
				 equivalenceClass.add(10);
				 //print 1 | [3, 5, 7, 9]
				 assertEquals(1, equivalenceClass.canonical());
				 equivalenceClass.demoteAndSetCanonical(3);
				//print 1 | [3, 5, 9]
				 assertEquals(3, equivalenceClass.canonical());
				
				 
				 LinkedEquivalenceClass<Integer> equivalenceClass1 = new LinkedEquivalenceClass<>(c);
				 equivalenceClass1.add(2);
				 equivalenceClass1.add(1);
				 equivalenceClass1.add(3);
				 equivalenceClass1.add(4);
				 equivalenceClass1.add(5);
				 equivalenceClass1.add(6);
				 equivalenceClass1.add(7);
				 equivalenceClass1.add(8);
				 equivalenceClass1.add(9);
				 equivalenceClass1.add(10);
				//print 2 | [4, 6, 8, 10]
				 assertEquals(2, equivalenceClass1.canonical());
				 equivalenceClass1.demoteAndSetCanonical(6);
				//print 4 | [ 6, 8, 10]
				 assertEquals(6, equivalenceClass1.canonical());
	 }
	 
	 

}
