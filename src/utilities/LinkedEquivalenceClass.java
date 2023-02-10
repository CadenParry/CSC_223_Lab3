package utilities;
import java.util.Comparator;

<<<<<<< Updated upstream

import java.util.Comparator;

<<<<<<< HEAD
    private T canonical;
    private Comparator<T> comparator;
    private LinkedList<T> rest;

    public LinkedEquivalenceClass(Comparator<T> comparator) {
        this.comparator = comparator;
        rest = new LinkedList<>();
    }

    public T canonical() {
        return canonical;
    }

    public boolean isEmpty() {
    	//true if canonical and rest are both empty
        return canonical == null && rest.isEmpty();
    }

    public void clear() {
    	//clear both null and rest
        canonical = null;
        rest.clear();
    }

    public void clearNonCanonical() {
    	//clear the rest
        this.rest.clear();
    }

    public int size() {
    	//size = rest size plus the canonical element
        return rest.size() + 1;
    }

    public boolean add(T element) {
    	//check if canonical exist
        if (canonical == null) {
        	//if it does not then element is the new canonical
            canonical = element;
            return true;
        }
        //check if element belongs to the canonical
        if (comparator.compare(canonical, element) == 0) {
        	rest.addToBack(element);
        	return true;
        }
        return false;
       
    }

    public boolean contains(T target) {
    	//canonical does not exist
        if (canonical == null) {
            return false;
        }
        //if it exist, check if canonical is comparator to target
        if (comparator.compare(canonical, target) == 0) {
            return true;
        }
        //check if target is contained in the rest
        return rest.contains(target);
    }

    public boolean belongs(T target) {
        if (canonical == null) {
            return false;
        }
        //canonical compared to the target
        return comparator.compare(canonical, target) == 0;
    }

    public boolean remove(T target) {
        if (canonical == null) {
            return false;
        }
        //check if the target is the canonical 
        if (canonical.equals(target)) {
        	//call for removeCanonical method to remove the canonical
            removeCanonical();
            return true;
        }
        //remove it from the rest of the body
        return rest.remove(target);
    }

    public boolean removeCanonical() {
    	//while canonical is not null
    	if (canonical != null) {
    		//set the canonical equal to first element of the LinkedList
    		canonical = rest._head._next._data;
    		return true;
    	}
    	return false;
    }
    

    public boolean demoteAndSetCanonical(T element) {
        if (contains(element)) {
        	//save the previous canonical
            T prev_Can = canonical;
          //set the new element equal to canonical
            canonical = element;
            //add the removed canonical to the rest
            add(prev_Can);

            return true;
        }
        return false;
    }

    public String toString() {
    	return canonical + " | " + rest.toString();
    }
=======
import java.util.ArrayList;
import java.util.Comparator;

public class LinkedEquivalenceClass<T> {
	protected T _canonical;
	protected Comparator<T> _comparator;
	protected  LinkedList<T> _rest;
	
	public LinkedEquivalenceClass(Comparator<T> element){
		_comparator = element;
	}
	public T canonical() {return _canonical;}
	public boolean isEmpty() {return _rest.isEmpty();}
	public void clear() {_rest.clear();}
	public void clearNonCanonical() {
		
		}
	public int size() {return _rest._size;}
	
	public boolean add(T element) {
		if(_comparator.compare(_canonical, element)==0) {
			if(!(_rest.contains(element))) {
				_rest.addToBack(element);
				return true;
			}
		}
		return false;
		}
	public boolean contains(T target) {
		return false;}
	public boolean belongs(T target) {
		if(_comparator.compare(_canonical, target)==0)
			return true;
		return false;}
	public boolean remove(T target) {
		return false;}
	public boolean removeCanonical() {
		return false;}
	public boolean demoteAndSetCanonical(T element) {
		return false;}
	public String toString() {
		return null;}
	
	
>>>>>>> Stashed changes
=======
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
>>>>>>> 4e6ec264c3f5fcba1c058663907c1d0539fd5095
}


