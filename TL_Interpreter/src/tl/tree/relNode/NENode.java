package tl.tree.relNode;

import tl.TLValue;
import tl.tree.TLNode;

public class NENode extends RelNode {

  public NENode(TLNode lhs, TLNode rhs) {
	  super(lhs, rhs);
  }

  @Override
  public TLValue evaluate() {

    TLValue a = lhs.evaluate();
    TLValue b = rhs.evaluate();

    if (a.isBoolean() && b.isBoolean()) {
    	return new TLValue(a.asBoolean() != b.asBoolean());
    }
    
    if(a.isNumber() && b.isNumber()) {
      return new TLValue(Math.abs(a.asDouble() - b.asDouble()) > 1E-30);
    }

    if(a.isString() && b.isString()) {
      return new TLValue(a.asString().compareTo(b.asString()) != 0);
    }
  
    throw new RuntimeException("illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s >_< %s)", lhs, rhs);
  }
}
