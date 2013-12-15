package tl;
// $ANTLR 3.2 Sep 23, 2009 12:02:23 TL.g 2013-12-15 17:36:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TLLexer extends Lexer {
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

    public TLLexer() {;} 
    public TLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "TL.g"; }

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "Def_Func"
    public final void mDef_Func() throws RecognitionException {
        try {
            int _type = Def_Func;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:191:11: ( 'func' )
            // TL.g:191:13: 'func'
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
            // TL.g:192:7: ( 'if' )
            // TL.g:192:9: 'if'
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
            // TL.g:193:11: ( 'fiif' )
            // TL.g:193:13: 'fiif'
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
            // TL.g:194:8: ( 'fi' )
            // TL.g:194:10: 'fi'
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
            // TL.g:195:10: ( 'return' )
            // TL.g:195:12: 'return'
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

    // $ANTLR start "Out"
    public final void mOut() throws RecognitionException {
        try {
            int _type = Out;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:196:8: ( 'out' )
            // TL.g:196:10: 'out'
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
            // TL.g:197:7: ( 'in' )
            // TL.g:197:9: 'in'
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
            // TL.g:198:8: ( 'null' )
            // TL.g:198:10: 'null'
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
            // TL.g:200:7: ( '|_|' )
            // TL.g:200:9: '|_|'
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
            // TL.g:201:8: ( '&_&' )
            // TL.g:201:10: '&_&'
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

    // $ANTLR start "Equals"
    public final void mEquals() throws RecognitionException {
        try {
            int _type = Equals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:202:10: ( '=_=' )
            // TL.g:202:12: '=_='
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
            // TL.g:203:11: ( '>_<' )
            // TL.g:203:13: '>_<'
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
            // TL.g:204:11: ( '>_=' )
            // TL.g:204:13: '>_='
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
            // TL.g:205:11: ( '=_<' )
            // TL.g:205:13: '=_<'
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
            // TL.g:206:7: ( '>_>' )
            // TL.g:206:9: '>_>'
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
            // TL.g:207:7: ( '<_<' )
            // TL.g:207:9: '<_<'
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
            // TL.g:208:8: ( '!' )
            // TL.g:208:10: '!'
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
            // TL.g:210:8: ( '**' )
            // TL.g:210:10: '**'
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
            // TL.g:211:8: ( '+' )
            // TL.g:211:10: '+'
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
            // TL.g:212:8: ( '-' )
            // TL.g:212:10: '-'
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
            // TL.g:213:8: ( '*' )
            // TL.g:213:10: '*'
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
            // TL.g:214:11: ( '//' )
            // TL.g:214:13: '//'
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
            // TL.g:215:8: ( '/' )
            // TL.g:215:10: '/'
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
            // TL.g:216:8: ( '%' )
            // TL.g:216:10: '%'
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
            // TL.g:217:10: ( '|' )
            // TL.g:217:12: '|'
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
            // TL.g:218:11: ( '&' )
            // TL.g:218:13: '&'
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
            // TL.g:219:11: ( '^' )
            // TL.g:219:13: '^'
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
            // TL.g:220:11: ( '~' )
            // TL.g:220:13: '~'
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

    // $ANTLR start "Gets"
    public final void mGets() throws RecognitionException {
        try {
            int _type = Gets;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TL.g:222:8: ( '<-' )
            // TL.g:222:10: '<-'
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
            // TL.g:223:9: ( ',' )
            // TL.g:223:11: ','
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
            // TL.g:225:13: ( '(' )
            // TL.g:225:15: '('
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
            // TL.g:226:14: ( ')' )
            // TL.g:226:16: ')'
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
            // TL.g:227:14: ( '[' )
            // TL.g:227:16: '['
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
            // TL.g:228:15: ( ']' )
            // TL.g:228:17: ']'
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
            // TL.g:229:13: ( '{' )
            // TL.g:229:15: '{'
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
            // TL.g:230:14: ( '}' )
            // TL.g:230:16: '}'
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
            // TL.g:233:3: ( 'true' | 'false' )
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
                    // TL.g:233:6: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // TL.g:234:6: 'false'
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
            // TL.g:238:3: ( Int ( '.' ( Digit )* )? )
            // TL.g:238:6: Int ( '.' ( Digit )* )?
            {
            mInt(); 
            // TL.g:238:10: ( '.' ( Digit )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // TL.g:238:11: '.' ( Digit )*
                    {
                    match('.'); 
                    // TL.g:238:15: ( Digit )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // TL.g:238:15: Digit
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
            // TL.g:242:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
            // TL.g:242:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // TL.g:242:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
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
            // TL.g:249:3: ( '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' . )* '\\'' )
            // TL.g:249:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' . )* '\\''
            {
            match('\''); 
            // TL.g:249:11: (~ ( '\\'' | '\\\\' ) | '\\\\' . )*
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
            	    // TL.g:249:12: ~ ( '\\'' | '\\\\' )
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
            	    // TL.g:249:29: '\\\\' .
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
            // TL.g:253:3: ( '##' (~ ( '\\r' | '\\n' ) )* | '/*' ( . )* '*/' )
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
                    // TL.g:253:6: '##' (~ ( '\\r' | '\\n' ) )*
                    {
                    match("##"); 

                    // TL.g:253:11: (~ ( '\\r' | '\\n' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // TL.g:253:11: ~ ( '\\r' | '\\n' )
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
                    // TL.g:254:6: '/*' ( . )* '*/'
                    {
                    match("/*"); 

                    // TL.g:254:11: ( . )*
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
                    	    // TL.g:254:11: .
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
            // TL.g:258:3: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' ) )
            // TL.g:258:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )
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
            // TL.g:262:3: ( '1' .. '9' ( Digit )* | '0' )
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
                    // TL.g:262:6: '1' .. '9' ( Digit )*
                    {
                    matchRange('1','9'); 
                    // TL.g:262:15: ( Digit )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // TL.g:262:15: Digit
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
                    // TL.g:263:6: '0'
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
            // TL.g:267:3: ( '0' .. '9' )
            // TL.g:267:6: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    public void mTokens() throws RecognitionException {
        // TL.g:1:8: ( T__64 | Def_Func | If | Else_If | Else | Return | Out | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | GT | LT | Not | Pow | Add | Subt | Mult | Int_Div | Div | Mod | Bit_Or | Bit_And | Bit_Xor | Bit_Not | Gets | Comma | Open_Paren | Close_Paren | Open_Bracket | Close_Bracket | Open_Brace | Close_Brace | Bool | Number | Identifier | String | Comment | Space )
        int alt11=43;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // TL.g:1:10: T__64
                {
                mT__64(); 

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
                // TL.g:1:48: Out
                {
                mOut(); 

                }
                break;
            case 8 :
                // TL.g:1:52: In
                {
                mIn(); 

                }
                break;
            case 9 :
                // TL.g:1:55: Null
                {
                mNull(); 

                }
                break;
            case 10 :
                // TL.g:1:60: Or
                {
                mOr(); 

                }
                break;
            case 11 :
                // TL.g:1:63: And
                {
                mAnd(); 

                }
                break;
            case 12 :
                // TL.g:1:67: Equals
                {
                mEquals(); 

                }
                break;
            case 13 :
                // TL.g:1:74: NEquals
                {
                mNEquals(); 

                }
                break;
            case 14 :
                // TL.g:1:82: GTEquals
                {
                mGTEquals(); 

                }
                break;
            case 15 :
                // TL.g:1:91: LTEquals
                {
                mLTEquals(); 

                }
                break;
            case 16 :
                // TL.g:1:100: GT
                {
                mGT(); 

                }
                break;
            case 17 :
                // TL.g:1:103: LT
                {
                mLT(); 

                }
                break;
            case 18 :
                // TL.g:1:106: Not
                {
                mNot(); 

                }
                break;
            case 19 :
                // TL.g:1:110: Pow
                {
                mPow(); 

                }
                break;
            case 20 :
                // TL.g:1:114: Add
                {
                mAdd(); 

                }
                break;
            case 21 :
                // TL.g:1:118: Subt
                {
                mSubt(); 

                }
                break;
            case 22 :
                // TL.g:1:123: Mult
                {
                mMult(); 

                }
                break;
            case 23 :
                // TL.g:1:128: Int_Div
                {
                mInt_Div(); 

                }
                break;
            case 24 :
                // TL.g:1:136: Div
                {
                mDiv(); 

                }
                break;
            case 25 :
                // TL.g:1:140: Mod
                {
                mMod(); 

                }
                break;
            case 26 :
                // TL.g:1:144: Bit_Or
                {
                mBit_Or(); 

                }
                break;
            case 27 :
                // TL.g:1:151: Bit_And
                {
                mBit_And(); 

                }
                break;
            case 28 :
                // TL.g:1:159: Bit_Xor
                {
                mBit_Xor(); 

                }
                break;
            case 29 :
                // TL.g:1:167: Bit_Not
                {
                mBit_Not(); 

                }
                break;
            case 30 :
                // TL.g:1:175: Gets
                {
                mGets(); 

                }
                break;
            case 31 :
                // TL.g:1:180: Comma
                {
                mComma(); 

                }
                break;
            case 32 :
                // TL.g:1:186: Open_Paren
                {
                mOpen_Paren(); 

                }
                break;
            case 33 :
                // TL.g:1:197: Close_Paren
                {
                mClose_Paren(); 

                }
                break;
            case 34 :
                // TL.g:1:209: Open_Bracket
                {
                mOpen_Bracket(); 

                }
                break;
            case 35 :
                // TL.g:1:222: Close_Bracket
                {
                mClose_Bracket(); 

                }
                break;
            case 36 :
                // TL.g:1:236: Open_Brace
                {
                mOpen_Brace(); 

                }
                break;
            case 37 :
                // TL.g:1:247: Close_Brace
                {
                mClose_Brace(); 

                }
                break;
            case 38 :
                // TL.g:1:259: Bool
                {
                mBool(); 

                }
                break;
            case 39 :
                // TL.g:1:264: Number
                {
                mNumber(); 

                }
                break;
            case 40 :
                // TL.g:1:271: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 41 :
                // TL.g:1:282: String
                {
                mString(); 

                }
                break;
            case 42 :
                // TL.g:1:289: Comment
                {
                mComment(); 

                }
                break;
            case 43 :
                // TL.g:1:297: Space
                {
                mSpace(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\2\uffff\5\35\1\52\1\54\4\uffff\1\62\2\uffff\1\64\12\uffff\1\35"+
        "\5\uffff\1\35\1\70\1\35\1\72\1\73\3\35\14\uffff\3\35\1\uffff\1\35"+
        "\2\uffff\1\35\1\111\1\35\5\uffff\1\35\1\114\1\115\2\35\1\uffff\1"+
        "\120\1\121\2\uffff\1\121\1\35\2\uffff\1\123\1\uffff";
    static final String DFA11_eofS =
        "\124\uffff";
    static final String DFA11_minS =
        "\1\11\1\uffff\1\141\1\146\1\145\2\165\4\137\1\55\1\uffff\1\52\2"+
        "\uffff\1\52\12\uffff\1\162\5\uffff\1\156\1\60\1\154\2\60\2\164\1"+
        "\154\4\uffff\2\74\6\uffff\1\165\1\143\1\146\1\uffff\1\163\2\uffff"+
        "\1\165\1\60\1\154\5\uffff\1\145\2\60\1\145\1\162\1\uffff\2\60\2"+
        "\uffff\1\60\1\156\2\uffff\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\176\1\uffff\1\165\1\156\1\145\2\165\5\137\1\uffff\1\52\2\uffff"+
        "\1\57\12\uffff\1\162\5\uffff\1\156\1\172\1\154\2\172\2\164\1\154"+
        "\4\uffff\1\75\1\76\6\uffff\1\165\1\143\1\146\1\uffff\1\163\2\uffff"+
        "\1\165\1\172\1\154\5\uffff\1\145\2\172\1\145\1\162\1\uffff\2\172"+
        "\2\uffff\1\172\1\156\2\uffff\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\12\uffff\1\22\1\uffff\1\24\1\25\1\uffff\1\31\1\34"+
        "\1\35\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\uffff\1\47\1\50\1\51"+
        "\1\52\1\53\10\uffff\1\12\1\32\1\13\1\33\2\uffff\1\21\1\36\1\23\1"+
        "\26\1\27\1\30\3\uffff\1\5\1\uffff\1\3\1\10\3\uffff\1\14\1\17\1\15"+
        "\1\16\1\20\5\uffff\1\7\2\uffff\1\2\1\4\2\uffff\1\11\1\46\1\uffff"+
        "\1\6";
    static final String DFA11_specialS =
        "\124\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\40\1\uffff\2\40\22\uffff\1\40\1\14\1\uffff\1\37\1\uffff"+
            "\1\21\1\10\1\36\1\25\1\26\1\15\1\16\1\24\1\17\1\uffff\1\20\12"+
            "\34\1\uffff\1\1\1\13\1\11\1\12\2\uffff\32\35\1\27\1\uffff\1"+
            "\30\1\22\1\35\1\uffff\5\35\1\2\2\35\1\3\4\35\1\6\1\5\2\35\1"+
            "\4\1\35\1\33\6\35\1\31\1\7\1\32\1\23",
            "",
            "\1\43\7\uffff\1\42\13\uffff\1\41",
            "\1\44\7\uffff\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\53",
            "\1\55",
            "\1\56",
            "\1\60\61\uffff\1\57",
            "",
            "\1\61",
            "",
            "",
            "\1\37\4\uffff\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\67\21\35",
            "\1\71",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "\1\100\1\77",
            "\1\101\1\102\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "",
            "",
            "\1\110",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\116",
            "\1\117",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\122",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
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
            return "1:1: Tokens : ( T__64 | Def_Func | If | Else_If | Else | Return | Out | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | GT | LT | Not | Pow | Add | Subt | Mult | Int_Div | Div | Mod | Bit_Or | Bit_And | Bit_Xor | Bit_Not | Gets | Comma | Open_Paren | Close_Paren | Open_Bracket | Close_Bracket | Open_Brace | Close_Brace | Bool | Number | Identifier | String | Comment | Space );";
        }
    }
 

}