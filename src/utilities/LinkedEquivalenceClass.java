package utilities;

import java.util.Comparator;

public class LinkedEquivalenceClass <T> 
{
	protected T _canonical;
	protected Comparator<T> _comparator;
	protected LinkedList<T> _rest;

	public LinkedEquivalenceClass(Comparator<T> comparator)
	{
		
	}
	
	public T canonical()
	{
		return null;
	}
	
	public boolean isEmpty()
	{
		return false;
	}
	
	public void clear()
	{
		return;
	}
	
	public void clearNonCanonical()
	{
		return;
	}
	
	public int size()
	{
		return -1;
	}
	
	public boolean add(T element)
	{
		return false;
	}
	
	public boolean contains(T target)
	{
		return false;
	}
	
	public boolean belongs(T target)
	{
		return false;
	}
	
	public boolean remove(T target)
	{
		return false;
	}
	
	public boolean removeCanonical()
	{
		return false;
	}
	
	public boolean demoteAndSetCanonical(T element)
	{
		return false;
	}
	
	public String toString()
	{
		return null;
	}	
}
