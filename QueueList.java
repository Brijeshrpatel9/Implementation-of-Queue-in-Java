public class QueueList 
{
	    ListItem front;
	    ListItem back;
	    int size;
	    QueueList() 
	    {
	        front = back = null;
	        size = 0;
	    }
	    public void enqueue(Object x) 
	    {
	        if (isEmpty())
	           front = back = new ListItem(x,null);
	        else 
	        {
	            back.next = new ListItem(x,null);
	            back = back.next;
	        }
	        size++;
	        System.out.println("Element " + x + " is inserted at rear.");
	    	System.out.println();
	    }
	    public Object dequeue() 
	    {
	        if (isEmpty())
	           return null;
	        else 
	        {
	           Object first = front.item;
	           front = front.next;
	           if (front == null)
	              back = null;
	           System.out.println("\nElement " + first + " is deleted from front.");
		       System.out.println();

	           size--;
	           return first;
	        }
	    }
	    public Object peek() 
	    {
	        if (isEmpty())
	           return null;
	        else
	           return front.item;
	    }
	    public boolean isEmpty() 
	    {
	        return (front == null);
	    }
	    public String toString() 
	    {
	        if (isEmpty())
	           return "empty queue";
	        else
	           return " " + front;
	    }
	    public static void main(String argv[])
	    {
	    	QueueList ql = new QueueList();
	    	ql.enqueue(10);
	    	ql.enqueue(12);
	    	ql.enqueue(50);
	    	ql.enqueue(46);
	    	ql.enqueue(63);
	    	//ql.toString();
	    	System.out.print("Size of the Queue: " + ql.size);
	    	System.out.println();
	    	
	    	System.out.println();
	    	System.out.print("Queue:"+ ql);
	    	System.out.println();
	    	ql.dequeue();
	    	System.out.print("Queue:"+ ql);
	    	System.out.println();
	    	ql.dequeue();
	    	//ql.dequeue();
	    	System.out.print("Queue:"+ ql);
	    	System.out.println();
	    	System.out.println();
	    	
	    	System.out.print("Size of the Queue: " + ql.size);
	    	
	    	System.out.println();
	    	System.out.println();
	    	
	    	System.out.print("Is Queue empty?: " + ql.isEmpty());
	    	
	    	
	    }
	}


