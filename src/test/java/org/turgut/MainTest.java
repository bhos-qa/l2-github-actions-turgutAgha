package org.turgut;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    Main main = new Main();

    @Test
    void testStringLength(){
        assertEquals("Length of the word 'TEsting1241' is 11", Main.stringLength("TEsting1241"));
    }
}
