public class ListItem {
    public Object item;
    public ListItem next;

    ListItem(Object item, ListItem next) {
        this.item = item;
        this.next = next;
    }

    public void setNext(ListItem next) {  this.next = next; }
    public ListItem getNext()          {  return next;      }

    public void setItem(Object item) { this.item = item; }
    public Object getItem()          { return item;      }

    public String toString() {
        if (this.next == null)
           return item.toString();
        else
           return item.toString() + " " + next.toString();
    }
}
