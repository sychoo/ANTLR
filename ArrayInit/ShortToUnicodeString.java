// Mon Dec 13 16:58:08 EST 2021
// define callbacks triggered by tree walking

public class ShortToUnicodeString extends ArrayInitBaseListener {
  // { to "
  @Override
  public void enterInit(ArrayInitParser.InitContext ctx) {
    System.out.print('"');
  }

  // } to "
  @Override
  public void exitInit(ArrayInitParser.InitContext ctx) {
    System.out.print('"');
  }

  // value to 4-digit hex prefixed with \\u
  @Override
  public void enterValue(ArrayInitParser.ValueContext ctx) {
    // assume no nested array initializers
    // ctx.INT() asks the context object for the integer INT token matched by that invocation of rule "value"
    int value = Integer.valueOf(ctx.INT().getText());
    System.out.printf("\\u%04x", value);
  }
}

