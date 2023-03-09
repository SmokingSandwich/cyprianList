import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CyprianListTest {

    @Test
    void shouldAddFirst() {
        //given
        CyprianList list = new CyprianList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        //when
        list.addFirst(50);

        //then
        assertEquals(50, list.getFirst());
    }

    @Test
    void shouldAddAt() {
        //given
        CyprianList list = new CyprianList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        //when
        list.addAt(10,1);

        //then
        assertEquals(10, list.getAt(1));
        assertEquals(1, list.getAt(0));
        assertEquals(1, list.getFirst());
    }

    //todo
    @Test
    void shouldAddLast() {
        //given
        CyprianList list = new CyprianList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        //when
        list.addLast(50);

        //then
        assertEquals(50, list.getLast());
        assertEquals(50, list.getAt(3));
    }

    @Test
    void shouldGetFirst() {
        //given
        CyprianList list = new CyprianList();

        //when
        list.addLast(10);
        list.addLast(2);
        list.addLast(3);

        //then
        assertEquals(10, list.getFirst());
        assertEquals(10, list.getAt(0));
        assertEquals(2, list.getAt(1));
        assertEquals(3, list.getAt(2));
    }

    //redundant
    @Test
    void shouldGetAtIndex() {
        //given
        CyprianList list = new CyprianList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        //when
        Object returned = list.getAt(1);

        //then
        assertEquals(2, returned);
    }

    @Test
    void shouldGetLast() {
        //given
        CyprianList list = new CyprianList();

        //when
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        //then
        assertEquals(4, list.getLast());
    }

    //todo
    @Test
    void shouldDeleteFirst() {
        //given
        CyprianList list = new CyprianList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        //when
        list.deleteLast();

        //then
        assertEquals(3, list.getListSize().size());
    }

    //fixme
    //todo check if the elements are in the right order after deletion
    @Test
    void shouldDeleteAt() {
        CyprianList list = new CyprianList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.deleteAt(2);

        list.getListSize();
    }

    //fixme
    @Test
    void shouldDeleteLast() {
        //given
        CyprianList list = new CyprianList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        //when
        list.deleteLast();

        //then
        assertEquals(3, list.getListSize().size());
//        assertEquals(1, list.getAt(1));
//        assertEquals(2, list.getAt(2));
//        assertEquals(3, list.getAt(3));
    }
}
