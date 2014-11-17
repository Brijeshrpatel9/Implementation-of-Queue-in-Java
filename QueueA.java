public interface QueueA {
     
    // return the size of the queue
    public void size();
     
    public boolean isEmpty();
     
    public boolean isFull();
     
    // insert an element into the queue 
    public void enqueue(Object obj) throws QueueFullException;
     
    // removes an element from the queue 
    public void dequeue() throws QueueEmptyException; 
    
    public void display();
 
}
