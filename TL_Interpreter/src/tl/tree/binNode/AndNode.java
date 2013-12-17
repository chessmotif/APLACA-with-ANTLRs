package tl.tree.binNode;

import tl.TLValue;
import tl.tree.TLNode;

public class AndNode extends BinNode {

  public AndNode(TLNode lhs, TLNode rhs) {
		super(lhs, rhs);
	}

@Override
  public TLValue evaluate() {

    TLValue a = lhs.evaluate();
    TLValue b = rhs.evaluate();
    
  if(a.isBoolean()&&b.isBoolean())
  {
	  return new TLValue(a.asBoolean()&&b.asBoolean());
  }

    throw new RuntimeException("illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s &_& %s)", lhs, rhs);
  }
}
