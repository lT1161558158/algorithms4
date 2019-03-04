package structure.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class FixedCapacityStackOfStringsTest {

    @Test
    public void test() {
        int max=4;
        FixedCapacityStackOfStrings fixedCapacityStackOfStrings=new FixedCapacityStackOfStrings(max);
        assertTrue(fixedCapacityStackOfStrings.isEmpty());
        assertFalse(fixedCapacityStackOfStrings.isFull());
        for (int i = 0; i < max; i++) {
            fixedCapacityStackOfStrings.push(i+"");
            assertEquals(fixedCapacityStackOfStrings.size(), i+1);
        }
        assertFalse(fixedCapacityStackOfStrings.isEmpty());
        assertTrue(fixedCapacityStackOfStrings.isFull());
        for (int i=max;i>0;i--){
            String pop = fixedCapacityStackOfStrings.pop();
            assertEquals(fixedCapacityStackOfStrings.size(), i-1);
            assertEquals((i-1)+"",pop);
        }
        assertFalse(fixedCapacityStackOfStrings.isFull());
        assertTrue(fixedCapacityStackOfStrings.isEmpty());
    }
    @Test
    public void test2(){
        String in="it was - the best - of times - - - it was - the - -";
        FixedCapacityStackOfStrings fixedCapacityStackOfStrings=new FixedCapacityStackOfStrings(10);
        String[] s = in.split(" ");
        StringBuilder builder=new StringBuilder();
        for (String s1 : s) {
            if (s1.equals("-")){
                builder.append(fixedCapacityStackOfStrings.pop()).append(" ");
            }else{
                fixedCapacityStackOfStrings.push(s1);
            }
        }
        System.out.println(builder);
    }
}