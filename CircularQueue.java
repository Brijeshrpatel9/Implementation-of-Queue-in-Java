
public class CircularQueue implements QueueA{
	
	private int capacity;
	private int front = 0;
	private int rear = 0;
	private Object Array[];
	private int N;
	
	public CircularQueue(int capacity)
	{
		N = capacity;
		Array = new Object[N];
	}
	
	public void size()
	{
		int size;
		if(rear > front)
			size = rear - front;
		else
			size = N - front + rear;
		System.out.println("Size of the Queue: " + size + "\n");
	}
	
	public boolean isEmpty()
	{
		return (front == rear);
	}
	
	public boolean isFull()
	{
		int diff = rear - front;
		if(diff == -1 || diff == N -1)
			return true;
		return false;
	}
	
	public void enqueue(Object element)
	{
		if(isFull())
			throw new QueueFullException("Overflow! Queue is full. ");
		else
		{
			Array[rear] = element;
			rear = (rear + 1) % N;
		}
		System.out.println("Add Element: " + element + "\n");
	}
	
	public void dequeue()
	{
		Object item;
		if(isEmpty())
			throw new QueueEmptyException("Underflow! Queue is Empty. ");
		else
		{
			item = Array[front];
			Array[front] = null;
			front = (front + 1) % N;
		}
		//return item;
		System.out.println("Remove Element: " + item + "\n");
	}
	
	public void display()
	{
		System.out.println("Elements of Queue: ");
		int i = front;
		
		while( i != rear)
		{
			System.out.println(Array[i]);
			i = (i + 1) % N;
		}
		System.out.println("\n");
	}
	
	public static void main(String argv[])
	{
		QueueA queue = new CircularQueue(5);
	       //queue.dequeue();        It throws queue empty exception.
	       queue.enqueue("A");
	       queue.enqueue("B");
	       queue.enqueue("C");
	       queue.enqueue("D");
	       //queue.enqueue("E");
	       queue.display();
	   
	       queue.size();
	       queue.dequeue();
	       queue.enqueue("E");
	       queue.display();
	       queue.size();
	       //System.out.println(queue.size());
	       //queue.enqueue("F");     It throws size full exception
	       queue.dequeue();
	       queue.size();
	       //System.out.println(queue.dequeue());
	       //System.out.println(queue.size());
	}

}
