// Generated from WavelusLexer.g4 by ANTLR 4.7.1
package antlr4.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WavelusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, DO=2, ELSE=3, ELIF=4, DEF_FUN=5, WHILE=6, RUN=7, END=8, NUMBER=9, 
		RETURN=10, PRINT=11, TEXT=12, BOOL=13, NULL=14, PLUS=15, MINUS=16, EQUAL=17, 
		GREATER=18, NAND=19, MULTIPLY=20, SEMI=21, COMMA=22, ASSIGN=23, OPEN_PAREN=24, 
		CLOSE_PAREN=25, OPEN_SQUARED_PAREN=26, CLOSE_SQUARED_PAREN=27, TYPE=28, 
		BOOL_VALUE=29, NUMBER_VALUE=30, TEXT_VALUE=31, COMMENT_LINE=32, WHITESPACE=33, 
		IDENTIFIER=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LOWERCASE", "UPPERCASE", "DIGIT", "A", "B", "C", "D", "E", "F", "G", 
		"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
		"V", "W", "X", "Y", "Z", "IF", "DO", "ELSE", "ELIF", "DEF_FUN", "WHILE", 
		"RUN", "END", "NUMBER", "RETURN", "PRINT", "TEXT", "BOOL", "NULL", "PLUS", 
		"MINUS", "EQUAL", "GREATER", "NAND", "MULTIPLY", "SEMI", "COMMA", "ASSIGN", 
		"OPEN_PAREN", "CLOSE_PAREN", "OPEN_SQUARED_PAREN", "CLOSE_SQUARED_PAREN", 
		"TYPE", "BOOL_VALUE", "NUMBER_VALUE", "TEXT_VALUE", "COMMENT_LINE", "WHITESPACE", 
		"IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "'number'", "'return'", 
		"'print'", "'text'", "'bool'", "'null'", "'+'", "'-'", "'=='", "'>'", 
		"'!!'", "'*'", "';'", "','", "'='", "'('", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "DO", "ELSE", "ELIF", "DEF_FUN", "WHILE", "RUN", "END", "NUMBER", 
		"RETURN", "PRINT", "TEXT", "BOOL", "NULL", "PLUS", "MINUS", "EQUAL", "GREATER", 
		"NAND", "MULTIPLY", "SEMI", "COMMA", "ASSIGN", "OPEN_PAREN", "CLOSE_PAREN", 
		"OPEN_SQUARED_PAREN", "CLOSE_SQUARED_PAREN", "TYPE", "BOOL_VALUE", "NUMBER_VALUE", 
		"TEXT_VALUE", "COMMENT_LINE", "WHITESPACE", "IDENTIFIER"
	};
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


	public WavelusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WavelusLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0155\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\3:\3:\3:\5:\u0120\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u012b\n;\3<\5<\u012e"+
		"\n<\3<\6<\u0131\n<\r<\16<\u0132\3=\3=\7=\u0137\n=\f=\16=\u013a\13=\3="+
		"\3=\3>\3>\3>\3>\7>\u0142\n>\f>\16>\u0145\13>\3>\3>\3?\3?\3?\3?\3@\3@\3"+
		"@\3@\7@\u0151\n@\f@\16@\u0154\13@\2\2A\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21"+
		"\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63"+
		"\2\65\2\67\29\2;\2=\3?\4A\5C\6E\7G\bI\tK\nM\13O\fQ\rS\16U\17W\20Y\21["+
		"\22]\23_\24a\25c\26e\27g\30i\31k\32m\33o\34q\35s\36u\37w y!{\"}#\177$"+
		"\3\2#\3\2c|\3\2C\\\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2"+
		"HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4"+
		"\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYy"+
		"y\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2//\7\2\13\f\"\"\62;C\\c|\4\2\f\f\17\17"+
		"\4\2\13\f\"\"\2\u0141\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u0083"+
		"\3\2\2\2\7\u0085\3\2\2\2\t\u0087\3\2\2\2\13\u0089\3\2\2\2\r\u008b\3\2"+
		"\2\2\17\u008d\3\2\2\2\21\u008f\3\2\2\2\23\u0091\3\2\2\2\25\u0093\3\2\2"+
		"\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2\2\2\35\u009b\3\2\2\2"+
		"\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a5"+
		"\3\2\2\2)\u00a7\3\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ad\3\2\2\2\61"+
		"\u00af\3\2\2\2\63\u00b1\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2\2\29\u00b7"+
		"\3\2\2\2;\u00b9\3\2\2\2=\u00bb\3\2\2\2?\u00be\3\2\2\2A\u00c1\3\2\2\2C"+
		"\u00c6\3\2\2\2E\u00cb\3\2\2\2G\u00cf\3\2\2\2I\u00d5\3\2\2\2K\u00d9\3\2"+
		"\2\2M\u00dd\3\2\2\2O\u00e4\3\2\2\2Q\u00eb\3\2\2\2S\u00f1\3\2\2\2U\u00f6"+
		"\3\2\2\2W\u00fb\3\2\2\2Y\u0100\3\2\2\2[\u0102\3\2\2\2]\u0104\3\2\2\2_"+
		"\u0107\3\2\2\2a\u0109\3\2\2\2c\u010c\3\2\2\2e\u010e\3\2\2\2g\u0110\3\2"+
		"\2\2i\u0112\3\2\2\2k\u0114\3\2\2\2m\u0116\3\2\2\2o\u0118\3\2\2\2q\u011a"+
		"\3\2\2\2s\u011f\3\2\2\2u\u012a\3\2\2\2w\u012d\3\2\2\2y\u0134\3\2\2\2{"+
		"\u013d\3\2\2\2}\u0148\3\2\2\2\177\u014c\3\2\2\2\u0081\u0082\t\2\2\2\u0082"+
		"\4\3\2\2\2\u0083\u0084\t\3\2\2\u0084\6\3\2\2\2\u0085\u0086\t\4\2\2\u0086"+
		"\b\3\2\2\2\u0087\u0088\t\5\2\2\u0088\n\3\2\2\2\u0089\u008a\t\6\2\2\u008a"+
		"\f\3\2\2\2\u008b\u008c\t\7\2\2\u008c\16\3\2\2\2\u008d\u008e\t\b\2\2\u008e"+
		"\20\3\2\2\2\u008f\u0090\t\t\2\2\u0090\22\3\2\2\2\u0091\u0092\t\n\2\2\u0092"+
		"\24\3\2\2\2\u0093\u0094\t\13\2\2\u0094\26\3\2\2\2\u0095\u0096\t\f\2\2"+
		"\u0096\30\3\2\2\2\u0097\u0098\t\r\2\2\u0098\32\3\2\2\2\u0099\u009a\t\16"+
		"\2\2\u009a\34\3\2\2\2\u009b\u009c\t\17\2\2\u009c\36\3\2\2\2\u009d\u009e"+
		"\t\20\2\2\u009e \3\2\2\2\u009f\u00a0\t\21\2\2\u00a0\"\3\2\2\2\u00a1\u00a2"+
		"\t\22\2\2\u00a2$\3\2\2\2\u00a3\u00a4\t\23\2\2\u00a4&\3\2\2\2\u00a5\u00a6"+
		"\t\24\2\2\u00a6(\3\2\2\2\u00a7\u00a8\t\25\2\2\u00a8*\3\2\2\2\u00a9\u00aa"+
		"\t\26\2\2\u00aa,\3\2\2\2\u00ab\u00ac\t\27\2\2\u00ac.\3\2\2\2\u00ad\u00ae"+
		"\t\30\2\2\u00ae\60\3\2\2\2\u00af\u00b0\t\31\2\2\u00b0\62\3\2\2\2\u00b1"+
		"\u00b2\t\32\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\t\33\2\2\u00b4\66\3\2\2\2"+
		"\u00b5\u00b6\t\34\2\2\u00b68\3\2\2\2\u00b7\u00b8\t\35\2\2\u00b8:\3\2\2"+
		"\2\u00b9\u00ba\t\36\2\2\u00ba<\3\2\2\2\u00bb\u00bc\5\31\r\2\u00bc\u00bd"+
		"\5\23\n\2\u00bd>\3\2\2\2\u00be\u00bf\5\17\b\2\u00bf\u00c0\5%\23\2\u00c0"+
		"@\3\2\2\2\u00c1\u00c2\5\21\t\2\u00c2\u00c3\5\37\20\2\u00c3\u00c4\5-\27"+
		"\2\u00c4\u00c5\5\21\t\2\u00c5B\3\2\2\2\u00c6\u00c7\5\21\t\2\u00c7\u00c8"+
		"\5\37\20\2\u00c8\u00c9\5\31\r\2\u00c9\u00ca\5\23\n\2\u00caD\3\2\2\2\u00cb"+
		"\u00cc\5\23\n\2\u00cc\u00cd\5\61\31\2\u00cd\u00ce\5#\22\2\u00ceF\3\2\2"+
		"\2\u00cf\u00d0\5\65\33\2\u00d0\u00d1\5\27\f\2\u00d1\u00d2\5\31\r\2\u00d2"+
		"\u00d3\5\37\20\2\u00d3\u00d4\5\21\t\2\u00d4H\3\2\2\2\u00d5\u00d6\5+\26"+
		"\2\u00d6\u00d7\5\61\31\2\u00d7\u00d8\5#\22\2\u00d8J\3\2\2\2\u00d9\u00da"+
		"\5\21\t\2\u00da\u00db\5#\22\2\u00db\u00dc\5\17\b\2\u00dcL\3\2\2\2\u00dd"+
		"\u00de\7p\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7d\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2\u00e3\7t\2\2\u00e3N\3\2\2\2\u00e4\u00e5\7t\2"+
		"\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9"+
		"\7t\2\2\u00e9\u00ea\7p\2\2\u00eaP\3\2\2\2\u00eb\u00ec\7r\2\2\u00ec\u00ed"+
		"\7t\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7v\2\2\u00f0"+
		"R\3\2\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7z\2\2\u00f4"+
		"\u00f5\7v\2\2\u00f5T\3\2\2\2\u00f6\u00f7\7d\2\2\u00f7\u00f8\7q\2\2\u00f8"+
		"\u00f9\7q\2\2\u00f9\u00fa\7n\2\2\u00faV\3\2\2\2\u00fb\u00fc\7p\2\2\u00fc"+
		"\u00fd\7w\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7n\2\2\u00ffX\3\2\2\2\u0100"+
		"\u0101\7-\2\2\u0101Z\3\2\2\2\u0102\u0103\7/\2\2\u0103\\\3\2\2\2\u0104"+
		"\u0105\7?\2\2\u0105\u0106\7?\2\2\u0106^\3\2\2\2\u0107\u0108\7@\2\2\u0108"+
		"`\3\2\2\2\u0109\u010a\7#\2\2\u010a\u010b\7#\2\2\u010bb\3\2\2\2\u010c\u010d"+
		"\7,\2\2\u010dd\3\2\2\2\u010e\u010f\7=\2\2\u010ff\3\2\2\2\u0110\u0111\7"+
		".\2\2\u0111h\3\2\2\2\u0112\u0113\7?\2\2\u0113j\3\2\2\2\u0114\u0115\7*"+
		"\2\2\u0115l\3\2\2\2\u0116\u0117\7+\2\2\u0117n\3\2\2\2\u0118\u0119\7]\2"+
		"\2\u0119p\3\2\2\2\u011a\u011b\7_\2\2\u011br\3\2\2\2\u011c\u0120\5U+\2"+
		"\u011d\u0120\5S*\2\u011e\u0120\5M\'\2\u011f\u011c\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u011e\3\2\2\2\u0120t\3\2\2\2\u0121\u0122\7v\2\2\u0122\u0123"+
		"\7t\2\2\u0123\u0124\7w\2\2\u0124\u012b\7g\2\2\u0125\u0126\7h\2\2\u0126"+
		"\u0127\7c\2\2\u0127\u0128\7n\2\2\u0128\u0129\7u\2\2\u0129\u012b\7g\2\2"+
		"\u012a\u0121\3\2\2\2\u012a\u0125\3\2\2\2\u012bv\3\2\2\2\u012c\u012e\t"+
		"\37\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u0131\t\4\2\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133x\3\2\2\2\u0134\u0138\7)\2\2\u0135\u0137"+
		"\t \2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7)"+
		"\2\2\u013cz\3\2\2\2\u013d\u013e\7%\2\2\u013e\u013f\7%\2\2\u013f\u0143"+
		"\3\2\2\2\u0140\u0142\n!\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0146\u0147\b>\2\2\u0147|\3\2\2\2\u0148\u0149\t\"\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\b?\2\2\u014b~\3\2\2\2\u014c\u0152\5\3\2\2\u014d\u0151"+
		"\5\3\2\2\u014e\u0151\5\7\4\2\u014f\u0151\7a\2\2\u0150\u014d\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u0080\3\2\2\2\u0154\u0152\3\2\2\2\13\2"+
		"\u011f\u012a\u012d\u0132\u0138\u0143\u0150\u0152\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}