package app;

import org.apache.commons.lang3.StringUtils;

public class UserAdapter {
  private Input input;
  private Display display;

  public UserAdapter(Input input, Display display) {
    this.input = input;
    this.display = display;
  } 

  public Code getInput(int tries) {
      while (true) {
        display.displayUserPrompt(tries);

        String guess = input.getInput();
        if (validCode(guess)) {
          return new Code(guess);
        }
        display.displayInvalidInput();
    }
  }

  private boolean validCode(String guess) {
    return guess.length() == 4 && StringUtils.isNumeric(guess);
  }

  public String displayWelcome() {
    return display.displayWelcome();
  }

  public String displayWin(int tries) {
    return display.displayWin(tries);
  }

  public String displayLoss() {
    return display.displayLoss();
  }

  public String displayScore(Score score) {
    return display.displayScore(score);
  }

}
