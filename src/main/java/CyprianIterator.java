public class CyprianIterator {

    MyNode current;

    public CyprianIterator(MyNode first) {
        current = first;
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
