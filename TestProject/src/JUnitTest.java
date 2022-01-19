import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JUnitTest {

  @Test (expected = IllegalArgumentException.class)
  public void testExceptionIsThrown() {
    TestClass tester = new TestClass();
    tester.multiply(1000, 5);
  }

  @Test
  public void testMultiply() {
    TestClass tester = new TestClass();
    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
  }
}