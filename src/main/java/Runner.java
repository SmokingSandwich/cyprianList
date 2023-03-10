public class Runner {
    public static void main(String[] args) {
        CyprianList list = new CyprianList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        CyprianList returnedList = list.returnAllObjectsFromList();
        for (int i = 0; i < returnedList.size(); i++) {
            System.out.println(returnedList.getAt(i));
        }
    }
}