package tl.tree.unaryNode;

import tl.TLValue;
import tl.tree.TLNode;

public class MinusNode extends UnaryNode {
	public MinusNode(TLNode exp) {
		super(exp);
	}

	@Override
	  public TLValue evaluate() {

	    TLValue a = exp.evaluate();
	    
	    if(a.isNumber()) {
	      return new TLValue(-a.asDouble());
	    }

	    throw new RuntimeException("illegal expression: " + this);
	  }

	  @Override
	  public String toString() {
	    return String.format("-(%s)", exp);
	  }
}
