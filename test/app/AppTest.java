package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  public void canRunATest() {
    App a = new App();
    assertNull(a.run());
  }

  @Test
  public void canDisplayScore() {
    Display display = new Display();

    String result = display.displayScore(new Score(1, 1));

    assertEquals(result, "Cows: 1, Bulls: 1");
  }

  @Test
  public void canDisplayWin() {
    Display display = new Display();

    String result = display.displayWin(3);

    assertEquals(result, "Correct! You guessed in 3 tries");

  }

  @Test
  public void canDisplayLoss() {
    Display display = new Display();

    String result = display.displayLoss();

    assertEquals(result, "wow dude...");

  }
}
