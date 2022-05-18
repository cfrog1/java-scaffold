package app;

public class Game {
  private int tries;
  private Scorer scorer;
  private Display display;
  private Code secret;
  private Input input;

  public Game(CodeGenerator codeGenerator, Input input) {
    this.tries = 0;
    this.scorer = new Scorer();
    this.display = new Display();
    this.secret = codeGenerator.generateCode();
    this.input = input;
  }

  public void start() {

    display.displayWelcome();

    while (tries < 20) {
      tries++;
      Code guess;
      while (true) {
        display.displayUserPrompt(tries);
        try {
          guess = input.getInput();
          break;
        } catch (Exception e) {
          display.displayInvalidInput(e.getMessage());
        }

      }
      if (guess.equals(secret)) {
        display.displayWin(tries);
        return;
      }
      Score score = scorer.score(guess, secret);
      display.displayScore(score);
    }
    display.displayLoss();

    return;
  }
}
