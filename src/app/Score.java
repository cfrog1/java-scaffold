package app;

public final class Score {
  public final int bulls;
  public final int cows;

  public Score(int bulls, int cows) {
    this.bulls = bulls;
    this.cows = cows;
  }

  @Override
  public boolean equals(Object other) {
    return (other instanceof Score &&
        this.bulls == ((Score) other).bulls &&
        this.cows == ((Score) other).cows);
  }
}
