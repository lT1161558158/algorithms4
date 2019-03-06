package util;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisualAccumulatorTest {
    @Test
    public void test() {
        int count=2*1000;
        VisualAccumulator visualAccumulator = new VisualAccumulator(count, 1.0);
        for (int i = 0; i < count; i++) {
            visualAccumulator.addDataValue(StdRandom.random());
        }
        StdOut.println(visualAccumulator);
    }
}