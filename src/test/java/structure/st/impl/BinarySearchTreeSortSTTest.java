package structure.st.impl;

import org.junit.Test;
import structure.st.SortST;

import static org.junit.Assert.*;

public class BinarySearchTreeSortSTTest {
    @Test
    public void test(){
        SortST<Integer,Integer> sortST=new BinarySearchTreeSortST<>();
        for (int i = 0; i < 10; i++) {
            sortST.put(i,i);
        }
        for (int i = 0; i < 10; i++) {
            sortST.put(i,i);
        }
        for (int i = 0; i < 10; i++) {
            assertEquals(sortST.get(i),new Integer(i));
        }
        assertEquals(sortST.size(),10);
        assertEquals(sortST.min(),new Integer(0));
        assertEquals(sortST.max(),new Integer(10-1));
        assertEquals(sortST.floor(3),new Integer(3));
        assertNull(sortST.floor(-1));
        assertEquals(sortST.floor(10),new Integer(9));
        assertEquals(sortST.floor(9),new Integer(9));


    }

}