package app;

public class Scorer {

  public Scorer() {
  };

  public Score score(String guess, String code) {
    Score score = new Score(0, 0);
    char[] guessArr = guess.toCharArray();
    char[] codeArr = code.toCharArray();

    for (int i = 0; i < codeArr.length; i++) {
      if (codeArr[i] == guessArr[i]) {
        score.setBulls(score.bulls() + 1);
        codeArr[i] = '#';
        continue;
      }
      for (int j = 0; j < guessArr.length; j++) {
        if (codeArr[i] == guessArr[j]) {
          score.setCows(score.cows() + 1);
          codeArr[i] = '#';
          continue;
        }
      }
    }

    return score;

  }

}
