import java.util.NoSuchElementException;


class Node
{
	protected int data;
	protected Node next;
	
	public Node()
	{
		data = 0;
		next = null;
	}
	public Node(int d, Node n)
	{
		data = d;
		next = n;
	}
}

class Deque
{
	protected int size;
	protected Node front, rear;
	
	public Deque()
	{
		front = null;
		rear = null;
		size = 0;
	}
	public boolean isEmpty()
	{
		return front == null;
	}
	public int getSize()
	{
		return size;
	}
	
	public void clear()
	{
		front = null;
		rear = null;
		size = 0;
	}
	
	public void insertAtFront(int val)
	{
		Node temp = new Node(val, null);
		size++;
		if(front == null)
		{
			front = temp;
			rear = front;
		}	
		else
		{
			temp.next = front;
			front = temp;
		}
		System.out.println("Insert at Front: " + val + "\n");
	}
	
	public void insertAtRear(int val)
	{
		Node temp = new Node(val,null);
		size++;
		if(rear == null)
		{
			rear = temp;
			front = rear;
		}
		else
		{
			rear.next = temp;
			rear = temp;
		}
		System.out.println("Insert at Rear: " + val + "\n");
	}
	
	public void removeAtFront()
	{
		if(isEmpty())
			throw new NoSuchElementException("Undeflow! Queue is Empty.");
		Node temp = front;
		front = front.next;
	
		if(front == null)
			rear = null;
		
		size--;
		int element = temp.data;
		System.out.println("Remove at Front: "+ element + "\n");
	}
	
	public void removeAtRear()
	{
		if(isEmpty())
			throw new NoSuchElementException("Underflow! Queue is Empty. ");
		int ele = rear.data;
		Node t = front;
		Node s = front;
		while(s!= rear)
		{
			t = s;
			s= s.next;
		}
		rear = t;
		rear.next = null;
		
		size--;
		System.out.println("Remove at Rear: " + ele + "\n");
	}
	
	public void peekAtFront()
	{
		if(isEmpty())
			throw new NoSuchElementException("Underflow! Queue is Empty. ");
		System.out.println("Peek front element: "+ front.data+ "\n"); 
	}
	public void peekAtRear()
	{
		if(isEmpty())
			throw new NoSuchElementException("Underflow! Queue is Empty. ");
		System.out.println("Peek rear element: "+ rear.data + "\n");
	}
	
	public void display()
	{
		System.out.println("Elements of Queue are: ");
		if(size == 0)
		{	
			System.out.println("Queue is Empty.");
			return;
		}
		Node temp = front;
		
		while( temp != rear.next)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
}

public class DoubleEndedQueue {

	public static void main(String argv[])
	{
		Deque dq = new Deque();
		System.out.println("Deque example \n");
		dq.insertAtFront(82);
		dq.insertAtFront(93);
		dq.insertAtRear(61);
		dq.insertAtRear(33);
		dq.display();
		System.out.println("Size of the Queue is " + dq.getSize());
		dq.removeAtFront();
		dq.display();
		dq.removeAtRear();
		dq.display();
		dq.peekAtFront();
		dq.peekAtRear();
		dq.display();
		
	}
}
