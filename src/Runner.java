public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CyprianList list = new CyprianList();
        list.add(10); //1
        System.out.println("List size: " + list.size);
        list.addFirst(150); //191 12 43
        System.out.println("List size: " + list.size);
//        list.addAt(2, 2222); //191 12 2222 43 //fixme
//        System.out.println("List size: " + list.size);
//        list.deleteAt(2); //191 12 43
//        System.out.println("List size: " + list.size);

        list.showList();
    }
}