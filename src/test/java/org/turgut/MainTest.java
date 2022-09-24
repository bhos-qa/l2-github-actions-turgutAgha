package org.turgut.
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    Main main = new Main();

    @Test
    void testStringLength(){
        assertEquals("The length of the word 'TEsting1241' is 12", Main.stringLength("TEsting1241"));
    }
}
