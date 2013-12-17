package tl.tree.binNode;

import tl.TLValue;
import tl.tree.TLNode;

import java.util.List;

public class StrCatNode extends BinNode {

	public StrCatNode(TLNode lhs, TLNode rhs) {
		super(lhs, rhs);
	}

@Override
  public TLValue evaluate() {

    TLValue a = lhs.evaluate();
    TLValue b = rhs.evaluate();
    
    // string + any, strcat
    if(a.isString()) {
      return new TLValue(a.asString() + "" + b.toString());
    }

    // any + string
    if(b.isString()) {
      return new TLValue(a.toString() + "" + b.asString());
    }

    throw new RuntimeException("illegal expression: " + this);
  }
@Override
public String toString() {
  return String.format("(%s # %s)", lhs, rhs);
}
 
}
