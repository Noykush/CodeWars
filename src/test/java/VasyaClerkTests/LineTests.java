package test.java.VasyaClerkTests;
import static org.testng.Assert.assertEquals;
import main.java.VasyaClerk.Line;
import org.testng.annotations.Test;

public class LineTests {
    @Test
    public void test1() {
        assertEquals("YES", Line.Tickets(new int[] {25,25,25,100,25,25,50,100,25,25,25,100}));
    }
    @Test
    public void test2() {
        assertEquals("NO", Line.Tickets(new int []{100}));
    }
}