import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledTests {
    @Test
    @Disabled
    void some1Test(){
        assertTrue(true);
    }
    @Test
    @Disabled
    void some2Test(){
        assertTrue(true);
    }
    @Test
    @Disabled
    void some3Test(){
        assertTrue(true);
    }
    @Test
    @Disabled
    void some4Test(){
        assertTrue(true);
    }
    @Test
    @Disabled
    void some5Test(){
        assertTrue(true);
    }
}
