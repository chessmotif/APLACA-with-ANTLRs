package tl;
// $ANTLR 3.2 Sep 23, 2009 12:02:23 TL.g 2013-12-17 15:35:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TLLexer extends Lexer {
    public static final int T__67=67;
    public static final int LT=41;
    public static final int TO_PRINT=8;
    public static final int Open_Bracket=59;
    public static final int Close_Brace=62;
    public static final int BIN_NOT=15;
    public static final int EXP_LIST=18;
    public static final int While=21;
    public static final int NOT=14;
    public static final int ID_LIST=11;
    public static final int Add=44;
    public static final int EOF=-1;
    public static final int Subt=45;
    public static final int Xor=35;
    public static final int Identifier=26;
    public static final int Int=63;
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
    public static final int LIST=17;
    public static final int Open_Paren=57;
    public static final int Else_If=23;
    public static final int LOOKUP=16;
    public static final int Mult=46;
    public static final int Close_Bracket=60;
    public static final int Bit_Xor=52;
    public static final int BLOCK=4;
    public static final int Not=42;
    public static final int Int_Div=47;
    public static final int GT=40;
    public static final int STATEMENTS=6;
    public static final int UNARY_MIN=13;
    public static final int ASSIGNMENT=7;
    public static final int Bit_Not=53;
    public static final int Else=24;
    public static final int Equals=36;
    public static final int Comma=56;
    public static final int Pow=43;
    public static final int Close_Paren=58;
    public static final int LTEquals=39;

    // delegates
    // delegators

    public TLLexer() {;} 
    public TLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "TL.g"; }

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:3:7: ( ';' )
            // TL.g:3:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "Def_Func"
    public final void mDef_Func() throws RecognitionException {
        try {
            int _type = Def_Func;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:199:11: ( 'func' )
            // TL.g:199:13: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Def_Func"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:200:7: ( 'if' )
            // TL.g:200:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "Else_If"
    public final void mElse_If() throws RecognitionException {
        try {
            int _type = Else_If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:201:11: ( 'fiif' )
            // TL.g:201:13: 'fiif'
            {
            match("fiif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else_If"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:202:8: ( 'fi' )
            // TL.g:202:10: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:203:10: ( 'return' )
            // TL.g:203:12: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:204:9: ( 'while' )
            // TL.g:204:11: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Out"
    public final void mOut() throws RecognitionException {
        try {
            int _type = Out;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:205:8: ( 'out' )
            // TL.g:205:10: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Out"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:206:7: ( 'in' )
            // TL.g:206:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:207:8: ( 'null' )
            // TL.g:207:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:210:7: ( '|_|' )
            // TL.g:210:9: '|_|'
            {
            match("|_|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:211:8: ( '&_&' )
            // TL.g:211:10: '&_&'
            {
            match("&_&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Xor"
    public final void mXor() throws RecognitionException {
        try {
            int _type = Xor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:212:8: ( '^_^' )
            // TL.g:212:10: '^_^'
            {
            match("^_^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Xor"

    // $ANTLR start "Equals"
    public final void mEquals() throws RecognitionException {
        try {
            int _type = Equals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:213:10: ( '=_=' )
            // TL.g:213:12: '=_='
            {
            match("=_="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Equals"

    // $ANTLR start "NEquals"
    public final void mNEquals() throws RecognitionException {
        try {
            int _type = NEquals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:214:11: ( '>_<' )
            // TL.g:214:13: '>_<'
            {
            match(">_<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEquals"

    // $ANTLR start "GTEquals"
    public final void mGTEquals() throws RecognitionException {
        try {
            int _type = GTEquals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:215:11: ( '>_=' )
            // TL.g:215:13: '>_='
            {
            match(">_="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTEquals"

    // $ANTLR start "LTEquals"
    public final void mLTEquals() throws RecognitionException {
        try {
            int _type = LTEquals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:216:11: ( '=_<' )
            // TL.g:216:13: '=_<'
            {
            match("=_<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTEquals"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:217:7: ( '>_>' )
            // TL.g:217:9: '>_>'
            {
            match(">_>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:218:7: ( '<_<' )
            // TL.g:218:9: '<_<'
            {
            match("<_<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "Not"
    public final void mNot() throws RecognitionException {
        try {
            int _type = Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:219:8: ( '!' )
            // TL.g:219:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Not"

    // $ANTLR start "Pow"
    public final void mPow() throws RecognitionException {
        try {
            int _type = Pow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:221:8: ( '**' )
            // TL.g:221:10: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pow"

    // $ANTLR start "Add"
    public final void mAdd() throws RecognitionException {
        try {
            int _type = Add;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:222:8: ( '+' )
            // TL.g:222:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Add"

    // $ANTLR start "Subt"
    public final void mSubt() throws RecognitionException {
        try {
            int _type = Subt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:223:8: ( '-' )
            // TL.g:223:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Subt"

    // $ANTLR start "Mult"
    public final void mMult() throws RecognitionException {
        try {
            int _type = Mult;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:224:8: ( '*' )
            // TL.g:224:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mult"

    // $ANTLR start "Int_Div"
    public final void mInt_Div() throws RecognitionException {
        try {
            int _type = Int_Div;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:225:11: ( '//' )
            // TL.g:225:13: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int_Div"

    // $ANTLR start "Div"
    public final void mDiv() throws RecognitionException {
        try {
            int _type = Div;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:226:8: ( '/' )
            // TL.g:226:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Div"

    // $ANTLR start "Mod"
    public final void mMod() throws RecognitionException {
        try {
            int _type = Mod;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:227:8: ( '%' )
            // TL.g:227:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mod"

    // $ANTLR start "Bit_Or"
    public final void mBit_Or() throws RecognitionException {
        try {
            int _type = Bit_Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:228:10: ( '|' )
            // TL.g:228:12: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bit_Or"

    // $ANTLR start "Bit_And"
    public final void mBit_And() throws RecognitionException {
        try {
            int _type = Bit_And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:229:11: ( '&' )
            // TL.g:229:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bit_And"

    // $ANTLR start "Bit_Xor"
    public final void mBit_Xor() throws RecognitionException {
        try {
            int _type = Bit_Xor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:230:11: ( '^' )
            // TL.g:230:13: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bit_Xor"

    // $ANTLR start "Bit_Not"
    public final void mBit_Not() throws RecognitionException {
        try {
            int _type = Bit_Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:231:11: ( '~' )
            // TL.g:231:13: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bit_Not"

    // $ANTLR start "Strcat"
    public final void mStrcat() throws RecognitionException {
        try {
            int _type = Strcat;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:232:10: ( '#' )
            // TL.g:232:12: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Strcat"

    // $ANTLR start "Gets"
    public final void mGets() throws RecognitionException {
        try {
            int _type = Gets;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:234:8: ( '<-' )
            // TL.g:234:10: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Gets"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:235:9: ( ',' )
            // TL.g:235:11: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Open_Paren"
    public final void mOpen_Paren() throws RecognitionException {
        try {
            int _type = Open_Paren;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:237:13: ( '(' )
            // TL.g:237:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Open_Paren"

    // $ANTLR start "Close_Paren"
    public final void mClose_Paren() throws RecognitionException {
        try {
            int _type = Close_Paren;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:238:14: ( ')' )
            // TL.g:238:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Close_Paren"

    // $ANTLR start "Open_Bracket"
    public final void mOpen_Bracket() throws RecognitionException {
        try {
            int _type = Open_Bracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:239:14: ( '[' )
            // TL.g:239:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Open_Bracket"

    // $ANTLR start "Close_Bracket"
    public final void mClose_Bracket() throws RecognitionException {
        try {
            int _type = Close_Bracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:240:15: ( ']' )
            // TL.g:240:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Close_Bracket"

    // $ANTLR start "Open_Brace"
    public final void mOpen_Brace() throws RecognitionException {
        try {
            int _type = Open_Brace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:241:13: ( '{' )
            // TL.g:241:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Open_Brace"

    // $ANTLR start "Close_Brace"
    public final void mClose_Brace() throws RecognitionException {
        try {
            int _type = Close_Brace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:242:14: ( '}' )
            // TL.g:242:16: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Close_Brace"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:245:3: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // TL.g:245:6: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // TL.g:246:6: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:250:3: ( Int ( '.' ( Digit )* )? )
            // TL.g:250:6: Int ( '.' ( Digit )* )?
            {
            mInt(); 
            // TL.g:250:10: ( '.' ( Digit )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // TL.g:250:11: '.' ( Digit )*
                    {
                    match('.'); 
                    // TL.g:250:15: ( Digit )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // TL.g:250:15: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:254:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
            // TL.g:254:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // TL.g:254:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // TL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:261:3: ( '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' . )* '\\'' )
            // TL.g:261:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' . )* '\\''
            {
            match('\''); 
            // TL.g:261:11: (~ ( '\\'' | '\\\\' ) | '\\\\' . )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }
                else if ( (LA5_0=='\\') ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // TL.g:261:12: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // TL.g:261:29: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;

              setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Comment"
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:265:3: ( '##' (~ ( '\\r' | '\\n' ) )* | '/*' ( . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='#') ) {
                alt8=1;
            }
            else if ( (LA8_0=='/') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // TL.g:265:6: '##' (~ ( '\\r' | '\\n' ) )*
                    {
                    match("##"); 

                    // TL.g:265:11: (~ ( '\\r' | '\\n' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // TL.g:265:11: ~ ( '\\r' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    skip();

                    }
                    break;
                case 2 :
                    // TL.g:266:6: '/*' ( . )* '*/'
                    {
                    match("/*"); 

                    // TL.g:266:11: ( . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // TL.g:266:11: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match("*/"); 

                    skip();

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comment"

    // $ANTLR start "Space"
    public final void mSpace() throws RecognitionException {
        try {
            int _type = Space;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:270:3: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' ) )
            // TL.g:270:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Space"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            // TL.g:274:3: ( '1' .. '9' ( Digit )* | '0' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='1' && LA10_0<='9')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='0') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // TL.g:274:6: '1' .. '9' ( Digit )*
                    {
                    matchRange('1','9'); 
                    // TL.g:274:15: ( Digit )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // TL.g:274:15: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // TL.g:275:6: '0'
                    {
                    match('0'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // TL.g:279:3: ( '0' .. '9' )
            // TL.g:279:6: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    public void mTokens() throws RecognitionException {
        // TL.g:1:8: ( T__67 | Def_Func | If | Else_If | Else | Return | While | Out | In | Null | Or | And | Xor | Equals | NEquals | GTEquals | LTEquals | GT | LT | Not | Pow | Add | Subt | Mult | Int_Div | Div | Mod | Bit_Or | Bit_And | Bit_Xor | Bit_Not | Strcat | Gets | Comma | Open_Paren | Close_Paren | Open_Bracket | Close_Bracket | Open_Brace | Close_Brace | Bool | Number | Identifier | String | Comment | Space )
        int alt11=46;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // TL.g:1:10: T__67
                {
                mT__67(); 

                }
                break;
            case 2 :
                // TL.g:1:16: Def_Func
                {
                mDef_Func(); 

                }
                break;
            case 3 :
                // TL.g:1:25: If
                {
                mIf(); 

                }
                break;
            case 4 :
                // TL.g:1:28: Else_If
                {
                mElse_If(); 

                }
                break;
            case 5 :
                // TL.g:1:36: Else
                {
                mElse(); 

                }
                break;
            case 6 :
                // TL.g:1:41: Return
                {
                mReturn(); 

                }
                break;
            case 7 :
                // TL.g:1:48: While
                {
                mWhile(); 

                }
                break;
            case 8 :
                // TL.g:1:54: Out
                {
                mOut(); 

                }
                break;
            case 9 :
                // TL.g:1:58: In
                {
                mIn(); 

                }
                break;
            case 10 :
                // TL.g:1:61: Null
                {
                mNull(); 

                }
                break;
            case 11 :
                // TL.g:1:66: Or
                {
                mOr(); 

                }
                break;
            case 12 :
                // TL.g:1:69: And
                {
                mAnd(); 

                }
                break;
            case 13 :
                // TL.g:1:73: Xor
                {
                mXor(); 

                }
                break;
            case 14 :
                // TL.g:1:77: Equals
                {
                mEquals(); 

                }
                break;
            case 15 :
                // TL.g:1:84: NEquals
                {
                mNEquals(); 

                }
                break;
            case 16 :
                // TL.g:1:92: GTEquals
                {
                mGTEquals(); 

                }
                break;
            case 17 :
                // TL.g:1:101: LTEquals
                {
                mLTEquals(); 

                }
                break;
            case 18 :
                // TL.g:1:110: GT
                {
                mGT(); 

                }
                break;
            case 19 :
                // TL.g:1:113: LT
                {
                mLT(); 

                }
                break;
            case 20 :
                // TL.g:1:116: Not
                {
                mNot(); 

                }
                break;
            case 21 :
                // TL.g:1:120: Pow
                {
                mPow(); 

                }
                break;
            case 22 :
                // TL.g:1:124: Add
                {
                mAdd(); 

                }
                break;
            case 23 :
                // TL.g:1:128: Subt
                {
                mSubt(); 

                }
                break;
            case 24 :
                // TL.g:1:133: Mult
                {
                mMult(); 

                }
                break;
            case 25 :
                // TL.g:1:138: Int_Div
                {
                mInt_Div(); 

                }
                break;
            case 26 :
                // TL.g:1:146: Div
                {
                mDiv(); 

                }
                break;
            case 27 :
                // TL.g:1:150: Mod
                {
                mMod(); 

                }
                break;
            case 28 :
                // TL.g:1:154: Bit_Or
                {
                mBit_Or(); 

                }
                break;
            case 29 :
                // TL.g:1:161: Bit_And
                {
                mBit_And(); 

                }
                break;
            case 30 :
                // TL.g:1:169: Bit_Xor
                {
                mBit_Xor(); 

                }
                break;
            case 31 :
                // TL.g:1:177: Bit_Not
                {
                mBit_Not(); 

                }
                break;
            case 32 :
                // TL.g:1:185: Strcat
                {
                mStrcat(); 

                }
                break;
            case 33 :
                // TL.g:1:192: Gets
                {
                mGets(); 

                }
                break;
            case 34 :
                // TL.g:1:197: Comma
                {
                mComma(); 

                }
                break;
            case 35 :
                // TL.g:1:203: Open_Paren
                {
                mOpen_Paren(); 

                }
                break;
            case 36 :
                // TL.g:1:214: Close_Paren
                {
                mClose_Paren(); 

                }
                break;
            case 37 :
                // TL.g:1:226: Open_Bracket
                {
                mOpen_Bracket(); 

                }
                break;
            case 38 :
                // TL.g:1:239: Close_Bracket
                {
                mClose_Bracket(); 

                }
                break;
            case 39 :
                // TL.g:1:253: Open_Brace
                {
                mOpen_Brace(); 

                }
                break;
            case 40 :
                // TL.g:1:264: Close_Brace
                {
                mClose_Brace(); 

                }
                break;
            case 41 :
                // TL.g:1:276: Bool
                {
                mBool(); 

                }
                break;
            case 42 :
                // TL.g:1:281: Number
                {
                mNumber(); 

                }
                break;
            case 43 :
                // TL.g:1:288: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 44 :
                // TL.g:1:299: String
                {
                mString(); 

                }
                break;
            case 45 :
                // TL.g:1:306: Comment
                {
                mComment(); 

                }
                break;
            case 46 :
                // TL.g:1:314: Space
                {
                mSpace(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\2\uffff\6\37\1\54\1\56\1\60\4\uffff\1\66\2\uffff\1\71\2\uffff"+
        "\1\72\7\uffff\1\37\4\uffff\1\37\1\76\1\37\1\100\1\101\4\37\20\uffff"+
        "\3\37\1\uffff\1\37\2\uffff\2\37\1\121\1\37\5\uffff\1\37\1\124\1"+
        "\125\3\37\1\uffff\1\131\1\132\2\uffff\1\132\1\37\1\134\2\uffff\1"+
        "\135\2\uffff";
    static final String DFA11_eofS =
        "\136\uffff";
    static final String DFA11_minS =
        "\1\11\1\uffff\1\141\1\146\1\145\1\150\2\165\5\137\1\55\1\uffff"+
        "\1\52\2\uffff\1\52\2\uffff\1\43\7\uffff\1\162\4\uffff\1\156\1\60"+
        "\1\154\2\60\1\164\1\151\1\164\1\154\6\uffff\2\74\10\uffff\1\165"+
        "\1\143\1\146\1\uffff\1\163\2\uffff\1\165\1\154\1\60\1\154\5\uffff"+
        "\1\145\2\60\1\145\1\162\1\145\1\uffff\2\60\2\uffff\1\60\1\156\1"+
        "\60\2\uffff\1\60\2\uffff";
    static final String DFA11_maxS =
        "\1\176\1\uffff\1\165\1\156\1\145\1\150\2\165\6\137\1\uffff\1\52"+
        "\2\uffff\1\57\2\uffff\1\43\7\uffff\1\162\4\uffff\1\156\1\172\1\154"+
        "\2\172\1\164\1\151\1\164\1\154\6\uffff\1\75\1\76\10\uffff\1\165"+
        "\1\143\1\146\1\uffff\1\163\2\uffff\1\165\1\154\1\172\1\154\5\uffff"+
        "\1\145\2\172\1\145\1\162\1\145\1\uffff\2\172\2\uffff\1\172\1\156"+
        "\1\172\2\uffff\1\172\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\14\uffff\1\24\1\uffff\1\26\1\27\1\uffff\1\33\1\37"+
        "\1\uffff\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\uffff\1\52\1\53\1"+
        "\54\1\56\11\uffff\1\13\1\34\1\14\1\35\1\15\1\36\2\uffff\1\23\1\41"+
        "\1\25\1\30\1\31\1\55\1\32\1\40\3\uffff\1\5\1\uffff\1\3\1\11\4\uffff"+
        "\1\16\1\21\1\17\1\20\1\22\6\uffff\1\10\2\uffff\1\2\1\4\3\uffff\1"+
        "\12\1\51\1\uffff\1\7\1\6";
    static final String DFA11_specialS =
        "\136\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\41\1\uffff\2\41\22\uffff\1\41\1\16\1\uffff\1\25\1\uffff"+
            "\1\23\1\11\1\40\1\27\1\30\1\17\1\20\1\26\1\21\1\uffff\1\22\12"+
            "\36\1\uffff\1\1\1\15\1\13\1\14\2\uffff\32\37\1\31\1\uffff\1"+
            "\32\1\12\1\37\1\uffff\5\37\1\2\2\37\1\3\4\37\1\7\1\6\2\37\1"+
            "\4\1\37\1\35\2\37\1\5\3\37\1\33\1\10\1\34\1\24",
            "",
            "\1\44\7\uffff\1\43\13\uffff\1\42",
            "\1\45\7\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\55",
            "\1\57",
            "\1\61",
            "\1\62",
            "\1\64\61\uffff\1\63",
            "",
            "\1\65",
            "",
            "",
            "\1\70\4\uffff\1\67",
            "",
            "",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\73",
            "",
            "",
            "",
            "",
            "\1\74",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\10\37\1\75\21\37",
            "\1\77",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107\1\106",
            "\1\110\1\111\1\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "",
            "",
            "\1\117",
            "\1\120",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\133",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__67 | Def_Func | If | Else_If | Else | Return | While | Out | In | Null | Or | And | Xor | Equals | NEquals | GTEquals | LTEquals | GT | LT | Not | Pow | Add | Subt | Mult | Int_Div | Div | Mod | Bit_Or | Bit_And | Bit_Xor | Bit_Not | Strcat | Gets | Comma | Open_Paren | Close_Paren | Open_Bracket | Close_Bracket | Open_Brace | Close_Brace | Bool | Number | Identifier | String | Comment | Space );";
        }
    }
 

}