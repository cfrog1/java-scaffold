package app;

import java.util.Random;

interface CodeGenerator {
  public Code generateCode();
}

class TestCodeGenerator implements CodeGenerator {

  @Override
  public Code generateCode() {
    try {
      return new Code("1234");
    } catch (Exception e) {
      return null;
    }

  }
}

class RandomCodeGenerator implements CodeGenerator {

  @Override
  public Code generateCode() {
    Random random = new Random();
    String code = String.format("%04d", random.nextInt(10000));
    try {
      return new Code(code);
    } catch (Exception e) {
      return null;
    }

  }

}