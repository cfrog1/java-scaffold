package app;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Input {

  private Scanner scanner;

  public Input() {
    this.scanner = new Scanner(System.in);
  }

  public String getInput() {
    System.out.print("Your guess: ");
    String input = "";

    while (input == "") {
      try {
        input = scanner.nextLine();
        validateInput(input);
      } catch (InputMismatchException e) {
        System.out.println("Please enter a valid guess e.g. 1234");
        input = "";
      }
    }

    return input;
  }

  private void validateInput(String input) {
    if (input.length() != 4 || !StringUtils.isNumeric(input)) {
      throw new InputMismatchException();
    }

  }

}
