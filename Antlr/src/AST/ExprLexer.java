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
			null, "';'", "'+'", "'-'", "'='", "'*'", "'/'", "'('", "')'"
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
		"\u0004\u0000\re\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0004\b-\b\b\u000b\b\f\b.\u0001\t\u0003\t2\b\t\u0001\t"+
		"\u0004\t5\b\t\u000b\t\f\t6\u0001\n\u0003\n:\b\n\u0001\n\u0004\n=\b\n\u000b"+
		"\n\f\n>\u0001\n\u0001\n\u0005\nC\b\n\n\n\f\nF\t\n\u0003\nH\b\n\u0001\n"+
		"\u0005\nK\b\n\n\n\f\nN\t\n\u0001\n\u0001\n\u0004\nR\b\n\u000b\n\f\nS\u0003"+
		"\nV\b\n\u0001\u000b\u0004\u000bY\b\u000b\u000b\u000b\f\u000bZ\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0005\fa\b\f\n\f\f\fd\t\f\u0000\u0000\r\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0006"+
		"\u0002\u0000\n\n\r\r\u0002\u0000++--\u0001\u000009\u0003\u0000\t\n\r\r"+
		"  \u0004\u0000$$AZ__az\u0005\u0000$$09AZ__azp\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0001\u001b\u0001\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000"+
		"\u0005\u001f\u0001\u0000\u0000\u0000\u0007!\u0001\u0000\u0000\u0000\t"+
		"#\u0001\u0000\u0000\u0000\u000b%\u0001\u0000\u0000\u0000\r\'\u0001\u0000"+
		"\u0000\u0000\u000f)\u0001\u0000\u0000\u0000\u0011,\u0001\u0000\u0000\u0000"+
		"\u00131\u0001\u0000\u0000\u0000\u00159\u0001\u0000\u0000\u0000\u0017X"+
		"\u0001\u0000\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		";\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005+\u0000"+
		"\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005-\u0000\u0000 "+
		"\u0006\u0001\u0000\u0000\u0000!\"\u0005=\u0000\u0000\"\b\u0001\u0000\u0000"+
		"\u0000#$\u0005*\u0000\u0000$\n\u0001\u0000\u0000\u0000%&\u0005/\u0000"+
		"\u0000&\f\u0001\u0000\u0000\u0000\'(\u0005(\u0000\u0000(\u000e\u0001\u0000"+
		"\u0000\u0000)*\u0005)\u0000\u0000*\u0010\u0001\u0000\u0000\u0000+-\u0007"+
		"\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0012\u0001\u0000"+
		"\u0000\u000002\u0007\u0001\u0000\u000010\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000024\u0001\u0000\u0000\u000035\u0007\u0002\u0000\u0000"+
		"43\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000064\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u00007\u0014\u0001\u0000\u0000\u00008:\u0007"+
		"\u0001\u0000\u000098\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":U\u0001\u0000\u0000\u0000;=\u0007\u0002\u0000\u0000<;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?G\u0001\u0000\u0000\u0000@D\u0005.\u0000\u0000AC\u0007\u0002"+
		"\u0000\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000G@\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HV\u0001\u0000\u0000\u0000IK\u0007\u0002\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"OQ\u0005.\u0000\u0000PR\u0007\u0002\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000U<\u0001\u0000\u0000\u0000UL\u0001\u0000"+
		"\u0000\u0000V\u0016\u0001\u0000\u0000\u0000WY\u0007\u0003\u0000\u0000"+
		"XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0006\u000b"+
		"\u0000\u0000]\u0018\u0001\u0000\u0000\u0000^b\u0007\u0004\u0000\u0000"+
		"_a\u0007\u0005\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u001a\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000\r\u0000.169>DGLSUZb\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}