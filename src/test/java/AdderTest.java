import org.example.cimaven.Adder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdderTest {

    @Test
    public void addTest() {
        assertEquals(Adder.add(5, 5), 10);
    }
}
