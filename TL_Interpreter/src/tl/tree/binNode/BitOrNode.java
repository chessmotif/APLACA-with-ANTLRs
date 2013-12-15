package tl.tree.binNode;

import tl.TLValue;
import tl.tree.TLNode;

public class BitOrNode extends BinNode {

  public BitOrNode(TLNode lhs, TLNode rhs) {
		super(lhs, rhs);
	}

@Override
  public TLValue evaluate() {

    TLValue a = lhs.evaluate();
    TLValue b = rhs.evaluate();
    
    // number / number
    if(a.isNumber() && b.isNumber()) {
      return new TLValue(a.asInteger()|b.asInteger());
    }    
    
    // anything else for division? probs not
    throw new RuntimeException("illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s | %s)", lhs, rhs);
  }
}
