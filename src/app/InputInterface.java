package app;

import java.util.Scanner;

interface Input {
  public Code getInput() throws Exception;
}

class CommandLineInput implements Input {
  public Code getInput() throws Exception {
    Scanner scanner = new Scanner(System.in);
    String guess = scanner.nextLine();
    scanner.close();
    return new Code(guess);
  }
}
