package app;

import java.util.Scanner;

public interface Input {
  public Code getInput() throws Exception;
}

class CommandLineInput implements Input {
  private Scanner scanner = new Scanner(System.in);

  @Override
  public Code getInput() throws Exception {
    String guess = scanner.nextLine();
    return new Code(guess);
  }

}
