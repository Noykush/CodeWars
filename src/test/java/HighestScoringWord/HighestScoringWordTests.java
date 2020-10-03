package test.java.HighestScoringWord;

import main.java.HighestScoringWord.Kata;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HighestScoringWordTests {
    @Test
    public void sampleTests() {
        assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
        assertEquals("volcano", Kata.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", Kata.high("take me to semynak"));
    }
}
