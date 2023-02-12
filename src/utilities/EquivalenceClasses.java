package utilities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EquivalenceClasses <T> {
	
	protected Comparator<T> 						_comparator;
	protected List <LinkedEquivalenceClass<T>>		_classes;
	
	public EquivalenceClasses (Comparator<T> comp)
	{
		_comparator = comp;
		_classes = new ArrayList <LinkedEquivalenceClass<T>> ();
		
	}
	
	public boolean add(T element)
	{
		if (contains(element)) return false;
		// todo
		return false;
	}
	
	public boolean contains (T target)
	{
		if (target == null) return false;
		for (LinkedEquivalenceClass<T> list : _classes)
		{
			if (list.contains(target)) return true;
		}
		
		return false;
	}
	
	public int size()
	{
		int size = 0;
		for (LinkedEquivalenceClass<T> list : _classes)
		{
			size += list.size();
		}
		return size;
	}
	
	public int numClasses()
	{
		return _classes.size();
	}
	
	protected int indexOfClass(T element)
	{
		for (int i = 0; i < _classes.size(); i++)
		{
			if (_classes.get(i).equals(element)) return i;
		}
		return -1;
	}
	
	public String toString()
	{
		String fin = "";
		for (LinkedEquivalenceClass<T> list : _classes)
		{
			fin += list.toString() + "/n";
			
		}
		return fin;
	}

	
	
}
