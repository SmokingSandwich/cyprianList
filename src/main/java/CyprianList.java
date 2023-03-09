import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CyprianList {
    MyNode head;
    MyNode tail; //todo

    private int size = 0;

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

    public void addLast(Object data) {
        MyNode node = new MyNode(data);
        if (head == null) {
            head = node;
        } else {
            MyNode n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
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
        tail = head;
        for (int i = 0; i < size() - 1; i++) {
            tail = tail.next;
        }
        return tail.getData();
    }

    //fixme
    public void deleteFirst() {
        MyNode current = head;
        current.next = current.next.next;
        size--;
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            MyNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current.next = current.next.next;
            }
        }
        size--;
    }

    //fixme
    public void deleteLast() {
        MyNode current = head;
        for (int i = 0; i < size() - 1; i++) {
            current.next = current.next.next;
        }
        size--;
    }

    public List<Object> getListSize() {
        List<Object> list;

        MyNode current = head;
        if (current == null) {
            System.out.println("This list is empty !");
            return Collections.emptyList();
        } else {
            list = new LinkedList<>();
            while (current != null) {
                list.add(current);
                current = current.next;
            }
        }
        return list;
    }
}
