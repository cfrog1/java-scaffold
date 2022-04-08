package app;

public class Score {
  private int bulls;
  private int cows;

  public Score() {
    this.bulls = 0;
    this.cows = 0;
  }

  public Score(int bulls, int cows) {
    this.bulls = bulls;
    this.cows = cows;
  }

  public int bulls() {
    return this.bulls;
  }

  public int cows() {
    return this.cows;
  }

}
