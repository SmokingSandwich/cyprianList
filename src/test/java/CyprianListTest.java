import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CyprianListTest {

    //TODO Przeczytać o typach generycznych, jak wskazać dany typ żeby lista go zwracała, porobić przykłady takich list<> (kilkanaście)
    //TODO new CyprianList<Foo>(); i ma zwracać ten typ

    @Test
    void shouldAddFirst() {
        //given
        CyprianList list = new CyprianList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //when
        list.addFirst(50);

        //then
        assertEquals(50, list.getFirst());
        assertEquals(1, list.getAt(1));
        assertEquals(2, list.getAt(2));
        assertEquals(3, list.getAt(3));
        assertEquals(4, list.getAt(4));
    }

    @Test
    void shouldAddAt() {
        //given
        CyprianList list = new CyprianList();
        list.add(1);
        list.add(2);
        list.add(3);

        //when
        list.addAt(10, 1);

        //then
        assertEquals(10, list.getAt(1));
        assertEquals(1, list.getAt(0));
        assertEquals(2, list.getAt(2));
        assertEquals(3, list.getAt(3));
        assertEquals(1, list.getFirst());
    }

    @Test
    void shouldGetFirstAndLast() {
        //given
        CyprianList list = new CyprianList();

        //when
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //then
        assertEquals(1, list.getFirst());
        assertEquals(4, list.getLast());
    }

    @Test
    void shouldDeleteFirst() {
        //given
        CyprianList list = new CyprianList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //when
        boolean isDeleted = list.deleteFirst();

        //then
        assertEquals(3, list.size());
        assertEquals(2, list.getAt(0));
        assertEquals(3, list.getAt(1));
        assertEquals(4, list.getAt(2));
        assertTrue(isDeleted);
    }

    @Test
    void shouldDeleteAt() {
        //given
        CyprianList list = new CyprianList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //when
        list.deleteAt(2);

        //then
        assertEquals(3, list.size());
        assertEquals(1, list.getAt(0));
        assertEquals(2, list.getAt(1));
        assertEquals(4, list.getAt(2));
    }

    @Test
    void shouldDeleteLast() {
        //given
        CyprianList list = new CyprianList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //when
        boolean isDeleted = list.deleteLast();

        //then
        assertEquals(3, list.size());
        assertEquals(1, list.getAt(0));
        assertEquals(2, list.getAt(1));
        assertEquals(3, list.getAt(2));
        assertTrue(isDeleted);
    }

    @Test
    void shouldNotDeleteFirst() {
        //given
        CyprianList list = new CyprianList();

        //when
        boolean isDeleted = list.deleteFirst();
        boolean isLastDeleted = list.deleteLast();

        //then
        assertEquals(0, list.size());
        assertFalse(isDeleted);
        assertFalse(isLastDeleted);
    }

    @Test
    void shouldNotDeleteAtWrongIndex() {
        //given
        CyprianList list = new CyprianList();

        //when
        boolean isDeleted = list.deleteAt(1);
        boolean isNegativeDeleted = list.deleteAt(-1);

        //then
        assertFalse(isDeleted);
        assertFalse(isNegativeDeleted);
        assertEquals(0, list.size());
    }

    @Test
    void shouldNotDeleteLast() {
        //given
        CyprianList list = new CyprianList();

        //when
        boolean isDeleted = list.deleteLast();

        //then
        assertEquals(0, list.size());
        assertFalse(isDeleted);
    }

    @Test
    void shouldGoThroughAllElements() {
        //given
        CyprianList list = new CyprianList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //when
        CyprianIterator iterator = list.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    void shouldGoThroughAllElements2() {
        //given
        CyprianList<Foo> list = new CyprianList<>();
        list.add(new Foo());
        list.add(new Foo());

        String stringToAdd = new String("Hello");
        list.add(stringToAdd);

            // todo - We can't do this because the iterator.next() method returns Object
//            Foo znaleziona = iterator.next();
//            znaleziona.poka();
    }

    @Test
    void shouldReturnListOfGivenType() {
        Foo foo = new Foo();

        CyprianList<Foo> cyprianList = new CyprianList<>();
        cyprianList.add(foo);
    }

    @Test
    void shouldFailToAddToList() {
        Foo foo = new Foo();
        Integer integer = 0;
        String name = "Mark";

        CyprianList<Foo> cyprianList = new CyprianList<>();
        cyprianList.add(integer);
        cyprianList.add(name);
        cyprianList.add(foo);

        CyprianList<Foo> list2 = new CyprianList();
        list2.add("First");
        list2.add(2);

//        List<Integer> list = new LinkedList<>();
//        list.add(2.3);

//        CyprianList<Animal> animalList = new CyprianList<>();
//        animalList.add(new Cat());
//        animalList.add(new Foo());
    }

    @Test
    void shouldFail() {

    }
}
