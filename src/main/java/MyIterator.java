import java.util.Iterator;

public class MyIterator implements Iterator<MyNode> {

    MyNode current;

    public MyIterator(MyNode first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public MyNode next() {
        MyNode temp = current;
        current = current.next;
        return temp;
    }
}
