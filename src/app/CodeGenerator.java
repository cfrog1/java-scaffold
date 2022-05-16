package app;

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