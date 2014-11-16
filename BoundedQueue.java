
public class BoundedQueue {

	protected Object rep[];
	protected int count = 0;
	protected int front = 0;
	protected int rear = 0;
	protected int size = 0;
	
	public BoundedQueue(int size)
	{
		if(size > 0)
			this.size = size;
		rep = new Object[size];
		
	}
	
	
	public boolean isEmpty()
	{
		return (count == 0);
	}
	public boolean isFull()
	{
		return (count == size);
	}
	public int getSize()
	{
		return count;
	}
	
	public void enqueue(Object e)
	{
		if(e!= null && !isEmpty())
			rear++;
			//System.out.println(rear);
			if(rear >= size)
				rear = 0;
			
			rep[rear] = e;
			count++;
			System.out.println("Elemnet "+ e +" is added at rear.");
	}
	
	public Object dequeue()
	{
		Object result = null;
		if(count!= 0)
			
			result = rep[front];
			rep[front] = null;
			front++;
			if(front >= size)
				front = 0;
			count--;
			System.out.println("Elemnet "+ result +" is poped from front.");	
		return result;
	}
	public void display()
	{		
			System.out.println();
			System.out.println("Elements of Queue: ");
			int i = front;
			//System.out.println(rep[front]);
			while( i != rear + 1)
			{
				System.out.println(rep[i]);
				i = (i + 1) % size;
			}
			System.out.println("\n");
		
	}
	
	
	public static void main(String argv[])
	{
		BoundedQueue bq = new BoundedQueue(10);
		
		
		bq.enqueue(25);
		bq.enqueue(50);
		bq.enqueue(14);
		bq.enqueue(63);
		bq.enqueue(89);
		bq.enqueue(8);
		bq.display();
		bq.dequeue();

		bq.display();
		bq.dequeue();
		bq.dequeue();
		bq.display();
		
		/*for(int i = 0; !bq.isFull(); i++)
		{	bq.enqueue(new Integer(i));
			System.out.println("Enqueue: " + i);
		}	
		System.out.println(" ");
		while(!bq.isEmpty())
			System.out.println("Dequeue: " + bq.dequeue());
			*/
	}
	
	

}

