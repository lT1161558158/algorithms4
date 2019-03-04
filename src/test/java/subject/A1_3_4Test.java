package subject;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class A1_3_4Test {

    @Test
    public void parentheses() {
        Assert.assertTrue(A1_3_4.parentheses("[()]{}{[()()]()}"));
        Assert.assertFalse(A1_3_4.parentheses("[()]{}{[()()]()"));
        Assert.assertFalse(A1_3_4.parentheses("[()]{}{[()()])}"));

    }
}