package test.java.PlayingWithDigits;

import main.java.PlayingWithDigits.DigPow;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PlayingWithDIgitsTests {
    @Test
    public void Test1() {
        Assert.assertEquals(1, DigPow.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, DigPow.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, DigPow.digPow(46288, 3));
    }
}
