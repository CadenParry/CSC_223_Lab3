package utilities;

import java.util.Comparator;
import java.util.List;

public class EquivalenceClasses <T> {
	
	private Comparator<T> 						_comparator;
	private List <LinkedEquivalenceClass<T>>	_classes;
	
	public EquivalenceClasses (Comparator<T> comp)
	{
		_comparator = comp;
		_classes = new List <LinkedEquivalenceClass<T>> (_comparator);
		
	}
	
	public boolean add (T element)
	{
		
	}
	
	public boolean contains (T target)
	{
		
	}
	
	public int size()
	{
		
	}
	
	public int numClasses()
	{
		
	}
	
	private int indexOfClass(T element)
	{
		
	}
	
	public String toString()
	{
		
	}

	
	
}
