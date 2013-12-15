package tl.tree.binNode;

import tl.TLValue;
import tl.tree.TLNode;

public class XorNode extends BinNode {

  public XorNode(TLNode lhs, TLNode rhs) {
		super(lhs, rhs);
	}

@Override
  public TLValue evaluate() {

    TLValue a = lhs.evaluate();
    TLValue b = rhs.evaluate();
    
  if(a.isBoolean()&&b.isBoolean())
  {
	  return new TLValue(a.asBoolean()^b.asBoolean());
  }
    // anything else for division? probs not
    throw new RuntimeException("illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s ^ %s)", lhs, rhs);
  }
}
