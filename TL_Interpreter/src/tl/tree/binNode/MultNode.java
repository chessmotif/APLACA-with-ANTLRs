package tl.tree.binNode;

import tl.TLValue;
import tl.tree.TLNode;

import java.util.List;

public class MultNode extends BinNode {

  public MultNode(TLNode lhs, TLNode rhs) {
		super(lhs, rhs);
	}

@Override
  public TLValue evaluate() {

    TLValue a = lhs.evaluate();
    TLValue b = rhs.evaluate();
    
    // number * number
    if(a.isNumber() && b.isNumber()) {
      return new TLValue(a.asDouble() * b.asDouble());
    }

    // list * any, replicate? or disallow this totally
    if(a.isList() && b.isNumber()) {
      List<TLValue> list = a.asList();
      long nB = b.asLong();
      while (nB-- > 0)
    	  list.addAll(list);
      return new TLValue(list);
    }

    throw new RuntimeException("illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s * %s)", lhs, rhs);
  }
}
