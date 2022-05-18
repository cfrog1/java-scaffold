package app;

public class Display {

  public Display() {
  }

  public String displayScore(Score score) {
    String output = String.format("Cows: %s, Bulls: %s", score.cows, score.bulls);
    System.out.println(output);
    return output;
  }

  public String displayWin(int tries) {
    String output = String.format("Correct! You guessed in %s tries", tries);
    System.out.println(output);
    return output;
  }

  public String displayLoss() {
    String output = "wow dude...";
    System.out.println(output);
    return output;
  }

  public String displayWelcome() {
    String output = "Guess the 4 digit code and win $1million";
    System.out.println(output);
    return output;
  }

  public String displayUserPrompt(int tries) {
    String output = String.format("Guess %s:", tries);
    System.out.println(output);
    return output;
  }

  public String displayInvalidInput(String message) {
    System.out.println(message);
    return message;
  }

}
