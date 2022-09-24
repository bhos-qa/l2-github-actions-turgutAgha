import static org.junit.jupiter.api.Assertions.*;

public class Test {

    Main main = new Main();

    void testStringLength(){
        assertEquals("The length of the word 'TEsting1241' is 11", Main.stringLength("TEsting1241"));
    }
}
