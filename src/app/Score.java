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

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Score) {
      Score score = (Score) obj;
      if (this.getClass() == score.getClass() && this.bulls == score.bulls && this.cows == score.cows) {
        return true;
      }
    }
    return false;
  }

  public int bulls() {
    return this.bulls;
  }

  public int cows() {
    return this.cows;
  }

  public Score setBulls(int bulls) {
    this.bulls = bulls;
    return this;
  }

  public Score setCows(int cows) {
    this.cows = cows;
    return this;
  }

}
