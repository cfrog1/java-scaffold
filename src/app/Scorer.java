package app;

public class Scorer {

  public Scorer() {
  };

  public Score score(Code guess, Code secret) {
    int cows = 0, bulls = 0;
    char[] guessArr = guess.code.toCharArray();
    char[] secretArr = secret.code.toCharArray();

    for (int i = 0; i < secretArr.length; i++) {
      if (secretArr[i] == guessArr[i]) {
        bulls++;
        secretArr[i] = '#';
        continue;
      }
      for (int j = 0; j < guessArr.length; j++) {
        if (secretArr[i] == guessArr[j]) {
          cows++;
          secretArr[i] = '#';
          continue;
        }
      }
    }

    return new Score(bulls, cows);
  }

}
