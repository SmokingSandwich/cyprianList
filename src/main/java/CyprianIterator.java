public class CyprianIterator {

    MyNode current;

    public CyprianIterator(MyNode current) {
        this.current = current;
    }

    public boolean hasNext() {
        return current != null;
    }

    public Object next() {
        MyNode temp = current;
        current = current.next;
        return temp.getData();
    }
}
