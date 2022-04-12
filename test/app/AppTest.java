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

  @Test
  public void canCalculateScore() {
    Scorer scorer = new Scorer();

    Score result = scorer.score("1234", "1234");

    assertEquals(result, new Score(4, 0));

    result = scorer.score("0000", "1234");

    assertEquals(result, new Score(0, 0));

    result = scorer.score("2122", "1234");

    assertEquals(result, new Score(0, 2));

    result = scorer.score("1240", "1234");

    assertEquals(result, new Score(2, 1));
  }

}
