package app;

public final class Code {
  public final String code;

  public Code(String code)   {
      this.code = code;
    }

  @Override
  public boolean equals(Object other) {
    return (other instanceof Code &&
        this.code.equals(((Code) other).code));
  }
}
