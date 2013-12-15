package tl.tree.unaryNode;

import tl.tree.TLNode;

public abstract class UnaryNode implements TLNode{
	  protected TLNode exp;

	  public UnaryNode(TLNode exp) {
	    this.exp = exp;
	  }
}
