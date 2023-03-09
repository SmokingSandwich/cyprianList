public class Runner {
    public static void main(String[] args) {
        CyprianList list = new CyprianList();
        list.addLast(10);
//        list.showList();
//        list.addFirst(150);
//        list.addFirst(150);
        list.addFirst(150);
//        System.out.println("List size: " + list.size);
        list.addAt(2, 1);
//        list.showList();

//        System.out.println("List size: " + list.size);
//        list.deleteAt(2); //
//        System.out.println("List size: " + list.size);
        list.deleteLast();
//        System.out.println("List size: " + list.size);
    }
}