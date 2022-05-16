package app;

import org.apache.commons.lang3.StringUtils;

public final class Code {
  public final String code;

  public Code(String code) throws Exception {
    if (isValidCode(code)) {
      this.code = code;
    } else {
      throw new Exception("Invalid code. Code must consist of 4 numbers");
    }
  }

  @Override
  public boolean equals(Object other) {
    return (other instanceof Code &&
        this.code.equals(((Code) other).code));
  }

  public static boolean isValidCode(Object code) {
    return (code instanceof String
        && ((String) code).length() == 4
        && StringUtils.isNumeric((String) code));

  }
}
