package BuildTools;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LibraryTest {
    @Test
    public void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        Assertions.assertTrue(classUnderTest.isPositiveNumber("1"));
    }
}
