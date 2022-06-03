import BuildTools.*;

import java.util.Arrays;
import java.util.Optional;

public class Utils {
    static boolean isAllPositiveNumbers(String... str) {
        //full classpath is needed to not mistake with this class
        BuildTools.Utils utils = new BuildTools.Utils();
        Optional<Boolean> optional = Arrays
                .stream(str)
                .map(val -> utils.isPositiveNumber(val))
                .filter(bool -> bool.equals(false))
                .findFirst();

        return !optional.isPresent();
    }
}