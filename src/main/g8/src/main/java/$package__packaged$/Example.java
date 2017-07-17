package $package$;

import org.apache.commons.lang3.StringUtils;

/**
 * Created on 05.01.2017.
 *
 * @author <a href="mailto:lenny@reinvent.software">Leonard Daume</a>
 */
public class Example {
    public static String helloWorld(String name) {
        return StringUtils.join("Hello ", name, "!");
    }
}
