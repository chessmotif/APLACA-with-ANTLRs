package tl;
// $ANTLR 3.2 Sep 23, 2009 12:02:23 TLTreeWalker.g 2013-12-15 22:02:08
 
  import tl.tree.*; 
  import tl.tree.binNode.*;
  import tl.tree.relNode.*;
  import tl.tree.unaryNode.*;
  import java.util.Map; 
  import java.util.HashMap; 


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TLTreeWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "RETURN", "STATEMENTS", "ASSIGNMENT", "TO_PRINT", "IF", "EXP", "ID_LIST", "INDEXES", "UNARY_MIN", "NOT", "BIN_NOT", "LOOKUP", "LIST", "EXP_LIST", "FUNC_CALL", "Return", "If", "Else_If", "Else", "Def_Func", "Identifier", "Out", "Null", "Number", "Bool", "In", "String", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "GT", "LT", "Not", "Pow", "Add", "Subt", "Mult", "Int_Div", "Div", "Mod", "Bit_Or", "Bit_And", "Bit_Xor", "Bit_Not", "Strcat", "Gets", "Comma", "Open_Paren", "Close_Paren", "Open_Bracket", "Close_Bracket", "Open_Brace", "Close_Brace", "Int", "Digit", "Comment", "Space", "';'"
    };
    public static final int LT=39;
    public static final int T__65=65;
    public static final int TO_PRINT=8;
    public static final int Open_Bracket=57;
    public static final int Close_Brace=60;
    public static final int BIN_NOT=15;
    public static final int EXP_LIST=18;
    public static final int NOT=14;
    public static final int ID_LIST=11;
    public static final int Add=42;
    public static final int EOF=-1;
    public static final int Subt=43;
    public static final int Identifier=25;
    public static final int Int=61;
    public static final int FUNC_CALL=19;
    public static final int IF=9;
    public static final int Space=64;
    public static final int Out=26;
    public static final int Bit_And=49;
    public static final int Gets=53;
    public static final int Number=28;
    public static final int Comment=63;
    public static final int EXP=10;
    public static final int GTEquals=36;
    public static final int RETURN=5;
    public static final int Bit_Or=48;
    public static final int String=31;
    public static final int Or=32;
    public static final int Open_Brace=59;
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
    public static final int Strcat=52;
    public static final int Digit=62;
    public static final int LIST=17;
    public static final int Open_Paren=55;
    public static final int Else_If=22;
    public static final int LOOKUP=16;
    public static final int Mult=44;
    public static final int Close_Bracket=58;
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
    public static final int Comma=54;
    public static final int Pow=41;
    public static final int Close_Paren=56;
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
    // TLTreeWalker.g:32:1: walk returns [TLNode node] : block ;
    public final TLNode walk() throws RecognitionException {
        TLNode node = null;

        TLNode block1 = null;


        try {
            // TLTreeWalker.g:33:3: ( block )
            // TLTreeWalker.g:33:6: block
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
    // TLTreeWalker.g:36:1: block returns [TLNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
    public final TLNode block() throws RecognitionException {
        TLNode node = null;

        TLNode statement2 = null;

        TLNode expression3 = null;


         
          BlockNode bn = new BlockNode(); 
          node = bn; 
          Scope scope = new Scope(currentScope); 
          currentScope = scope; 

        try {
            // TLTreeWalker.g:46:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // TLTreeWalker.g:46:5: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block93); 

            match(input, Token.DOWN, null); 
            match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block101); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // TLTreeWalker.g:47:18: ( statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=ASSIGNMENT && LA1_0<=IF)||LA1_0==FUNC_CALL) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // TLTreeWalker.g:47:19: statement
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
                // TLTreeWalker.g:48:14: ( expression )?
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=UNARY_MIN && LA2_0<=LOOKUP)||(LA2_0>=Null && LA2_0<=In)||(LA2_0>=Or && LA2_0<=LT)||(LA2_0>=Pow && LA2_0<=Bit_Xor)||LA2_0==Strcat) ) {
                    alt2=1;
                }
                switch (alt2) {
                    case 1 :
                        // TLTreeWalker.g:48:15: expression
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
    // TLTreeWalker.g:52:1: delimitedBlock returns [TLNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
    public final TLNode delimitedBlock() throws RecognitionException {
        TLNode node = null;

        TLNode statement4 = null;

        TLNode expression5 = null;


         
          BlockNode bn = new BlockNode(); 
          node = bn; 
          Scope scope = new Scope(currentScope); 
          currentScope = scope; 

        try {
            // TLTreeWalker.g:62:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // TLTreeWalker.g:62:5: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_delimitedBlock164); 

            match(input, Token.DOWN, null); 
            match(input,STATEMENTS,FOLLOW_STATEMENTS_in_delimitedBlock172); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // TLTreeWalker.g:63:18: ( statement )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=ASSIGNMENT && LA3_0<=IF)||LA3_0==FUNC_CALL) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // TLTreeWalker.g:63:19: statement
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
                // TLTreeWalker.g:64:14: ( expression )?
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=UNARY_MIN && LA4_0<=LOOKUP)||(LA4_0>=Null && LA4_0<=In)||(LA4_0>=Or && LA4_0<=LT)||(LA4_0>=Pow && LA4_0<=Bit_Xor)||LA4_0==Strcat) ) {
                    alt4=1;
                }
                switch (alt4) {
                    case 1 :
                        // TLTreeWalker.g:64:15: expression
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
    // TLTreeWalker.g:68:1: statement returns [TLNode node] : ( assignment | functionCall | ifStatement );
    public final TLNode statement() throws RecognitionException {
        TLNode node = null;

        TLNode assignment6 = null;

        TLNode functionCall7 = null;

        TLNode ifStatement8 = null;


        try {
            // TLTreeWalker.g:69:3: ( assignment | functionCall | ifStatement )
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
                    // TLTreeWalker.g:69:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement222);
                    assignment6=assignment();

                    state._fsp--;

                    node =assignment6;

                    }
                    break;
                case 2 :
                    // TLTreeWalker.g:70:5: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_statement230);
                    functionCall7=functionCall();

                    state._fsp--;

                    node = functionCall7;

                    }
                    break;
                case 3 :
                    // TLTreeWalker.g:71:5: ifStatement
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
    // TLTreeWalker.g:74:1: functionCall returns [TLNode node] : ^( FUNC_CALL Identifier ( exprList )? ) ;
    public final TLNode functionCall() throws RecognitionException {
        TLNode node = null;

        CommonTree Identifier9=null;
        java.util.List<TLNode> exprList10 = null;


        try {
            // TLTreeWalker.g:75:3: ( ^( FUNC_CALL Identifier ( exprList )? ) )
            // TLTreeWalker.g:75:6: ^( FUNC_CALL Identifier ( exprList )? )
            {
            match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall260); 

            match(input, Token.DOWN, null); 
            Identifier9=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall262); 
            // TLTreeWalker.g:75:29: ( exprList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EXP_LIST) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // TLTreeWalker.g:75:29: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_functionCall264);
                    exprList10=exprList();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            node = new FunctionCallNode((Identifier9!=null?Identifier9.getText():null), exprList10, functions);

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
    // TLTreeWalker.g:78:1: ifStatement returns [TLNode node] : ^( IF ( ^( EXP e= expression a= block ) )+ ( ^( EXP b= block ) )? ) ;
    public final TLNode ifStatement() throws RecognitionException {
        TLNode node = null;

        TLNode e = null;

        TLNode a = null;

        TLNode b = null;


         
          IfNode ifNode = new IfNode(); 
          node = ifNode; 

        try {
            // TLTreeWalker.g:83:3: ( ^( IF ( ^( EXP e= expression a= block ) )+ ( ^( EXP b= block ) )? ) )
            // TLTreeWalker.g:83:5: ^( IF ( ^( EXP e= expression a= block ) )+ ( ^( EXP b= block ) )? )
            {
            match(input,IF,FOLLOW_IF_in_ifStatement294); 

            match(input, Token.DOWN, null); 
            // TLTreeWalker.g:83:10: ( ^( EXP e= expression a= block ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==EXP) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==DOWN) ) {
                        int LA7_3 = input.LA(3);

                        if ( ((LA7_3>=UNARY_MIN && LA7_3<=LOOKUP)||(LA7_3>=Null && LA7_3<=In)||(LA7_3>=Or && LA7_3<=LT)||(LA7_3>=Pow && LA7_3<=Bit_Xor)||LA7_3==Strcat) ) {
                            alt7=1;
                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // TLTreeWalker.g:83:11: ^( EXP e= expression a= block )
            	    {
            	    match(input,EXP,FOLLOW_EXP_in_ifStatement298); 

            	    match(input, Token.DOWN, null); 
            	    pushFollow(FOLLOW_expression_in_ifStatement302);
            	    e=expression();

            	    state._fsp--;

            	    pushFollow(FOLLOW_block_in_ifStatement306);
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

            // TLTreeWalker.g:84:5: ( ^( EXP b= block ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EXP) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // TLTreeWalker.g:84:6: ^( EXP b= block )
                    {
                    match(input,EXP,FOLLOW_EXP_in_ifStatement320); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_block_in_ifStatement324);
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
    // TLTreeWalker.g:88:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
    public final java.util.List<String> idList() throws RecognitionException {
        java.util.List<String> i = null;

        CommonTree Identifier11=null;

        i = new java.util.ArrayList<String>();
        try {
            // TLTreeWalker.g:90:3: ( ^( ID_LIST ( Identifier )+ ) )
            // TLTreeWalker.g:90:5: ^( ID_LIST ( Identifier )+ )
            {
            match(input,ID_LIST,FOLLOW_ID_LIST_in_idList374); 

            match(input, Token.DOWN, null); 
            // TLTreeWalker.g:90:15: ( Identifier )+
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
            	    // TLTreeWalker.g:90:16: Identifier
            	    {
            	    Identifier11=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList377); 
            	    i.add((Identifier11!=null?Identifier11.getText():null));

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
    // TLTreeWalker.g:93:1: assignment returns [TLNode node] : ( ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression ) | ^( TO_PRINT expression ) );
    public final TLNode assignment() throws RecognitionException {
        TLNode node = null;

        CommonTree i=null;
        List<TLNode> x = null;

        TLNode e = null;

        TLNode expression12 = null;


        try {
            // TLTreeWalker.g:94:3: ( ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression ) | ^( TO_PRINT expression ) )
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
                    // TLTreeWalker.g:94:5: ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression )
                    {
                    match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment402); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment406); 
                    // TLTreeWalker.g:94:32: (x= indexes )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==INDEXES) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // TLTreeWalker.g:94:32: x= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_assignment410);
                            x=indexes();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_assignment415);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new AssignmentNode((i!=null?i.getText():null), x, e, currentScope);

                    }
                    break;
                case 2 :
                    // TLTreeWalker.g:95:5: ^( TO_PRINT expression )
                    {
                    match(input,TO_PRINT,FOLLOW_TO_PRINT_in_assignment427); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_assignment429);
                    expression12=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new OutNode(expression12);

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
    // TLTreeWalker.g:98:1: indexes returns [List<TLNode> e] : ^( INDEXES ( expression )+ ) ;
    public final List<TLNode> indexes() throws RecognitionException {
        List<TLNode> e = null;

        TLNode expression13 = null;


        e = new ArrayList<TLNode>();
        try {
            // TLTreeWalker.g:100:3: ( ^( INDEXES ( expression )+ ) )
            // TLTreeWalker.g:100:5: ^( INDEXES ( expression )+ )
            {
            match(input,INDEXES,FOLLOW_INDEXES_in_indexes458); 

            match(input, Token.DOWN, null); 
            // TLTreeWalker.g:100:15: ( expression )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=UNARY_MIN && LA12_0<=LOOKUP)||(LA12_0>=Null && LA12_0<=In)||(LA12_0>=Or && LA12_0<=LT)||(LA12_0>=Pow && LA12_0<=Bit_Xor)||LA12_0==Strcat) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // TLTreeWalker.g:100:16: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_indexes461);
            	    expression13=expression();

            	    state._fsp--;

            	    e.add(expression13);

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
    // TLTreeWalker.g:103:1: exprList returns [java.util.List<TLNode> e] : ^( EXP_LIST ( expression )+ ) ;
    public final java.util.List<TLNode> exprList() throws RecognitionException {
        java.util.List<TLNode> e = null;

        TLNode expression14 = null;


        e = new java.util.ArrayList<TLNode>();
        try {
            // TLTreeWalker.g:105:3: ( ^( EXP_LIST ( expression )+ ) )
            // TLTreeWalker.g:105:6: ^( EXP_LIST ( expression )+ )
            {
            match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList497); 

            match(input, Token.DOWN, null); 
            // TLTreeWalker.g:105:17: ( expression )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=UNARY_MIN && LA13_0<=LOOKUP)||(LA13_0>=Null && LA13_0<=In)||(LA13_0>=Or && LA13_0<=LT)||(LA13_0>=Pow && LA13_0<=Bit_Xor)||LA13_0==Strcat) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // TLTreeWalker.g:105:18: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_exprList500);
            	    expression14=expression();

            	    state._fsp--;

            	    e.add(expression14);

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
    // TLTreeWalker.g:108:1: expression returns [TLNode node] : ( ^( '|_|' expression expression ) | ^( '&_&' expression expression ) | ^( '=_=' a= expression b= expression ) | ^( '>_<' a= expression b= expression ) | ^( '>_=' a= expression b= expression ) | ^( '=_<' a= expression b= expression ) | ^( '>_>' a= expression b= expression ) | ^( '<_<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '//' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '**' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( '&' a= expression b= expression ) | ^( '|' a= expression b= expression ) | ^( '#' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NOT a= expression ) | ^( BIN_NOT a= expression ) | Number | Bool | Null | In | lookup );
    public final TLNode expression() throws RecognitionException {
        TLNode node = null;

        CommonTree Number15=null;
        CommonTree Bool16=null;
        TLNode a = null;

        TLNode b = null;

        TLNode lookup17 = null;


        try {
            // TLTreeWalker.g:109:3: ( ^( '|_|' expression expression ) | ^( '&_&' expression expression ) | ^( '=_=' a= expression b= expression ) | ^( '>_<' a= expression b= expression ) | ^( '>_=' a= expression b= expression ) | ^( '=_<' a= expression b= expression ) | ^( '>_>' a= expression b= expression ) | ^( '<_<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '//' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '**' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( '&' a= expression b= expression ) | ^( '|' a= expression b= expression ) | ^( '#' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NOT a= expression ) | ^( BIN_NOT a= expression ) | Number | Bool | Null | In | lookup )
            int alt14=27;
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
            case Strcat:
                {
                alt14=19;
                }
                break;
            case UNARY_MIN:
                {
                alt14=20;
                }
                break;
            case NOT:
                {
                alt14=21;
                }
                break;
            case BIN_NOT:
                {
                alt14=22;
                }
                break;
            case Number:
                {
                alt14=23;
                }
                break;
            case Bool:
                {
                alt14=24;
                }
                break;
            case Null:
                {
                alt14=25;
                }
                break;
            case In:
                {
                alt14=26;
                }
                break;
            case LOOKUP:
                {
                alt14=27;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // TLTreeWalker.g:109:6: ^( '|_|' expression expression )
                    {
                    match(input,Or,FOLLOW_Or_in_expression531); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression533);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression535);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new OrNode(a, b);

                    }
                    break;
                case 2 :
                    // TLTreeWalker.g:110:6: ^( '&_&' expression expression )
                    {
                    match(input,And,FOLLOW_And_in_expression548); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression550);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression552);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new AndNode(a, b);

                    }
                    break;
                case 3 :
                    // TLTreeWalker.g:111:6: ^( '=_=' a= expression b= expression )
                    {
                    match(input,Equals,FOLLOW_Equals_in_expression565); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression569);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression573);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new EqNode(a, b);

                    }
                    break;
                case 4 :
                    // TLTreeWalker.g:112:6: ^( '>_<' a= expression b= expression )
                    {
                    match(input,NEquals,FOLLOW_NEquals_in_expression585); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression589);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression593);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new NENode(a, b);

                    }
                    break;
                case 5 :
                    // TLTreeWalker.g:113:6: ^( '>_=' a= expression b= expression )
                    {
                    match(input,GTEquals,FOLLOW_GTEquals_in_expression605); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression609);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression613);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new GTENode(a, b);

                    }
                    break;
                case 6 :
                    // TLTreeWalker.g:114:6: ^( '=_<' a= expression b= expression )
                    {
                    match(input,LTEquals,FOLLOW_LTEquals_in_expression625); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression629);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression633);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new LTENode(a, b);

                    }
                    break;
                case 7 :
                    // TLTreeWalker.g:115:6: ^( '>_>' a= expression b= expression )
                    {
                    match(input,GT,FOLLOW_GT_in_expression645); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression649);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression653);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new GTNode(a, b);

                    }
                    break;
                case 8 :
                    // TLTreeWalker.g:116:6: ^( '<_<' a= expression b= expression )
                    {
                    match(input,LT,FOLLOW_LT_in_expression665); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression669);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression673);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new LTNode(a, b);

                    }
                    break;
                case 9 :
                    // TLTreeWalker.g:117:6: ^( '+' a= expression b= expression )
                    {
                    match(input,Add,FOLLOW_Add_in_expression685); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression689);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression693);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new AddNode(a, b);

                    }
                    break;
                case 10 :
                    // TLTreeWalker.g:118:6: ^( '-' a= expression b= expression )
                    {
                    match(input,Subt,FOLLOW_Subt_in_expression704); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression708);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression712);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new SubNode(a, b);

                    }
                    break;
                case 11 :
                    // TLTreeWalker.g:119:6: ^( '*' a= expression b= expression )
                    {
                    match(input,Mult,FOLLOW_Mult_in_expression723); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression727);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression731);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new MultNode(a, b);

                    }
                    break;
                case 12 :
                    // TLTreeWalker.g:120:6: ^( '/' a= expression b= expression )
                    {
                    match(input,Div,FOLLOW_Div_in_expression742); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression746);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression750);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new DivNode(a, b);

                    }
                    break;
                case 13 :
                    // TLTreeWalker.g:121:6: ^( '//' a= expression b= expression )
                    {
                    match(input,Int_Div,FOLLOW_Int_Div_in_expression761); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression765);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression769);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new QuotNode(a, b);

                    }
                    break;
                case 14 :
                    // TLTreeWalker.g:122:6: ^( '%' a= expression b= expression )
                    {
                    match(input,Mod,FOLLOW_Mod_in_expression780); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression784);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression788);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new ModNode(a, b);

                    }
                    break;
                case 15 :
                    // TLTreeWalker.g:123:6: ^( '**' a= expression b= expression )
                    {
                    match(input,Pow,FOLLOW_Pow_in_expression799); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression803);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression807);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new PowerNode(a, b);

                    }
                    break;
                case 16 :
                    // TLTreeWalker.g:124:6: ^( '^' a= expression b= expression )
                    {
                    match(input,Bit_Xor,FOLLOW_Bit_Xor_in_expression820); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression824);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression828);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new XorNode(a, b);

                    }
                    break;
                case 17 :
                    // TLTreeWalker.g:125:6: ^( '&' a= expression b= expression )
                    {
                    match(input,Bit_And,FOLLOW_Bit_And_in_expression842); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression846);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression850);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new BitAndNode(a, b);

                    }
                    break;
                case 18 :
                    // TLTreeWalker.g:126:6: ^( '|' a= expression b= expression )
                    {
                    match(input,Bit_Or,FOLLOW_Bit_Or_in_expression864); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression868);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression872);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new BitOrNode(a, b);

                    }
                    break;
                case 19 :
                    // TLTreeWalker.g:127:6: ^( '#' a= expression b= expression )
                    {
                    match(input,Strcat,FOLLOW_Strcat_in_expression886); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression890);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression894);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new StrCatNode(a, b);

                    }
                    break;
                case 20 :
                    // TLTreeWalker.g:128:6: ^( UNARY_MIN a= expression )
                    {
                    match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression908); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression912);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new MinusNode(a);

                    }
                    break;
                case 21 :
                    // TLTreeWalker.g:129:6: ^( NOT a= expression )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression926); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression930);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new NotNode(a);

                    }
                    break;
                case 22 :
                    // TLTreeWalker.g:130:6: ^( BIN_NOT a= expression )
                    {
                    match(input,BIN_NOT,FOLLOW_BIN_NOT_in_expression945); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression949);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new BinNegationNode(a);

                    }
                    break;
                case 23 :
                    // TLTreeWalker.g:131:6: Number
                    {
                    Number15=(CommonTree)match(input,Number,FOLLOW_Number_in_expression962); 
                    node = new AtomNode(Double.parseDouble((Number15!=null?Number15.getText():null)));

                    }
                    break;
                case 24 :
                    // TLTreeWalker.g:132:6: Bool
                    {
                    Bool16=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression977); 
                    node = new AtomNode(Boolean.parseBoolean((Bool16!=null?Bool16.getText():null)));

                    }
                    break;
                case 25 :
                    // TLTreeWalker.g:133:6: Null
                    {
                    match(input,Null,FOLLOW_Null_in_expression992); 
                    node = new AtomNode(null);

                    }
                    break;
                case 26 :
                    // TLTreeWalker.g:134:6: In
                    {
                    match(input,In,FOLLOW_In_in_expression1007); 

                    }
                    break;
                case 27 :
                    // TLTreeWalker.g:135:6: lookup
                    {
                    pushFollow(FOLLOW_lookup_in_expression1014);
                    lookup17=lookup();

                    state._fsp--;

                    node = lookup17;

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
    // TLTreeWalker.g:138:1: list returns [TLNode node] : ^( LIST ( exprList )? ) ;
    public final TLNode list() throws RecognitionException {
        TLNode node = null;

        java.util.List<TLNode> exprList18 = null;


        try {
            // TLTreeWalker.g:139:3: ( ^( LIST ( exprList )? ) )
            // TLTreeWalker.g:139:6: ^( LIST ( exprList )? )
            {
            match(input,LIST,FOLLOW_LIST_in_list1057); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // TLTreeWalker.g:139:13: ( exprList )?
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==EXP_LIST) ) {
                    alt15=1;
                }
                switch (alt15) {
                    case 1 :
                        // TLTreeWalker.g:139:13: exprList
                        {
                        pushFollow(FOLLOW_exprList_in_list1059);
                        exprList18=exprList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            node = new ListNode(exprList18);

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
    // TLTreeWalker.g:142:1: lookup returns [TLNode node] : ( ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
    public final TLNode lookup() throws RecognitionException {
        TLNode node = null;

        CommonTree Identifier22=null;
        CommonTree String23=null;
        List<TLNode> i = null;

        TLNode functionCall19 = null;

        TLNode list20 = null;

        TLNode expression21 = null;


        try {
            // TLTreeWalker.g:143:3: ( ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
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
                    case FUNC_CALL:
                        {
                        alt21=1;
                        }
                        break;
                    case LIST:
                        {
                        alt21=2;
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
                    case Strcat:
                        {
                        alt21=3;
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
                    // TLTreeWalker.g:143:6: ^( LOOKUP functionCall (i= indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1090); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_functionCall_in_lookup1092);
                    functionCall19=functionCall();

                    state._fsp--;

                    // TLTreeWalker.g:143:29: (i= indexes )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==INDEXES) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // TLTreeWalker.g:143:29: i= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1096);
                            i=indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    node = i != null ? new LookupNode(functionCall19, i) : functionCall19;

                    }
                    break;
                case 2 :
                    // TLTreeWalker.g:144:6: ^( LOOKUP list (i= indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1109); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_list_in_lookup1111);
                    list20=list();

                    state._fsp--;

                    // TLTreeWalker.g:144:21: (i= indexes )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==INDEXES) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // TLTreeWalker.g:144:21: i= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1115);
                            i=indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    node = i != null ? new LookupNode(list20, i) : list20;

                    }
                    break;
                case 3 :
                    // TLTreeWalker.g:145:6: ^( LOOKUP expression (i= indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1132); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_lookup1134);
                    expression21=expression();

                    state._fsp--;

                    // TLTreeWalker.g:145:27: (i= indexes )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==INDEXES) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // TLTreeWalker.g:145:27: i= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1138);
                            i=indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    node = i != null ? new LookupNode(expression21, i) : expression21;

                    }
                    break;
                case 4 :
                    // TLTreeWalker.g:146:6: ^( LOOKUP Identifier (i= indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1152); 

                    match(input, Token.DOWN, null); 
                    Identifier22=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup1154); 
                    // TLTreeWalker.g:146:27: (i= indexes )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==INDEXES) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // TLTreeWalker.g:146:27: i= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1158);
                            i=indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    node = i != null ? new LookupNode(new IdentifierNode((Identifier22!=null?Identifier22.getText():null), currentScope), i) : new IdentifierNode((Identifier22!=null?Identifier22.getText():null), currentScope);

                    }
                    break;
                case 5 :
                    // TLTreeWalker.g:147:6: ^( LOOKUP String (i= indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1171); 

                    match(input, Token.DOWN, null); 
                    String23=(CommonTree)match(input,String,FOLLOW_String_in_lookup1173); 
                    // TLTreeWalker.g:147:23: (i= indexes )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==INDEXES) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // TLTreeWalker.g:147:23: i= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1177);
                            i=indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    node = i != null ? new LookupNode(new AtomNode((String23!=null?String23.getText():null)), i) : new AtomNode((String23!=null?String23.getText():null));

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
    public static final BitSet FOLLOW_IF_in_ifStatement294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXP_in_ifStatement298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifStatement302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_ifStatement306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_ifStatement320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_ifStatement324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_LIST_in_idList374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_idList377 = new BitSet(new long[]{0x0000000002000008L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment402 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_assignment406 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_indexes_in_assignment410 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_assignment415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TO_PRINT_in_assignment427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_assignment429 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEXES_in_indexes458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_indexes461 = new BitSet(new long[]{0x0017FEFF7801F008L});
    public static final BitSet FOLLOW_EXP_LIST_in_exprList497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_exprList500 = new BitSet(new long[]{0x0017FEFF7801F008L});
    public static final BitSet FOLLOW_Or_in_expression531 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression533 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression535 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_And_in_expression548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression550 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Equals_in_expression565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression569 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEquals_in_expression585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression589 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression593 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTEquals_in_expression605 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression609 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTEquals_in_expression625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression629 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_expression645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression649 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression653 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expression665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression669 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Add_in_expression685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression689 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Subt_in_expression704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression708 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Mult_in_expression723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression727 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression731 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Div_in_expression742 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression746 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Int_Div_in_expression761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression765 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Mod_in_expression780 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression784 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression788 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Pow_in_expression799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression803 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Bit_Xor_in_expression820 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression824 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression828 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Bit_And_in_expression842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression846 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression850 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Bit_Or_in_expression864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression868 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression872 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Strcat_in_expression886 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression890 = new BitSet(new long[]{0x0017FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression894 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MIN_in_expression908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIN_NOT_in_expression945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression949 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Number_in_expression962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_expression977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Null_in_expression992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_In_in_expression1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_expression1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_list1057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprList_in_list1059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup1090 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionCall_in_lookup1092 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup1096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup1109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_in_lookup1111 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup1115 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup1132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_lookup1134 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup1138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup1152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_lookup1154 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup1158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup1171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_String_in_lookup1173 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup1177 = new BitSet(new long[]{0x0000000000000008L});

}