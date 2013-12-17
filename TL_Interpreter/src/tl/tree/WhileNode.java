package tl.tree;

import tl.Scope;
import tl.TLValue;

public class WhileNode implements TLNode {

    private TLNode expression;
    private TLNode block;

    public WhileNode(TLNode exp, TLNode bl) {
        expression = exp;
        block = bl;
    }

    @Override
    public TLValue evaluate() {

        while(expression.evaluate().asBoolean()) {

            TLValue returnValue = block.evaluate();

            if(returnValue != TLValue.VOID) {
                return returnValue;
            }
        }

        return TLValue.VOID;
    }
}
