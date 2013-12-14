package tl.tree.binNode;

import tl.tree.TLNode;

public abstract class BinNode implements TLNode{
	  protected TLNode lhs;
	  protected TLNode rhs;

	  public BinNode(TLNode lhs, TLNode rhs) {
	    this.lhs = lhs;
	    this.rhs = rhs;
	  }
}
