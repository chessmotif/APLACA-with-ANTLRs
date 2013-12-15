package tl;
// $ANTLR 3.2 Sep 23, 2009 12:02:23 TLTreeWalker.g 2013-12-15 17:36:49
 
  import tl.tree.*; 
  import tl.tree.binNode.*;
  import tl.tree.relNode.*;
  import java.util.Map; 
  import java.util.HashMap; 


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TLTreeWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "RETURN", "STATEMENTS", "ASSIGNMENT", "TO_PRINT", "IF", "EXP", "ID_LIST", "INDEXES", "UNARY_MIN", "NOT", "BIN_NOT", "LOOKUP", "LIST", "EXP_LIST", "FUNC_CALL", "Return", "If", "Else_If", "Else", "Def_Func", "Identifier", "Out", "Null", "Number", "Bool", "In", "String", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "GT", "LT", "Not", "Pow", "Add", "Subt", "Mult", "Int_Div", "Div", "Mod", "Bit_Or", "Bit_And", "Bit_Xor", "Bit_Not", "Gets", "Comma", "Open_Paren", "Close_Paren", "Open_Bracket", "Close_Bracket", "Open_Brace", "Close_Brace", "Int", "Digit", "Comment", "Space", "';'"
    };
    public static final int LT=39;
    public static final int T__64=64;
    public static final int TO_PRINT=8;
    public static final int Open_Bracket=56;
    public static final int Close_Brace=59;
    public static final int BIN_NOT=15;
    public static final int EXP_LIST=18;
    public static final int NOT=14;
    public static final int ID_LIST=11;
    public static final int Add=42;
    public static final int EOF=-1;
    public static final int Subt=43;
    public static final int Identifier=25;
    public static final int Int=60;
    public static final int FUNC_CALL=19;
    public static final int IF=9;
    public static final int Space=63;
    public static final int Out=26;
    public static final int Bit_And=49;
    public static final int Gets=52;
    public static final int Number=28;
    public static final int Comment=62;
    public static final int EXP=10;
    public static final int GTEquals=36;
    public static final int RETURN=5;
    public static final int Bit_Or=48;
    public static final int String=31;
    public static final int Or=32;
    public static final int Open_Brace=58;
    public static final int Return=20;
    public static final int Def_Func=24;
    public static final int If=21;
    public static final int Null=27;
    public static final int And=33;
    public static final int Div=46;
    public static final int Mod=47;
    public static final int Bool=29;
    public static final int In=30;
    public static final int NEquals=35;
    public static final int INDEXES=12;
    public static final int Digit=61;
    public static final int LIST=17;
    public static final int Open_Paren=54;
    public static final int Else_If=22;
    public static final int LOOKUP=16;
    public static final int Mult=44;
    public static final int Close_Bracket=57;
    public static final int Bit_Xor=50;
    public static final int BLOCK=4;
    public static final int Not=40;
    public static final int Int_Div=45;
    public static final int GT=38;
    public static final int STATEMENTS=6;
    public static final int UNARY_MIN=13;
    public static final int ASSIGNMENT=7;
    public static final int Bit_Not=51;
    public static final int Else=23;
    public static final int Equals=34;
    public static final int Comma=53;
    public static final int Pow=41;
    public static final int Close_Paren=55;
    public static final int LTEquals=37;

    // delegates
    // delegators


        public TLTreeWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public TLTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TLTreeWalker.tokenNames; }
    public String getGrammarFileName() { return "TLTreeWalker.g"; }

     
      public Map<String, Function> functions = null; 
      Scope currentScope = null; 
       
      public TLTreeWalker(CommonTreeNodeStream nodes, Map<String, Function> fns) { 
        this(nodes, null, fns); 
      } 
       
      public TLTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, Function> fns) { 
        super(nds); 
        currentScope = sc; 
        functions = fns; 
      } 



    // $ANTLR start "walk"
    // TLTreeWalker.g:31:1: walk returns [TLNode node] : block ;
    public final TLNode walk() throws RecognitionException {
        TLNode node = null;

        TLNode block1 = null;


        try {
            // TLTreeWalker.g:32:3: ( block )
            // TLTreeWalker.g:32:6: block
            {
            pushFollow(FOLLOW_block_in_walk58);
            block1=block();

            state._fsp--;

            node = block1;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "walk"


    // $ANTLR start "block"
    // TLTreeWalker.g:35:1: block returns [TLNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
    public final TLNode block() throws RecognitionException {
        TLNode node = null;

        TLNode statement2 = null;

        TLNode expression3 = null;


         
          BlockNode bn = new BlockNode(); 
          node = bn; 
          Scope scope = new Scope(currentScope); 
          currentScope = scope; 

        try {
            // TLTreeWalker.g:45:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // TLTreeWalker.g:45:5: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block93); 

            match(input, Token.DOWN, null); 
            match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block101); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // TLTreeWalker.g:46:18: ( statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=ASSIGNMENT && LA1_0<=IF)||LA1_0==FUNC_CALL) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // TLTreeWalker.g:46:19: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_block104);
                	    statement2=statement();

                	    state._fsp--;

                	    bn.addStatement(statement2);

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            match(input,RETURN,FOLLOW_RETURN_in_block118); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // TLTreeWalker.g:47:14: ( expression )?
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=UNARY_MIN && LA2_0<=LOOKUP)||(LA2_0>=Null && LA2_0<=In)||(LA2_0>=Or && LA2_0<=LT)||(LA2_0>=Pow && LA2_0<=Bit_Xor)) ) {
                    alt2=1;
                }
                switch (alt2) {
                    case 1 :
                        // TLTreeWalker.g:47:15: expression
                        {
                        pushFollow(FOLLOW_expression_in_block121);
                        expression3=expression();

                        state._fsp--;

                        bn.addStatement(expression3);

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            match(input, Token.UP, null); 

            }

             
              currentScope = currentScope.parent(); 

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "block"


    // $ANTLR start "delimitedBlock"
    // TLTreeWalker.g:51:1: delimitedBlock returns [TLNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
    public final TLNode delimitedBlock() throws RecognitionException {
        TLNode node = null;

        TLNode statement4 = null;

        TLNode expression5 = null;


         
          BlockNode bn = new BlockNode(); 
          node = bn; 
          Scope scope = new Scope(currentScope); 
          currentScope = scope; 

        try {
            // TLTreeWalker.g:61:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // TLTreeWalker.g:61:5: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_delimitedBlock164); 

            match(input, Token.DOWN, null); 
            match(input,STATEMENTS,FOLLOW_STATEMENTS_in_delimitedBlock172); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // TLTreeWalker.g:62:18: ( statement )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=ASSIGNMENT && LA3_0<=IF)||LA3_0==FUNC_CALL) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // TLTreeWalker.g:62:19: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_delimitedBlock175);
                	    statement4=statement();

                	    state._fsp--;

                	    bn.addStatement(statement4);

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            match(input,RETURN,FOLLOW_RETURN_in_delimitedBlock189); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // TLTreeWalker.g:63:14: ( expression )?
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=UNARY_MIN && LA4_0<=LOOKUP)||(LA4_0>=Null && LA4_0<=In)||(LA4_0>=Or && LA4_0<=LT)||(LA4_0>=Pow && LA4_0<=Bit_Xor)) ) {
                    alt4=1;
                }
                switch (alt4) {
                    case 1 :
                        // TLTreeWalker.g:63:15: expression
                        {
                        pushFollow(FOLLOW_expression_in_delimitedBlock192);
                        expression5=expression();

                        state._fsp--;

                        bn.addStatement(expression5);

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            match(input, Token.UP, null); 

            }

             
              currentScope = currentScope.parent(); 

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "delimitedBlock"


    // $ANTLR start "statement"
    // TLTreeWalker.g:67:1: statement returns [TLNode node] : ( assignment | functionCall | ifStatement );
    public final TLNode statement() throws RecognitionException {
        TLNode node = null;

        TLNode assignment6 = null;

        TLNode functionCall7 = null;

        TLNode ifStatement8 = null;


        try {
            // TLTreeWalker.g:68:3: ( assignment | functionCall | ifStatement )
            int alt5=3;
            switch ( input.LA(1) ) {
            case ASSIGNMENT:
            case TO_PRINT:
                {
                alt5=1;
                }
                break;
            case FUNC_CALL:
                {
                alt5=2;
                }
                break;
            case IF:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // TLTreeWalker.g:68:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement222);
                    assignment6=assignment();

                    state._fsp--;

                    node =assignment6;

                    }
                    break;
                case 2 :
                    // TLTreeWalker.g:69:5: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_statement230);
                    functionCall7=functionCall();

                    state._fsp--;

                    node = functionCall7;

                    }
                    break;
                case 3 :
                    // TLTreeWalker.g:70:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement238);
                    ifStatement8=ifStatement();

                    state._fsp--;

                    node = ifStatement8;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "statement"


    // $ANTLR start "functionCall"
    // TLTreeWalker.g:73:1: functionCall returns [TLNode node] : ^( FUNC_CALL Identifier ( exprList )? ) ;
    public final TLNode functionCall() throws RecognitionException {
        TLNode node = null;

        try {
            // TLTreeWalker.g:74:3: ( ^( FUNC_CALL Identifier ( exprList )? ) )
            // TLTreeWalker.g:74:6: ^( FUNC_CALL Identifier ( exprList )? )
            {
            match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall260); 

            match(input, Token.DOWN, null); 
            match(input,Identifier,FOLLOW_Identifier_in_functionCall262); 
            // TLTreeWalker.g:74:29: ( exprList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EXP_LIST) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // TLTreeWalker.g:74:29: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_functionCall264);
                    exprList();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "functionCall"


    // $ANTLR start "ifStatement"
    // TLTreeWalker.g:77:1: ifStatement returns [TLNode node] : ^( IF ( ^( EXP e= expression a= block ) )+ ( ^( EXP b= block ) )? ) ;
    public final TLNode ifStatement() throws RecognitionException {
        TLNode node = null;

        TLNode e = null;

        TLNode a = null;

        TLNode b = null;


         
          IfNode ifNode = new IfNode(); 
          node = ifNode; 

        try {
            // TLTreeWalker.g:82:3: ( ^( IF ( ^( EXP e= expression a= block ) )+ ( ^( EXP b= block ) )? ) )
            // TLTreeWalker.g:82:5: ^( IF ( ^( EXP e= expression a= block ) )+ ( ^( EXP b= block ) )? )
            {
            match(input,IF,FOLLOW_IF_in_ifStatement293); 

            match(input, Token.DOWN, null); 
            // TLTreeWalker.g:82:10: ( ^( EXP e= expression a= block ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==EXP) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==DOWN) ) {
                        int LA7_3 = input.LA(3);

                        if ( ((LA7_3>=UNARY_MIN && LA7_3<=LOOKUP)||(LA7_3>=Null && LA7_3<=In)||(LA7_3>=Or && LA7_3<=LT)||(LA7_3>=Pow && LA7_3<=Bit_Xor)) ) {
                            alt7=1;
                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // TLTreeWalker.g:82:11: ^( EXP e= expression a= block )
            	    {
            	    match(input,EXP,FOLLOW_EXP_in_ifStatement297); 

            	    match(input, Token.DOWN, null); 
            	    pushFollow(FOLLOW_expression_in_ifStatement301);
            	    e=expression();

            	    state._fsp--;

            	    pushFollow(FOLLOW_block_in_ifStatement305);
            	    a=block();

            	    state._fsp--;


            	    match(input, Token.UP, null); 
            	    ifNode.addChoice(e,a);

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // TLTreeWalker.g:83:5: ( ^( EXP b= block ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EXP) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // TLTreeWalker.g:83:6: ^( EXP b= block )
                    {
                    match(input,EXP,FOLLOW_EXP_in_ifStatement319); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_block_in_ifStatement323);
                    b=block();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    ifNode.addChoice(new AtomNode(true),b);

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "idList"
    // TLTreeWalker.g:87:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
    public final java.util.List<String> idList() throws RecognitionException {
        java.util.List<String> i = null;

        try {
            // TLTreeWalker.g:88:3: ( ^( ID_LIST ( Identifier )+ ) )
            // TLTreeWalker.g:88:5: ^( ID_LIST ( Identifier )+ )
            {
            match(input,ID_LIST,FOLLOW_ID_LIST_in_idList368); 

            match(input, Token.DOWN, null); 
            // TLTreeWalker.g:88:15: ( Identifier )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Identifier) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // TLTreeWalker.g:88:15: Identifier
            	    {
            	    match(input,Identifier,FOLLOW_Identifier_in_idList370); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return i;
    }
    // $ANTLR end "idList"


    // $ANTLR start "assignment"
    // TLTreeWalker.g:91:1: assignment returns [TLNode node] : ( ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression ) | ^( TO_PRINT expression ) );
    public final TLNode assignment() throws RecognitionException {
        TLNode node = null;

        CommonTree i=null;
        List<TLNode> x = null;

        TLNode e = null;

        TLNode expression9 = null;


        try {
            // TLTreeWalker.g:92:3: ( ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression ) | ^( TO_PRINT expression ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ASSIGNMENT) ) {
                alt11=1;
            }
            else if ( (LA11_0==TO_PRINT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // TLTreeWalker.g:92:5: ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression )
                    {
                    match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment392); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment396); 
                    // TLTreeWalker.g:92:32: (x= indexes )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==INDEXES) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // TLTreeWalker.g:92:32: x= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_assignment400);
                            x=indexes();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_assignment405);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new AssignmentNode((i!=null?i.getText():null), x, e, currentScope);

                    }
                    break;
                case 2 :
                    // TLTreeWalker.g:93:5: ^( TO_PRINT expression )
                    {
                    match(input,TO_PRINT,FOLLOW_TO_PRINT_in_assignment417); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_assignment419);
                    expression9=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new OutNode(expression9);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "indexes"
    // TLTreeWalker.g:96:1: indexes returns [List<TLNode> e] : ^( INDEXES ( expression )+ ) ;
    public final List<TLNode> indexes() throws RecognitionException {
        List<TLNode> e = null;

        TLNode expression10 = null;


        e = new ArrayList<TLNode>();
        try {
            // TLTreeWalker.g:98:3: ( ^( INDEXES ( expression )+ ) )
            // TLTreeWalker.g:98:5: ^( INDEXES ( expression )+ )
            {
            match(input,INDEXES,FOLLOW_INDEXES_in_indexes448); 

            match(input, Token.DOWN, null); 
            // TLTreeWalker.g:98:15: ( expression )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=UNARY_MIN && LA12_0<=LOOKUP)||(LA12_0>=Null && LA12_0<=In)||(LA12_0>=Or && LA12_0<=LT)||(LA12_0>=Pow && LA12_0<=Bit_Xor)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // TLTreeWalker.g:98:16: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_indexes451);
            	    expression10=expression();

            	    state._fsp--;

            	    e.add(expression10);

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "indexes"


    // $ANTLR start "exprList"
    // TLTreeWalker.g:101:1: exprList returns [java.util.List<TLNode> e] : ^( EXP_LIST ( expression )+ ) ;
    public final java.util.List<TLNode> exprList() throws RecognitionException {
        java.util.List<TLNode> e = null;

        try {
            // TLTreeWalker.g:102:3: ( ^( EXP_LIST ( expression )+ ) )
            // TLTreeWalker.g:102:6: ^( EXP_LIST ( expression )+ )
            {
            match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList481); 

            match(input, Token.DOWN, null); 
            // TLTreeWalker.g:102:17: ( expression )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=UNARY_MIN && LA13_0<=LOOKUP)||(LA13_0>=Null && LA13_0<=In)||(LA13_0>=Or && LA13_0<=LT)||(LA13_0>=Pow && LA13_0<=Bit_Xor)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // TLTreeWalker.g:102:17: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_exprList483);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "exprList"


    // $ANTLR start "expression"
    // TLTreeWalker.g:105:1: expression returns [TLNode node] : ( ^( '|_|' expression expression ) | ^( '&_&' expression expression ) | ^( '=_=' a= expression b= expression ) | ^( '>_<' a= expression b= expression ) | ^( '>_=' a= expression b= expression ) | ^( '=_<' a= expression b= expression ) | ^( '>_>' a= expression b= expression ) | ^( '<_<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '//' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '**' expression expression ) | ^( '^' expression expression ) | ^( '&' expression expression ) | ^( '|' expression expression ) | ^( UNARY_MIN expression ) | ^( NOT expression ) | ^( BIN_NOT expression ) | Number | Bool | Null | In | lookup );
    public final TLNode expression() throws RecognitionException {
        TLNode node = null;

        CommonTree Number11=null;
        CommonTree Bool12=null;
        TLNode a = null;

        TLNode b = null;

        TLNode lookup13 = null;


        try {
            // TLTreeWalker.g:106:3: ( ^( '|_|' expression expression ) | ^( '&_&' expression expression ) | ^( '=_=' a= expression b= expression ) | ^( '>_<' a= expression b= expression ) | ^( '>_=' a= expression b= expression ) | ^( '=_<' a= expression b= expression ) | ^( '>_>' a= expression b= expression ) | ^( '<_<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '//' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '**' expression expression ) | ^( '^' expression expression ) | ^( '&' expression expression ) | ^( '|' expression expression ) | ^( UNARY_MIN expression ) | ^( NOT expression ) | ^( BIN_NOT expression ) | Number | Bool | Null | In | lookup )
            int alt14=26;
            switch ( input.LA(1) ) {
            case Or:
                {
                alt14=1;
                }
                break;
            case And:
                {
                alt14=2;
                }
                break;
            case Equals:
                {
                alt14=3;
                }
                break;
            case NEquals:
                {
                alt14=4;
                }
                break;
            case GTEquals:
                {
                alt14=5;
                }
                break;
            case LTEquals:
                {
                alt14=6;
                }
                break;
            case GT:
                {
                alt14=7;
                }
                break;
            case LT:
                {
                alt14=8;
                }
                break;
            case Add:
                {
                alt14=9;
                }
                break;
            case Subt:
                {
                alt14=10;
                }
                break;
            case Mult:
                {
                alt14=11;
                }
                break;
            case Div:
                {
                alt14=12;
                }
                break;
            case Int_Div:
                {
                alt14=13;
                }
                break;
            case Mod:
                {
                alt14=14;
                }
                break;
            case Pow:
                {
                alt14=15;
                }
                break;
            case Bit_Xor:
                {
                alt14=16;
                }
                break;
            case Bit_And:
                {
                alt14=17;
                }
                break;
            case Bit_Or:
                {
                alt14=18;
                }
                break;
            case UNARY_MIN:
                {
                alt14=19;
                }
                break;
            case NOT:
                {
                alt14=20;
                }
                break;
            case BIN_NOT:
                {
                alt14=21;
                }
                break;
            case Number:
                {
                alt14=22;
                }
                break;
            case Bool:
                {
                alt14=23;
                }
                break;
            case Null:
                {
                alt14=24;
                }
                break;
            case In:
                {
                alt14=25;
                }
                break;
            case LOOKUP:
                {
                alt14=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // TLTreeWalker.g:106:6: ^( '|_|' expression expression )
                    {
                    match(input,Or,FOLLOW_Or_in_expression511); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression513);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression515);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // TLTreeWalker.g:107:6: ^( '&_&' expression expression )
                    {
                    match(input,And,FOLLOW_And_in_expression526); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression528);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression530);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // TLTreeWalker.g:108:6: ^( '=_=' a= expression b= expression )
                    {
                    match(input,Equals,FOLLOW_Equals_in_expression541); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression545);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression549);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new EqNode(a, b);

                    }
                    break;
                case 4 :
                    // TLTreeWalker.g:109:6: ^( '>_<' a= expression b= expression )
                    {
                    match(input,NEquals,FOLLOW_NEquals_in_expression561); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression565);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression569);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new NENode(a, b);

                    }
                    break;
                case 5 :
                    // TLTreeWalker.g:110:6: ^( '>_=' a= expression b= expression )
                    {
                    match(input,GTEquals,FOLLOW_GTEquals_in_expression581); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression585);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression589);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new GTENode(a, b);

                    }
                    break;
                case 6 :
                    // TLTreeWalker.g:111:6: ^( '=_<' a= expression b= expression )
                    {
                    match(input,LTEquals,FOLLOW_LTEquals_in_expression601); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression605);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression609);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new LTENode(a, b);

                    }
                    break;
                case 7 :
                    // TLTreeWalker.g:112:6: ^( '>_>' a= expression b= expression )
                    {
                    match(input,GT,FOLLOW_GT_in_expression621); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression625);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression629);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new GTNode(a, b);

                    }
                    break;
                case 8 :
                    // TLTreeWalker.g:113:6: ^( '<_<' a= expression b= expression )
                    {
                    match(input,LT,FOLLOW_LT_in_expression641); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression645);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression649);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new LTNode(a, b);

                    }
                    break;
                case 9 :
                    // TLTreeWalker.g:114:6: ^( '+' a= expression b= expression )
                    {
                    match(input,Add,FOLLOW_Add_in_expression661); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression665);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression669);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new AddNode(a, b);

                    }
                    break;
                case 10 :
                    // TLTreeWalker.g:115:6: ^( '-' a= expression b= expression )
                    {
                    match(input,Subt,FOLLOW_Subt_in_expression680); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression684);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression688);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new SubNode(a, b);

                    }
                    break;
                case 11 :
                    // TLTreeWalker.g:116:6: ^( '*' a= expression b= expression )
                    {
                    match(input,Mult,FOLLOW_Mult_in_expression699); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression703);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression707);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new MultNode(a, b);

                    }
                    break;
                case 12 :
                    // TLTreeWalker.g:117:6: ^( '/' a= expression b= expression )
                    {
                    match(input,Div,FOLLOW_Div_in_expression718); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression722);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression726);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new DivNode(a, b);

                    }
                    break;
                case 13 :
                    // TLTreeWalker.g:118:6: ^( '//' a= expression b= expression )
                    {
                    match(input,Int_Div,FOLLOW_Int_Div_in_expression737); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression741);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression745);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new QuotNode(a, b);

                    }
                    break;
                case 14 :
                    // TLTreeWalker.g:119:6: ^( '%' a= expression b= expression )
                    {
                    match(input,Mod,FOLLOW_Mod_in_expression756); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression760);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression764);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new ModNode(a, b);

                    }
                    break;
                case 15 :
                    // TLTreeWalker.g:120:6: ^( '**' expression expression )
                    {
                    match(input,Pow,FOLLOW_Pow_in_expression775); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression777);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression779);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 16 :
                    // TLTreeWalker.g:121:6: ^( '^' expression expression )
                    {
                    match(input,Bit_Xor,FOLLOW_Bit_Xor_in_expression790); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression792);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression794);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // TLTreeWalker.g:122:6: ^( '&' expression expression )
                    {
                    match(input,Bit_And,FOLLOW_Bit_And_in_expression805); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression807);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression809);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // TLTreeWalker.g:123:6: ^( '|' expression expression )
                    {
                    match(input,Bit_Or,FOLLOW_Bit_Or_in_expression820); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression822);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression824);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // TLTreeWalker.g:124:6: ^( UNARY_MIN expression )
                    {
                    match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression835); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression837);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 20 :
                    // TLTreeWalker.g:125:6: ^( NOT expression )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression848); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression850);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 21 :
                    // TLTreeWalker.g:126:6: ^( BIN_NOT expression )
                    {
                    match(input,BIN_NOT,FOLLOW_BIN_NOT_in_expression861); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression863);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 22 :
                    // TLTreeWalker.g:127:6: Number
                    {
                    Number11=(CommonTree)match(input,Number,FOLLOW_Number_in_expression873); 
                    node = new AtomNode(Double.parseDouble((Number11!=null?Number11.getText():null)));

                    }
                    break;
                case 23 :
                    // TLTreeWalker.g:128:6: Bool
                    {
                    Bool12=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression888); 
                    node = new AtomNode(Boolean.parseBoolean((Bool12!=null?Bool12.getText():null)));

                    }
                    break;
                case 24 :
                    // TLTreeWalker.g:129:6: Null
                    {
                    match(input,Null,FOLLOW_Null_in_expression903); 
                    node = new AtomNode(null);

                    }
                    break;
                case 25 :
                    // TLTreeWalker.g:130:6: In
                    {
                    match(input,In,FOLLOW_In_in_expression918); 

                    }
                    break;
                case 26 :
                    // TLTreeWalker.g:131:6: lookup
                    {
                    pushFollow(FOLLOW_lookup_in_expression925);
                    lookup13=lookup();

                    state._fsp--;

                    node = lookup13;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "expression"


    // $ANTLR start "list"
    // TLTreeWalker.g:134:1: list returns [TLNode node] : ^( LIST ( exprList )? ) ;
    public final TLNode list() throws RecognitionException {
        TLNode node = null;

        try {
            // TLTreeWalker.g:135:3: ( ^( LIST ( exprList )? ) )
            // TLTreeWalker.g:135:6: ^( LIST ( exprList )? )
            {
            match(input,LIST,FOLLOW_LIST_in_list968); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // TLTreeWalker.g:135:13: ( exprList )?
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==EXP_LIST) ) {
                    alt15=1;
                }
                switch (alt15) {
                    case 1 :
                        // TLTreeWalker.g:135:13: exprList
                        {
                        pushFollow(FOLLOW_exprList_in_list970);
                        exprList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "list"


    // $ANTLR start "lookup"
    // TLTreeWalker.g:138:1: lookup returns [TLNode node] : ( ^( LOOKUP functionCall ( indexes )? ) | ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) );
    public final TLNode lookup() throws RecognitionException {
        TLNode node = null;

        CommonTree i=null;
        List<TLNode> x = null;


        try {
            // TLTreeWalker.g:139:3: ( ^( LOOKUP functionCall ( indexes )? ) | ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) )
            int alt21=5;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LOOKUP) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case Identifier:
                        {
                        alt21=4;
                        }
                        break;
                    case String:
                        {
                        alt21=5;
                        }
                        break;
                    case UNARY_MIN:
                    case NOT:
                    case BIN_NOT:
                    case LOOKUP:
                    case Null:
                    case Number:
                    case Bool:
                    case In:
                    case Or:
                    case And:
                    case Equals:
                    case NEquals:
                    case GTEquals:
                    case LTEquals:
                    case GT:
                    case LT:
                    case Pow:
                    case Add:
                    case Subt:
                    case Mult:
                    case Int_Div:
                    case Div:
                    case Mod:
                    case Bit_Or:
                    case Bit_And:
                    case Bit_Xor:
                        {
                        alt21=3;
                        }
                        break;
                    case LIST:
                        {
                        alt21=2;
                        }
                        break;
                    case FUNC_CALL:
                        {
                        alt21=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // TLTreeWalker.g:139:6: ^( LOOKUP functionCall ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1000); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_functionCall_in_lookup1002);
                    functionCall();

                    state._fsp--;

                    // TLTreeWalker.g:139:28: ( indexes )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==INDEXES) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // TLTreeWalker.g:139:28: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1004);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // TLTreeWalker.g:140:6: ^( LOOKUP list ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1016); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_list_in_lookup1018);
                    list();

                    state._fsp--;

                    // TLTreeWalker.g:140:20: ( indexes )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==INDEXES) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // TLTreeWalker.g:140:20: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1020);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // TLTreeWalker.g:141:6: ^( LOOKUP expression ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1032); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_lookup1034);
                    expression();

                    state._fsp--;

                    // TLTreeWalker.g:141:26: ( indexes )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==INDEXES) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // TLTreeWalker.g:141:26: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1036);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // TLTreeWalker.g:142:6: ^( LOOKUP i= Identifier (x= indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1049); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup1053); 
                    // TLTreeWalker.g:142:29: (x= indexes )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==INDEXES) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // TLTreeWalker.g:142:29: x= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1057);
                            x=indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     
                            node = (x != null) 
                              ? new LookupNode(new IdentifierNode((i!=null?i.getText():null), currentScope), x) 
                              : new IdentifierNode((i!=null?i.getText():null), currentScope); 
                          

                    }
                    break;
                case 5 :
                    // TLTreeWalker.g:148:6: ^( LOOKUP String ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1077); 

                    match(input, Token.DOWN, null); 
                    match(input,String,FOLLOW_String_in_lookup1079); 
                    // TLTreeWalker.g:148:22: ( indexes )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==INDEXES) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // TLTreeWalker.g:148:22: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1081);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "lookup"

    // Delegated rules


 

    public static final BitSet FOLLOW_block_in_walk58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block93 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATEMENTS_in_block101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_block104 = new BitSet(new long[]{0x0000000000080388L});
    public static final BitSet FOLLOW_RETURN_in_block118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_block121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_delimitedBlock164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATEMENTS_in_delimitedBlock172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_delimitedBlock175 = new BitSet(new long[]{0x0000000000080388L});
    public static final BitSet FOLLOW_RETURN_in_delimitedBlock189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_delimitedBlock192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_in_statement222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_functionCall262 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_exprList_in_functionCall264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifStatement293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXP_in_ifStatement297 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifStatement301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_ifStatement305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_ifStatement319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_ifStatement323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_LIST_in_idList368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_idList370 = new BitSet(new long[]{0x0000000002000008L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_assignment396 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_indexes_in_assignment400 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_assignment405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TO_PRINT_in_assignment417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_assignment419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEXES_in_indexes448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_indexes451 = new BitSet(new long[]{0x0007FEFF7801F008L});
    public static final BitSet FOLLOW_EXP_LIST_in_exprList481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_exprList483 = new BitSet(new long[]{0x0007FEFF7801F008L});
    public static final BitSet FOLLOW_Or_in_expression511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression513 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_And_in_expression526 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression528 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Equals_in_expression541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression545 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEquals_in_expression561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression565 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTEquals_in_expression581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression585 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression589 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTEquals_in_expression601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression605 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression609 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_expression621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression625 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expression641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression645 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Add_in_expression661 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression665 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Subt_in_expression680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression684 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression688 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Mult_in_expression699 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression703 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Div_in_expression718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression722 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Int_Div_in_expression737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression741 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Mod_in_expression756 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression760 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression764 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Pow_in_expression775 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression777 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Bit_Xor_in_expression790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression792 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression794 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Bit_And_in_expression805 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression807 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Bit_Or_in_expression820 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression822 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression824 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MIN_in_expression835 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression837 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression848 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression850 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIN_NOT_in_expression861 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression863 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Number_in_expression873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_expression888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Null_in_expression903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_In_in_expression918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_expression925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_list968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprList_in_list970 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup1000 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionCall_in_lookup1002 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup1004 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup1016 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_in_lookup1018 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup1020 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup1032 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_lookup1034 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup1036 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup1049 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_lookup1053 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup1057 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup1077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_String_in_lookup1079 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup1081 = new BitSet(new long[]{0x0000000000000008L});

}