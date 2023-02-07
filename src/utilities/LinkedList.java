package utilities;

import utilities.LinkedList.Node;

public class LinkedList<T>
{
	protected Node 	_head;
	protected Node	_tail;
	protected int 	_size;

	final class Node
	{
		public T 	_data;
		public Node _next;

		public Node() 
		{
			this(null, null);
		}

		public Node(T data, Node next) 
		{
			_data = data;
			_next = next;
		}
	}

	public LinkedList()
	{
		init();
	}

	private void init()
	{
		_head = new Node(null, null);
		_tail = new Node(null, null);
		_head._next = _tail;

		_size = 0;
	}

	public boolean isEmpty()
	{
		return _size == 0;
	}

	public void clear()
	{
		init();
	}

	public int size()
	{
		return _size;
	}

	public void addToFront(T element)
	{
		if(element == null) return;
		_head._next = new Node(element, _head._next);
		_size += 1;
	}

	public boolean contains(T target)
	{
		return contains(target, _head._next);
	}

	private boolean contains(T target, Node n)
	{
		if(n == _tail) return false;
		if(n._data.equals(target)) return true;
		return contains(target, n._next);
	}

	//change to private
	public Node previous(T target)
	{
		return previous(target, _head);
	}

	private Node previous(T target, Node n)
	{
		if (n._next == _tail || n._next._data == target) 
		{
			return n != _tail ? n : null;
		}
		return previous(target, n._next);
	}

	public boolean remove(T target)
	{
		if(isEmpty())return false;

		Node n = previous(target);
		n._next = n._next._next;
		_size -= 1;
		return true;
	}

	public Node last()
	{
		if(isEmpty()) return _head;

		Node n = _head._next;
		while (n._next != _tail) 
		{
			n = n._next;
		}
		return n;
	}

	public void addToBack(T element)
	{
		Node n = last();
		n._next = new Node(element, _tail);
		_size += 1;
	}

	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node node = _head._next;
		while (node != _tail) 
		{
			sb.append(node._data.toString());
			sb.append(", ");
			node = node._next;
		}
		if (_size > 0) 
		{
			sb.delete(sb.length()-2, sb.length());
		}
		sb.append("]");
		return sb.toString();
	}
	
	public void reverse()
	{
		if(isEmpty() || size() == 1) return;
		
		//points the end of the new LL to _tail
		reverse(_head._next, _head, _head._next, _head._next._next)._next = _tail;
	}

	private Node reverse(Node pointToTail, Node prev, Node curr, Node next)
	{
		//reverse operation
		curr._next = prev;
		
		if(next == _tail)
		{
			//points the head to the new beginning of the LL
			_head._next = curr;
			return pointToTail;
		}

		return reverse(pointToTail, curr, next, next._next);
	}
	
//	public void reverse()
//	{
//		if(isEmpty() || size() == 1) return;
//		
//		Node lastValid = _head._next;
//		
//		//head points to the returned (new first) node
//		_head._next = reverse(_head, _head._next, _head._next._next);
//		
//		
//		lastValid._next = _tail;
//		
//	}
//
//	private Node reverse(Node prev, Node curr, Node next)
//	{
//		curr._next = prev;
//		
//		if(next == _tail) return curr;
//
//		return reverse(curr, next, next._next);
//	}
	
	
}
