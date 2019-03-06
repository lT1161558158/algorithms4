package structure.impl;

import org.junit.Test;
import structure.st.ST;
import structure.st.impl.SequentialSearchST;

import java.util.Iterator;

import static org.junit.Assert.*;

public class SequentialSearchSTTest {
    @Test
    public void test(){

        ST<String,Integer> sss=new SequentialSearchST<>();
        assertTrue(sss.isEmpty());
        sss.put("1",1);
        assertFalse(sss.isEmpty());
        assertTrue(sss.contains("1"));
        assertEquals( sss.get("1"),new Integer(1));
        sss.delete("1");
        assertTrue(sss.isEmpty());
        int count=10;
        for (int i = 0; i < count; i++) {
            sss.put(""+i,i);
        }
        assertFalse(sss.isEmpty());
        assertEquals(sss.size(),count);
        Iterator<String> keys = sss.keys();
        int tempCount=0;
        while (keys.hasNext()){
            keys.next();
            tempCount++;
        }
        assertEquals(tempCount,count);

    }

}