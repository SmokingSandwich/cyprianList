public class CyprianList {
    MyNode head;
    MyNode tail;

    private int size = 0;

//    public CyprianIterator getIterator() {
//    }

    //This method may show wrong size of the list if the connection between elements have been detached
    public int size() {
        return size;
    }

    public void addFirst(Object data) {
        MyNode node = new MyNode(data);
        node.next = head;
        head = node;

        size++;
    }

    public void addAt(Object data, int index) {
        if (index == 0) {
            addFirst(data);
        } else {
            MyNode node = new MyNode(data);
            MyNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public void add(Object data) {
        MyNode node = new MyNode(data);
        if (head == null) {
            head = node;
        } else {
            MyNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public Object getFirst() {
        MyNode current;
        if (head != null) {
            current = head;
        }
        return head.getData();
    }

    public Object getAt(int index) {
        if (index == 0) {
            return head.getData();
        } else {
            MyNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.getData();
        }
    }

    public Object getLast() {
        MyNode current = head;
        for (int i = 0; i < size() - 1; i++) {
            current = current.next;
        }
        return current.getData();
    }

    public boolean deleteFirst() {
        if (head != null) {
            head = head.next;
            size--;
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteAt(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index < size && index > 0) {
            MyNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        else {
            return false;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (size() == 0) {
            return deleteFirst();
        }

        MyNode current = head;
        for (int i = 0; i < size() - 1; i++) {
            current = current.next;
        }
        size--;
        return true;
    }
}
