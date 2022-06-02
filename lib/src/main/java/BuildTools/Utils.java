package BuildTools;

import org.apache.commons.lang3.StringUtils;

public class Utils {
    public boolean isPositiveNumber(String str) {
        return StringUtils.isNumeric(str);
    }
}
