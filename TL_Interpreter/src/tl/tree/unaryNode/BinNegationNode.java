package tl.tree.unaryNode;

import tl.TLValue;
import tl.tree.TLNode;

public class BinNegationNode extends UnaryNode {
	public BinNegationNode(TLNode exp) {
		super(exp);
	}

	@Override
	  public TLValue evaluate() {

	    TLValue a = exp.evaluate();
	    
	    if(a.isNumber()) {
	    	if (a.asDouble() - a.asLong() < 1E-30)
	    		return new TLValue(~a.asLong());
	    }

	    throw new RuntimeException("illegal expression: " + this);
	  }

	  @Override
	  public String toString() {
	    return String.format("!(%s)", exp);
	  }
}
