// $ANTLR 3.2 Sep 23, 2009 12:02:23 TL.g 2013-12-14 23:52:17
 
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "RETURN", "STATEMENTS", "ASSIGNMENT", "IF", "EXP", "ID_LIST", "INDEXES", "UNARY_MIN", "NOT", "BIN_NOT", "LOOKUP", "LIST", "EXP_LIST", "FUNC_CALL", "Return", "If", "Else_If", "Else", "Def_Func", "Identifier", "Null", "Number", "Bool", "String", "Out", "In", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "GT", "LT", "Not", "Pow", "Add", "Subt", "Mult", "Int_Div", "Div", "Mod", "Bit_Or", "Bit_And", "Bit_Xor", "Bit_Not", "Gets", "Comma", "Open_Paren", "Close_Paren", "Open_Bracket", "Close_Bracket", "Open_Brace", "Close_Brace", "Int", "Digit", "Comment", "Space", "';'"
    };
    public static final int LT=38;
    public static final int Close_Brace=58;
    public static final int Open_Bracket=55;
    public static final int T__63=63;
    public static final int BIN_NOT=14;
    public static final int EXP_LIST=17;
    public static final int NOT=13;
    public static final int ID_LIST=10;
    public static final int EOF=-1;
    public static final int Add=41;
    public static final int Subt=42;
    public static final int Int=59;
    public static final int Identifier=24;
    public static final int IF=8;
    public static final int FUNC_CALL=18;
    public static final int Space=62;
    public static final int Out=29;
    public static final int Bit_And=48;
    public static final int Gets=51;
    public static final int Number=26;
    public static final int Comment=61;
    public static final int EXP=9;
    public static final int GTEquals=35;
    public static final int RETURN=5;
    public static final int Bit_Or=47;
    public static final int String=28;
    public static final int Or=31;
    public static final int Open_Brace=57;
    public static final int Return=19;
    public static final int Def_Func=23;
    public static final int If=20;
    public static final int Null=25;
    public static final int And=32;
    public static final int Div=45;
    public static final int Mod=46;
    public static final int Bool=27;
    public static final int In=30;
    public static final int NEquals=34;
    public static final int INDEXES=11;
    public static final int Digit=60;
    public static final int Open_Paren=53;
    public static final int LIST=16;
    public static final int Mult=43;
    public static final int LOOKUP=15;
    public static final int Else_If=21;
    public static final int Close_Bracket=56;
    public static final int Bit_Xor=49;
    public static final int BLOCK=4;
    public static final int Not=39;
    public static final int Int_Div=44;
    public static final int STATEMENTS=6;
    public static final int GT=37;
    public static final int UNARY_MIN=12;
    public static final int ASSIGNMENT=7;
    public static final int Bit_Not=50;
    public static final int Else=22;
    public static final int Comma=52;
    public static final int Equals=33;
    public static final int Pow=40;
    public static final int Close_Paren=54;
    public static final int LTEquals=36;

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

            pushFollow(FOLLOW_delimitedBlock_in_parse130);
            delimitedBlock1=delimitedBlock();

            state._fsp--;

            adaptor.addChild(root_0, delimitedBlock1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse132); 
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
    // TL.g:52:1: block : '{' delimitedBlock '}' -> delimitedBlock ;
    public final TLParser.block_return block() throws RecognitionException {
        TLParser.block_return retval = new TLParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal3=null;
        Token char_literal5=null;
        TLParser.delimitedBlock_return delimitedBlock4 = null;


        Object char_literal3_tree=null;
        Object char_literal5_tree=null;
        RewriteRuleTokenStream stream_Close_Brace=new RewriteRuleTokenStream(adaptor,"token Close_Brace");
        RewriteRuleTokenStream stream_Open_Brace=new RewriteRuleTokenStream(adaptor,"token Open_Brace");
        RewriteRuleSubtreeStream stream_delimitedBlock=new RewriteRuleSubtreeStream(adaptor,"rule delimitedBlock");
        try {
            // TL.g:53:3: ( '{' delimitedBlock '}' -> delimitedBlock )
            // TL.g:53:6: '{' delimitedBlock '}'
            {
            char_literal3=(Token)match(input,Open_Brace,FOLLOW_Open_Brace_in_block146);  
            stream_Open_Brace.add(char_literal3);

            pushFollow(FOLLOW_delimitedBlock_in_block148);
            delimitedBlock4=delimitedBlock();

            state._fsp--;

            stream_delimitedBlock.add(delimitedBlock4.getTree());
            char_literal5=(Token)match(input,Close_Brace,FOLLOW_Close_Brace_in_block150);  
            stream_Close_Brace.add(char_literal5);



            // AST REWRITE
            // elements: delimitedBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 54:5: -> delimitedBlock
            {
                adaptor.addChild(root_0, stream_delimitedBlock.nextTree());

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

        Token Return8=null;
        Token char_literal10=null;
        TLParser.statement_return statement6 = null;

        TLParser.functionDecl_return functionDecl7 = null;

        TLParser.expression_return expression9 = null;


        Object Return8_tree=null;
        Object char_literal10_tree=null;
        RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");
        try {
            // TL.g:58:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // TL.g:58:5: ( statement | functionDecl )* ( Return expression ';' )?
            {
            // TL.g:58:5: ( statement | functionDecl )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==If||LA1_0==Identifier) ) {
                    alt1=1;
                }
                else if ( (LA1_0==Def_Func) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // TL.g:58:6: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_delimitedBlock172);
            	    statement6=statement();

            	    state._fsp--;

            	    stream_statement.add(statement6.getTree());

            	    }
            	    break;
            	case 2 :
            	    // TL.g:58:18: functionDecl
            	    {
            	    pushFollow(FOLLOW_functionDecl_in_delimitedBlock176);
            	    functionDecl7=functionDecl();

            	    state._fsp--;

            	    stream_functionDecl.add(functionDecl7.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // TL.g:58:33: ( Return expression ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Return) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // TL.g:58:34: Return expression ';'
                    {
                    Return8=(Token)match(input,Return,FOLLOW_Return_in_delimitedBlock181);  
                    stream_Return.add(Return8);

                    pushFollow(FOLLOW_expression_in_delimitedBlock183);
                    expression9=expression();

                    state._fsp--;

                    stream_expression.add(expression9.getTree());
                    char_literal10=(Token)match(input,63,FOLLOW_63_in_delimitedBlock185);  
                    stream_63.add(char_literal10);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expression, statement
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
    // TL.g:62:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement );
    public final TLParser.statement_return statement() throws RecognitionException {
        TLParser.statement_return retval = new TLParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal12=null;
        Token char_literal14=null;
        TLParser.assignment_return assignment11 = null;

        TLParser.functionCall_return functionCall13 = null;

        TLParser.ifStatement_return ifStatement15 = null;


        Object char_literal12_tree=null;
        Object char_literal14_tree=null;
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // TL.g:63:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Identifier) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==Open_Paren) ) {
                    alt3=2;
                }
                else if ( (LA3_1==Gets||LA3_1==Open_Bracket) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==If) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // TL.g:63:6: assignment ';'
                    {
                    pushFollow(FOLLOW_assignment_in_statement225);
                    assignment11=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment11.getTree());
                    char_literal12=(Token)match(input,63,FOLLOW_63_in_statement227);  
                    stream_63.add(char_literal12);



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
                    pushFollow(FOLLOW_functionCall_in_statement238);
                    functionCall13=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall13.getTree());
                    char_literal14=(Token)match(input,63,FOLLOW_63_in_statement240);  
                    stream_63.add(char_literal14);



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

                    pushFollow(FOLLOW_ifStatement_in_statement251);
                    ifStatement15=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement15.getTree());

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

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // TL.g:68:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
    public final TLParser.ifStatement_return ifStatement() throws RecognitionException {
        TLParser.ifStatement_return retval = new TLParser.ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TLParser.ifStat_return ifStat16 = null;

        TLParser.elseIfStat_return elseIfStat17 = null;

        TLParser.elseStat_return elseStat18 = null;


        RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
        RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
        RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");
        try {
            // TL.g:69:3: ( ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
            // TL.g:69:6: ifStat ( elseIfStat )* ( elseStat )?
            {
            pushFollow(FOLLOW_ifStat_in_ifStatement265);
            ifStat16=ifStat();

            state._fsp--;

            stream_ifStat.add(ifStat16.getTree());
            // TL.g:69:13: ( elseIfStat )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Else) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==If) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==Else_If) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // TL.g:69:13: elseIfStat
            	    {
            	    pushFollow(FOLLOW_elseIfStat_in_ifStatement267);
            	    elseIfStat17=elseIfStat();

            	    state._fsp--;

            	    stream_elseIfStat.add(elseIfStat17.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // TL.g:69:25: ( elseStat )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Else) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // TL.g:69:25: elseStat
                    {
                    pushFollow(FOLLOW_elseStat_in_ifStatement270);
                    elseStat18=elseStat();

                    state._fsp--;

                    stream_elseStat.add(elseStat18.getTree());

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
            // 69:35: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
            {
                // TL.g:69:38: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_ifStat.nextTree());
                // TL.g:69:50: ( elseIfStat )*
                while ( stream_elseIfStat.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseIfStat.nextTree());

                }
                stream_elseIfStat.reset();
                // TL.g:69:62: ( elseStat )?
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
    // TL.g:72:1: ifStat : If expression block -> ^( EXP expression block ) ;
    public final TLParser.ifStat_return ifStat() throws RecognitionException {
        TLParser.ifStat_return retval = new TLParser.ifStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token If19=null;
        TLParser.expression_return expression20 = null;

        TLParser.block_return block21 = null;


        Object If19_tree=null;
        RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // TL.g:73:3: ( If expression block -> ^( EXP expression block ) )
            // TL.g:73:6: If expression block
            {
            If19=(Token)match(input,If,FOLLOW_If_in_ifStat299);  
            stream_If.add(If19);

            pushFollow(FOLLOW_expression_in_ifStat301);
            expression20=expression();

            state._fsp--;

            stream_expression.add(expression20.getTree());
            pushFollow(FOLLOW_block_in_ifStat303);
            block21=block();

            state._fsp--;

            stream_block.add(block21.getTree());


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
            // 73:26: -> ^( EXP expression block )
            {
                // TL.g:73:29: ^( EXP expression block )
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
    // TL.g:76:1: elseIfStat : ( Else_If expression block -> ^( EXP expression block ) | Else If expression block -> ^( EXP expression block ) );
    public final TLParser.elseIfStat_return elseIfStat() throws RecognitionException {
        TLParser.elseIfStat_return retval = new TLParser.elseIfStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Else_If22=null;
        Token Else25=null;
        Token If26=null;
        TLParser.expression_return expression23 = null;

        TLParser.block_return block24 = null;

        TLParser.expression_return expression27 = null;

        TLParser.block_return block28 = null;


        Object Else_If22_tree=null;
        Object Else25_tree=null;
        Object If26_tree=null;
        RewriteRuleTokenStream stream_Else_If=new RewriteRuleTokenStream(adaptor,"token Else_If");
        RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
        RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // TL.g:77:3: ( Else_If expression block -> ^( EXP expression block ) | Else If expression block -> ^( EXP expression block ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Else_If) ) {
                alt6=1;
            }
            else if ( (LA6_0==Else) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // TL.g:77:6: Else_If expression block
                    {
                    Else_If22=(Token)match(input,Else_If,FOLLOW_Else_If_in_elseIfStat327);  
                    stream_Else_If.add(Else_If22);

                    pushFollow(FOLLOW_expression_in_elseIfStat329);
                    expression23=expression();

                    state._fsp--;

                    stream_expression.add(expression23.getTree());
                    pushFollow(FOLLOW_block_in_elseIfStat331);
                    block24=block();

                    state._fsp--;

                    stream_block.add(block24.getTree());


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
                    // 77:31: -> ^( EXP expression block )
                    {
                        // TL.g:77:34: ^( EXP expression block )
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
                    // TL.g:78:6: Else If expression block
                    {
                    Else25=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat348);  
                    stream_Else.add(Else25);

                    If26=(Token)match(input,If,FOLLOW_If_in_elseIfStat350);  
                    stream_If.add(If26);

                    pushFollow(FOLLOW_expression_in_elseIfStat352);
                    expression27=expression();

                    state._fsp--;

                    stream_expression.add(expression27.getTree());
                    pushFollow(FOLLOW_block_in_elseIfStat354);
                    block28=block();

                    state._fsp--;

                    stream_block.add(block28.getTree());


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
                    // 78:31: -> ^( EXP expression block )
                    {
                        // TL.g:78:34: ^( EXP expression block )
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
    // TL.g:81:1: elseStat : Else block -> ^( EXP block ) ;
    public final TLParser.elseStat_return elseStat() throws RecognitionException {
        TLParser.elseStat_return retval = new TLParser.elseStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Else29=null;
        TLParser.block_return block30 = null;


        Object Else29_tree=null;
        RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // TL.g:82:3: ( Else block -> ^( EXP block ) )
            // TL.g:82:6: Else block
            {
            Else29=(Token)match(input,Else,FOLLOW_Else_in_elseStat378);  
            stream_Else.add(Else29);

            pushFollow(FOLLOW_block_in_elseStat380);
            block30=block();

            state._fsp--;

            stream_block.add(block30.getTree());


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
            // 82:17: -> ^( EXP block )
            {
                // TL.g:82:20: ^( EXP block )
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
    // TL.g:85:1: functionDecl : Def_Func Identifier '(' ( idList )? ')' block ;
    public final TLParser.functionDecl_return functionDecl() throws RecognitionException {
        TLParser.functionDecl_return retval = new TLParser.functionDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Def_Func31=null;
        Token Identifier32=null;
        Token char_literal33=null;
        Token char_literal35=null;
        TLParser.idList_return idList34 = null;

        TLParser.block_return block36 = null;


        Object Def_Func31_tree=null;
        Object Identifier32_tree=null;
        Object char_literal33_tree=null;
        Object char_literal35_tree=null;

        try {
            // TL.g:86:3: ( Def_Func Identifier '(' ( idList )? ')' block )
            // TL.g:86:6: Def_Func Identifier '(' ( idList )? ')' block
            {
            root_0 = (Object)adaptor.nil();

            Def_Func31=(Token)match(input,Def_Func,FOLLOW_Def_Func_in_functionDecl402); 
            Def_Func31_tree = (Object)adaptor.create(Def_Func31);
            adaptor.addChild(root_0, Def_Func31_tree);

            Identifier32=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl404); 
            Identifier32_tree = (Object)adaptor.create(Identifier32);
            adaptor.addChild(root_0, Identifier32_tree);

            char_literal33=(Token)match(input,Open_Paren,FOLLOW_Open_Paren_in_functionDecl406); 
            char_literal33_tree = (Object)adaptor.create(char_literal33);
            adaptor.addChild(root_0, char_literal33_tree);

            // TL.g:86:30: ( idList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Identifier) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // TL.g:86:30: idList
                    {
                    pushFollow(FOLLOW_idList_in_functionDecl408);
                    idList34=idList();

                    state._fsp--;

                    adaptor.addChild(root_0, idList34.getTree());

                    }
                    break;

            }

            char_literal35=(Token)match(input,Close_Paren,FOLLOW_Close_Paren_in_functionDecl411); 
            char_literal35_tree = (Object)adaptor.create(char_literal35);
            adaptor.addChild(root_0, char_literal35_tree);

            pushFollow(FOLLOW_block_in_functionDecl413);
            block36=block();

            state._fsp--;

            adaptor.addChild(root_0, block36.getTree());
            defineFunction((Identifier32!=null?Identifier32.getText():null), (idList34!=null?((Object)idList34.tree):null), (block36!=null?((Object)block36.tree):null));

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
    // TL.g:90:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
    public final TLParser.idList_return idList() throws RecognitionException {
        TLParser.idList_return retval = new TLParser.idList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier37=null;
        Token char_literal38=null;
        Token Identifier39=null;

        Object Identifier37_tree=null;
        Object char_literal38_tree=null;
        Object Identifier39_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // TL.g:91:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
            // TL.g:91:6: Identifier ( ',' Identifier )*
            {
            Identifier37=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList435);  
            stream_Identifier.add(Identifier37);

            // TL.g:91:17: ( ',' Identifier )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // TL.g:91:18: ',' Identifier
            	    {
            	    char_literal38=(Token)match(input,Comma,FOLLOW_Comma_in_idList438);  
            	    stream_Comma.add(char_literal38);

            	    Identifier39=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList440);  
            	    stream_Identifier.add(Identifier39);


            	    }
            	    break;

            	default :
            	    break loop8;
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
            // 91:35: -> ^( ID_LIST ( Identifier )+ )
            {
                // TL.g:91:38: ^( ID_LIST ( Identifier )+ )
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
    // TL.g:94:2: assignment : Identifier ( indexes )? '<-' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) ;
    public final TLParser.assignment_return assignment() throws RecognitionException {
        TLParser.assignment_return retval = new TLParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier40=null;
        Token string_literal42=null;
        TLParser.indexes_return indexes41 = null;

        TLParser.expression_return expression43 = null;


        Object Identifier40_tree=null;
        Object string_literal42_tree=null;
        RewriteRuleTokenStream stream_Gets=new RewriteRuleTokenStream(adaptor,"token Gets");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
        try {
            // TL.g:95:3: ( Identifier ( indexes )? '<-' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) )
            // TL.g:95:6: Identifier ( indexes )? '<-' expression
            {
            Identifier40=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment467);  
            stream_Identifier.add(Identifier40);

            // TL.g:95:17: ( indexes )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Open_Bracket) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // TL.g:95:17: indexes
                    {
                    pushFollow(FOLLOW_indexes_in_assignment469);
                    indexes41=indexes();

                    state._fsp--;

                    stream_indexes.add(indexes41.getTree());

                    }
                    break;

            }

            string_literal42=(Token)match(input,Gets,FOLLOW_Gets_in_assignment472);  
            stream_Gets.add(string_literal42);

            pushFollow(FOLLOW_expression_in_assignment474);
            expression43=expression();

            state._fsp--;

            stream_expression.add(expression43.getTree());


            // AST REWRITE
            // elements: expression, Identifier, indexes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 96:5: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
            {
                // TL.g:96:8: ^( ASSIGNMENT Identifier ( indexes )? expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // TL.g:96:32: ( indexes )?
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
    // TL.g:99:1: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
    public final TLParser.indexes_return indexes() throws RecognitionException {
        TLParser.indexes_return retval = new TLParser.indexes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal44=null;
        Token char_literal46=null;
        TLParser.expression_return expression45 = null;


        Object char_literal44_tree=null;
        Object char_literal46_tree=null;
        RewriteRuleTokenStream stream_Open_Bracket=new RewriteRuleTokenStream(adaptor,"token Open_Bracket");
        RewriteRuleTokenStream stream_Close_Bracket=new RewriteRuleTokenStream(adaptor,"token Close_Bracket");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // TL.g:100:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
            // TL.g:100:6: ( '[' expression ']' )+
            {
            // TL.g:100:6: ( '[' expression ']' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Open_Bracket) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // TL.g:100:7: '[' expression ']'
            	    {
            	    char_literal44=(Token)match(input,Open_Bracket,FOLLOW_Open_Bracket_in_indexes506);  
            	    stream_Open_Bracket.add(char_literal44);

            	    pushFollow(FOLLOW_expression_in_indexes508);
            	    expression45=expression();

            	    state._fsp--;

            	    stream_expression.add(expression45.getTree());
            	    char_literal46=(Token)match(input,Close_Bracket,FOLLOW_Close_Bracket_in_indexes510);  
            	    stream_Close_Bracket.add(char_literal46);


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // 100:28: -> ^( INDEXES ( expression )+ )
            {
                // TL.g:100:31: ^( INDEXES ( expression )+ )
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
    // TL.g:103:2: expression : orExpr ;
    public final TLParser.expression_return expression() throws RecognitionException {
        TLParser.expression_return retval = new TLParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TLParser.orExpr_return orExpr47 = null;



        try {
            // TL.g:104:3: ( orExpr )
            // TL.g:104:6: orExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orExpr_in_expression537);
            orExpr47=orExpr();

            state._fsp--;

            adaptor.addChild(root_0, orExpr47.getTree());

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
    // TL.g:113:1: orExpr : andExpr ( '|_|' andExpr )* ;
    public final TLParser.orExpr_return orExpr() throws RecognitionException {
        TLParser.orExpr_return retval = new TLParser.orExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;
        TLParser.andExpr_return andExpr48 = null;

        TLParser.andExpr_return andExpr50 = null;


        Object string_literal49_tree=null;

        try {
            // TL.g:114:3: ( andExpr ( '|_|' andExpr )* )
            // TL.g:114:6: andExpr ( '|_|' andExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpr_in_orExpr554);
            andExpr48=andExpr();

            state._fsp--;

            adaptor.addChild(root_0, andExpr48.getTree());
            // TL.g:114:14: ( '|_|' andExpr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Or) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // TL.g:114:15: '|_|' andExpr
            	    {
            	    string_literal49=(Token)match(input,Or,FOLLOW_Or_in_orExpr557); 
            	    string_literal49_tree = (Object)adaptor.create(string_literal49);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal49_tree, root_0);

            	    pushFollow(FOLLOW_andExpr_in_orExpr560);
            	    andExpr50=andExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andExpr50.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // TL.g:117:1: andExpr : bitORExpr ( '&_&' bitORExpr )* ;
    public final TLParser.andExpr_return andExpr() throws RecognitionException {
        TLParser.andExpr_return retval = new TLParser.andExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal52=null;
        TLParser.bitORExpr_return bitORExpr51 = null;

        TLParser.bitORExpr_return bitORExpr53 = null;


        Object string_literal52_tree=null;

        try {
            // TL.g:118:3: ( bitORExpr ( '&_&' bitORExpr )* )
            // TL.g:118:6: bitORExpr ( '&_&' bitORExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitORExpr_in_andExpr576);
            bitORExpr51=bitORExpr();

            state._fsp--;

            adaptor.addChild(root_0, bitORExpr51.getTree());
            // TL.g:118:16: ( '&_&' bitORExpr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==And) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // TL.g:118:17: '&_&' bitORExpr
            	    {
            	    string_literal52=(Token)match(input,And,FOLLOW_And_in_andExpr579); 
            	    string_literal52_tree = (Object)adaptor.create(string_literal52);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal52_tree, root_0);

            	    pushFollow(FOLLOW_bitORExpr_in_andExpr582);
            	    bitORExpr53=bitORExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitORExpr53.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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

    public static class bitORExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitORExpr"
    // TL.g:121:1: bitORExpr : bitXORExpr ( '|' bitXORExpr )* ;
    public final TLParser.bitORExpr_return bitORExpr() throws RecognitionException {
        TLParser.bitORExpr_return retval = new TLParser.bitORExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal55=null;
        TLParser.bitXORExpr_return bitXORExpr54 = null;

        TLParser.bitXORExpr_return bitXORExpr56 = null;


        Object char_literal55_tree=null;

        try {
            // TL.g:122:3: ( bitXORExpr ( '|' bitXORExpr )* )
            // TL.g:122:6: bitXORExpr ( '|' bitXORExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitXORExpr_in_bitORExpr598);
            bitXORExpr54=bitXORExpr();

            state._fsp--;

            adaptor.addChild(root_0, bitXORExpr54.getTree());
            // TL.g:122:17: ( '|' bitXORExpr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Bit_Or) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // TL.g:122:18: '|' bitXORExpr
            	    {
            	    char_literal55=(Token)match(input,Bit_Or,FOLLOW_Bit_Or_in_bitORExpr601); 
            	    char_literal55_tree = (Object)adaptor.create(char_literal55);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal55_tree, root_0);

            	    pushFollow(FOLLOW_bitXORExpr_in_bitORExpr604);
            	    bitXORExpr56=bitXORExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitXORExpr56.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // TL.g:125:1: bitXORExpr : bitANDExpr ( '^' bitANDExpr )* ;
    public final TLParser.bitXORExpr_return bitXORExpr() throws RecognitionException {
        TLParser.bitXORExpr_return retval = new TLParser.bitXORExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal58=null;
        TLParser.bitANDExpr_return bitANDExpr57 = null;

        TLParser.bitANDExpr_return bitANDExpr59 = null;


        Object char_literal58_tree=null;

        try {
            // TL.g:126:3: ( bitANDExpr ( '^' bitANDExpr )* )
            // TL.g:126:6: bitANDExpr ( '^' bitANDExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitANDExpr_in_bitXORExpr620);
            bitANDExpr57=bitANDExpr();

            state._fsp--;

            adaptor.addChild(root_0, bitANDExpr57.getTree());
            // TL.g:126:17: ( '^' bitANDExpr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Bit_Xor) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // TL.g:126:18: '^' bitANDExpr
            	    {
            	    char_literal58=(Token)match(input,Bit_Xor,FOLLOW_Bit_Xor_in_bitXORExpr623); 
            	    char_literal58_tree = (Object)adaptor.create(char_literal58);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal58_tree, root_0);

            	    pushFollow(FOLLOW_bitANDExpr_in_bitXORExpr626);
            	    bitANDExpr59=bitANDExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitANDExpr59.getTree());

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
    // $ANTLR end "bitXORExpr"

    public static class bitANDExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitANDExpr"
    // TL.g:129:1: bitANDExpr : equExpr ( '&' equExpr )* ;
    public final TLParser.bitANDExpr_return bitANDExpr() throws RecognitionException {
        TLParser.bitANDExpr_return retval = new TLParser.bitANDExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal61=null;
        TLParser.equExpr_return equExpr60 = null;

        TLParser.equExpr_return equExpr62 = null;


        Object char_literal61_tree=null;

        try {
            // TL.g:130:3: ( equExpr ( '&' equExpr )* )
            // TL.g:130:6: equExpr ( '&' equExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equExpr_in_bitANDExpr642);
            equExpr60=equExpr();

            state._fsp--;

            adaptor.addChild(root_0, equExpr60.getTree());
            // TL.g:130:14: ( '&' equExpr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Bit_And) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // TL.g:130:15: '&' equExpr
            	    {
            	    char_literal61=(Token)match(input,Bit_And,FOLLOW_Bit_And_in_bitANDExpr645); 
            	    char_literal61_tree = (Object)adaptor.create(char_literal61);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal61_tree, root_0);

            	    pushFollow(FOLLOW_equExpr_in_bitANDExpr648);
            	    equExpr62=equExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equExpr62.getTree());

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
    // $ANTLR end "bitANDExpr"

    public static class equExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equExpr"
    // TL.g:133:1: equExpr : relExpr ( ( '=_=' | '>_<' ) relExpr )* ;
    public final TLParser.equExpr_return equExpr() throws RecognitionException {
        TLParser.equExpr_return retval = new TLParser.equExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set64=null;
        TLParser.relExpr_return relExpr63 = null;

        TLParser.relExpr_return relExpr65 = null;


        Object set64_tree=null;

        try {
            // TL.g:134:3: ( relExpr ( ( '=_=' | '>_<' ) relExpr )* )
            // TL.g:134:6: relExpr ( ( '=_=' | '>_<' ) relExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relExpr_in_equExpr664);
            relExpr63=relExpr();

            state._fsp--;

            adaptor.addChild(root_0, relExpr63.getTree());
            // TL.g:134:14: ( ( '=_=' | '>_<' ) relExpr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=Equals && LA16_0<=NEquals)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // TL.g:134:15: ( '=_=' | '>_<' ) relExpr
            	    {
            	    set64=(Token)input.LT(1);
            	    set64=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Equals && input.LA(1)<=NEquals) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set64), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relExpr_in_equExpr676);
            	    relExpr65=relExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relExpr65.getTree());

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
    // $ANTLR end "equExpr"

    public static class relExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relExpr"
    // TL.g:137:1: relExpr : addExpr ( ( '>_=' | '=_<' | '>_>' | '<_<' ) addExpr )* ;
    public final TLParser.relExpr_return relExpr() throws RecognitionException {
        TLParser.relExpr_return retval = new TLParser.relExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set67=null;
        TLParser.addExpr_return addExpr66 = null;

        TLParser.addExpr_return addExpr68 = null;


        Object set67_tree=null;

        try {
            // TL.g:138:3: ( addExpr ( ( '>_=' | '=_<' | '>_>' | '<_<' ) addExpr )* )
            // TL.g:138:6: addExpr ( ( '>_=' | '=_<' | '>_>' | '<_<' ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_relExpr692);
            addExpr66=addExpr();

            state._fsp--;

            adaptor.addChild(root_0, addExpr66.getTree());
            // TL.g:138:14: ( ( '>_=' | '=_<' | '>_>' | '<_<' ) addExpr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=GTEquals && LA17_0<=LT)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // TL.g:138:15: ( '>_=' | '=_<' | '>_>' | '<_<' ) addExpr
            	    {
            	    set67=(Token)input.LT(1);
            	    set67=(Token)input.LT(1);
            	    if ( (input.LA(1)>=GTEquals && input.LA(1)<=LT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set67), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_relExpr712);
            	    addExpr68=addExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, addExpr68.getTree());

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
    // $ANTLR end "relExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // TL.g:141:1: addExpr : mulExpr ( ( '+' | '-' ) mulExpr )* ;
    public final TLParser.addExpr_return addExpr() throws RecognitionException {
        TLParser.addExpr_return retval = new TLParser.addExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set70=null;
        TLParser.mulExpr_return mulExpr69 = null;

        TLParser.mulExpr_return mulExpr71 = null;


        Object set70_tree=null;

        try {
            // TL.g:142:3: ( mulExpr ( ( '+' | '-' ) mulExpr )* )
            // TL.g:142:6: mulExpr ( ( '+' | '-' ) mulExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mulExpr_in_addExpr728);
            mulExpr69=mulExpr();

            state._fsp--;

            adaptor.addChild(root_0, mulExpr69.getTree());
            // TL.g:142:14: ( ( '+' | '-' ) mulExpr )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=Add && LA18_0<=Subt)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // TL.g:142:15: ( '+' | '-' ) mulExpr
            	    {
            	    set70=(Token)input.LT(1);
            	    set70=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Add && input.LA(1)<=Subt) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set70), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mulExpr_in_addExpr740);
            	    mulExpr71=mulExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mulExpr71.getTree());

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
    // $ANTLR end "addExpr"

    public static class mulExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mulExpr"
    // TL.g:145:1: mulExpr : powExpr ( ( '*' | '/' | '%' | '//' ) powExpr )* ;
    public final TLParser.mulExpr_return mulExpr() throws RecognitionException {
        TLParser.mulExpr_return retval = new TLParser.mulExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set73=null;
        TLParser.powExpr_return powExpr72 = null;

        TLParser.powExpr_return powExpr74 = null;


        Object set73_tree=null;

        try {
            // TL.g:146:3: ( powExpr ( ( '*' | '/' | '%' | '//' ) powExpr )* )
            // TL.g:146:6: powExpr ( ( '*' | '/' | '%' | '//' ) powExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powExpr_in_mulExpr756);
            powExpr72=powExpr();

            state._fsp--;

            adaptor.addChild(root_0, powExpr72.getTree());
            // TL.g:146:14: ( ( '*' | '/' | '%' | '//' ) powExpr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=Mult && LA19_0<=Mod)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // TL.g:146:15: ( '*' | '/' | '%' | '//' ) powExpr
            	    {
            	    set73=(Token)input.LT(1);
            	    set73=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Mult && input.LA(1)<=Mod) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set73), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_powExpr_in_mulExpr776);
            	    powExpr74=powExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, powExpr74.getTree());

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
    // $ANTLR end "mulExpr"

    public static class powExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "powExpr"
    // TL.g:149:1: powExpr : unaryExpr ( '**' unaryExpr )* ;
    public final TLParser.powExpr_return powExpr() throws RecognitionException {
        TLParser.powExpr_return retval = new TLParser.powExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal76=null;
        TLParser.unaryExpr_return unaryExpr75 = null;

        TLParser.unaryExpr_return unaryExpr77 = null;


        Object string_literal76_tree=null;

        try {
            // TL.g:150:3: ( unaryExpr ( '**' unaryExpr )* )
            // TL.g:150:6: unaryExpr ( '**' unaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpr_in_powExpr792);
            unaryExpr75=unaryExpr();

            state._fsp--;

            adaptor.addChild(root_0, unaryExpr75.getTree());
            // TL.g:150:16: ( '**' unaryExpr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Pow) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // TL.g:150:17: '**' unaryExpr
            	    {
            	    string_literal76=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr795); 
            	    string_literal76_tree = (Object)adaptor.create(string_literal76);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal76_tree, root_0);

            	    pushFollow(FOLLOW_unaryExpr_in_powExpr798);
            	    unaryExpr77=unaryExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExpr77.getTree());

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
    // $ANTLR end "powExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // TL.g:153:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NOT atom ) | '~' atom -> ^( BIN_NOT atom ) | atom );
    public final TLParser.unaryExpr_return unaryExpr() throws RecognitionException {
        TLParser.unaryExpr_return retval = new TLParser.unaryExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal78=null;
        Token char_literal80=null;
        Token char_literal82=null;
        TLParser.atom_return atom79 = null;

        TLParser.atom_return atom81 = null;

        TLParser.atom_return atom83 = null;

        TLParser.atom_return atom84 = null;


        Object char_literal78_tree=null;
        Object char_literal80_tree=null;
        Object char_literal82_tree=null;
        RewriteRuleTokenStream stream_Bit_Not=new RewriteRuleTokenStream(adaptor,"token Bit_Not");
        RewriteRuleTokenStream stream_Subt=new RewriteRuleTokenStream(adaptor,"token Subt");
        RewriteRuleTokenStream stream_Not=new RewriteRuleTokenStream(adaptor,"token Not");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // TL.g:154:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NOT atom ) | '~' atom -> ^( BIN_NOT atom ) | atom )
            int alt21=4;
            switch ( input.LA(1) ) {
            case Subt:
                {
                alt21=1;
                }
                break;
            case Not:
                {
                alt21=2;
                }
                break;
            case Bit_Not:
                {
                alt21=3;
                }
                break;
            case Identifier:
            case Null:
            case Number:
            case Bool:
            case String:
            case Open_Paren:
            case Open_Bracket:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // TL.g:154:6: '-' atom
                    {
                    char_literal78=(Token)match(input,Subt,FOLLOW_Subt_in_unaryExpr816);  
                    stream_Subt.add(char_literal78);

                    pushFollow(FOLLOW_atom_in_unaryExpr818);
                    atom79=atom();

                    state._fsp--;

                    stream_atom.add(atom79.getTree());


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
                    // 154:15: -> ^( UNARY_MIN atom )
                    {
                        // TL.g:154:18: ^( UNARY_MIN atom )
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
                    // TL.g:155:6: '!' atom
                    {
                    char_literal80=(Token)match(input,Not,FOLLOW_Not_in_unaryExpr833);  
                    stream_Not.add(char_literal80);

                    pushFollow(FOLLOW_atom_in_unaryExpr835);
                    atom81=atom();

                    state._fsp--;

                    stream_atom.add(atom81.getTree());


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
                    // 155:15: -> ^( NOT atom )
                    {
                        // TL.g:155:18: ^( NOT atom )
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
                    // TL.g:156:6: '~' atom
                    {
                    char_literal82=(Token)match(input,Bit_Not,FOLLOW_Bit_Not_in_unaryExpr850);  
                    stream_Bit_Not.add(char_literal82);

                    pushFollow(FOLLOW_atom_in_unaryExpr852);
                    atom83=atom();

                    state._fsp--;

                    stream_atom.add(atom83.getTree());


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
                    // 156:15: -> ^( BIN_NOT atom )
                    {
                        // TL.g:156:18: ^( BIN_NOT atom )
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
                    // TL.g:157:6: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_unaryExpr867);
                    atom84=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom84.getTree());

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
    // TL.g:160:1: atom : ( Null | Number | Bool | lookup );
    public final TLParser.atom_return atom() throws RecognitionException {
        TLParser.atom_return retval = new TLParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Null85=null;
        Token Number86=null;
        Token Bool87=null;
        TLParser.lookup_return lookup88 = null;


        Object Null85_tree=null;
        Object Number86_tree=null;
        Object Bool87_tree=null;

        try {
            // TL.g:161:3: ( Null | Number | Bool | lookup )
            int alt22=4;
            switch ( input.LA(1) ) {
            case Null:
                {
                alt22=1;
                }
                break;
            case Number:
                {
                alt22=2;
                }
                break;
            case Bool:
                {
                alt22=3;
                }
                break;
            case Identifier:
            case String:
            case Open_Paren:
            case Open_Bracket:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // TL.g:161:6: Null
                    {
                    root_0 = (Object)adaptor.nil();

                    Null85=(Token)match(input,Null,FOLLOW_Null_in_atom881); 
                    Null85_tree = (Object)adaptor.create(Null85);
                    adaptor.addChild(root_0, Null85_tree);


                    }
                    break;
                case 2 :
                    // TL.g:162:6: Number
                    {
                    root_0 = (Object)adaptor.nil();

                    Number86=(Token)match(input,Number,FOLLOW_Number_in_atom888); 
                    Number86_tree = (Object)adaptor.create(Number86);
                    adaptor.addChild(root_0, Number86_tree);


                    }
                    break;
                case 3 :
                    // TL.g:163:6: Bool
                    {
                    root_0 = (Object)adaptor.nil();

                    Bool87=(Token)match(input,Bool,FOLLOW_Bool_in_atom895); 
                    Bool87_tree = (Object)adaptor.create(Bool87);
                    adaptor.addChild(root_0, Bool87_tree);


                    }
                    break;
                case 4 :
                    // TL.g:164:6: lookup
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lookup_in_atom902);
                    lookup88=lookup();

                    state._fsp--;

                    adaptor.addChild(root_0, lookup88.getTree());

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
    // TL.g:167:1: lookup : ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) );
    public final TLParser.lookup_return lookup() throws RecognitionException {
        TLParser.lookup_return retval = new TLParser.lookup_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal91=null;
        Token char_literal93=null;
        Token Identifier97=null;
        Token String99=null;
        TLParser.functionCall_return functionCall89 = null;

        TLParser.indexes_return indexes90 = null;

        TLParser.expression_return expression92 = null;

        TLParser.indexes_return indexes94 = null;

        TLParser.list_return list95 = null;

        TLParser.indexes_return indexes96 = null;

        TLParser.indexes_return indexes98 = null;

        TLParser.indexes_return indexes100 = null;


        Object char_literal91_tree=null;
        Object char_literal93_tree=null;
        Object Identifier97_tree=null;
        Object String99_tree=null;
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_Open_Paren=new RewriteRuleTokenStream(adaptor,"token Open_Paren");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_Close_Paren=new RewriteRuleTokenStream(adaptor,"token Close_Paren");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
        RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");
        try {
            // TL.g:168:3: ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==Open_Paren) ) {
                    alt28=1;
                }
                else if ( ((LA28_1>=Or && LA28_1<=LT)||(LA28_1>=Pow && LA28_1<=Bit_Xor)||LA28_1==Comma||(LA28_1>=Close_Paren && LA28_1<=Open_Brace)||LA28_1==63) ) {
                    alt28=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case Open_Paren:
                {
                alt28=2;
                }
                break;
            case Open_Bracket:
                {
                alt28=3;
                }
                break;
            case String:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // TL.g:168:6: functionCall ( indexes )?
                    {
                    pushFollow(FOLLOW_functionCall_in_lookup917);
                    functionCall89=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall89.getTree());
                    // TL.g:168:19: ( indexes )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==Open_Bracket) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // TL.g:168:19: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup919);
                            indexes90=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes90.getTree());

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
                    // 168:30: -> ^( LOOKUP functionCall ( indexes )? )
                    {
                        // TL.g:168:33: ^( LOOKUP functionCall ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_functionCall.nextTree());
                        // TL.g:168:55: ( indexes )?
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
                    // TL.g:169:6: '(' expression ')' ( indexes )?
                    {
                    char_literal91=(Token)match(input,Open_Paren,FOLLOW_Open_Paren_in_lookup940);  
                    stream_Open_Paren.add(char_literal91);

                    pushFollow(FOLLOW_expression_in_lookup942);
                    expression92=expression();

                    state._fsp--;

                    stream_expression.add(expression92.getTree());
                    char_literal93=(Token)match(input,Close_Paren,FOLLOW_Close_Paren_in_lookup944);  
                    stream_Close_Paren.add(char_literal93);

                    // TL.g:169:25: ( indexes )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==Open_Bracket) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // TL.g:169:25: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup946);
                            indexes94=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes94.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expression, indexes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 169:34: -> ^( LOOKUP expression ( indexes )? )
                    {
                        // TL.g:169:37: ^( LOOKUP expression ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // TL.g:169:57: ( indexes )?
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
                    // TL.g:170:6: list ( indexes )?
                    {
                    pushFollow(FOLLOW_list_in_lookup965);
                    list95=list();

                    state._fsp--;

                    stream_list.add(list95.getTree());
                    // TL.g:170:11: ( indexes )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==Open_Bracket) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // TL.g:170:11: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup967);
                            indexes96=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes96.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: list, indexes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 170:24: -> ^( LOOKUP list ( indexes )? )
                    {
                        // TL.g:170:27: ^( LOOKUP list ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_list.nextTree());
                        // TL.g:170:41: ( indexes )?
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
                    // TL.g:171:6: Identifier ( indexes )?
                    {
                    Identifier97=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup990);  
                    stream_Identifier.add(Identifier97);

                    // TL.g:171:17: ( indexes )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==Open_Bracket) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // TL.g:171:17: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup992);
                            indexes98=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes98.getTree());

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
                    // 171:28: -> ^( LOOKUP Identifier ( indexes )? )
                    {
                        // TL.g:171:31: ^( LOOKUP Identifier ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        // TL.g:171:51: ( indexes )?
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
                    // TL.g:172:6: String ( indexes )?
                    {
                    String99=(Token)match(input,String,FOLLOW_String_in_lookup1013);  
                    stream_String.add(String99);

                    // TL.g:172:13: ( indexes )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==Open_Bracket) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // TL.g:172:13: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1015);
                            indexes100=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes100.getTree());

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
                    // 172:25: -> ^( LOOKUP String ( indexes )? )
                    {
                        // TL.g:172:28: ^( LOOKUP String ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_String.nextNode());
                        // TL.g:172:44: ( indexes )?
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
    // TL.g:175:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
    public final TLParser.list_return list() throws RecognitionException {
        TLParser.list_return retval = new TLParser.list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal101=null;
        Token char_literal103=null;
        TLParser.exprList_return exprList102 = null;


        Object char_literal101_tree=null;
        Object char_literal103_tree=null;
        RewriteRuleTokenStream stream_Open_Bracket=new RewriteRuleTokenStream(adaptor,"token Open_Bracket");
        RewriteRuleTokenStream stream_Close_Bracket=new RewriteRuleTokenStream(adaptor,"token Close_Bracket");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // TL.g:176:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
            // TL.g:176:6: '[' ( exprList )? ']'
            {
            char_literal101=(Token)match(input,Open_Bracket,FOLLOW_Open_Bracket_in_list1044);  
            stream_Open_Bracket.add(char_literal101);

            // TL.g:176:10: ( exprList )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=Identifier && LA29_0<=String)||LA29_0==Not||LA29_0==Subt||LA29_0==Bit_Not||LA29_0==Open_Paren||LA29_0==Open_Bracket) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // TL.g:176:10: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_list1046);
                    exprList102=exprList();

                    state._fsp--;

                    stream_exprList.add(exprList102.getTree());

                    }
                    break;

            }

            char_literal103=(Token)match(input,Close_Bracket,FOLLOW_Close_Bracket_in_list1049);  
            stream_Close_Bracket.add(char_literal103);



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
            // 176:24: -> ^( LIST ( exprList )? )
            {
                // TL.g:176:27: ^( LIST ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                // TL.g:176:34: ( exprList )?
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
    // TL.g:179:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
    public final TLParser.exprList_return exprList() throws RecognitionException {
        TLParser.exprList_return retval = new TLParser.exprList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal105=null;
        TLParser.expression_return expression104 = null;

        TLParser.expression_return expression106 = null;


        Object char_literal105_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // TL.g:180:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
            // TL.g:180:6: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_exprList1072);
            expression104=expression();

            state._fsp--;

            stream_expression.add(expression104.getTree());
            // TL.g:180:17: ( ',' expression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Comma) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // TL.g:180:18: ',' expression
            	    {
            	    char_literal105=(Token)match(input,Comma,FOLLOW_Comma_in_exprList1075);  
            	    stream_Comma.add(char_literal105);

            	    pushFollow(FOLLOW_expression_in_exprList1077);
            	    expression106=expression();

            	    state._fsp--;

            	    stream_expression.add(expression106.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
            // 180:35: -> ^( EXP_LIST ( expression )+ )
            {
                // TL.g:180:38: ^( EXP_LIST ( expression )+ )
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
    // TL.g:183:1: functionCall : Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) ;
    public final TLParser.functionCall_return functionCall() throws RecognitionException {
        TLParser.functionCall_return retval = new TLParser.functionCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier107=null;
        Token char_literal108=null;
        Token char_literal110=null;
        TLParser.exprList_return exprList109 = null;


        Object Identifier107_tree=null;
        Object char_literal108_tree=null;
        Object char_literal110_tree=null;
        RewriteRuleTokenStream stream_Open_Paren=new RewriteRuleTokenStream(adaptor,"token Open_Paren");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_Close_Paren=new RewriteRuleTokenStream(adaptor,"token Close_Paren");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // TL.g:184:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) )
            // TL.g:184:6: Identifier '(' ( exprList )? ')'
            {
            Identifier107=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall1102);  
            stream_Identifier.add(Identifier107);

            char_literal108=(Token)match(input,Open_Paren,FOLLOW_Open_Paren_in_functionCall1104);  
            stream_Open_Paren.add(char_literal108);

            // TL.g:184:21: ( exprList )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=Identifier && LA31_0<=String)||LA31_0==Not||LA31_0==Subt||LA31_0==Bit_Not||LA31_0==Open_Paren||LA31_0==Open_Bracket) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // TL.g:184:21: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_functionCall1106);
                    exprList109=exprList();

                    state._fsp--;

                    stream_exprList.add(exprList109.getTree());

                    }
                    break;

            }

            char_literal110=(Token)match(input,Close_Paren,FOLLOW_Close_Paren_in_functionCall1109);  
            stream_Close_Paren.add(char_literal110);



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
            // 184:35: -> ^( FUNC_CALL Identifier ( exprList )? )
            {
                // TL.g:184:38: ^( FUNC_CALL Identifier ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // TL.g:184:61: ( exprList )?
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


 

    public static final BitSet FOLLOW_delimitedBlock_in_parse130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Open_Brace_in_block146 = new BitSet(new long[]{0x0400000001980000L});
    public static final BitSet FOLLOW_delimitedBlock_in_block148 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_Close_Brace_in_block150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_delimitedBlock172 = new BitSet(new long[]{0x0000000001980002L});
    public static final BitSet FOLLOW_functionDecl_in_delimitedBlock176 = new BitSet(new long[]{0x0000000001980002L});
    public static final BitSet FOLLOW_Return_in_delimitedBlock181 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_expression_in_delimitedBlock183 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_delimitedBlock185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement225 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_statement227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement238 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_statement240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStat_in_ifStatement265 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_elseIfStat_in_ifStatement267 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_elseStat_in_ifStatement270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_ifStat299 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_expression_in_ifStat301 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_block_in_ifStat303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_If_in_elseIfStat327 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_expression_in_elseIfStat329 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_block_in_elseIfStat331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_elseIfStat348 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_If_in_elseIfStat350 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_expression_in_elseIfStat352 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_block_in_elseIfStat354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_elseStat378 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_block_in_elseStat380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Def_Func_in_functionDecl402 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_Identifier_in_functionDecl404 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_Open_Paren_in_functionDecl406 = new BitSet(new long[]{0x0040000001000000L});
    public static final BitSet FOLLOW_idList_in_functionDecl408 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Close_Paren_in_functionDecl411 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_block_in_functionDecl413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_idList435 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_Comma_in_idList438 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_Identifier_in_idList440 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assignment467 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_indexes_in_assignment469 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_Gets_in_assignment472 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_expression_in_assignment474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Open_Bracket_in_indexes506 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_expression_in_indexes508 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Close_Bracket_in_indexes510 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_orExpr_in_expression537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr554 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_Or_in_orExpr557 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_andExpr_in_orExpr560 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_bitORExpr_in_andExpr576 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_And_in_andExpr579 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_bitORExpr_in_andExpr582 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_bitXORExpr_in_bitORExpr598 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_Bit_Or_in_bitORExpr601 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_bitXORExpr_in_bitORExpr604 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_bitANDExpr_in_bitXORExpr620 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Bit_Xor_in_bitXORExpr623 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_bitANDExpr_in_bitXORExpr626 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_equExpr_in_bitANDExpr642 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_Bit_And_in_bitANDExpr645 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_equExpr_in_bitANDExpr648 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_relExpr_in_equExpr664 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_set_in_equExpr667 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_relExpr_in_equExpr676 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_addExpr_in_relExpr692 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_set_in_relExpr695 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_addExpr_in_relExpr712 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr728 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_set_in_addExpr731 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr740 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_powExpr_in_mulExpr756 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_set_in_mulExpr759 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_powExpr_in_mulExpr776 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_powExpr792 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_Pow_in_powExpr795 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_unaryExpr_in_powExpr798 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_Subt_in_unaryExpr816 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_atom_in_unaryExpr818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Not_in_unaryExpr833 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_atom_in_unaryExpr835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bit_Not_in_unaryExpr850 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_atom_in_unaryExpr852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryExpr867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Null_in_atom881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_atom888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_atom895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_atom902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_lookup917 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Open_Paren_in_lookup940 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_expression_in_lookup942 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Close_Paren_in_lookup944 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_lookup965 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_lookup990 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_lookup1013 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Open_Bracket_in_list1044 = new BitSet(new long[]{0x01A404801F000000L});
    public static final BitSet FOLLOW_exprList_in_list1046 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Close_Bracket_in_list1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprList1072 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_Comma_in_exprList1075 = new BitSet(new long[]{0x00A404801F000000L});
    public static final BitSet FOLLOW_expression_in_exprList1077 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionCall1102 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_Open_Paren_in_functionCall1104 = new BitSet(new long[]{0x00E404801F000000L});
    public static final BitSet FOLLOW_exprList_in_functionCall1106 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Close_Paren_in_functionCall1109 = new BitSet(new long[]{0x0000000000000002L});

}