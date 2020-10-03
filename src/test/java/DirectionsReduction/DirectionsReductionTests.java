package test.java.DirectionsReduction;
import main.java.DirectionsReduction.DirReduction;
import org.testng.annotations.Test;
import java.util.ArrayList;
import static org.testng.Assert.assertEquals;


public class DirectionsReductionTests {
    @Test
    public void testSimpleDirReduc() {
        assertEquals(DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}),
                new String[]{"WEST"});
        assertEquals(DirReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}),
                new String[]{});
    }
}
