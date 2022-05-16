package app;

import java.util.Scanner;

public class Input {

  private Scanner scanner;

  public Input() {
    this.scanner = new Scanner(System.in);
  }

  public Code getInput(int tries) {
    System.out.print(String.format("Guess %s: ", tries));

    while (true) {
      try {
        String input = scanner.nextLine();
        return new Code(input);
      } catch (Exception e) {
        System.out.println("Please enter a valid guess e.g. 1234");
      }
    }

  }

}
