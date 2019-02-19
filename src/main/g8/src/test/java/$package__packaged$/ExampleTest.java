package $package$;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

  @ParameterizedTest
  @ValueSource(strings = {"Lenny", "World"})
  void parameterized(String name) {
    Assertions.assertThat(Example.helloWorld(name)).isEqualTo("Hello " + name + "!");
  }
}
