import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CyprianListTest {


    //TODO Przeczytać o typach generycznych, jak wskazać dany typ żeby lista go zwracała, porobić przykłady takich list<>
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

//    @Test
//    void shouldGoThroughAllElements2() {
//        //given
//        CyprianList list = new CyprianList<Foo>();
//        list.add(new Foo());
//        list.add(new Foo());
//
//
//        //when
//        CyprianIterator iterator = list.getIterator();
//        while (iterator.hasNext()) {
//            Foo znaleziona = iterator.next();
//            znaleziona.poka();
//        }
//    }
}
