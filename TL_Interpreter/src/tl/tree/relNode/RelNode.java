package tl.tree.relNode;

import tl.tree.TLNode;

public abstract class RelNode implements TLNode{
	  protected TLNode lhs;
	  protected TLNode rhs;

	  public RelNode(TLNode lhs, TLNode rhs) {
	    this.lhs = lhs;
	    this.rhs = rhs;
	  }
}
