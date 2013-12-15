package tl.tree.binNode;

import java.util.ArrayList;
import java.util.List;

import tl.TLValue;
import tl.tree.TLNode;

public class AddNode extends BinNode {

	public AddNode(TLNode lhs, TLNode rhs) {
		super(lhs, rhs);
	}

@Override
  public TLValue evaluate() {

    TLValue a = lhs.evaluate();
    TLValue b = rhs.evaluate();
    
    // number + number
    if(a.isNumber() && b.isNumber()) {
      return new TLValue(a.asDouble() + b.asDouble());
    }

    throw new RuntimeException("illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s + %s)", lhs, rhs);
  }
}
