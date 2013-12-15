package tl.tree;

import tl.Function;
import tl.TLValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FunctionCallNode implements TLNode {

    private String identifier;
    private List<TLNode> params;
    private Map<String, Function> functions;

    public FunctionCallNode(String id, List<TLNode> ps, Map<String, Function> fs) {
        identifier = id;
        params = ps == null ? new ArrayList<TLNode>() : ps;
        functions = fs;
    }

    @Override
    public TLValue evaluate() {

        Function f = functions.get(identifier + params.size());

        if(f == null) {
            throw new RuntimeException("no function `" + identifier + "` with " + params.size() + " parameter(s)");
        }

        Function function = new Function(f);

        return function.invoke(params, functions);
    }
}
