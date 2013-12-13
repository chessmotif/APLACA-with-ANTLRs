package tl;
// $ANTLR 3.2 Sep 23, 2009 12:02:23 TL.g 2013-12-12 17:41:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Println", "Print", "Assert", "Size", "Def", "If", "Else", "Return", "For", "While", "To", "Do", "End", "In", "Null", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool", "Int", "Digit", "Number", "Identifier", "String", "Comment", "Space"
    };
    public static final int End=16;
    public static final int LT=28;
    public static final int OParen=38;
    public static final int Assert=6;
    public static final int While=13;
    public static final int QMark=43;
    public static final int EOF=-1;
    public static final int Add=29;
    public static final int Identifier=49;
    public static final int Int=46;
    public static final int Space=52;
    public static final int Size=7;
    public static final int Assign=41;
    public static final int CParen=39;
    public static final int Number=48;
    public static final int To=14;
    public static final int Comment=51;
    public static final int Print=5;
    public static final int GTEquals=23;
    public static final int CBrace=35;
    public static final int Do=15;
    public static final int String=50;
    public static final int Or=19;
    public static final int Return=11;
    public static final int If=9;
    public static final int Null=18;
    public static final int And=20;
    public static final int CBracket=37;
    public static final int Println=4;
    public static final int Bool=45;
    public static final int In=17;
    public static final int NEquals=22;
    public static final int Subtract=30;
    public static final int Modulus=33;
    public static final int Multiply=31;
    public static final int OBrace=34;
    public static final int Colon=44;
    public static final int Excl=26;
    public static final int Digit=47;
    public static final int For=12;
    public static final int Divide=32;
    public static final int Def=8;
    public static final int SColon=40;
    public static final int OBracket=36;
    public static final int GT=27;
    public static final int Else=10;
    public static final int Equals=21;
    public static final int Comma=42;
    public static final int Pow=25;
    public static final int LTEquals=24;

    // delegates
    // delegators


        public TLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TLParser.tokenNames; }
    public String getGrammarFileName() { return "TL.g"; }



    // $ANTLR start "parse"
    // TL.g:3:1: parse : (t= . )* EOF ;
    public final void parse() throws RecognitionException {
        Token t=null;

        try {
            // TL.g:4:3: ( (t= . )* EOF )
            // TL.g:4:6: (t= . )* EOF
            {
            // TL.g:4:6: (t= . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=Println && LA1_0<=Space)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // TL.g:4:7: t= .
            	    {
            	    t=(Token)input.LT(1);
            	    matchAny(input); 
            	    System.out.printf("text: %-7s  type: %s \n", 
            	               (t!=null?t.getText():null), tokenNames[(t!=null?t.getType():0)]);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_parse45); 

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
    // $ANTLR end "parse"

    // Delegated rules


 

    public static final BitSet FOLLOW_EOF_in_parse45 = new BitSet(new long[]{0x0000000000000002L});

}