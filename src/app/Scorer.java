package app;

public class Scorer {

  public Scorer() {
  };

  public Score score(String guess, String code) {
    int cows = 0, bulls = 0;
    char[] guessArr = guess.toCharArray();
    char[] codeArr = code.toCharArray();

    for (int i = 0; i < codeArr.length; i++) {
      if (codeArr[i] == guessArr[i]) {
        bulls++;
        codeArr[i] = '#';
        continue;
      }
      for (int j = 0; j < guessArr.length; j++) {
        if (codeArr[i] == guessArr[j]) {
          cows++;
          codeArr[i] = '#';
          continue;
        }
      }
    }

    return new Score(bulls, cows);
  }

  public boolean isCorrect(String guess, String code) {
    return guess.equals(code);
  }

}
