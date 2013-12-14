package tl.tree.relNode;

import tl.TLValue;
import tl.tree.TLNode;

public class GTENode extends RelNode {

  public GTENode(TLNode lhs, TLNode rhs) {
	  super(lhs, rhs);
  }

  @Override
  public TLValue evaluate() {

    TLValue a = lhs.evaluate();
    TLValue b = rhs.evaluate();

    if(a.isNumber() && b.isNumber()) {
      return new TLValue(a.asDouble() >= b.asDouble());
    }

    if(a.isString() && b.isString()) {
      return new TLValue(a.asString().compareTo(b.asString()) >= 0);
    }
  

    throw new RuntimeException("illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s >_= %s)", lhs, rhs);
  }
}
