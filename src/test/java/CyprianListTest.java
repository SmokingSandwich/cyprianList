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
        assertEquals(1, list.getAt(1));
        assertEquals(2, list.getAt(2));
        assertEquals(3, list.getAt(3));
        assertEquals(4, list.getAt(4));
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
        assertEquals(2, list.getAt(2));
        assertEquals(3, list.getAt(3));
        assertEquals(1, list.getFirst());
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


    @Test
    void shouldDeleteFirst() {
        //given
        CyprianList list = new CyprianList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        //when
        list.deleteFirst();

        //then
        assertEquals(3, list.size());
        assertEquals(2, list.getAt(0));
        assertEquals(3, list.getAt(1));
        assertEquals(4, list.getAt(2));
    }

    //fixme
    //todo check if the elements are in the right order after deletion
    @Test
    void shouldDeleteAt() {
        //given
        CyprianList list = new CyprianList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        //when
        list.deleteAt(2);

        //then
        assertEquals(3, list.size());
        assertEquals(1, list.getAt(0));
        assertEquals(2, list.getAt(1));
        assertEquals(4, list.getAt(3));
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
        assertEquals(3, list.size());
//        assertEquals(1, list.getAt(1));
//        assertEquals(2, list.getAt(2));
//        assertEquals(3, list.getAt(3));
    }

    //todo Add unhappy path for deleting when the list is empty
    //TODO iterator
    //fixme check size adding and subtracting
    //draw it out on a sheet of papaer
}
