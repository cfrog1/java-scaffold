package app;

import java.util.Random;

interface CodeGenerator {
  public Code generateCode();
}

class TestCodeGenerator implements CodeGenerator {

  @Override
  public Code generateCode() {
    return new Code("1234");
  }
}

class RandomCodeGenerator implements CodeGenerator {

  @Override
  public Code generateCode() {
    Random random = new Random();
    String code = String.format("%04d", random.nextInt(10000));
    return new Code(code);
    }

}
