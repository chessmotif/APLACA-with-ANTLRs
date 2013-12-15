package tl.tree;

import tl.TLValue;

import java.util.ArrayList;
import java.util.List;

public class ListNode implements TLNode {

    private List<TLNode> expressionNodes;

    public ListNode(List<TLNode> nodes) {
        expressionNodes = (nodes == null) ? new ArrayList<TLNode>() : nodes;
    }

    @Override
    public TLValue evaluate() {
        List<TLValue> evaluated = new ArrayList<TLValue>();
        for(TLNode node : expressionNodes) {
            evaluated.add(node.evaluate());
        }
        return new TLValue(evaluated);
    }

    @Override
    public String toString() {
        return expressionNodes.toString();
    }
}
