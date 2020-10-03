package test.java.CreditCardMask;

import main.java.CreditCardMask.Maskify;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CreditCardMaskTests {
    @Test
    public void testSolution() {
        assertEquals("############5616", Maskify.maskify("4556364607935616"));
        assertEquals("#######5616",      Maskify.maskify(     "64607935616"));
        assertEquals("1",                Maskify.maskify(               "1"));
        assertEquals("",                 Maskify.maskify(                ""));

        // "What was the name of your first pet?"
        assertEquals("##ippy",                                    Maskify.maskify("Skippy")                                  );
        assertEquals("####################################man!",  Maskify.maskify("Nananananananananananananananana Batman!"));
    }
}
