public class MyNode {
    //List element
    private Object data;

    //Link to the next node in the list
    MyNode next;

    //Constructor which takes an int value which is stored as the data in this object
    MyNode(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
