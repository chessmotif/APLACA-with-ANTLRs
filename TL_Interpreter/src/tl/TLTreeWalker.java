package tl;
// $ANTLR 3.2 Sep 23, 2009 12:02:23 TLTreeWalker.g 2013-12-15 02:50:30
 
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

        try {
            // TLTreeWalker.g:52:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // TLTreeWalker.g:52:5: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_delimitedBlock150); 

            match(input, Token.DOWN, null); 
            match(input,STATEMENTS,FOLLOW_STATEMENTS_in_delimitedBlock153); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // TLTreeWalker.g:52:26: ( statement )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=ASSIGNMENT && LA3_0<=IF)||LA3_0==FUNC_CALL) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // TLTreeWalker.g:52:26: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_delimitedBlock155);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            match(input,RETURN,FOLLOW_RETURN_in_delimitedBlock160); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // TLTreeWalker.g:52:47: ( expression )?
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=UNARY_MIN && LA4_0<=LOOKUP)||(LA4_0>=Null && LA4_0<=In)||(LA4_0>=Or && LA4_0<=LT)||(LA4_0>=Pow && LA4_0<=Bit_Xor)) ) {
                    alt4=1;
                }
                switch (alt4) {
                    case 1 :
                        // TLTreeWalker.g:52:47: expression
                        {
                        pushFollow(FOLLOW_expression_in_delimitedBlock162);
                        expression();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
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
    // $ANTLR end "delimitedBlock"


    // $ANTLR start "statement"
    // TLTreeWalker.g:55:1: statement returns [TLNode node] : ( assignment | functionCall | ifStatement );
    public final TLNode statement() throws RecognitionException {
        TLNode node = null;

        try {
            // TLTreeWalker.g:56:3: ( assignment | functionCall | ifStatement )
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
                    // TLTreeWalker.g:56:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement184);
                    assignment();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // TLTreeWalker.g:57:5: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_statement190);
                    functionCall();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // TLTreeWalker.g:58:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement196);
                    ifStatement();

                    state._fsp--;


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
    // TLTreeWalker.g:61:1: functionCall returns [TLNode node] : ^( FUNC_CALL Identifier ( exprList )? ) ;
    public final TLNode functionCall() throws RecognitionException {
        TLNode node = null;

        try {
            // TLTreeWalker.g:62:3: ( ^( FUNC_CALL Identifier ( exprList )? ) )
            // TLTreeWalker.g:62:6: ^( FUNC_CALL Identifier ( exprList )? )
            {
            match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall216); 

            match(input, Token.DOWN, null); 
            match(input,Identifier,FOLLOW_Identifier_in_functionCall218); 
            // TLTreeWalker.g:62:29: ( exprList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EXP_LIST) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // TLTreeWalker.g:62:29: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_functionCall220);
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
    // TLTreeWalker.g:65:1: ifStatement returns [TLNode node] : ^( IF ( ^( EXP e= expression a= block ) )+ ( ^( EXP b= block ) )? ) ;
    public final TLNode ifStatement() throws RecognitionException {
        TLNode node = null;

        TLNode e = null;

        TLNode a = null;

        TLNode b = null;


         
          IfNode ifNode = new IfNode(); 
          node = ifNode; 

        try {
            // TLTreeWalker.g:70:3: ( ^( IF ( ^( EXP e= expression a= block ) )+ ( ^( EXP b= block ) )? ) )
            // TLTreeWalker.g:70:5: ^( IF ( ^( EXP e= expression a= block ) )+ ( ^( EXP b= block ) )? )
            {
            match(input,IF,FOLLOW_IF_in_ifStatement250); 

            match(input, Token.DOWN, null); 
            // TLTreeWalker.g:70:10: ( ^( EXP e= expression a= block ) )+
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
            	    // TLTreeWalker.g:70:11: ^( EXP e= expression a= block )
            	    {
            	    match(input,EXP,FOLLOW_EXP_in_ifStatement254); 

            	    match(input, Token.DOWN, null); 
            	    pushFollow(FOLLOW_expression_in_ifStatement258);
            	    e=expression();

            	    state._fsp--;

            	    pushFollow(FOLLOW_block_in_ifStatement262);
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

            // TLTreeWalker.g:71:5: ( ^( EXP b= block ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EXP) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // TLTreeWalker.g:71:6: ^( EXP b= block )
                    {
                    match(input,EXP,FOLLOW_EXP_in_ifStatement276); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_block_in_ifStatement280);
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
    // TLTreeWalker.g:75:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
    public final java.util.List<String> idList() throws RecognitionException {
        java.util.List<String> i = null;

        try {
            // TLTreeWalker.g:76:3: ( ^( ID_LIST ( Identifier )+ ) )
            // TLTreeWalker.g:76:5: ^( ID_LIST ( Identifier )+ )
            {
            match(input,ID_LIST,FOLLOW_ID_LIST_in_idList325); 

            match(input, Token.DOWN, null); 
            // TLTreeWalker.g:76:15: ( Identifier )+
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
            	    // TLTreeWalker.g:76:15: Identifier
            	    {
            	    match(input,Identifier,FOLLOW_Identifier_in_idList327); 

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
    // TLTreeWalker.g:79:1: assignment : ( ^( ASSIGNMENT Identifier ( indexes )? expression ) | ^( TO_PRINT expression ) );
    public final void assignment() throws RecognitionException {
        try {
            // TLTreeWalker.g:80:3: ( ^( ASSIGNMENT Identifier ( indexes )? expression ) | ^( TO_PRINT expression ) )
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
                    // TLTreeWalker.g:80:5: ^( ASSIGNMENT Identifier ( indexes )? expression )
                    {
                    match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment345); 

                    match(input, Token.DOWN, null); 
                    match(input,Identifier,FOLLOW_Identifier_in_assignment347); 
                    // TLTreeWalker.g:80:29: ( indexes )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==INDEXES) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // TLTreeWalker.g:80:29: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_assignment349);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_assignment352);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // TLTreeWalker.g:81:5: ^( TO_PRINT expression )
                    {
                    match(input,TO_PRINT,FOLLOW_TO_PRINT_in_assignment360); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_assignment362);
                    expression();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "indexes"
    // TLTreeWalker.g:84:1: indexes returns [TLNode node] : ^( INDEXES ( expression )+ ) ;
    public final TLNode indexes() throws RecognitionException {
        TLNode node = null;

        try {
            // TLTreeWalker.g:85:3: ( ^( INDEXES ( expression )+ ) )
            // TLTreeWalker.g:85:5: ^( INDEXES ( expression )+ )
            {
            match(input,INDEXES,FOLLOW_INDEXES_in_indexes383); 

            match(input, Token.DOWN, null); 
            // TLTreeWalker.g:85:15: ( expression )+
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
            	    // TLTreeWalker.g:85:15: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_indexes385);
            	    expression();

            	    state._fsp--;


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
        return node;
    }
    // $ANTLR end "indexes"


    // $ANTLR start "exprList"
    // TLTreeWalker.g:88:1: exprList returns [java.util.List<TLNode> e] : ^( EXP_LIST ( expression )+ ) ;
    public final java.util.List<TLNode> exprList() throws RecognitionException {
        java.util.List<TLNode> e = null;

        try {
            // TLTreeWalker.g:89:3: ( ^( EXP_LIST ( expression )+ ) )
            // TLTreeWalker.g:89:6: ^( EXP_LIST ( expression )+ )
            {
            match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList411); 

            match(input, Token.DOWN, null); 
            // TLTreeWalker.g:89:17: ( expression )+
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
            	    // TLTreeWalker.g:89:17: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_exprList413);
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
    // TLTreeWalker.g:92:1: expression returns [TLNode node] : ( ^( '|_|' expression expression ) | ^( '&_&' expression expression ) | ^( '=_=' a= expression b= expression ) | ^( '>_<' a= expression b= expression ) | ^( '>_=' a= expression b= expression ) | ^( '=_<' a= expression b= expression ) | ^( '>_>' a= expression b= expression ) | ^( '<_<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '//' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '**' expression expression ) | ^( '^' expression expression ) | ^( '&' expression expression ) | ^( '|' expression expression ) | ^( UNARY_MIN expression ) | ^( NOT expression ) | ^( BIN_NOT expression ) | Number | Bool | Null | In | lookup );
    public final TLNode expression() throws RecognitionException {
        TLNode node = null;

        CommonTree Number4=null;
        CommonTree Bool5=null;
        TLNode a = null;

        TLNode b = null;


        try {
            // TLTreeWalker.g:93:3: ( ^( '|_|' expression expression ) | ^( '&_&' expression expression ) | ^( '=_=' a= expression b= expression ) | ^( '>_<' a= expression b= expression ) | ^( '>_=' a= expression b= expression ) | ^( '=_<' a= expression b= expression ) | ^( '>_>' a= expression b= expression ) | ^( '<_<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '//' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '**' expression expression ) | ^( '^' expression expression ) | ^( '&' expression expression ) | ^( '|' expression expression ) | ^( UNARY_MIN expression ) | ^( NOT expression ) | ^( BIN_NOT expression ) | Number | Bool | Null | In | lookup )
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
                    // TLTreeWalker.g:93:6: ^( '|_|' expression expression )
                    {
                    match(input,Or,FOLLOW_Or_in_expression441); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression443);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression445);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // TLTreeWalker.g:94:6: ^( '&_&' expression expression )
                    {
                    match(input,And,FOLLOW_And_in_expression456); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression458);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression460);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // TLTreeWalker.g:95:6: ^( '=_=' a= expression b= expression )
                    {
                    match(input,Equals,FOLLOW_Equals_in_expression471); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression475);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression479);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new EqNode(a, b);

                    }
                    break;
                case 4 :
                    // TLTreeWalker.g:96:6: ^( '>_<' a= expression b= expression )
                    {
                    match(input,NEquals,FOLLOW_NEquals_in_expression491); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression495);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression499);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new NENode(a, b);

                    }
                    break;
                case 5 :
                    // TLTreeWalker.g:97:6: ^( '>_=' a= expression b= expression )
                    {
                    match(input,GTEquals,FOLLOW_GTEquals_in_expression511); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression515);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression519);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new GTENode(a, b);

                    }
                    break;
                case 6 :
                    // TLTreeWalker.g:98:6: ^( '=_<' a= expression b= expression )
                    {
                    match(input,LTEquals,FOLLOW_LTEquals_in_expression531); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression535);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression539);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new LTENode(a, b);

                    }
                    break;
                case 7 :
                    // TLTreeWalker.g:99:6: ^( '>_>' a= expression b= expression )
                    {
                    match(input,GT,FOLLOW_GT_in_expression551); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression555);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression559);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new GTNode(a, b);

                    }
                    break;
                case 8 :
                    // TLTreeWalker.g:100:6: ^( '<_<' a= expression b= expression )
                    {
                    match(input,LT,FOLLOW_LT_in_expression571); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression575);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression579);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new LTNode(a, b);

                    }
                    break;
                case 9 :
                    // TLTreeWalker.g:101:6: ^( '+' a= expression b= expression )
                    {
                    match(input,Add,FOLLOW_Add_in_expression591); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression595);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression599);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new AddNode(a, b);

                    }
                    break;
                case 10 :
                    // TLTreeWalker.g:102:6: ^( '-' a= expression b= expression )
                    {
                    match(input,Subt,FOLLOW_Subt_in_expression610); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression614);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression618);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new SubNode(a, b);

                    }
                    break;
                case 11 :
                    // TLTreeWalker.g:103:6: ^( '*' a= expression b= expression )
                    {
                    match(input,Mult,FOLLOW_Mult_in_expression629); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression633);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression637);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new MultNode(a, b);

                    }
                    break;
                case 12 :
                    // TLTreeWalker.g:104:6: ^( '/' a= expression b= expression )
                    {
                    match(input,Div,FOLLOW_Div_in_expression648); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression652);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression656);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new DivNode(a, b);

                    }
                    break;
                case 13 :
                    // TLTreeWalker.g:105:6: ^( '//' a= expression b= expression )
                    {
                    match(input,Int_Div,FOLLOW_Int_Div_in_expression667); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression671);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression675);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new QuotNode(a, b);

                    }
                    break;
                case 14 :
                    // TLTreeWalker.g:106:6: ^( '%' a= expression b= expression )
                    {
                    match(input,Mod,FOLLOW_Mod_in_expression686); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression690);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression694);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    node = new ModNode(a, b);

                    }
                    break;
                case 15 :
                    // TLTreeWalker.g:107:6: ^( '**' expression expression )
                    {
                    match(input,Pow,FOLLOW_Pow_in_expression705); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression707);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression709);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 16 :
                    // TLTreeWalker.g:108:6: ^( '^' expression expression )
                    {
                    match(input,Bit_Xor,FOLLOW_Bit_Xor_in_expression720); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression722);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression724);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 17 :
                    // TLTreeWalker.g:109:6: ^( '&' expression expression )
                    {
                    match(input,Bit_And,FOLLOW_Bit_And_in_expression735); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression737);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression739);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 18 :
                    // TLTreeWalker.g:110:6: ^( '|' expression expression )
                    {
                    match(input,Bit_Or,FOLLOW_Bit_Or_in_expression750); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression752);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression754);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 19 :
                    // TLTreeWalker.g:111:6: ^( UNARY_MIN expression )
                    {
                    match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression765); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression767);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 20 :
                    // TLTreeWalker.g:112:6: ^( NOT expression )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression778); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression780);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 21 :
                    // TLTreeWalker.g:113:6: ^( BIN_NOT expression )
                    {
                    match(input,BIN_NOT,FOLLOW_BIN_NOT_in_expression791); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression793);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 22 :
                    // TLTreeWalker.g:114:6: Number
                    {
                    Number4=(CommonTree)match(input,Number,FOLLOW_Number_in_expression803); 
                    node = new AtomNode(Double.parseDouble((Number4!=null?Number4.getText():null)));

                    }
                    break;
                case 23 :
                    // TLTreeWalker.g:115:6: Bool
                    {
                    Bool5=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression818); 
                    node = new AtomNode(Boolean.parseBoolean((Bool5!=null?Bool5.getText():null)));

                    }
                    break;
                case 24 :
                    // TLTreeWalker.g:116:6: Null
                    {
                    match(input,Null,FOLLOW_Null_in_expression833); 
                    node = new AtomNode(null);

                    }
                    break;
                case 25 :
                    // TLTreeWalker.g:117:6: In
                    {
                    match(input,In,FOLLOW_In_in_expression848); 

                    }
                    break;
                case 26 :
                    // TLTreeWalker.g:118:6: lookup
                    {
                    pushFollow(FOLLOW_lookup_in_expression855);
                    lookup();

                    state._fsp--;


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
    // TLTreeWalker.g:121:1: list returns [TLNode node] : ^( LIST ( exprList )? ) ;
    public final TLNode list() throws RecognitionException {
        TLNode node = null;

        try {
            // TLTreeWalker.g:122:3: ( ^( LIST ( exprList )? ) )
            // TLTreeWalker.g:122:6: ^( LIST ( exprList )? )
            {
            match(input,LIST,FOLLOW_LIST_in_list892); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // TLTreeWalker.g:122:13: ( exprList )?
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==EXP_LIST) ) {
                    alt15=1;
                }
                switch (alt15) {
                    case 1 :
                        // TLTreeWalker.g:122:13: exprList
                        {
                        pushFollow(FOLLOW_exprList_in_list894);
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
    // TLTreeWalker.g:125:1: lookup returns [TLNode node] : ( ^( LOOKUP functionCall ( indexes )? ) | ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP Identifier ( indexes )? ) | ^( LOOKUP String ( indexes )? ) );
    public final TLNode lookup() throws RecognitionException {
        TLNode node = null;

        try {
            // TLTreeWalker.g:126:3: ( ^( LOOKUP functionCall ( indexes )? ) | ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP Identifier ( indexes )? ) | ^( LOOKUP String ( indexes )? ) )
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
                    // TLTreeWalker.g:126:6: ^( LOOKUP functionCall ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup924); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_functionCall_in_lookup926);
                    functionCall();

                    state._fsp--;

                    // TLTreeWalker.g:126:28: ( indexes )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==INDEXES) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // TLTreeWalker.g:126:28: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup928);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // TLTreeWalker.g:127:6: ^( LOOKUP list ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup940); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_list_in_lookup942);
                    list();

                    state._fsp--;

                    // TLTreeWalker.g:127:20: ( indexes )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==INDEXES) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // TLTreeWalker.g:127:20: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup944);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // TLTreeWalker.g:128:6: ^( LOOKUP expression ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup956); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_lookup958);
                    expression();

                    state._fsp--;

                    // TLTreeWalker.g:128:26: ( indexes )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==INDEXES) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // TLTreeWalker.g:128:26: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup960);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // TLTreeWalker.g:129:6: ^( LOOKUP Identifier ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup973); 

                    match(input, Token.DOWN, null); 
                    match(input,Identifier,FOLLOW_Identifier_in_lookup975); 
                    // TLTreeWalker.g:129:26: ( indexes )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==INDEXES) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // TLTreeWalker.g:129:26: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup977);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // TLTreeWalker.g:130:6: ^( LOOKUP String ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup989); 

                    match(input, Token.DOWN, null); 
                    match(input,String,FOLLOW_String_in_lookup991); 
                    // TLTreeWalker.g:130:22: ( indexes )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==INDEXES) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // TLTreeWalker.g:130:22: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup993);
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
    public static final BitSet FOLLOW_BLOCK_in_delimitedBlock150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATEMENTS_in_delimitedBlock153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_delimitedBlock155 = new BitSet(new long[]{0x0000000000080388L});
    public static final BitSet FOLLOW_RETURN_in_delimitedBlock160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_delimitedBlock162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_in_statement184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_functionCall218 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_exprList_in_functionCall220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifStatement250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXP_in_ifStatement254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifStatement258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_ifStatement262 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_ifStatement276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_ifStatement280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_LIST_in_idList325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_idList327 = new BitSet(new long[]{0x0000000002000008L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_assignment347 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_indexes_in_assignment349 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_assignment352 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TO_PRINT_in_assignment360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_assignment362 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEXES_in_indexes383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_indexes385 = new BitSet(new long[]{0x0007FEFF7801F008L});
    public static final BitSet FOLLOW_EXP_LIST_in_exprList411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_exprList413 = new BitSet(new long[]{0x0007FEFF7801F008L});
    public static final BitSet FOLLOW_Or_in_expression441 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression443 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression445 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_And_in_expression456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression458 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression460 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Equals_in_expression471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression475 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEquals_in_expression491 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression495 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression499 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTEquals_in_expression511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression515 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression519 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTEquals_in_expression531 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression535 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_expression551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression555 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expression571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression575 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression579 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Add_in_expression591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression595 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Subt_in_expression610 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression614 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Mult_in_expression629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression633 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Div_in_expression648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression652 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Int_Div_in_expression667 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression671 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression675 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Mod_in_expression686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression690 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Pow_in_expression705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression707 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression709 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Bit_Xor_in_expression720 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression722 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression724 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Bit_And_in_expression735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression737 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression739 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Bit_Or_in_expression750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression752 = new BitSet(new long[]{0x0007FEFF7801F000L});
    public static final BitSet FOLLOW_expression_in_expression754 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MIN_in_expression765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression767 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression778 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression780 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIN_NOT_in_expression791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Number_in_expression803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_expression818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Null_in_expression833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_In_in_expression848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_expression855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_list892 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprList_in_list894 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup924 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionCall_in_lookup926 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup928 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup940 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_in_lookup942 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup944 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup956 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_lookup958 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup960 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup973 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_lookup975 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup977 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_String_in_lookup991 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_indexes_in_lookup993 = new BitSet(new long[]{0x0000000000000008L});

}