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

	public Node previous(T target)
	{
		return previous(target, _head);
	}

	private Node previous(T target, Node n)
	{
		if (n._next == _tail || n._next._data.equals(target)) 
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

	//		public String toString()
	//		{
	//			String str = "";
	//			for(Node current = _head._next; current != _tail; current = current._next)
	//			{
	//				str += current._data;
	//			}
	//			return str;
	//		}

	public void reverse()
	{
		if(isEmpty()) return;

		Node firstHolder = last();
		reverse(last(), previous(last()._data));
		_head._next = firstHolder;
	}

	private void reverse(Node last, Node prev)
	{
		last._next = prev;
		prev._next = _tail;
		if (prev == _head._next) return;
		reverse(last(), previous(prev._data));
	}
}
