// $ANTLR 3.2 Sep 23, 2009 12:02:23 TL.g 2013-12-17 15:35:14
 
  package tl; 
  import java.util.Map; 
  import java.util.HashMap; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class TLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "RETURN", "STATEMENTS", "ASSIGNMENT", "TO_PRINT", "IF", "EXP", "ID_LIST", "INDEXES", "UNARY_MIN", "NOT", "BIN_NOT", "LOOKUP", "LIST", "EXP_LIST", "FUNC_CALL", "Return", "While", "If", "Else_If", "Else", "Def_Func", "Identifier", "Out", "Null", "Number", "Bool", "In", "String", "Or", "And", "Xor", "Equals", "NEquals", "GTEquals", "LTEquals", "GT", "LT", "Not", "Pow", "Add", "Subt", "Mult", "Int_Div", "Div", "Mod", "Bit_Or", "Bit_And", "Bit_Xor", "Bit_Not", "Strcat", "Gets", "Comma", "Open_Paren", "Close_Paren", "Open_Bracket", "Close_Bracket", "Open_Brace", "Close_Brace", "Int", "Digit", "Comment", "Space", "';'"
    };
    public static final int T__67=67;
    public static final int LT=41;
    public static final int Close_Brace=62;
    public static final int Open_Bracket=59;
    public static final int TO_PRINT=8;
    public static final int BIN_NOT=15;
    public static final int EXP_LIST=18;
    public static final int While=21;
    public static final int NOT=14;
    public static final int ID_LIST=11;
    public static final int Add=44;
    public static final int EOF=-1;
    public static final int Subt=45;
    public static final int Int=63;
    public static final int Identifier=26;
    public static final int Xor=35;
    public static final int IF=9;
    public static final int FUNC_CALL=19;
    public static final int Space=66;
    public static final int Out=27;
    public static final int Bit_And=51;
    public static final int Gets=55;
    public static final int Number=29;
    public static final int Comment=65;
    public static final int EXP=10;
    public static final int GTEquals=38;
    public static final int RETURN=5;
    public static final int Bit_Or=50;
    public static final int String=32;
    public static final int Or=33;
    public static final int Open_Brace=61;
    public static final int Return=20;
    public static final int Def_Func=25;
    public static final int If=22;
    public static final int Null=28;
    public static final int And=34;
    public static final int Div=48;
    public static final int Mod=49;
    public static final int Bool=30;
    public static final int In=31;
    public static final int NEquals=37;
    public static final int INDEXES=12;
    public static final int Strcat=54;
    public static final int Digit=64;
    public static final int Open_Paren=57;
    public static final int LIST=17;
    public static final int Mult=46;
    public static final int LOOKUP=16;
    public static final int Else_If=23;
    public static final int Close_Bracket=60;
    public static final int Bit_Xor=52;
    public static final int BLOCK=4;
    public static final int Not=42;
    public static final int Int_Div=47;
    public static final int STATEMENTS=6;
    public static final int GT=40;
    public static final int UNARY_MIN=13;
    public static final int ASSIGNMENT=7;
    public static final int Bit_Not=53;
    public static final int Else=24;
    public static final int Comma=56;
    public static final int Equals=36;
    public static final int Pow=43;
    public static final int Close_Paren=58;
    public static final int LTEquals=39;

    // delegates
    // delegators


        public TLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TLParser.tokenNames; }
    public String getGrammarFileName() { return "TL.g"; }

     
      public Map<String, Function> functions = new HashMap<String, Function>(); 
       
      private void defineFunction(String id, Object idList, Object block) { 
        // `idList` is possibly null!  Create an empty tree in that case.  
        CommonTree idListTree = idList == null ? new CommonTree() : (CommonTree)idList; 
     
        // `block` is never null 
        CommonTree blockTree = (CommonTree)block; 
     
        // The function name with the number of parameters after it, is the unique key 
        String key = id + idListTree.getChildCount(); 
        functions.put(key, new Function(id, idListTree, blockTree)); 
      } 


    public static class parse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parse"
    // TL.g:48:1: parse : delimitedBlock EOF ;
    public final TLParser.parse_return parse() throws RecognitionException {
        TLParser.parse_return retval = new TLParser.parse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        TLParser.delimitedBlock_return delimitedBlock1 = null;


        Object EOF2_tree=null;

        try {
            // TL.g:49:3: ( delimitedBlock EOF )
            // TL.g:49:6: delimitedBlock EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_delimitedBlock_in_parse135);
            delimitedBlock1=delimitedBlock();

            state._fsp--;

            adaptor.addChild(root_0, delimitedBlock1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse137); 
            EOF2_tree = (Object)adaptor.create(EOF2);
            adaptor.addChild(root_0, EOF2_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parse"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // TL.g:52:1: block : '{' ( statement | functionDecl )* ( Return expression ';' )? '}' -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
    public final TLParser.block_return block() throws RecognitionException {
        TLParser.block_return retval = new TLParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal3=null;
        Token Return6=null;
        Token char_literal8=null;
        Token char_literal9=null;
        TLParser.statement_return statement4 = null;

        TLParser.functionDecl_return functionDecl5 = null;

        TLParser.expression_return expression7 = null;


        Object char_literal3_tree=null;
        Object Return6_tree=null;
        Object char_literal8_tree=null;
        Object char_literal9_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_Close_Brace=new RewriteRuleTokenStream(adaptor,"token Close_Brace");
        RewriteRuleTokenStream stream_Open_Brace=new RewriteRuleTokenStream(adaptor,"token Open_Brace");
        RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");
        try {
            // TL.g:53:3: ( '{' ( statement | functionDecl )* ( Return expression ';' )? '}' -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // TL.g:53:6: '{' ( statement | functionDecl )* ( Return expression ';' )? '}'
            {
            char_literal3=(Token)match(input,Open_Brace,FOLLOW_Open_Brace_in_block151);  
            stream_Open_Brace.add(char_literal3);

            // TL.g:53:10: ( statement | functionDecl )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=While && LA1_0<=If)||(LA1_0>=Identifier && LA1_0<=Out)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==Def_Func) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // TL.g:53:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block154);
            	    statement4=statement();

            	    state._fsp--;

            	    stream_statement.add(statement4.getTree());

            	    }
            	    break;
            	case 2 :
            	    // TL.g:53:23: functionDecl
            	    {
            	    pushFollow(FOLLOW_functionDecl_in_block158);
            	    functionDecl5=functionDecl();

            	    state._fsp--;

            	    stream_functionDecl.add(functionDecl5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // TL.g:53:38: ( Return expression ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Return) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // TL.g:53:39: Return expression ';'
                    {
                    Return6=(Token)match(input,Return,FOLLOW_Return_in_block163);  
                    stream_Return.add(Return6);

                    pushFollow(FOLLOW_expression_in_block165);
                    expression7=expression();

                    state._fsp--;

                    stream_expression.add(expression7.getTree());
                    char_literal8=(Token)match(input,67,FOLLOW_67_in_block167);  
                    stream_67.add(char_literal8);


                    }
                    break;

            }

            char_literal9=(Token)match(input,Close_Brace,FOLLOW_Close_Brace_in_block171);  
            stream_Close_Brace.add(char_literal9);



            // AST REWRITE
            // elements: statement, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 54:5: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
                // TL.g:54:8: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // TL.g:54:16: ^( STATEMENTS ( statement )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);

                // TL.g:54:29: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_2, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_1, root_2);
                }
                // TL.g:54:41: ^( RETURN ( expression )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);

                // TL.g:54:50: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_2, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class delimitedBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delimitedBlock"
    // TL.g:57:1: delimitedBlock : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
    public final TLParser.delimitedBlock_return delimitedBlock() throws RecognitionException {
        TLParser.delimitedBlock_return retval = new TLParser.delimitedBlock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Return12=null;
        Token char_literal14=null;
        TLParser.statement_return statement10 = null;

        TLParser.functionDecl_return functionDecl11 = null;

        TLParser.expression_return expression13 = null;


        Object Return12_tree=null;
        Object char_literal14_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");
        try {
            // TL.g:58:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // TL.g:58:5: ( statement | functionDecl )* ( Return expression ';' )?
            {
            // TL.g:58:5: ( statement | functionDecl )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=While && LA3_0<=If)||(LA3_0>=Identifier && LA3_0<=Out)) ) {
                    alt3=1;
                }
                else if ( (LA3_0==Def_Func) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // TL.g:58:6: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_delimitedBlock209);
            	    statement10=statement();

            	    state._fsp--;

            	    stream_statement.add(statement10.getTree());

            	    }
            	    break;
            	case 2 :
            	    // TL.g:58:18: functionDecl
            	    {
            	    pushFollow(FOLLOW_functionDecl_in_delimitedBlock213);
            	    functionDecl11=functionDecl();

            	    state._fsp--;

            	    stream_functionDecl.add(functionDecl11.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // TL.g:58:33: ( Return expression ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Return) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // TL.g:58:34: Return expression ';'
                    {
                    Return12=(Token)match(input,Return,FOLLOW_Return_in_delimitedBlock218);  
                    stream_Return.add(Return12);

                    pushFollow(FOLLOW_expression_in_delimitedBlock220);
                    expression13=expression();

                    state._fsp--;

                    stream_expression.add(expression13.getTree());
                    char_literal14=(Token)match(input,67,FOLLOW_67_in_delimitedBlock222);  
                    stream_67.add(char_literal14);


                    }
                    break;

            }



            // AST REWRITE
            // elements: statement, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:5: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
                // TL.g:59:8: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // TL.g:59:16: ^( STATEMENTS ( statement )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);

                // TL.g:59:29: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_2, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_1, root_2);
                }
                // TL.g:59:41: ^( RETURN ( expression )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);

                // TL.g:59:50: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_2, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delimitedBlock"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // TL.g:62:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | whileStatement );
    public final TLParser.statement_return statement() throws RecognitionException {
        TLParser.statement_return retval = new TLParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal16=null;
        Token char_literal18=null;
        TLParser.assignment_return assignment15 = null;

        TLParser.functionCall_return functionCall17 = null;

        TLParser.ifStatement_return ifStatement19 = null;

        TLParser.whileStatement_return whileStatement20 = null;


        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // TL.g:63:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | whileStatement )
            int alt5=4;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==Open_Paren) ) {
                    alt5=2;
                }
                else if ( (LA5_1==Gets||LA5_1==Open_Bracket) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case Out:
                {
                alt5=1;
                }
                break;
            case If:
                {
                alt5=3;
                }
                break;
            case While:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // TL.g:63:6: assignment ';'
                    {
                    pushFollow(FOLLOW_assignment_in_statement262);
                    assignment15=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment15.getTree());
                    char_literal16=(Token)match(input,67,FOLLOW_67_in_statement264);  
                    stream_67.add(char_literal16);



                    // AST REWRITE
                    // elements: assignment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 63:21: -> assignment
                    {
                        adaptor.addChild(root_0, stream_assignment.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // TL.g:64:6: functionCall ';'
                    {
                    pushFollow(FOLLOW_functionCall_in_statement275);
                    functionCall17=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall17.getTree());
                    char_literal18=(Token)match(input,67,FOLLOW_67_in_statement277);  
                    stream_67.add(char_literal18);



                    // AST REWRITE
                    // elements: functionCall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:23: -> functionCall
                    {
                        adaptor.addChild(root_0, stream_functionCall.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // TL.g:65:6: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement288);
                    ifStatement19=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement19.getTree());

                    }
                    break;
                case 4 :
                    // TL.g:66:6: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_statement295);
                    whileStatement20=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement20.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // TL.g:69:1: whileStatement : While expression block -> ^( While expression block ) ;
    public final TLParser.whileStatement_return whileStatement() throws RecognitionException {
        TLParser.whileStatement_return retval = new TLParser.whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token While21=null;
        TLParser.expression_return expression22 = null;

        TLParser.block_return block23 = null;


        Object While21_tree=null;
        RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // TL.g:70:3: ( While expression block -> ^( While expression block ) )
            // TL.g:70:6: While expression block
            {
            While21=(Token)match(input,While,FOLLOW_While_in_whileStatement309);  
            stream_While.add(While21);

            pushFollow(FOLLOW_expression_in_whileStatement311);
            expression22=expression();

            state._fsp--;

            stream_expression.add(expression22.getTree());
            pushFollow(FOLLOW_block_in_whileStatement313);
            block23=block();

            state._fsp--;

            stream_block.add(block23.getTree());


            // AST REWRITE
            // elements: block, While, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 70:29: -> ^( While expression block )
            {
                // TL.g:70:32: ^( While expression block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_While.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // TL.g:73:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
    public final TLParser.ifStatement_return ifStatement() throws RecognitionException {
        TLParser.ifStatement_return retval = new TLParser.ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TLParser.ifStat_return ifStat24 = null;

        TLParser.elseIfStat_return elseIfStat25 = null;

        TLParser.elseStat_return elseStat26 = null;


        RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
        RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
        RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");
        try {
            // TL.g:74:3: ( ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
            // TL.g:74:6: ifStat ( elseIfStat )* ( elseStat )?
            {
            pushFollow(FOLLOW_ifStat_in_ifStatement337);
            ifStat24=ifStat();

            state._fsp--;

            stream_ifStat.add(ifStat24.getTree());
            // TL.g:74:13: ( elseIfStat )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Else) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==If) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==Else_If) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // TL.g:74:13: elseIfStat
            	    {
            	    pushFollow(FOLLOW_elseIfStat_in_ifStatement339);
            	    elseIfStat25=elseIfStat();

            	    state._fsp--;

            	    stream_elseIfStat.add(elseIfStat25.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // TL.g:74:25: ( elseStat )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Else) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // TL.g:74:25: elseStat
                    {
                    pushFollow(FOLLOW_elseStat_in_ifStatement342);
                    elseStat26=elseStat();

                    state._fsp--;

                    stream_elseStat.add(elseStat26.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: elseIfStat, ifStat, elseStat
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:35: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
            {
                // TL.g:74:38: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_ifStat.nextTree());
                // TL.g:74:50: ( elseIfStat )*
                while ( stream_elseIfStat.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseIfStat.nextTree());

                }
                stream_elseIfStat.reset();
                // TL.g:74:62: ( elseStat )?
                if ( stream_elseStat.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseStat.nextTree());

                }
                stream_elseStat.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class ifStat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStat"
    // TL.g:77:1: ifStat : If expression block -> ^( EXP expression block ) ;
    public final TLParser.ifStat_return ifStat() throws RecognitionException {
        TLParser.ifStat_return retval = new TLParser.ifStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token If27=null;
        TLParser.expression_return expression28 = null;

        TLParser.block_return block29 = null;


        Object If27_tree=null;
        RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // TL.g:78:3: ( If expression block -> ^( EXP expression block ) )
            // TL.g:78:6: If expression block
            {
            If27=(Token)match(input,If,FOLLOW_If_in_ifStat371);  
            stream_If.add(If27);

            pushFollow(FOLLOW_expression_in_ifStat373);
            expression28=expression();

            state._fsp--;

            stream_expression.add(expression28.getTree());
            pushFollow(FOLLOW_block_in_ifStat375);
            block29=block();

            state._fsp--;

            stream_block.add(block29.getTree());


            // AST REWRITE
            // elements: expression, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 78:26: -> ^( EXP expression block )
            {
                // TL.g:78:29: ^( EXP expression block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStat"

    public static class elseIfStat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseIfStat"
    // TL.g:81:1: elseIfStat : ( Else_If expression block -> ^( EXP expression block ) | Else If expression block -> ^( EXP expression block ) );
    public final TLParser.elseIfStat_return elseIfStat() throws RecognitionException {
        TLParser.elseIfStat_return retval = new TLParser.elseIfStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Else_If30=null;
        Token Else33=null;
        Token If34=null;
        TLParser.expression_return expression31 = null;

        TLParser.block_return block32 = null;

        TLParser.expression_return expression35 = null;

        TLParser.block_return block36 = null;


        Object Else_If30_tree=null;
        Object Else33_tree=null;
        Object If34_tree=null;
        RewriteRuleTokenStream stream_Else_If=new RewriteRuleTokenStream(adaptor,"token Else_If");
        RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
        RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // TL.g:82:3: ( Else_If expression block -> ^( EXP expression block ) | Else If expression block -> ^( EXP expression block ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Else_If) ) {
                alt8=1;
            }
            else if ( (LA8_0==Else) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // TL.g:82:6: Else_If expression block
                    {
                    Else_If30=(Token)match(input,Else_If,FOLLOW_Else_If_in_elseIfStat399);  
                    stream_Else_If.add(Else_If30);

                    pushFollow(FOLLOW_expression_in_elseIfStat401);
                    expression31=expression();

                    state._fsp--;

                    stream_expression.add(expression31.getTree());
                    pushFollow(FOLLOW_block_in_elseIfStat403);
                    block32=block();

                    state._fsp--;

                    stream_block.add(block32.getTree());


                    // AST REWRITE
                    // elements: block, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:31: -> ^( EXP expression block )
                    {
                        // TL.g:82:34: ^( EXP expression block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // TL.g:83:6: Else If expression block
                    {
                    Else33=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat420);  
                    stream_Else.add(Else33);

                    If34=(Token)match(input,If,FOLLOW_If_in_elseIfStat422);  
                    stream_If.add(If34);

                    pushFollow(FOLLOW_expression_in_elseIfStat424);
                    expression35=expression();

                    state._fsp--;

                    stream_expression.add(expression35.getTree());
                    pushFollow(FOLLOW_block_in_elseIfStat426);
                    block36=block();

                    state._fsp--;

                    stream_block.add(block36.getTree());


                    // AST REWRITE
                    // elements: expression, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:31: -> ^( EXP expression block )
                    {
                        // TL.g:83:34: ^( EXP expression block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elseIfStat"

    public static class elseStat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseStat"
    // TL.g:86:1: elseStat : Else block -> ^( EXP block ) ;
    public final TLParser.elseStat_return elseStat() throws RecognitionException {
        TLParser.elseStat_return retval = new TLParser.elseStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Else37=null;
        TLParser.block_return block38 = null;


        Object Else37_tree=null;
        RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // TL.g:87:3: ( Else block -> ^( EXP block ) )
            // TL.g:87:6: Else block
            {
            Else37=(Token)match(input,Else,FOLLOW_Else_in_elseStat450);  
            stream_Else.add(Else37);

            pushFollow(FOLLOW_block_in_elseStat452);
            block38=block();

            state._fsp--;

            stream_block.add(block38.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:17: -> ^( EXP block )
            {
                // TL.g:87:20: ^( EXP block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elseStat"

    public static class functionDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDecl"
    // TL.g:90:1: functionDecl : Def_Func Identifier '(' ( idList )? ')' block ;
    public final TLParser.functionDecl_return functionDecl() throws RecognitionException {
        TLParser.functionDecl_return retval = new TLParser.functionDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Def_Func39=null;
        Token Identifier40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        TLParser.idList_return idList42 = null;

        TLParser.block_return block44 = null;


        Object Def_Func39_tree=null;
        Object Identifier40_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;

        try {
            // TL.g:91:3: ( Def_Func Identifier '(' ( idList )? ')' block )
            // TL.g:91:6: Def_Func Identifier '(' ( idList )? ')' block
            {
            root_0 = (Object)adaptor.nil();

            Def_Func39=(Token)match(input,Def_Func,FOLLOW_Def_Func_in_functionDecl474); 
            Def_Func39_tree = (Object)adaptor.create(Def_Func39);
            adaptor.addChild(root_0, Def_Func39_tree);

            Identifier40=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl476); 
            Identifier40_tree = (Object)adaptor.create(Identifier40);
            adaptor.addChild(root_0, Identifier40_tree);

            char_literal41=(Token)match(input,Open_Paren,FOLLOW_Open_Paren_in_functionDecl478); 
            char_literal41_tree = (Object)adaptor.create(char_literal41);
            adaptor.addChild(root_0, char_literal41_tree);

            // TL.g:91:30: ( idList )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Identifier) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // TL.g:91:30: idList
                    {
                    pushFollow(FOLLOW_idList_in_functionDecl480);
                    idList42=idList();

                    state._fsp--;

                    adaptor.addChild(root_0, idList42.getTree());

                    }
                    break;

            }

            char_literal43=(Token)match(input,Close_Paren,FOLLOW_Close_Paren_in_functionDecl483); 
            char_literal43_tree = (Object)adaptor.create(char_literal43);
            adaptor.addChild(root_0, char_literal43_tree);

            pushFollow(FOLLOW_block_in_functionDecl485);
            block44=block();

            state._fsp--;

            adaptor.addChild(root_0, block44.getTree());
            defineFunction((Identifier40!=null?Identifier40.getText():null), (idList42!=null?((Object)idList42.tree):null), (block44!=null?((Object)block44.tree):null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDecl"

    public static class idList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idList"
    // TL.g:95:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
    public final TLParser.idList_return idList() throws RecognitionException {
        TLParser.idList_return retval = new TLParser.idList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier45=null;
        Token char_literal46=null;
        Token Identifier47=null;

        Object Identifier45_tree=null;
        Object char_literal46_tree=null;
        Object Identifier47_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // TL.g:96:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
            // TL.g:96:6: Identifier ( ',' Identifier )*
            {
            Identifier45=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList507);  
            stream_Identifier.add(Identifier45);

            // TL.g:96:17: ( ',' Identifier )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // TL.g:96:18: ',' Identifier
            	    {
            	    char_literal46=(Token)match(input,Comma,FOLLOW_Comma_in_idList510);  
            	    stream_Comma.add(char_literal46);

            	    Identifier47=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList512);  
            	    stream_Identifier.add(Identifier47);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);



            // AST REWRITE
            // elements: Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 96:35: -> ^( ID_LIST ( Identifier )+ )
            {
                // TL.g:96:38: ^( ID_LIST ( Identifier )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID_LIST, "ID_LIST"), root_1);

                if ( !(stream_Identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "idList"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // TL.g:99:2: assignment : ( Identifier ( indexes )? '<-' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | Out '<-' expression -> ^( TO_PRINT expression ) );
    public final TLParser.assignment_return assignment() throws RecognitionException {
        TLParser.assignment_return retval = new TLParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier48=null;
        Token string_literal50=null;
        Token Out52=null;
        Token string_literal53=null;
        TLParser.indexes_return indexes49 = null;

        TLParser.expression_return expression51 = null;

        TLParser.expression_return expression54 = null;


        Object Identifier48_tree=null;
        Object string_literal50_tree=null;
        Object Out52_tree=null;
        Object string_literal53_tree=null;
        RewriteRuleTokenStream stream_Out=new RewriteRuleTokenStream(adaptor,"token Out");
        RewriteRuleTokenStream stream_Gets=new RewriteRuleTokenStream(adaptor,"token Gets");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
        try {
            // TL.g:100:3: ( Identifier ( indexes )? '<-' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | Out '<-' expression -> ^( TO_PRINT expression ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Identifier) ) {
                alt12=1;
            }
            else if ( (LA12_0==Out) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // TL.g:100:6: Identifier ( indexes )? '<-' expression
                    {
                    Identifier48=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment539);  
                    stream_Identifier.add(Identifier48);

                    // TL.g:100:17: ( indexes )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==Open_Bracket) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // TL.g:100:17: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_assignment541);
                            indexes49=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes49.getTree());

                            }
                            break;

                    }

                    string_literal50=(Token)match(input,Gets,FOLLOW_Gets_in_assignment544);  
                    stream_Gets.add(string_literal50);

                    pushFollow(FOLLOW_expression_in_assignment546);
                    expression51=expression();

                    state._fsp--;

                    stream_expression.add(expression51.getTree());


                    // AST REWRITE
                    // elements: indexes, expression, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:5: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
                    {
                        // TL.g:101:8: ^( ASSIGNMENT Identifier ( indexes )? expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        // TL.g:101:32: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // TL.g:102:6: Out '<-' expression
                    {
                    Out52=(Token)match(input,Out,FOLLOW_Out_in_assignment570);  
                    stream_Out.add(Out52);

                    string_literal53=(Token)match(input,Gets,FOLLOW_Gets_in_assignment572);  
                    stream_Gets.add(string_literal53);

                    pushFollow(FOLLOW_expression_in_assignment574);
                    expression54=expression();

                    state._fsp--;

                    stream_expression.add(expression54.getTree());


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:9: -> ^( TO_PRINT expression )
                    {
                        // TL.g:103:12: ^( TO_PRINT expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TO_PRINT, "TO_PRINT"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class indexes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexes"
    // TL.g:106:1: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
    public final TLParser.indexes_return indexes() throws RecognitionException {
        TLParser.indexes_return retval = new TLParser.indexes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal55=null;
        Token char_literal57=null;
        TLParser.expression_return expression56 = null;


        Object char_literal55_tree=null;
        Object char_literal57_tree=null;
        RewriteRuleTokenStream stream_Open_Bracket=new RewriteRuleTokenStream(adaptor,"token Open_Bracket");
        RewriteRuleTokenStream stream_Close_Bracket=new RewriteRuleTokenStream(adaptor,"token Close_Bracket");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // TL.g:107:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
            // TL.g:107:6: ( '[' expression ']' )+
            {
            // TL.g:107:6: ( '[' expression ']' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Open_Bracket) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // TL.g:107:7: '[' expression ']'
            	    {
            	    char_literal55=(Token)match(input,Open_Bracket,FOLLOW_Open_Bracket_in_indexes605);  
            	    stream_Open_Bracket.add(char_literal55);

            	    pushFollow(FOLLOW_expression_in_indexes607);
            	    expression56=expression();

            	    state._fsp--;

            	    stream_expression.add(expression56.getTree());
            	    char_literal57=(Token)match(input,Close_Bracket,FOLLOW_Close_Bracket_in_indexes609);  
            	    stream_Close_Bracket.add(char_literal57);


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



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 107:28: -> ^( INDEXES ( expression )+ )
            {
                // TL.g:107:31: ^( INDEXES ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEXES, "INDEXES"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "indexes"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // TL.g:110:2: expression : orExpr ;
    public final TLParser.expression_return expression() throws RecognitionException {
        TLParser.expression_return retval = new TLParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TLParser.orExpr_return orExpr58 = null;



        try {
            // TL.g:111:3: ( orExpr )
            // TL.g:111:6: orExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpr_in_expression636);
            orExpr58=orExpr();

            state._fsp--;

            adaptor.addChild(root_0, orExpr58.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class orExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExpr"
    // TL.g:120:1: orExpr : andExpr ( '|_|' andExpr )* ;
    public final TLParser.orExpr_return orExpr() throws RecognitionException {
        TLParser.orExpr_return retval = new TLParser.orExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal60=null;
        TLParser.andExpr_return andExpr59 = null;

        TLParser.andExpr_return andExpr61 = null;


        Object string_literal60_tree=null;

        try {
            // TL.g:121:3: ( andExpr ( '|_|' andExpr )* )
            // TL.g:121:6: andExpr ( '|_|' andExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpr_in_orExpr653);
            andExpr59=andExpr();

            state._fsp--;

            adaptor.addChild(root_0, andExpr59.getTree());
            // TL.g:121:14: ( '|_|' andExpr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Or) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // TL.g:121:15: '|_|' andExpr
            	    {
            	    string_literal60=(Token)match(input,Or,FOLLOW_Or_in_orExpr656); 
            	    string_literal60_tree = (Object)adaptor.create(string_literal60);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal60_tree, root_0);

            	    pushFollow(FOLLOW_andExpr_in_orExpr659);
            	    andExpr61=andExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andExpr61.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orExpr"

    public static class andExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpr"
    // TL.g:124:1: andExpr : xorExpr ( '&_&' xorExpr )* ;
    public final TLParser.andExpr_return andExpr() throws RecognitionException {
        TLParser.andExpr_return retval = new TLParser.andExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal63=null;
        TLParser.xorExpr_return xorExpr62 = null;

        TLParser.xorExpr_return xorExpr64 = null;


        Object string_literal63_tree=null;

        try {
            // TL.g:125:3: ( xorExpr ( '&_&' xorExpr )* )
            // TL.g:125:6: xorExpr ( '&_&' xorExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_xorExpr_in_andExpr675);
            xorExpr62=xorExpr();

            state._fsp--;

            adaptor.addChild(root_0, xorExpr62.getTree());
            // TL.g:125:14: ( '&_&' xorExpr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==And) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // TL.g:125:15: '&_&' xorExpr
            	    {
            	    string_literal63=(Token)match(input,And,FOLLOW_And_in_andExpr678); 
            	    string_literal63_tree = (Object)adaptor.create(string_literal63);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal63_tree, root_0);

            	    pushFollow(FOLLOW_xorExpr_in_andExpr681);
            	    xorExpr64=xorExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xorExpr64.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "andExpr"

    public static class xorExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xorExpr"
    // TL.g:128:1: xorExpr : bitORExpr ( '^_^' bitORExpr )* ;
    public final TLParser.xorExpr_return xorExpr() throws RecognitionException {
        TLParser.xorExpr_return retval = new TLParser.xorExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal66=null;
        TLParser.bitORExpr_return bitORExpr65 = null;

        TLParser.bitORExpr_return bitORExpr67 = null;


        Object string_literal66_tree=null;

        try {
            // TL.g:129:3: ( bitORExpr ( '^_^' bitORExpr )* )
            // TL.g:129:6: bitORExpr ( '^_^' bitORExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitORExpr_in_xorExpr697);
            bitORExpr65=bitORExpr();

            state._fsp--;

            adaptor.addChild(root_0, bitORExpr65.getTree());
            // TL.g:129:16: ( '^_^' bitORExpr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Xor) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // TL.g:129:17: '^_^' bitORExpr
            	    {
            	    string_literal66=(Token)match(input,Xor,FOLLOW_Xor_in_xorExpr700); 
            	    string_literal66_tree = (Object)adaptor.create(string_literal66);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal66_tree, root_0);

            	    pushFollow(FOLLOW_bitORExpr_in_xorExpr703);
            	    bitORExpr67=bitORExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitORExpr67.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "xorExpr"

    public static class bitORExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitORExpr"
    // TL.g:132:1: bitORExpr : bitXORExpr ( '|' bitXORExpr )* ;
    public final TLParser.bitORExpr_return bitORExpr() throws RecognitionException {
        TLParser.bitORExpr_return retval = new TLParser.bitORExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal69=null;
        TLParser.bitXORExpr_return bitXORExpr68 = null;

        TLParser.bitXORExpr_return bitXORExpr70 = null;


        Object char_literal69_tree=null;

        try {
            // TL.g:133:3: ( bitXORExpr ( '|' bitXORExpr )* )
            // TL.g:133:6: bitXORExpr ( '|' bitXORExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitXORExpr_in_bitORExpr719);
            bitXORExpr68=bitXORExpr();

            state._fsp--;

            adaptor.addChild(root_0, bitXORExpr68.getTree());
            // TL.g:133:17: ( '|' bitXORExpr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Bit_Or) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // TL.g:133:18: '|' bitXORExpr
            	    {
            	    char_literal69=(Token)match(input,Bit_Or,FOLLOW_Bit_Or_in_bitORExpr722); 
            	    char_literal69_tree = (Object)adaptor.create(char_literal69);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal69_tree, root_0);

            	    pushFollow(FOLLOW_bitXORExpr_in_bitORExpr725);
            	    bitXORExpr70=bitXORExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitXORExpr70.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitORExpr"

    public static class bitXORExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitXORExpr"
    // TL.g:136:1: bitXORExpr : bitANDExpr ( '^' bitANDExpr )* ;
    public final TLParser.bitXORExpr_return bitXORExpr() throws RecognitionException {
        TLParser.bitXORExpr_return retval = new TLParser.bitXORExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal72=null;
        TLParser.bitANDExpr_return bitANDExpr71 = null;

        TLParser.bitANDExpr_return bitANDExpr73 = null;


        Object char_literal72_tree=null;

        try {
            // TL.g:137:3: ( bitANDExpr ( '^' bitANDExpr )* )
            // TL.g:137:6: bitANDExpr ( '^' bitANDExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitANDExpr_in_bitXORExpr741);
            bitANDExpr71=bitANDExpr();

            state._fsp--;

            adaptor.addChild(root_0, bitANDExpr71.getTree());
            // TL.g:137:17: ( '^' bitANDExpr )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Bit_Xor) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // TL.g:137:18: '^' bitANDExpr
            	    {
            	    char_literal72=(Token)match(input,Bit_Xor,FOLLOW_Bit_Xor_in_bitXORExpr744); 
            	    char_literal72_tree = (Object)adaptor.create(char_literal72);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal72_tree, root_0);

            	    pushFollow(FOLLOW_bitANDExpr_in_bitXORExpr747);
            	    bitANDExpr73=bitANDExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitANDExpr73.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitXORExpr"

    public static class bitANDExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitANDExpr"
    // TL.g:140:1: bitANDExpr : equExpr ( '&' equExpr )* ;
    public final TLParser.bitANDExpr_return bitANDExpr() throws RecognitionException {
        TLParser.bitANDExpr_return retval = new TLParser.bitANDExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal75=null;
        TLParser.equExpr_return equExpr74 = null;

        TLParser.equExpr_return equExpr76 = null;


        Object char_literal75_tree=null;

        try {
            // TL.g:141:3: ( equExpr ( '&' equExpr )* )
            // TL.g:141:6: equExpr ( '&' equExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equExpr_in_bitANDExpr763);
            equExpr74=equExpr();

            state._fsp--;

            adaptor.addChild(root_0, equExpr74.getTree());
            // TL.g:141:14: ( '&' equExpr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Bit_And) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // TL.g:141:15: '&' equExpr
            	    {
            	    char_literal75=(Token)match(input,Bit_And,FOLLOW_Bit_And_in_bitANDExpr766); 
            	    char_literal75_tree = (Object)adaptor.create(char_literal75);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal75_tree, root_0);

            	    pushFollow(FOLLOW_equExpr_in_bitANDExpr769);
            	    equExpr76=equExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equExpr76.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitANDExpr"

    public static class equExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equExpr"
    // TL.g:144:1: equExpr : relExpr ( ( '=_=' | '>_<' ) relExpr )* ;
    public final TLParser.equExpr_return equExpr() throws RecognitionException {
        TLParser.equExpr_return retval = new TLParser.equExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set78=null;
        TLParser.relExpr_return relExpr77 = null;

        TLParser.relExpr_return relExpr79 = null;


        Object set78_tree=null;

        try {
            // TL.g:145:3: ( relExpr ( ( '=_=' | '>_<' ) relExpr )* )
            // TL.g:145:6: relExpr ( ( '=_=' | '>_<' ) relExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relExpr_in_equExpr785);
            relExpr77=relExpr();

            state._fsp--;

            adaptor.addChild(root_0, relExpr77.getTree());
            // TL.g:145:14: ( ( '=_=' | '>_<' ) relExpr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=Equals && LA20_0<=NEquals)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // TL.g:145:15: ( '=_=' | '>_<' ) relExpr
            	    {
            	    set78=(Token)input.LT(1);
            	    set78=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Equals && input.LA(1)<=NEquals) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set78), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relExpr_in_equExpr797);
            	    relExpr79=relExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relExpr79.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equExpr"

    public static class relExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relExpr"
    // TL.g:148:1: relExpr : addExpr ( ( '>_=' | '=_<' | '>_>' | '<_<' ) addExpr )* ;
    public final TLParser.relExpr_return relExpr() throws RecognitionException {
        TLParser.relExpr_return retval = new TLParser.relExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set81=null;
        TLParser.addExpr_return addExpr80 = null;

        TLParser.addExpr_return addExpr82 = null;


        Object set81_tree=null;

        try {
            // TL.g:149:3: ( addExpr ( ( '>_=' | '=_<' | '>_>' | '<_<' ) addExpr )* )
            // TL.g:149:6: addExpr ( ( '>_=' | '=_<' | '>_>' | '<_<' ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_relExpr813);
            addExpr80=addExpr();

            state._fsp--;

            adaptor.addChild(root_0, addExpr80.getTree());
            // TL.g:149:14: ( ( '>_=' | '=_<' | '>_>' | '<_<' ) addExpr )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=GTEquals && LA21_0<=LT)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // TL.g:149:15: ( '>_=' | '=_<' | '>_>' | '<_<' ) addExpr
            	    {
            	    set81=(Token)input.LT(1);
            	    set81=(Token)input.LT(1);
            	    if ( (input.LA(1)>=GTEquals && input.LA(1)<=LT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set81), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_relExpr833);
            	    addExpr82=addExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, addExpr82.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // TL.g:152:1: addExpr : mulExpr ( ( '+' | '-' | '#' ) mulExpr )* ;
    public final TLParser.addExpr_return addExpr() throws RecognitionException {
        TLParser.addExpr_return retval = new TLParser.addExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set84=null;
        TLParser.mulExpr_return mulExpr83 = null;

        TLParser.mulExpr_return mulExpr85 = null;


        Object set84_tree=null;

        try {
            // TL.g:153:3: ( mulExpr ( ( '+' | '-' | '#' ) mulExpr )* )
            // TL.g:153:6: mulExpr ( ( '+' | '-' | '#' ) mulExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mulExpr_in_addExpr849);
            mulExpr83=mulExpr();

            state._fsp--;

            adaptor.addChild(root_0, mulExpr83.getTree());
            // TL.g:153:14: ( ( '+' | '-' | '#' ) mulExpr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=Add && LA22_0<=Subt)||LA22_0==Strcat) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // TL.g:153:15: ( '+' | '-' | '#' ) mulExpr
            	    {
            	    set84=(Token)input.LT(1);
            	    set84=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Add && input.LA(1)<=Subt)||input.LA(1)==Strcat ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set84), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mulExpr_in_addExpr865);
            	    mulExpr85=mulExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mulExpr85.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class mulExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mulExpr"
    // TL.g:156:1: mulExpr : powExpr ( ( '*' | '/' | '%' | '//' ) powExpr )* ;
    public final TLParser.mulExpr_return mulExpr() throws RecognitionException {
        TLParser.mulExpr_return retval = new TLParser.mulExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set87=null;
        TLParser.powExpr_return powExpr86 = null;

        TLParser.powExpr_return powExpr88 = null;


        Object set87_tree=null;

        try {
            // TL.g:157:3: ( powExpr ( ( '*' | '/' | '%' | '//' ) powExpr )* )
            // TL.g:157:6: powExpr ( ( '*' | '/' | '%' | '//' ) powExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powExpr_in_mulExpr881);
            powExpr86=powExpr();

            state._fsp--;

            adaptor.addChild(root_0, powExpr86.getTree());
            // TL.g:157:14: ( ( '*' | '/' | '%' | '//' ) powExpr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=Mult && LA23_0<=Mod)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // TL.g:157:15: ( '*' | '/' | '%' | '//' ) powExpr
            	    {
            	    set87=(Token)input.LT(1);
            	    set87=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Mult && input.LA(1)<=Mod) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set87), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_powExpr_in_mulExpr901);
            	    powExpr88=powExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, powExpr88.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mulExpr"

    public static class powExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "powExpr"
    // TL.g:160:1: powExpr : unaryExpr ( '**' unaryExpr )* ;
    public final TLParser.powExpr_return powExpr() throws RecognitionException {
        TLParser.powExpr_return retval = new TLParser.powExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal90=null;
        TLParser.unaryExpr_return unaryExpr89 = null;

        TLParser.unaryExpr_return unaryExpr91 = null;


        Object string_literal90_tree=null;

        try {
            // TL.g:161:3: ( unaryExpr ( '**' unaryExpr )* )
            // TL.g:161:6: unaryExpr ( '**' unaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpr_in_powExpr917);
            unaryExpr89=unaryExpr();

            state._fsp--;

            adaptor.addChild(root_0, unaryExpr89.getTree());
            // TL.g:161:16: ( '**' unaryExpr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Pow) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // TL.g:161:17: '**' unaryExpr
            	    {
            	    string_literal90=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr920); 
            	    string_literal90_tree = (Object)adaptor.create(string_literal90);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal90_tree, root_0);

            	    pushFollow(FOLLOW_unaryExpr_in_powExpr923);
            	    unaryExpr91=unaryExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExpr91.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "powExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // TL.g:164:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NOT atom ) | '~' atom -> ^( BIN_NOT atom ) | atom );
    public final TLParser.unaryExpr_return unaryExpr() throws RecognitionException {
        TLParser.unaryExpr_return retval = new TLParser.unaryExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal92=null;
        Token char_literal94=null;
        Token char_literal96=null;
        TLParser.atom_return atom93 = null;

        TLParser.atom_return atom95 = null;

        TLParser.atom_return atom97 = null;

        TLParser.atom_return atom98 = null;


        Object char_literal92_tree=null;
        Object char_literal94_tree=null;
        Object char_literal96_tree=null;
        RewriteRuleTokenStream stream_Bit_Not=new RewriteRuleTokenStream(adaptor,"token Bit_Not");
        RewriteRuleTokenStream stream_Subt=new RewriteRuleTokenStream(adaptor,"token Subt");
        RewriteRuleTokenStream stream_Not=new RewriteRuleTokenStream(adaptor,"token Not");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // TL.g:165:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NOT atom ) | '~' atom -> ^( BIN_NOT atom ) | atom )
            int alt25=4;
            switch ( input.LA(1) ) {
            case Subt:
                {
                alt25=1;
                }
                break;
            case Not:
                {
                alt25=2;
                }
                break;
            case Bit_Not:
                {
                alt25=3;
                }
                break;
            case Identifier:
            case Null:
            case Number:
            case Bool:
            case In:
            case String:
            case Open_Paren:
            case Open_Bracket:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // TL.g:165:6: '-' atom
                    {
                    char_literal92=(Token)match(input,Subt,FOLLOW_Subt_in_unaryExpr941);  
                    stream_Subt.add(char_literal92);

                    pushFollow(FOLLOW_atom_in_unaryExpr943);
                    atom93=atom();

                    state._fsp--;

                    stream_atom.add(atom93.getTree());


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:15: -> ^( UNARY_MIN atom )
                    {
                        // TL.g:165:18: ^( UNARY_MIN atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MIN, "UNARY_MIN"), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // TL.g:166:6: '!' atom
                    {
                    char_literal94=(Token)match(input,Not,FOLLOW_Not_in_unaryExpr958);  
                    stream_Not.add(char_literal94);

                    pushFollow(FOLLOW_atom_in_unaryExpr960);
                    atom95=atom();

                    state._fsp--;

                    stream_atom.add(atom95.getTree());


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 166:15: -> ^( NOT atom )
                    {
                        // TL.g:166:18: ^( NOT atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // TL.g:167:6: '~' atom
                    {
                    char_literal96=(Token)match(input,Bit_Not,FOLLOW_Bit_Not_in_unaryExpr975);  
                    stream_Bit_Not.add(char_literal96);

                    pushFollow(FOLLOW_atom_in_unaryExpr977);
                    atom97=atom();

                    state._fsp--;

                    stream_atom.add(atom97.getTree());


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 167:15: -> ^( BIN_NOT atom )
                    {
                        // TL.g:167:18: ^( BIN_NOT atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BIN_NOT, "BIN_NOT"), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // TL.g:168:6: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_unaryExpr992);
                    atom98=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom98.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // TL.g:171:1: atom : ( Null | Number | Bool | lookup | In ( '(' String ')' )? -> ^( In ( String )? ) );
    public final TLParser.atom_return atom() throws RecognitionException {
        TLParser.atom_return retval = new TLParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Null99=null;
        Token Number100=null;
        Token Bool101=null;
        Token In103=null;
        Token char_literal104=null;
        Token String105=null;
        Token char_literal106=null;
        TLParser.lookup_return lookup102 = null;


        Object Null99_tree=null;
        Object Number100_tree=null;
        Object Bool101_tree=null;
        Object In103_tree=null;
        Object char_literal104_tree=null;
        Object String105_tree=null;
        Object char_literal106_tree=null;
        RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_Open_Paren=new RewriteRuleTokenStream(adaptor,"token Open_Paren");
        RewriteRuleTokenStream stream_Close_Paren=new RewriteRuleTokenStream(adaptor,"token Close_Paren");

        try {
            // TL.g:172:3: ( Null | Number | Bool | lookup | In ( '(' String ')' )? -> ^( In ( String )? ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case Null:
                {
                alt27=1;
                }
                break;
            case Number:
                {
                alt27=2;
                }
                break;
            case Bool:
                {
                alt27=3;
                }
                break;
            case Identifier:
            case String:
            case Open_Paren:
            case Open_Bracket:
                {
                alt27=4;
                }
                break;
            case In:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // TL.g:172:6: Null
                    {
                    root_0 = (Object)adaptor.nil();

                    Null99=(Token)match(input,Null,FOLLOW_Null_in_atom1006); 
                    Null99_tree = (Object)adaptor.create(Null99);
                    adaptor.addChild(root_0, Null99_tree);


                    }
                    break;
                case 2 :
                    // TL.g:173:6: Number
                    {
                    root_0 = (Object)adaptor.nil();

                    Number100=(Token)match(input,Number,FOLLOW_Number_in_atom1013); 
                    Number100_tree = (Object)adaptor.create(Number100);
                    adaptor.addChild(root_0, Number100_tree);


                    }
                    break;
                case 3 :
                    // TL.g:174:6: Bool
                    {
                    root_0 = (Object)adaptor.nil();

                    Bool101=(Token)match(input,Bool,FOLLOW_Bool_in_atom1020); 
                    Bool101_tree = (Object)adaptor.create(Bool101);
                    adaptor.addChild(root_0, Bool101_tree);


                    }
                    break;
                case 4 :
                    // TL.g:175:6: lookup
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lookup_in_atom1027);
                    lookup102=lookup();

                    state._fsp--;

                    adaptor.addChild(root_0, lookup102.getTree());

                    }
                    break;
                case 5 :
                    // TL.g:176:6: In ( '(' String ')' )?
                    {
                    In103=(Token)match(input,In,FOLLOW_In_in_atom1034);  
                    stream_In.add(In103);

                    // TL.g:176:9: ( '(' String ')' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==Open_Paren) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // TL.g:176:10: '(' String ')'
                            {
                            char_literal104=(Token)match(input,Open_Paren,FOLLOW_Open_Paren_in_atom1037);  
                            stream_Open_Paren.add(char_literal104);

                            String105=(Token)match(input,String,FOLLOW_String_in_atom1039);  
                            stream_String.add(String105);

                            char_literal106=(Token)match(input,Close_Paren,FOLLOW_Close_Paren_in_atom1041);  
                            stream_Close_Paren.add(char_literal106);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: String, In
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:27: -> ^( In ( String )? )
                    {
                        // TL.g:176:30: ^( In ( String )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_In.nextNode(), root_1);

                        // TL.g:176:35: ( String )?
                        if ( stream_String.hasNext() ) {
                            adaptor.addChild(root_1, stream_String.nextNode());

                        }
                        stream_String.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class lookup_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lookup"
    // TL.g:179:1: lookup : ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) );
    public final TLParser.lookup_return lookup() throws RecognitionException {
        TLParser.lookup_return retval = new TLParser.lookup_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal109=null;
        Token char_literal111=null;
        Token Identifier115=null;
        Token String117=null;
        TLParser.functionCall_return functionCall107 = null;

        TLParser.indexes_return indexes108 = null;

        TLParser.expression_return expression110 = null;

        TLParser.indexes_return indexes112 = null;

        TLParser.list_return list113 = null;

        TLParser.indexes_return indexes114 = null;

        TLParser.indexes_return indexes116 = null;

        TLParser.indexes_return indexes118 = null;


        Object char_literal109_tree=null;
        Object char_literal111_tree=null;
        Object Identifier115_tree=null;
        Object String117_tree=null;
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_Open_Paren=new RewriteRuleTokenStream(adaptor,"token Open_Paren");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_Close_Paren=new RewriteRuleTokenStream(adaptor,"token Close_Paren");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
        RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");
        try {
            // TL.g:180:3: ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==Open_Paren) ) {
                    alt33=1;
                }
                else if ( ((LA33_1>=Or && LA33_1<=LT)||(LA33_1>=Pow && LA33_1<=Bit_Xor)||LA33_1==Strcat||LA33_1==Comma||(LA33_1>=Close_Paren && LA33_1<=Open_Brace)||LA33_1==67) ) {
                    alt33=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case Open_Paren:
                {
                alt33=2;
                }
                break;
            case Open_Bracket:
                {
                alt33=3;
                }
                break;
            case String:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // TL.g:180:6: functionCall ( indexes )?
                    {
                    pushFollow(FOLLOW_functionCall_in_lookup1068);
                    functionCall107=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall107.getTree());
                    // TL.g:180:19: ( indexes )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==Open_Bracket) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // TL.g:180:19: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1070);
                            indexes108=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes108.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: indexes, functionCall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 180:30: -> ^( LOOKUP functionCall ( indexes )? )
                    {
                        // TL.g:180:33: ^( LOOKUP functionCall ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_functionCall.nextTree());
                        // TL.g:180:55: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // TL.g:181:6: '(' expression ')' ( indexes )?
                    {
                    char_literal109=(Token)match(input,Open_Paren,FOLLOW_Open_Paren_in_lookup1091);  
                    stream_Open_Paren.add(char_literal109);

                    pushFollow(FOLLOW_expression_in_lookup1093);
                    expression110=expression();

                    state._fsp--;

                    stream_expression.add(expression110.getTree());
                    char_literal111=(Token)match(input,Close_Paren,FOLLOW_Close_Paren_in_lookup1095);  
                    stream_Close_Paren.add(char_literal111);

                    // TL.g:181:25: ( indexes )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==Open_Bracket) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // TL.g:181:25: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1097);
                            indexes112=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes112.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: indexes, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 181:34: -> ^( LOOKUP expression ( indexes )? )
                    {
                        // TL.g:181:37: ^( LOOKUP expression ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // TL.g:181:57: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // TL.g:182:6: list ( indexes )?
                    {
                    pushFollow(FOLLOW_list_in_lookup1116);
                    list113=list();

                    state._fsp--;

                    stream_list.add(list113.getTree());
                    // TL.g:182:11: ( indexes )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==Open_Bracket) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // TL.g:182:11: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1118);
                            indexes114=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes114.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: indexes, list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:24: -> ^( LOOKUP list ( indexes )? )
                    {
                        // TL.g:182:27: ^( LOOKUP list ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_list.nextTree());
                        // TL.g:182:41: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // TL.g:183:6: Identifier ( indexes )?
                    {
                    Identifier115=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup1141);  
                    stream_Identifier.add(Identifier115);

                    // TL.g:183:17: ( indexes )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==Open_Bracket) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // TL.g:183:17: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1143);
                            indexes116=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes116.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: indexes, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:28: -> ^( LOOKUP Identifier ( indexes )? )
                    {
                        // TL.g:183:31: ^( LOOKUP Identifier ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        // TL.g:183:51: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // TL.g:184:6: String ( indexes )?
                    {
                    String117=(Token)match(input,String,FOLLOW_String_in_lookup1164);  
                    stream_String.add(String117);

                    // TL.g:184:13: ( indexes )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==Open_Bracket) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // TL.g:184:13: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1166);
                            indexes118=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes118.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: String, indexes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 184:25: -> ^( LOOKUP String ( indexes )? )
                    {
                        // TL.g:184:28: ^( LOOKUP String ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_String.nextNode());
                        // TL.g:184:44: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lookup"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // TL.g:187:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
    public final TLParser.list_return list() throws RecognitionException {
        TLParser.list_return retval = new TLParser.list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal119=null;
        Token char_literal121=null;
        TLParser.exprList_return exprList120 = null;


        Object char_literal119_tree=null;
        Object char_literal121_tree=null;
        RewriteRuleTokenStream stream_Open_Bracket=new RewriteRuleTokenStream(adaptor,"token Open_Bracket");
        RewriteRuleTokenStream stream_Close_Bracket=new RewriteRuleTokenStream(adaptor,"token Close_Bracket");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // TL.g:188:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
            // TL.g:188:6: '[' ( exprList )? ']'
            {
            char_literal119=(Token)match(input,Open_Bracket,FOLLOW_Open_Bracket_in_list1195);  
            stream_Open_Bracket.add(char_literal119);

            // TL.g:188:10: ( exprList )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Identifier||(LA34_0>=Null && LA34_0<=String)||LA34_0==Not||LA34_0==Subt||LA34_0==Bit_Not||LA34_0==Open_Paren||LA34_0==Open_Bracket) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // TL.g:188:10: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_list1197);
                    exprList120=exprList();

                    state._fsp--;

                    stream_exprList.add(exprList120.getTree());

                    }
                    break;

            }

            char_literal121=(Token)match(input,Close_Bracket,FOLLOW_Close_Bracket_in_list1200);  
            stream_Close_Bracket.add(char_literal121);



            // AST REWRITE
            // elements: exprList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 188:24: -> ^( LIST ( exprList )? )
            {
                // TL.g:188:27: ^( LIST ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                // TL.g:188:34: ( exprList )?
                if ( stream_exprList.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprList.nextTree());

                }
                stream_exprList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // TL.g:191:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
    public final TLParser.exprList_return exprList() throws RecognitionException {
        TLParser.exprList_return retval = new TLParser.exprList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal123=null;
        TLParser.expression_return expression122 = null;

        TLParser.expression_return expression124 = null;


        Object char_literal123_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // TL.g:192:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
            // TL.g:192:6: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_exprList1223);
            expression122=expression();

            state._fsp--;

            stream_expression.add(expression122.getTree());
            // TL.g:192:17: ( ',' expression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Comma) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // TL.g:192:18: ',' expression
            	    {
            	    char_literal123=(Token)match(input,Comma,FOLLOW_Comma_in_exprList1226);  
            	    stream_Comma.add(char_literal123);

            	    pushFollow(FOLLOW_expression_in_exprList1228);
            	    expression124=expression();

            	    state._fsp--;

            	    stream_expression.add(expression124.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 192:35: -> ^( EXP_LIST ( expression )+ )
            {
                // TL.g:192:38: ^( EXP_LIST ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_LIST, "EXP_LIST"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprList"

    public static class functionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // TL.g:195:1: functionCall : Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) ;
    public final TLParser.functionCall_return functionCall() throws RecognitionException {
        TLParser.functionCall_return retval = new TLParser.functionCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier125=null;
        Token char_literal126=null;
        Token char_literal128=null;
        TLParser.exprList_return exprList127 = null;


        Object Identifier125_tree=null;
        Object char_literal126_tree=null;
        Object char_literal128_tree=null;
        RewriteRuleTokenStream stream_Open_Paren=new RewriteRuleTokenStream(adaptor,"token Open_Paren");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_Close_Paren=new RewriteRuleTokenStream(adaptor,"token Close_Paren");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // TL.g:196:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) )
            // TL.g:196:6: Identifier '(' ( exprList )? ')'
            {
            Identifier125=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall1253);  
            stream_Identifier.add(Identifier125);

            char_literal126=(Token)match(input,Open_Paren,FOLLOW_Open_Paren_in_functionCall1255);  
            stream_Open_Paren.add(char_literal126);

            // TL.g:196:21: ( exprList )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Identifier||(LA36_0>=Null && LA36_0<=String)||LA36_0==Not||LA36_0==Subt||LA36_0==Bit_Not||LA36_0==Open_Paren||LA36_0==Open_Bracket) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // TL.g:196:21: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_functionCall1257);
                    exprList127=exprList();

                    state._fsp--;

                    stream_exprList.add(exprList127.getTree());

                    }
                    break;

            }

            char_literal128=(Token)match(input,Close_Paren,FOLLOW_Close_Paren_in_functionCall1260);  
            stream_Close_Paren.add(char_literal128);



            // AST REWRITE
            // elements: exprList, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 196:35: -> ^( FUNC_CALL Identifier ( exprList )? )
            {
                // TL.g:196:38: ^( FUNC_CALL Identifier ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // TL.g:196:61: ( exprList )?
                if ( stream_exprList.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprList.nextTree());

                }
                stream_exprList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    // Delegated rules


 

    public static final BitSet FOLLOW_delimitedBlock_in_parse135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Open_Brace_in_block151 = new BitSet(new long[]{0x400000000E700000L});
    public static final BitSet FOLLOW_statement_in_block154 = new BitSet(new long[]{0x400000000E700000L});
    public static final BitSet FOLLOW_functionDecl_in_block158 = new BitSet(new long[]{0x400000000E700000L});
    public static final BitSet FOLLOW_Return_in_block163 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_expression_in_block165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_block167 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_Close_Brace_in_block171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_delimitedBlock209 = new BitSet(new long[]{0x000000000E700002L});
    public static final BitSet FOLLOW_functionDecl_in_delimitedBlock213 = new BitSet(new long[]{0x000000000E700002L});
    public static final BitSet FOLLOW_Return_in_delimitedBlock218 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_expression_in_delimitedBlock220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_delimitedBlock222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_statement264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_statement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_whileStatement309 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement311 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_whileStatement313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStat_in_ifStatement337 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_elseIfStat_in_ifStatement339 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_elseStat_in_ifStatement342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_ifStat371 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_expression_in_ifStat373 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_ifStat375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_If_in_elseIfStat399 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_expression_in_elseIfStat401 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_elseIfStat403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_elseIfStat420 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_If_in_elseIfStat422 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_expression_in_elseIfStat424 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_elseIfStat426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_elseStat450 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_elseStat452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Def_Func_in_functionDecl474 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_Identifier_in_functionDecl476 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_Open_Paren_in_functionDecl478 = new BitSet(new long[]{0x0400000004000000L});
    public static final BitSet FOLLOW_idList_in_functionDecl480 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_Close_Paren_in_functionDecl483 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_block_in_functionDecl485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_idList507 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_Comma_in_idList510 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_Identifier_in_idList512 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assignment539 = new BitSet(new long[]{0x0880000000000000L});
    public static final BitSet FOLLOW_indexes_in_assignment541 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_Gets_in_assignment544 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_expression_in_assignment546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Out_in_assignment570 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_Gets_in_assignment572 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_expression_in_assignment574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Open_Bracket_in_indexes605 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_expression_in_indexes607 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_Close_Bracket_in_indexes609 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_orExpr_in_expression636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr653 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_Or_in_orExpr656 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_andExpr_in_orExpr659 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_xorExpr_in_andExpr675 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_And_in_andExpr678 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_xorExpr_in_andExpr681 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_bitORExpr_in_xorExpr697 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_Xor_in_xorExpr700 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_bitORExpr_in_xorExpr703 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_bitXORExpr_in_bitORExpr719 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_Bit_Or_in_bitORExpr722 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_bitXORExpr_in_bitORExpr725 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_bitANDExpr_in_bitXORExpr741 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_Bit_Xor_in_bitXORExpr744 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_bitANDExpr_in_bitXORExpr747 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_equExpr_in_bitANDExpr763 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_Bit_And_in_bitANDExpr766 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_equExpr_in_bitANDExpr769 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_relExpr_in_equExpr785 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_set_in_equExpr788 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_relExpr_in_equExpr797 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_addExpr_in_relExpr813 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_set_in_relExpr816 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_addExpr_in_relExpr833 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr849 = new BitSet(new long[]{0x0040300000000002L});
    public static final BitSet FOLLOW_set_in_addExpr852 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr865 = new BitSet(new long[]{0x0040300000000002L});
    public static final BitSet FOLLOW_powExpr_in_mulExpr881 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_set_in_mulExpr884 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_powExpr_in_mulExpr901 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_powExpr917 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_Pow_in_powExpr920 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_unaryExpr_in_powExpr923 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_Subt_in_unaryExpr941 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_atom_in_unaryExpr943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Not_in_unaryExpr958 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_atom_in_unaryExpr960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bit_Not_in_unaryExpr975 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_atom_in_unaryExpr977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryExpr992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Null_in_atom1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_atom1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_atom1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_atom1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_In_in_atom1034 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_Open_Paren_in_atom1037 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_String_in_atom1039 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_Close_Paren_in_atom1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_lookup1068 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Open_Paren_in_lookup1091 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_expression_in_lookup1093 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_Close_Paren_in_lookup1095 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_lookup1116 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_lookup1141 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_lookup1164 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Open_Bracket_in_list1195 = new BitSet(new long[]{0x1A202401F4000000L});
    public static final BitSet FOLLOW_exprList_in_list1197 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_Close_Bracket_in_list1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprList1223 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_Comma_in_exprList1226 = new BitSet(new long[]{0x0A202401F4000000L});
    public static final BitSet FOLLOW_expression_in_exprList1228 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionCall1253 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_Open_Paren_in_functionCall1255 = new BitSet(new long[]{0x0E202401F4000000L});
    public static final BitSet FOLLOW_exprList_in_functionCall1257 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_Close_Paren_in_functionCall1260 = new BitSet(new long[]{0x0000000000000002L});

}