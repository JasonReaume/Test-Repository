
public class TestClass {
  public int multiply(int x, int y) {
    if (x > 999) {
      throw new IllegalArgumentException("X should be less than 1000");
    }
    // Changing x * y to something like x / y will result in a test failure
    return x * y;
  }
}