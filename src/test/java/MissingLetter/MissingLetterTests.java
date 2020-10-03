package test.java.MissingLetter;

import main.java.MissingLetter.Kata;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MissingLetterTests {
    @Test
    public void exampleTests() {
        assertEquals('e', Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
