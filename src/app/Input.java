package app;

import java.util.Scanner;

public interface Input {
  public String getInput();
}

class CommandLineInput implements Input {
  private Scanner scanner = new Scanner(System.in);

  @Override
  public String getInput() {
    String input = "";
    try {
      input = scanner.nextLine();
    } catch(Exception e) {
    }
    return input;
  }

}
