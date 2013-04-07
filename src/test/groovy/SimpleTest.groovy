import org.junit.Test

class SimpleTest {

  @Test
  void testSuccess() {
    assert 1 == 1
  }

  @Test
  void testFail() {
    assert 1 == 2
  }
}
