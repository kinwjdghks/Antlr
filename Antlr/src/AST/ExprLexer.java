// Generated from Expr.g4 by ANTLR 4.13.1
package AST;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NEWLINE=9, 
		INT=10, REAL=11, WS=12, VAR=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NEWLINE", 
			"INT", "REAL", "WS", "VAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NEWLINE", "INT", 
			"REAL", "WS", "VAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\rU\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0004\b-\b\b\u000b\b\f\b.\u0001\t\u0003\t2\b\t\u0001\t"+
		"\u0004\t5\b\t\u000b\t\f\t6\u0001\n\u0003\n:\b\n\u0001\n\u0004\n=\b\n\u000b"+
		"\n\f\n>\u0001\n\u0001\n\u0005\nC\b\n\n\n\f\nF\t\n\u0001\u000b\u0004\u000b"+
		"I\b\u000b\u000b\u000b\f\u000bJ\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0005\fQ\b\f\n\f\f\fT\t\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0006\u0002\u0000\n\n\r\r\u0002"+
		"\u0000++--\u0001\u000009\u0003\u0000\t\n\r\r  \u0004\u0000$$AZ__az\u0005"+
		"\u0000$$09AZ__az\\\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000"+
		"\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000"+
		"\u0000\u0007!\u0001\u0000\u0000\u0000\t#\u0001\u0000\u0000\u0000\u000b"+
		"%\u0001\u0000\u0000\u0000\r\'\u0001\u0000\u0000\u0000\u000f)\u0001\u0000"+
		"\u0000\u0000\u0011,\u0001\u0000\u0000\u0000\u00131\u0001\u0000\u0000\u0000"+
		"\u00159\u0001\u0000\u0000\u0000\u0017H\u0001\u0000\u0000\u0000\u0019N"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005;\u0000\u0000\u001c\u0002\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005=\u0000\u0000\u001e\u0004\u0001\u0000"+
		"\u0000\u0000\u001f \u0005*\u0000\u0000 \u0006\u0001\u0000\u0000\u0000"+
		"!\"\u0005/\u0000\u0000\"\b\u0001\u0000\u0000\u0000#$\u0005+\u0000\u0000"+
		"$\n\u0001\u0000\u0000\u0000%&\u0005-\u0000\u0000&\f\u0001\u0000\u0000"+
		"\u0000\'(\u0005(\u0000\u0000(\u000e\u0001\u0000\u0000\u0000)*\u0005)\u0000"+
		"\u0000*\u0010\u0001\u0000\u0000\u0000+-\u0007\u0000\u0000\u0000,+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/\u0012\u0001\u0000\u0000\u000002\u0007\u0001"+
		"\u0000\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001"+
		"\u0000\u0000\u000035\u0007\u0002\u0000\u000043\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u00007\u0014\u0001\u0000\u0000\u00008:\u0007\u0001\u0000\u000098\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000"+
		";=\u0007\u0002\u0000\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@D\u0005.\u0000\u0000AC\u0007\u0002\u0000\u0000BA\u0001\u0000"+
		"\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000E\u0016\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000GI\u0007\u0003\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LM\u0006\u000b\u0000\u0000M\u0018\u0001\u0000\u0000"+
		"\u0000NR\u0007\u0004\u0000\u0000OQ\u0007\u0005\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000S\u001a\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000\t\u0000.169>DJR\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}