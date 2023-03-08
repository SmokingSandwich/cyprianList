public class CyprianList {
    CustomNode head;
    CustomNode tail; //todo

    int size = 0;

    public int size() {
        return size;
    }

    // The default method adding a new element at the end of the list
    public void add(int data) {
        CustomNode node = new CustomNode(data);
        if (head == null) {
            head = node;
        } else {
            CustomNode n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        size++;
    }


    // Method used for adding an element at the beginning of the list
    public void addFirst(int data) {
        CustomNode node = new CustomNode(data);
        node.next = head;
        head = node;

        size++;
    }

     // Method used for adding an element at the specific index of the list
    public void addAt(int data, int index) {
        //If we pass an index indicating the start of the list we use the existing method
        if (index == 0) {
            addFirst(data);
        } else {
            CustomNode node = new CustomNode(data);

            CustomNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    //TODO add methods to delete the last and first element of the list



    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            CustomNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current.next = current.next.next;
            }
        }
        size --;
    }

//    //Delete the last element of the list
//    public void delete() {
//        CustomNode current = head;
//        if (current != null) {
//            for (int i = 0; i < )
//        }
//    }

//    public void deleteFirst


    public void showList() {
        CustomNode current = head;
        if (current == null) {
            System.out.println("This custom list is empty");
        } else {
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }
}
