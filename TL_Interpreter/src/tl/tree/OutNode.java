package tl.tree;

import tl.TLValue;
import tl.tree.TLNode;
import java.io.PrintStream;

public class OutNode implements TLNode {

  private TLNode expression;
  private PrintStream out;

  public OutNode(TLNode e) {
    this(e, System.out);
  }

  public OutNode(TLNode e, PrintStream o) {
    expression = e;
    out = o;
  }

  @Override
  public TLValue evaluate() {
    TLValue value = expression.evaluate();
    out.println(value);
    return value == null? TLValue.VOID : value;
  }
}
