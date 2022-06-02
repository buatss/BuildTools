package BuildTools;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UtilsTest {
    @Test
    public void someLibraryMethodReturnsTrue() {
        Utils classUnderTest = new Utils();
        Assertions.assertTrue(classUnderTest.isPositiveNumber("1"));
    }
}
