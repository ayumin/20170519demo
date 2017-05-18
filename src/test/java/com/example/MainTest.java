import static junit.api.Assertions.assertEquals;

import junit.api.Test;

public class MainTest {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        // MyClass tester = new MyClass(); // MyClass is tested

        // assert statements
        assertEquals("10 x 0 must be 0", 0, 10);
        assertEquals("0 x 10 must be 0", 0, 0);
        assertEquals("0 x 0 must be 0", 0, 0);
    }
}