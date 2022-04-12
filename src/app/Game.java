package app;

import java.util.Random;

public class Game {
  private int tries;
  private Scorer scorer;
  private Display display;
  private String code;
  private Input input;

  public Game() {
    this.tries = 0;
    this.scorer = new Scorer();
    this.display = new Display();
    // Random random = new Random();
    // this.code = String.format("%04d", random.nextInt(10000));
    this.code = "1234";
    this.input = new Input();
  }

  public void start() {

    display.displayWelcome();

    while (tries < 20) {
      tries++;
      String guess = input.getInput(tries);
      if (scorer.isCorrect(guess, code)) {
        display.displayWin(tries);
        return;
      }
      Score score = scorer.score(guess, code);
      display.displayScore(score);
    }
    display.displayLoss();

    return;
  }
}
