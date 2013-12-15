package tl.tree.binNode;

import tl.TLValue;
import tl.tree.TLNode;

import java.util.List;

public class SubNode extends BinNode {

  public SubNode(TLNode lhs, TLNode rhs) {
	  super(lhs, rhs);
  }

  @Override
  public TLValue evaluate() {

    TLValue a = lhs.evaluate();
    TLValue b = rhs.evaluate();
    
    // number - number
    if(a.isNumber() && b.isNumber()) {
      return new TLValue(a.asDouble() - b.asDouble());
    }

    // list - any, list remove
    if(a.isList()) {
      List<TLValue> list = a.asList();
      list.remove(list.indexOf(b));
      return new TLValue(list);
    }

    throw new RuntimeException("illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s - %s)", lhs, rhs);
  }
}