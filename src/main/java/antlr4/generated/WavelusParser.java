// Generated from WavelusParser.g4 by ANTLR 4.7.1
package antlr4.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WavelusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, DO=2, ELSE=3, DEF_FUN=4, WHILE=5, RUN=6, END=7, NUMBER=8, RETURN=9, 
		PRINT=10, TEXT=11, BOOL=12, NULL=13, PLUS=14, MINUS=15, EQUAL=16, GREATER=17, 
		NAND=18, MULTIPLY=19, SEMI=20, COMMA=21, ASSIGN=22, OPEN_PAREN=23, CLOSE_PAREN=24, 
		OPEN_SQUARED_PAREN=25, CLOSE_SQUARED_PAREN=26, TYPE=27, BOOL_VALUE=28, 
		NUMBER_VALUE=29, TEXT_VALUE=30, COMMENT_LINE=31, WHITESPACE=32, IDENTIFIER=33;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_block = 2, RULE_statement = 3, RULE_structuredStatement = 4, 
		RULE_simpleStatement = 5, RULE_assignment = 6, RULE_variableDeclaration = 7, 
		RULE_functionCall = 8, RULE_ifStatement = 9, RULE_ifStat = 10, RULE_elseIfStat = 11, 
		RULE_elseStat = 12, RULE_functionDef = 13, RULE_whileStatement = 14, RULE_idList = 15, 
		RULE_expressionList = 16, RULE_expression = 17, RULE_textExpression = 18, 
		RULE_numberExpression = 19, RULE_booleanExpression = 20, RULE_listElement = 21, 
		RULE_index = 22;
	public static final String[] ruleNames = {
		"program", "main", "block", "statement", "structuredStatement", "simpleStatement", 
		"assignment", "variableDeclaration", "functionCall", "ifStatement", "ifStat", 
		"elseIfStat", "elseStat", "functionDef", "whileStatement", "idList", "expressionList", 
		"expression", "textExpression", "numberExpression", "booleanExpression", 
		"listElement", "index"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'number'", "'return'", 
		"'print'", "'text'", "'bool'", "'null'", "'+'", "'-'", "'=='", "'>'", 
		"'!!'", "'*'", "';'", "','", "'='", "'('", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "DO", "ELSE", "DEF_FUN", "WHILE", "RUN", "END", "NUMBER", 
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

	@Override
	public String getGrammarFileName() { return "WavelusParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WavelusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WavelusParser.EOF, 0); }
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF_FUN) {
				{
				{
				setState(46);
				functionDef();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			main();
			setState(53);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(WavelusParser.RUN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(RUN);
			setState(56);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(WavelusParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DEF_FUN) | (1L << WHILE) | (1L << NUMBER) | (1L << PRINT) | (1L << TEXT) | (1L << BOOL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case WHILE:
				case NUMBER:
				case PRINT:
				case TEXT:
				case BOOL:
				case IDENTIFIER:
					{
					setState(58);
					statement();
					}
					break;
				case DEF_FUN:
					{
					setState(59);
					functionDef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(65);
				match(RETURN);
				setState(66);
				expression();
				setState(67);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				simpleStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				structuredStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitStructuredStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitStructuredStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structuredStatement);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				whileStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(WavelusParser.SEMI, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleStatement);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				assignment();
				setState(81);
				match(SEMI);
				}
				break;
			case NUMBER:
			case TEXT:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				variableDeclaration();
				setState(84);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(WavelusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(WavelusParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IDENTIFIER);
			setState(89);
			match(ASSIGN);
			setState(90);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(WavelusParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WavelusParser.IDENTIFIER, 0); }
		public TerminalNode TEXT() { return getToken(WavelusParser.TEXT, 0); }
		public TerminalNode BOOL() { return getToken(WavelusParser.BOOL, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclaration);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(NUMBER);
				setState(93);
				match(IDENTIFIER);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(TEXT);
				setState(95);
				match(IDENTIFIER);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(BOOL);
				setState(97);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(WavelusParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(WavelusParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(WavelusParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMI() { return getToken(WavelusParser.SEMI, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(WavelusParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(IDENTIFIER);
				setState(101);
				match(OPEN_PAREN);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << BOOL) | (1L << NULL) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << BOOL_VALUE) | (1L << NUMBER_VALUE) | (1L << TEXT_VALUE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(102);
					expressionList();
					}
				}

				setState(105);
				match(CLOSE_PAREN);
				setState(106);
				match(SEMI);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(PRINT);
				setState(108);
				match(OPEN_PAREN);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << BOOL) | (1L << NULL) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << BOOL_VALUE) | (1L << NUMBER_VALUE) | (1L << TEXT_VALUE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(109);
					expression();
					}
				}

				setState(112);
				match(CLOSE_PAREN);
				setState(113);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public TerminalNode END() { return getToken(WavelusParser.END, 0); }
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			ifStat();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					elseIfStat();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(123);
				elseStat();
				}
			}

			setState(126);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(WavelusParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(WavelusParser.OPEN_PAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(WavelusParser.CLOSE_PAREN, 0); }
		public TerminalNode DO() { return getToken(WavelusParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IF);
			setState(129);
			match(OPEN_PAREN);
			setState(130);
			booleanExpression(0);
			setState(131);
			match(CLOSE_PAREN);
			setState(132);
			match(DO);
			setState(133);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(WavelusParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(WavelusParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(WavelusParser.OPEN_PAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(WavelusParser.CLOSE_PAREN, 0); }
		public TerminalNode DO() { return getToken(WavelusParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitElseIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ELSE);
			setState(136);
			match(IF);
			setState(137);
			match(OPEN_PAREN);
			setState(138);
			booleanExpression(0);
			setState(139);
			match(CLOSE_PAREN);
			setState(140);
			match(DO);
			setState(141);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(WavelusParser.ELSE, 0); }
		public TerminalNode DO() { return getToken(WavelusParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ELSE);
			setState(144);
			match(DO);
			setState(145);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode DEF_FUN() { return getToken(WavelusParser.DEF_FUN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WavelusParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(WavelusParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(WavelusParser.CLOSE_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(WavelusParser.END, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(DEF_FUN);
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(OPEN_PAREN);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(150);
				idList();
				}
			}

			setState(153);
			match(CLOSE_PAREN);
			setState(154);
			block();
			setState(155);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(WavelusParser.WHILE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(WavelusParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(WavelusParser.END, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(WHILE);
			setState(158);
			booleanExpression(0);
			setState(159);
			match(DO);
			setState(160);
			block();
			setState(161);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(WavelusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(WavelusParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WavelusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WavelusParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(IDENTIFIER);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(164);
				match(COMMA);
				setState(165);
				match(IDENTIFIER);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WavelusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WavelusParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			expression();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				expression();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(WavelusParser.BOOL, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NumberExpressionContext numberExpression() {
			return getRuleContext(NumberExpressionContext.class,0);
		}
		public TextExpressionContext textExpression() {
			return getRuleContext(TextExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(WavelusParser.IDENTIFIER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(BOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				booleanExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				numberExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				textExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextExpressionContext extends ParserRuleContext {
		public TerminalNode TEXT_VALUE() { return getToken(WavelusParser.TEXT_VALUE, 0); }
		public TextExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterTextExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitTextExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitTextExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextExpressionContext textExpression() throws RecognitionException {
		TextExpressionContext _localctx = new TextExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_textExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(TEXT_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberExpressionContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(WavelusParser.MINUS, 0); }
		public NumberExpressionContext numberExpression() {
			return getRuleContext(NumberExpressionContext.class,0);
		}
		public List<TerminalNode> NUMBER_VALUE() { return getTokens(WavelusParser.NUMBER_VALUE); }
		public TerminalNode NUMBER_VALUE(int i) {
			return getToken(WavelusParser.NUMBER_VALUE, i);
		}
		public TerminalNode PLUS() { return getToken(WavelusParser.PLUS, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ListElementContext listElement() {
			return getRuleContext(ListElementContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(WavelusParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(WavelusParser.CLOSE_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WavelusParser.IDENTIFIER, 0); }
		public NumberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberExpressionContext numberExpression() throws RecognitionException {
		NumberExpressionContext _localctx = new NumberExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numberExpression);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(MINUS);
				setState(189);
				numberExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(NUMBER_VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(NUMBER_VALUE);
				setState(192);
				match(PLUS);
				setState(193);
				match(NUMBER_VALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				listElement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(OPEN_PAREN);
				setState(197);
				numberExpression();
				setState(198);
				match(CLOSE_PAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public TerminalNode BOOL_VALUE() { return getToken(WavelusParser.BOOL_VALUE, 0); }
		public TerminalNode NULL() { return getToken(WavelusParser.NULL, 0); }
		public List<NumberExpressionContext> numberExpression() {
			return getRuleContexts(NumberExpressionContext.class);
		}
		public NumberExpressionContext numberExpression(int i) {
			return getRuleContext(NumberExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(WavelusParser.EQUAL, 0); }
		public List<TextExpressionContext> textExpression() {
			return getRuleContexts(TextExpressionContext.class);
		}
		public TextExpressionContext textExpression(int i) {
			return getRuleContext(TextExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(WavelusParser.IDENTIFIER, 0); }
		public TerminalNode GREATER() { return getToken(WavelusParser.GREATER, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode NAND() { return getToken(WavelusParser.NAND, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(204);
				match(BOOL_VALUE);
				}
				break;
			case 2:
				{
				setState(205);
				match(NULL);
				}
				break;
			case 3:
				{
				setState(206);
				numberExpression();
				setState(207);
				match(EQUAL);
				setState(208);
				numberExpression();
				}
				break;
			case 4:
				{
				setState(210);
				textExpression();
				setState(211);
				match(EQUAL);
				setState(212);
				textExpression();
				}
				break;
			case 5:
				{
				setState(214);
				match(IDENTIFIER);
				setState(215);
				match(GREATER);
				setState(216);
				numberExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooleanExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
					setState(219);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(220);
					match(NAND);
					setState(221);
					booleanExpression(5);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListElementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(WavelusParser.IDENTIFIER, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public ListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementContext listElement() throws RecognitionException {
		ListElementContext _localctx = new ListElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_listElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IDENTIFIER);
			setState(228);
			index();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARED_PAREN() { return getToken(WavelusParser.OPEN_SQUARED_PAREN, 0); }
		public TerminalNode NUMBER_VALUE() { return getToken(WavelusParser.NUMBER_VALUE, 0); }
		public TerminalNode CLOSE_SQUARED_PAREN() { return getToken(WavelusParser.CLOSE_SQUARED_PAREN, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavelusParserListener ) ((WavelusParserListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WavelusParserVisitor ) return ((WavelusParserVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(OPEN_SQUARED_PAREN);
			setState(231);
			match(NUMBER_VALUE);
			setState(232);
			match(CLOSE_SQUARED_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4?\n\4\f\4\16"+
		"\4B\13\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\5\6Q\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\te\n\t\3\n\3\n\3\n\5\nj\n\n\3\n\3\n\3\n\3\n\3\n\5\nq\n\n\3\n"+
		"\3\n\5\nu\n\n\3\13\3\13\7\13y\n\13\f\13\16\13|\13\13\3\13\5\13\177\n\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u009a\n\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00a9\n\21\f\21"+
		"\16\21\u00ac\13\21\3\22\3\22\3\22\7\22\u00b1\n\22\f\22\16\22\u00b4\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\5\23\u00bb\n\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00cc\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00dc\n\26\3\26\3\26\3\26\7\26\u00e1\n\26\f\26\16\26\u00e4\13\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\2\3*\31\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\2\2\2\u00f6\2\63\3\2\2\2\49\3\2\2\2\6@\3\2\2\2\b"+
		"L\3\2\2\2\nP\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20d\3\2\2\2\22t\3\2\2\2\24"+
		"v\3\2\2\2\26\u0082\3\2\2\2\30\u0089\3\2\2\2\32\u0091\3\2\2\2\34\u0095"+
		"\3\2\2\2\36\u009f\3\2\2\2 \u00a5\3\2\2\2\"\u00ad\3\2\2\2$\u00ba\3\2\2"+
		"\2&\u00bc\3\2\2\2(\u00cb\3\2\2\2*\u00db\3\2\2\2,\u00e5\3\2\2\2.\u00e8"+
		"\3\2\2\2\60\62\5\34\17\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63"+
		"\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\5\4\3\2\678\7\2\2\38\3\3"+
		"\2\2\29:\7\b\2\2:;\5\6\4\2;\5\3\2\2\2<?\5\b\5\2=?\5\34\17\2><\3\2\2\2"+
		">=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AG\3\2\2\2B@\3\2\2\2CD\7\13\2"+
		"\2DE\5$\23\2EF\7\26\2\2FH\3\2\2\2GC\3\2\2\2GH\3\2\2\2H\7\3\2\2\2IM\5\f"+
		"\7\2JM\5\22\n\2KM\5\n\6\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\t\3\2\2\2NQ\5"+
		"\24\13\2OQ\5\36\20\2PN\3\2\2\2PO\3\2\2\2Q\13\3\2\2\2RS\5\16\b\2ST\7\26"+
		"\2\2TY\3\2\2\2UV\5\20\t\2VW\7\26\2\2WY\3\2\2\2XR\3\2\2\2XU\3\2\2\2Y\r"+
		"\3\2\2\2Z[\7#\2\2[\\\7\30\2\2\\]\5$\23\2]\17\3\2\2\2^_\7\n\2\2_e\7#\2"+
		"\2`a\7\r\2\2ae\7#\2\2bc\7\16\2\2ce\7#\2\2d^\3\2\2\2d`\3\2\2\2db\3\2\2"+
		"\2e\21\3\2\2\2fg\7#\2\2gi\7\31\2\2hj\5\"\22\2ih\3\2\2\2ij\3\2\2\2jk\3"+
		"\2\2\2kl\7\32\2\2lu\7\26\2\2mn\7\f\2\2np\7\31\2\2oq\5$\23\2po\3\2\2\2"+
		"pq\3\2\2\2qr\3\2\2\2rs\7\32\2\2su\7\26\2\2tf\3\2\2\2tm\3\2\2\2u\23\3\2"+
		"\2\2vz\5\26\f\2wy\5\30\r\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3"+
		"\2\2\2|z\3\2\2\2}\177\5\32\16\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0081\7\t\2\2\u0081\25\3\2\2\2\u0082\u0083\7\3\2\2\u0083\u0084"+
		"\7\31\2\2\u0084\u0085\5*\26\2\u0085\u0086\7\32\2\2\u0086\u0087\7\4\2\2"+
		"\u0087\u0088\5\6\4\2\u0088\27\3\2\2\2\u0089\u008a\7\5\2\2\u008a\u008b"+
		"\7\3\2\2\u008b\u008c\7\31\2\2\u008c\u008d\5*\26\2\u008d\u008e\7\32\2\2"+
		"\u008e\u008f\7\4\2\2\u008f\u0090\5\6\4\2\u0090\31\3\2\2\2\u0091\u0092"+
		"\7\5\2\2\u0092\u0093\7\4\2\2\u0093\u0094\5\6\4\2\u0094\33\3\2\2\2\u0095"+
		"\u0096\7\6\2\2\u0096\u0097\7#\2\2\u0097\u0099\7\31\2\2\u0098\u009a\5 "+
		"\21\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\7\32\2\2\u009c\u009d\5\6\4\2\u009d\u009e\7\t\2\2\u009e\35\3\2\2"+
		"\2\u009f\u00a0\7\7\2\2\u00a0\u00a1\5*\26\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3"+
		"\5\6\4\2\u00a3\u00a4\7\t\2\2\u00a4\37\3\2\2\2\u00a5\u00aa\7#\2\2\u00a6"+
		"\u00a7\7\27\2\2\u00a7\u00a9\7#\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab!\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ad\u00b2\5$\23\2\u00ae\u00af\7\27\2\2\u00af\u00b1\5$\23\2"+
		"\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3#\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00bb\7\16\2\2\u00b6"+
		"\u00bb\5*\26\2\u00b7\u00bb\5(\25\2\u00b8\u00bb\5&\24\2\u00b9\u00bb\7#"+
		"\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb%\3\2\2\2\u00bc\u00bd\7 \2\2\u00bd"+
		"\'\3\2\2\2\u00be\u00bf\7\21\2\2\u00bf\u00cc\5(\25\2\u00c0\u00cc\7\37\2"+
		"\2\u00c1\u00c2\7\37\2\2\u00c2\u00c3\7\20\2\2\u00c3\u00cc\7\37\2\2\u00c4"+
		"\u00cc\5\22\n\2\u00c5\u00cc\5,\27\2\u00c6\u00c7\7\31\2\2\u00c7\u00c8\5"+
		"(\25\2\u00c8\u00c9\7\32\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cc\7#\2\2\u00cb"+
		"\u00be\3\2\2\2\u00cb\u00c0\3\2\2\2\u00cb\u00c1\3\2\2\2\u00cb\u00c4\3\2"+
		"\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		")\3\2\2\2\u00cd\u00ce\b\26\1\2\u00ce\u00dc\7\36\2\2\u00cf\u00dc\7\17\2"+
		"\2\u00d0\u00d1\5(\25\2\u00d1\u00d2\7\22\2\2\u00d2\u00d3\5(\25\2\u00d3"+
		"\u00dc\3\2\2\2\u00d4\u00d5\5&\24\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7\5"+
		"&\24\2\u00d7\u00dc\3\2\2\2\u00d8\u00d9\7#\2\2\u00d9\u00da\7\23\2\2\u00da"+
		"\u00dc\5(\25\2\u00db\u00cd\3\2\2\2\u00db\u00cf\3\2\2\2\u00db\u00d0\3\2"+
		"\2\2\u00db\u00d4\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\u00e2\3\2\2\2\u00dd"+
		"\u00de\f\6\2\2\u00de\u00df\7\24\2\2\u00df\u00e1\5*\26\7\u00e0\u00dd\3"+
		"\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"+\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7#\2\2\u00e6\u00e7\5.\30\2\u00e7"+
		"-\3\2\2\2\u00e8\u00e9\7\33\2\2\u00e9\u00ea\7\37\2\2\u00ea\u00eb\7\34\2"+
		"\2\u00eb/\3\2\2\2\26\63>@GLPXdiptz~\u0099\u00aa\u00b2\u00ba\u00cb\u00db"+
		"\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}