package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

  // @Test
  // public void canRunATest() {
  // App a = new App();
  // assertNull(a.run());
  // }

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
    Code guess;
    Code secret;
    try {
      guess = new Code("1234");
      secret = new Code("1234");
      Score result = scorer.score(guess, secret);
      assertEquals(result, new Score(4, 0));
    } catch (Exception e) {
    }

    try {
      guess = new Code("0000");
      secret = new Code("1234");
      Score result = scorer.score(guess, secret);
      assertEquals(result, new Score(0, 0));
    } catch (Exception e) {
    }
    try {
      guess = new Code("2122");
      secret = new Code("1234");
      Score result = scorer.score(guess, secret);
      assertEquals(result, new Score(0, 2));
    } catch (Exception e) {
    }
    try {
      guess = new Code("1240");
      secret = new Code("1234");
      Score result = scorer.score(guess, secret);
      assertEquals(result, new Score(2, 1));
    } catch (Exception e) {
    }
  }

}
