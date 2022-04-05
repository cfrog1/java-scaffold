package app;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  public void canRunATest() {
    App a = new App();
    assertNull(a.run());
  }
}
