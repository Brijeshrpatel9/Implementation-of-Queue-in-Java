
public class QueueList {

 
	    ListItem front;
	    ListItem back;
	    QueueList() {
	        front = back = null;
	    }
	    public void enqueue(Object x) {
	        if (isEmpty())
	           front = back = new ListItem(x,null);
	        else {
	            back.next = new ListItem(x,null);
	            back = back.next;
	        }
	        System.out.println("Element " + x + " is inserted at rear.");
	    }
	    public Object dequeue() {
	        if (isEmpty())
	           return null;
	        else {
	           Object first = front.item;
	           front = front.next;
	           if (front == null)
	              back = null;
	           System.out.println("\nElement " + first + " is deleted from front.");
	           return first;
	        }
	    }
	    public Object peek() {
	        if (isEmpty())
	           return null;
	        else
	           return front.item;
	    }
	    public boolean isEmpty() {
	        return (front == null);
	    }
	    public String toString() {
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
	    	System.out.println();
	    	System.out.print("Queue:"+ ql);
	    	System.out.println();
	    	ql.dequeue();
	    	System.out.println();
	    	System.out.print("Queue:"+ ql);
	    	System.out.println();
	    	ql.dequeue();
	    	//ql.dequeue();
	    	System.out.println();
	    	System.out.print("Queue:"+ ql);
	    	
	    	
	    }
	}


