package app;

public class Game {
  private int tries;
  private Scorer scorer;
  private Code secret;
  private UserAdapter userAdapter;

  public Game(CodeGenerator codeGenerator, Input input) {
    this.tries = 0;
    this.scorer = new Scorer();
    this.secret = codeGenerator.generateCode();
    this.userAdapter = new UserAdapter(input, new Display());
  }

  public void start() {

    userAdapter.displayWelcome();

    while (tries < 20) {
      tries++;

      Code guess = userAdapter.getInput(tries);

      if (guess.equals(secret)) {
        userAdapter.displayWin(tries);
        return;
      }

      Score score = scorer.score(guess, secret);
      userAdapter.displayScore(score);
    }

    userAdapter.displayLoss();

    return;
  }
}
