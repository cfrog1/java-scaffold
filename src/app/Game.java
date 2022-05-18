package app;

public class Game {
  private int tries;
  private Scorer scorer;
  private Display display;
  private Code secret;
  private Input input;

  public Game(CodeGenerator codeGenerator) {
    this.tries = 0;
    this.scorer = new Scorer();
    this.display = new Display();
    // Random random = new Random();
    // this.code = String.format("%04d", random.nextInt(10000));
    this.secret = codeGenerator.generateCode();
    this.input = new CommandLineInput();
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
