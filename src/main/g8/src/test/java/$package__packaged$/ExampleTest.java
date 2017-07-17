package $organization$.$name$;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created on 05.01.2017.
 *
 * @author <a href="mailto:lenny@reinvent.software">Leonard Daume</a>
 */
public class ExampleTest {
    @Test
    public void testHelloWorld() throws Exception {
        Assertions.assertThat(Example.helloWorld("Lenny")).isEqualTo("Hello Lenny!");

    }
}
