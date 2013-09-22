// Generated from CubexParser2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CubexParser2 extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		APPEND=42, CLASS=11, STAR=31, LRTHR=46, THR=43, WHILE=4, LONW=48, CLSINTF=17, 
		COMMENTS_POND=55, ONW=47, LANGLE=36, GTE=50, LBRACE=29, FOR=5, THING=13, 
		SPACE=56, LTE=49, LPAREN=25, IF=2, LBRACKET=21, RPAREN=26, LTHR=44, SLASH=32, 
		IN=6, COMMENTS=54, COMMA=27, EQUAL=24, RETURN=7, NOTHING=14, PLUS=34, 
		PIPE=40, VAR=19, SUPER=12, RBRACKET=22, RANGLE=37, DOT=41, RTHR=45, INTEGER=20, 
		INEQUAL=52, RBRACE=30, PERCENT=33, DASH=35, ELSE=3, AMPERSAND=39, SEMICOLON=28, 
		BANG=38, ERROR=57, TRUE=15, COLON=23, EQEQUAL=51, ASSIGN=53, INTERFACE=8, 
		TPARA=18, FUN=10, FALSE=16, EXTENDS=9, STRING=1;
	public static final String[] tokenNames = {
		"<INVALID>", "STRING", "'if'", "'else'", "'while'", "'for'", "'in'", "'return'", 
		"'interface'", "'extends'", "'fun'", "'class'", "'super'", "'Thing'", 
		"'Nothing'", "'true'", "'false'", "CLSINTF", "TPARA", "VAR", "INTEGER", 
		"'['", "']'", "':'", "'='", "'('", "')'", "','", "';'", "'{'", "'}'", 
		"'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", "'!'", "'&'", "'|'", 
		"'.'", "'++'", "'..'", "'<.'", "'.<'", "'<<'", "'...'", "'<..'", "'<='", 
		"'>='", "'=='", "'!='", "':='", "COMMENTS", "COMMENTS_POND", "SPACE", 
		"ERROR"
	};
	public static final int
		RULE_vvc = 0, RULE_kindcontext = 1, RULE_typecontext = 2, RULE_paratype = 3, 
		RULE_type = 4, RULE_typescheme = 5, RULE_expr = 6, RULE_exprs = 7, RULE_stat = 8, 
		RULE_stats = 9, RULE_intf = 10, RULE_cls = 11, RULE_program = 12, RULE_functxt = 13, 
		RULE_clsctxt = 14;
	public static final String[] ruleNames = {
		"vvc", "kindcontext", "typecontext", "paratype", "type", "typescheme", 
		"expr", "exprs", "stat", "stats", "intf", "cls", "program", "functxt", 
		"clsctxt"
	};

	@Override
	public String getGrammarFileName() { return "CubexParser2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CubexParser2(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VvcContext extends ParserRuleContext {
		public CuVvc v;
		public Token vv;
		public TerminalNode VAR() { return getToken(CubexParser2.VAR, 0); }
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public VvcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vvc; }
	}

	public final VvcContext vvc() throws RecognitionException {
		VvcContext _localctx = new VvcContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_vvc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((VvcContext)_localctx).vv = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CLSINTF || _la==VAR) ) {
				((VvcContext)_localctx).vv = (Token)_errHandler.recoverInline(this);
			}
			consume();
			((VvcContext)_localctx).v =  new Vvc((((VvcContext)_localctx).vv!=null?((VvcContext)_localctx).vv.getText():null));
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

	public static class KindcontextContext extends ParserRuleContext {
		public CuKindContext kc;
		public Token TPARA;
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public List<TerminalNode> TPARA() { return getTokens(CubexParser2.TPARA); }
		public TerminalNode LANGLE() { return getToken(CubexParser2.LANGLE, 0); }
		public TerminalNode TPARA(int i) {
			return getToken(CubexParser2.TPARA, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public TerminalNode RANGLE() { return getToken(CubexParser2.RANGLE, 0); }
		public KindcontextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kindcontext; }
	}

	public final KindcontextContext kindcontext() throws RecognitionException {
		KindcontextContext _localctx = new KindcontextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_kindcontext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((KindcontextContext)_localctx).kc =  new KindContext(); 
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(34); match(LANGLE);
				setState(45);
				_la = _input.LA(1);
				if (_la==TPARA) {
					{
					setState(35); ((KindcontextContext)_localctx).TPARA = match(TPARA);
					 _localctx.kc.add((((KindcontextContext)_localctx).TPARA!=null?((KindcontextContext)_localctx).TPARA.getText():null)); 
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(37); match(COMMA);
						setState(38); ((KindcontextContext)_localctx).TPARA = match(TPARA);
						 _localctx.kc.add((((KindcontextContext)_localctx).TPARA!=null?((KindcontextContext)_localctx).TPARA.getText():null)); 
						}
						}
						setState(44);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(47); match(RANGLE);
				}
				break;
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

	public static class TypecontextContext extends ParserRuleContext {
		public CuTypeContext tc;
		public Token VAR;
		public TypeContext t;
		public TerminalNode VAR(int i) {
			return getToken(CubexParser2.VAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public List<TerminalNode> VAR() { return getTokens(CubexParser2.VAR); }
		public TerminalNode RPAREN() { return getToken(CubexParser2.RPAREN, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode COLON(int i) {
			return getToken(CubexParser2.COLON, i);
		}
		public TerminalNode LPAREN() { return getToken(CubexParser2.LPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(CubexParser2.COLON); }
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public TypecontextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typecontext; }
	}

	public final TypecontextContext typecontext() throws RecognitionException {
		TypecontextContext _localctx = new TypecontextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typecontext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TypecontextContext)_localctx).tc =  new TypeContext(); 
			setState(51); match(LPAREN);
			setState(67);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(52); ((TypecontextContext)_localctx).VAR = match(VAR);
				setState(53); match(COLON);
				setState(54); ((TypecontextContext)_localctx).t = type(0);
				 _localctx.tc.add((((TypecontextContext)_localctx).VAR!=null?((TypecontextContext)_localctx).VAR.getText():null), ((TypecontextContext)_localctx).t.t); 
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(56); match(COMMA);
					setState(57); ((TypecontextContext)_localctx).VAR = match(VAR);
					setState(58); match(COLON);
					setState(59); ((TypecontextContext)_localctx).t = type(0);
					 _localctx.tc.add((((TypecontextContext)_localctx).VAR!=null?((TypecontextContext)_localctx).VAR.getText():null), ((TypecontextContext)_localctx).t.t); 
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(69); match(RPAREN);
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

	public static class ParatypeContext extends ParserRuleContext {
		public CuParaType pt;
		public TypeContext t;
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode LANGLE() { return getToken(CubexParser2.LANGLE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public TerminalNode RANGLE() { return getToken(CubexParser2.RANGLE, 0); }
		public ParatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paratype; }
	}

	public final ParatypeContext paratype() throws RecognitionException {
		ParatypeContext _localctx = new ParatypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paratype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ParatypeContext)_localctx).pt =  new ParaType(); 
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(72); match(LANGLE);
				setState(84);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THING) | (1L << NOTHING) | (1L << CLSINTF) | (1L << TPARA))) != 0)) {
					{
					setState(73); ((ParatypeContext)_localctx).t = type(0);
					_localctx.pt.add(((ParatypeContext)_localctx).t.t);
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(75); match(COMMA);
						setState(76); ((ParatypeContext)_localctx).t = type(0);
						_localctx.pt.add(((ParatypeContext)_localctx).t.t);
						}
						}
						setState(83);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(86); match(RANGLE);
				}
				break;
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

	public static class TypeContext extends ParserRuleContext {
		public int _p;
		public CuType t;
		public TypeContext l;
		public Token v;
		public Token CLSINTF;
		public ParatypeContext p;
		public TypeContext r;
		public TerminalNode AMPERSAND() { return getToken(CubexParser2.AMPERSAND, 0); }
		public TerminalNode TPARA() { return getToken(CubexParser2.TPARA, 0); }
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode THING() { return getToken(CubexParser2.THING, 0); }
		public ParatypeContext paratype() {
			return getRuleContext(ParatypeContext.class,0);
		}
		public TerminalNode NOTHING() { return getToken(CubexParser2.NOTHING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypeContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState, _p);
		TypeContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			switch (_input.LA(1)) {
			case THING:
			case NOTHING:
			case TPARA:
				{
				setState(90);
				((TypeContext)_localctx).v = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THING) | (1L << NOTHING) | (1L << TPARA))) != 0)) ) {
					((TypeContext)_localctx).v = (Token)_errHandler.recoverInline(this);
				}
				consume();
				((TypeContext)_localctx).t =  (((TypeContext)_localctx).v!=null?((TypeContext)_localctx).v.getType():0)== TPARA ? new VTypePara((((TypeContext)_localctx).v!=null?((TypeContext)_localctx).v.getText():null)) : new VTopBot((((TypeContext)_localctx).v!=null?((TypeContext)_localctx).v.getText():null));
				}
				break;
			case CLSINTF:
				{
				setState(92); ((TypeContext)_localctx).CLSINTF = match(CLSINTF);
				((TypeContext)_localctx).t =  new VClass((((TypeContext)_localctx).CLSINTF!=null?((TypeContext)_localctx).CLSINTF.getText():null));
				setState(97);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(94); ((TypeContext)_localctx).p = paratype();
					_localctx.t.add(((TypeContext)_localctx).p.pt);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState, _p);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(101);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(102); match(AMPERSAND);
					setState(103); ((TypeContext)_localctx).r = type(2);
					((TypeContext)_localctx).t =  new VTypeInter(((TypeContext)_localctx).l.t, ((TypeContext)_localctx).r.t);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class TypeschemeContext extends ParserRuleContext {
		public CuTypeScheme ts;
		public KindcontextContext kc;
		public TypecontextContext tc;
		public TypeContext t;
		public TypecontextContext typecontext() {
			return getRuleContext(TypecontextContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public KindcontextContext kindcontext() {
			return getRuleContext(KindcontextContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CubexParser2.COLON, 0); }
		public TypeschemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typescheme; }
	}

	public final TypeschemeContext typescheme() throws RecognitionException {
		TypeschemeContext _localctx = new TypeschemeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typescheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); ((TypeschemeContext)_localctx).kc = kindcontext();
			setState(112); ((TypeschemeContext)_localctx).tc = typecontext();
			setState(113); match(COLON);
			setState(114); ((TypeschemeContext)_localctx).t = type(0);
			((TypeschemeContext)_localctx).ts =  new TypeScheme(((TypeschemeContext)_localctx).kc.kc, ((TypeschemeContext)_localctx).tc.tc, ((TypeschemeContext)_localctx).t.t);
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public CuExpr e;
		public ExprContext ex;
		public ExprContext l;
		public Token VAR;
		public VvcContext v;
		public ParatypeContext pt;
		public ExprsContext es;
		public Token INTEGER;
		public Token STRING;
		public ExprContext r;
		public Token op;
		public TerminalNode APPEND() { return getToken(CubexParser2.APPEND, 0); }
		public TerminalNode TRUE() { return getToken(CubexParser2.TRUE, 0); }
		public VvcContext vvc() {
			return getRuleContext(VvcContext.class,0);
		}
		public TerminalNode LANGLE() { return getToken(CubexParser2.LANGLE, 0); }
		public TerminalNode STAR() { return getToken(CubexParser2.STAR, 0); }
		public TerminalNode RBRACKET() { return getToken(CubexParser2.RBRACKET, 0); }
		public TerminalNode AMPERSAND() { return getToken(CubexParser2.AMPERSAND, 0); }
		public TerminalNode RTHR() { return getToken(CubexParser2.RTHR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode VAR() { return getToken(CubexParser2.VAR, 0); }
		public TerminalNode PLUS() { return getToken(CubexParser2.PLUS, 0); }
		public TerminalNode LRTHR() { return getToken(CubexParser2.LRTHR, 0); }
		public TerminalNode ONW() { return getToken(CubexParser2.ONW, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(CubexParser2.PIPE, 0); }
		public TerminalNode GTE() { return getToken(CubexParser2.GTE, 0); }
		public TerminalNode PERCENT() { return getToken(CubexParser2.PERCENT, 0); }
		public TerminalNode LTE() { return getToken(CubexParser2.LTE, 0); }
		public TerminalNode BANG() { return getToken(CubexParser2.BANG, 0); }
		public TerminalNode DASH() { return getToken(CubexParser2.DASH, 0); }
		public TerminalNode LBRACKET() { return getToken(CubexParser2.LBRACKET, 0); }
		public TerminalNode LPAREN() { return getToken(CubexParser2.LPAREN, 0); }
		public TerminalNode INEQUAL() { return getToken(CubexParser2.INEQUAL, 0); }
		public TerminalNode EQEQUAL() { return getToken(CubexParser2.EQEQUAL, 0); }
		public TerminalNode RANGLE() { return getToken(CubexParser2.RANGLE, 0); }
		public TerminalNode LONW() { return getToken(CubexParser2.LONW, 0); }
		public TerminalNode RPAREN() { return getToken(CubexParser2.RPAREN, 0); }
		public TerminalNode LTHR() { return getToken(CubexParser2.LTHR, 0); }
		public TerminalNode STRING() { return getToken(CubexParser2.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(CubexParser2.INTEGER, 0); }
		public ParatypeContext paratype() {
			return getRuleContext(ParatypeContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(CubexParser2.SLASH, 0); }
		public TerminalNode FALSE() { return getToken(CubexParser2.FALSE, 0); }
		public TerminalNode THR() { return getToken(CubexParser2.THR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(118); ((ExprContext)_localctx).VAR = match(VAR);
				((ExprContext)_localctx).e =  new VvExp((((ExprContext)_localctx).VAR!=null?((ExprContext)_localctx).VAR.getText():null));
				}
				break;

			case 2:
				{
				setState(120); ((ExprContext)_localctx).v = vvc();
				setState(121); ((ExprContext)_localctx).pt = paratype();
				setState(122); ((ExprContext)_localctx).es = exprs();
				((ExprContext)_localctx).e =  new VvcExp(((ExprContext)_localctx).v.v, ((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
				}
				break;

			case 3:
				{
				setState(125); match(LBRACKET);
				setState(126); ((ExprContext)_localctx).es = exprs();
				setState(127); match(RBRACKET);
				((ExprContext)_localctx).e =  new BrkExpr(((ExprContext)_localctx).es.cu);
				}
				break;

			case 4:
				{
				setState(130); match(TRUE);
				((ExprContext)_localctx).e =  new CBoolean(true);
				}
				break;

			case 5:
				{
				setState(132); match(FALSE);
				((ExprContext)_localctx).e =  new CBoolean(false);
				}
				break;

			case 6:
				{
				setState(134); ((ExprContext)_localctx).INTEGER = match(INTEGER);
				((ExprContext)_localctx).e =  new CInteger((((ExprContext)_localctx).INTEGER!=null?Integer.valueOf(((ExprContext)_localctx).INTEGER.getText()):0));
				}
				break;

			case 7:
				{
				setState(136); ((ExprContext)_localctx).STRING = match(STRING);
				((ExprContext)_localctx).e =  new CString((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(141); match(APPEND);
						setState(142); ((ExprContext)_localctx).r = expr(6);
						((ExprContext)_localctx).e =  new AppExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(146); ((ExprContext)_localctx).VAR = match(VAR);
						setState(147); ((ExprContext)_localctx).pt = paratype();
						setState(148); match(LPAREN);
						setState(149); ((ExprContext)_localctx).es = exprs();
						setState(150); match(RPAREN);
						((ExprContext)_localctx).e =  new VarExpr(((ExprContext)_localctx).ex.e, (((ExprContext)_localctx).VAR!=null?((ExprContext)_localctx).VAR.getText():null), ((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(154);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DASH || _la==BANG) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == DASH) ? new NegativeExpr(((ExprContext)_localctx).ex.e) : new NegateExpr(((ExprContext)_localctx).ex.e);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(157);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(159);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(158); match(LPAREN);
							}
						}

						setState(161); ((ExprContext)_localctx).r = expr(0);
						setState(163);
						switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
						case 1:
							{
							setState(162); match(RPAREN);
							}
							break;
						}
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == STAR) ? new TimesExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == SLASH) ? new DivideExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e) : new ModuloExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(168);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==DASH) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(170);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(169); match(LPAREN);
							}
						}

						setState(172); ((ExprContext)_localctx).r = expr(0);
						setState(174);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(173); match(RPAREN);
							}
							break;
						}
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == PLUS) ? new PlusExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e) : new MinusExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(179);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THR) | (1L << LTHR) | (1L << RTHR) | (1L << LRTHR))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(181);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(180); match(LPAREN);
							}
						}

						setState(183); ((ExprContext)_localctx).r = expr(0);
						setState(185);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(184); match(RPAREN);
							}
							break;
						}
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == THR) ? new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true, true) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == LTHR) ? new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false, true) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == RTHR) ? new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true, false) : new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false, false);
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(190);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ONW || _la==LONW) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == ONW) ? new OnwardsExpr(((ExprContext)_localctx).ex.e, true) : new OnwardsExpr(((ExprContext)_localctx).ex.e, false);
						}
						break;

					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(193); match(APPEND);
						setState(195);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(194); match(LPAREN);
							}
						}

						setState(197); ((ExprContext)_localctx).r = expr(0);
						setState(199);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(198); match(RPAREN);
							}
							break;
						}
						((ExprContext)_localctx).e =  new AppendExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e);
						}
						break;

					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(204);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LTE) | (1L << GTE))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(206);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(205); match(LPAREN);
							}
						}

						setState(208); ((ExprContext)_localctx).r = expr(0);
						setState(210);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(209); match(RPAREN);
							}
							break;
						}
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == LANGLE) ? new LessThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == LTE) ? new LessThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == RANGLE) ? new GreaterThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true) : new GreaterThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false);
						}
						break;

					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(215);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQEQUAL || _la==INEQUAL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(217);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(216); match(LPAREN);
							}
						}

						setState(219); ((ExprContext)_localctx).r = expr(0);
						setState(221);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(220); match(RPAREN);
							}
							break;
						}
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == EQEQUAL) ? new EqualExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true) : new EqualExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false);
						}
						break;

					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(226);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AMPERSAND || _la==PIPE) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(228);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(227); match(LPAREN);
							}
						}

						setState(230); ((ExprContext)_localctx).r = expr(0);
						setState(232);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(231); match(RPAREN);
							}
							break;
						}
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == AMPERSAND) ? new AndExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e) : new OrExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class ExprsContext extends ParserRuleContext {
		public List<CuExpr> cu;
		public ExprContext e;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ExprsContext)_localctx).cu =  new ArrayList<CuExpr>();
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(242); ((ExprsContext)_localctx).e = expr(0);
				_localctx.cu.add(((ExprsContext)_localctx).e.e);
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(244); match(COMMA);
						setState(245); ((ExprsContext)_localctx).e = expr(0);
						_localctx.cu.add(((ExprsContext)_localctx).e.e);
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
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

	public static class StatContext extends ParserRuleContext {
		public CuStat s;
		public StatsContext ss;
		public Token VAR;
		public ExprContext e;
		public StatContext l;
		public StatContext r;
		public StatContext st;
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CubexParser2.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(CubexParser2.EQUAL, 0); }
		public TerminalNode RBRACE() { return getToken(CubexParser2.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(CubexParser2.LPAREN, 0); }
		public TerminalNode IN() { return getToken(CubexParser2.IN, 0); }
		public TerminalNode WHILE() { return getToken(CubexParser2.WHILE, 0); }
		public TerminalNode IF() { return getToken(CubexParser2.IF, 0); }
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode FOR() { return getToken(CubexParser2.FOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CubexParser2.ELSE, 0); }
		public TerminalNode ASSIGN() { return getToken(CubexParser2.ASSIGN, 0); }
		public TerminalNode VAR() { return getToken(CubexParser2.VAR, 0); }
		public TerminalNode RPAREN() { return getToken(CubexParser2.RPAREN, 0); }
		public TerminalNode RETURN() { return getToken(CubexParser2.RETURN, 0); }
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stat);
		int _la;
		try {
			setState(298);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(255); match(LBRACE);
				setState(256); ((StatContext)_localctx).ss = stats();
				setState(257); match(RBRACE);
				((StatContext)_localctx).s =  new Stats(((StatContext)_localctx).ss.cu);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(260); ((StatContext)_localctx).VAR = match(VAR);
				setState(261); match(ASSIGN);
				setState(262); ((StatContext)_localctx).e = expr(0);
				setState(263); match(SEMICOLON);
				((StatContext)_localctx).s =  new AssignStat((((StatContext)_localctx).VAR!=null?((StatContext)_localctx).VAR.getText():null), ((StatContext)_localctx).e.e);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(266); match(IF);
				setState(267); match(LPAREN);
				setState(268); ((StatContext)_localctx).e = expr(0);
				setState(269); match(RPAREN);
				setState(270); ((StatContext)_localctx).l = stat();
				((StatContext)_localctx).s =  new IfStat(((StatContext)_localctx).e.e, ((StatContext)_localctx).l.s);
				setState(276);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(272); match(ELSE);
					setState(273); ((StatContext)_localctx).r = stat();
					_localctx.s.add(((StatContext)_localctx).r.s);
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(278); match(WHILE);
				setState(279); match(LPAREN);
				setState(280); ((StatContext)_localctx).e = expr(0);
				setState(281); match(RPAREN);
				setState(282); ((StatContext)_localctx).st = stat();
				((StatContext)_localctx).s =  new WhileStat(((StatContext)_localctx).e.e, ((StatContext)_localctx).st.s);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(285); match(FOR);
				setState(286); match(LPAREN);
				setState(287); ((StatContext)_localctx).VAR = match(VAR);
				setState(288); match(IN);
				setState(289); ((StatContext)_localctx).e = expr(0);
				setState(290); match(RPAREN);
				setState(291); ((StatContext)_localctx).st = stat();
				((StatContext)_localctx).s =  new ForStat((((StatContext)_localctx).VAR!=null?((StatContext)_localctx).VAR.getText():null), ((StatContext)_localctx).e.e, ((StatContext)_localctx).st.s);
				}
				break;
			case RETURN:
			case EQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				_la = _input.LA(1);
				if ( !(_la==RETURN || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(295); ((StatContext)_localctx).e = expr(0);
				((StatContext)_localctx).s =  new ReturnStat(((StatContext)_localctx).e.e);
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

	public static class StatsContext extends ParserRuleContext {
		public List<CuStat> cu;
		public StatContext s;
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stats);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StatsContext)_localctx).cu =  new ArrayList<CuStat>();
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(301); ((StatsContext)_localctx).s = stat();
				_localctx.cu.add(((StatsContext)_localctx).s.s);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(303); match(COMMA);
					setState(304); ((StatsContext)_localctx).s = stat();
					_localctx.cu.add(((StatsContext)_localctx).s.s);
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class IntfContext extends ParserRuleContext {
		public CuInterface i;
		public Token CLSINTF;
		public KindcontextContext p;
		public TypeContext t;
		public Token VAR;
		public TypeschemeContext ts;
		public TerminalNode VAR(int i) {
			return getToken(CubexParser2.VAR, i);
		}
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CubexParser2.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CubexParser2.SEMICOLON, i);
		}
		public List<TerminalNode> FUN() { return getTokens(CubexParser2.FUN); }
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public KindcontextContext kindcontext() {
			return getRuleContext(KindcontextContext.class,0);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public TerminalNode RBRACE() { return getToken(CubexParser2.RBRACE, 0); }
		public List<TerminalNode> VAR() { return getTokens(CubexParser2.VAR); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeschemeContext typescheme(int i) {
			return getRuleContext(TypeschemeContext.class,i);
		}
		public TerminalNode INTERFACE() { return getToken(CubexParser2.INTERFACE, 0); }
		public TerminalNode FUN(int i) {
			return getToken(CubexParser2.FUN, i);
		}
		public TerminalNode EXTENDS() { return getToken(CubexParser2.EXTENDS, 0); }
		public IntfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intf; }
	}

	public final IntfContext intf() throws RecognitionException {
		IntfContext _localctx = new IntfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_intf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(INTERFACE);
			setState(315); ((IntfContext)_localctx).CLSINTF = match(CLSINTF);
			setState(316); ((IntfContext)_localctx).p = kindcontext();
			((IntfContext)_localctx).i =  new Intf((((IntfContext)_localctx).CLSINTF!=null?((IntfContext)_localctx).CLSINTF.getText():null), ((IntfContext)_localctx).p.kc);
			setState(335);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(318); match(EXTENDS);
				setState(319); ((IntfContext)_localctx).t = type(0);
				_localctx.i.add(((IntfContext)_localctx).t.t);
				setState(321); match(LBRACE);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN) {
					{
					{
					setState(322); match(FUN);
					setState(323); ((IntfContext)_localctx).VAR = match(VAR);
					setState(324); ((IntfContext)_localctx).ts = typescheme();
					setState(325); match(SEMICOLON);
					_localctx.i.add((((IntfContext)_localctx).VAR!=null?((IntfContext)_localctx).VAR.getText():null), ((IntfContext)_localctx).ts.ts);
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(333); match(RBRACE);
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

	public static class ClsContext extends ParserRuleContext {
		public CuClass c;
		public Token CLSINTF;
		public KindcontextContext pk;
		public TypecontextContext pt;
		public TypeContext t;
		public StatContext s;
		public ExprContext ex;
		public Token VAR;
		public TypeschemeContext ts;
		public TerminalNode VAR(int i) {
			return getToken(CubexParser2.VAR, i);
		}
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CubexParser2.SEMICOLON, 0); }
		public TerminalNode SUPER() { return getToken(CubexParser2.SUPER, 0); }
		public List<TerminalNode> FUN() { return getTokens(CubexParser2.FUN); }
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public KindcontextContext kindcontext() {
			return getRuleContext(KindcontextContext.class,0);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public TerminalNode LPAREN() { return getToken(CubexParser2.LPAREN, 0); }
		public TerminalNode RBRACE() { return getToken(CubexParser2.RBRACE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public TerminalNode CLASS() { return getToken(CubexParser2.CLASS, 0); }
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypecontextContext typecontext() {
			return getRuleContext(TypecontextContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(CubexParser2.VAR); }
		public TerminalNode RPAREN() { return getToken(CubexParser2.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeschemeContext typescheme(int i) {
			return getRuleContext(TypeschemeContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public TerminalNode FUN(int i) {
			return getToken(CubexParser2.FUN, i);
		}
		public TerminalNode EXTENDS() { return getToken(CubexParser2.EXTENDS, 0); }
		public ClsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls; }
	}

	public final ClsContext cls() throws RecognitionException {
		ClsContext _localctx = new ClsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); match(CLASS);
			setState(338); ((ClsContext)_localctx).CLSINTF = match(CLSINTF);
			setState(339); ((ClsContext)_localctx).pk = kindcontext();
			setState(340); ((ClsContext)_localctx).pt = typecontext();
			((ClsContext)_localctx).c =  new Cls((((ClsContext)_localctx).CLSINTF!=null?((ClsContext)_localctx).CLSINTF.getText():null), ((ClsContext)_localctx).pk.kc, ((ClsContext)_localctx).pt.tc);
			setState(388);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(342); match(EXTENDS);
				setState(343); ((ClsContext)_localctx).t = type(0);
				_localctx.c.add(((ClsContext)_localctx).t.t);
				setState(345); match(LBRACE);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << VAR) | (1L << EQUAL) | (1L << LBRACE))) != 0)) {
					{
					{
					setState(346); ((ClsContext)_localctx).s = stat();
					_localctx.c.add(((ClsContext)_localctx).s.s);
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
				_la = _input.LA(1);
				if (_la==SUPER) {
					{
					setState(354); match(SUPER);
					setState(356);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
						setState(355); match(LPAREN);
						}
					}

					setState(358); ((ClsContext)_localctx).ex = expr(0);
					_localctx.c.add(((ClsContext)_localctx).ex.e);
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(360); match(COMMA);
						setState(361); ((ClsContext)_localctx).ex = expr(0);
						_localctx.c.add(((ClsContext)_localctx).ex.e);
						}
						}
						setState(368);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(370);
					_la = _input.LA(1);
					if (_la==RPAREN) {
						{
						setState(369); match(RPAREN);
						}
					}

					}
				}

				setState(374); match(SEMICOLON);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN) {
					{
					{
					setState(375); match(FUN);
					setState(376); ((ClsContext)_localctx).VAR = match(VAR);
					setState(377); ((ClsContext)_localctx).ts = typescheme();
					setState(378); ((ClsContext)_localctx).s = stat();
					_localctx.c.add((((ClsContext)_localctx).VAR!=null?((ClsContext)_localctx).VAR.getText():null), ((ClsContext)_localctx).ts.ts, ((ClsContext)_localctx).s.s);
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(386); match(RBRACE);
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

	public static class ProgramContext extends ParserRuleContext {
		public CuProgr p;
		public StatContext s;
		public StatsContext ss;
		public ProgramContext pr;
		public Token VAR;
		public TypeschemeContext ts;
		public IntfContext i;
		public ClsContext c;
		public IntfContext intf() {
			return getRuleContext(IntfContext.class,0);
		}
		public TerminalNode VAR(int i) {
			return getToken(CubexParser2.VAR, i);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ClsContext cls() {
			return getRuleContext(ClsContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(CubexParser2.VAR); }
		public List<TerminalNode> FUN() { return getTokens(CubexParser2.FUN); }
		public TypeschemeContext typescheme(int i) {
			return getRuleContext(TypeschemeContext.class,i);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public TerminalNode FUN(int i) {
			return getToken(CubexParser2.FUN, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_program);
		try {
			int _alt;
			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390); ((ProgramContext)_localctx).s = stat();
				((ProgramContext)_localctx).p =  new StatPrg(((ProgramContext)_localctx).s.s);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393); ((ProgramContext)_localctx).s = stat();
				setState(394); ((ProgramContext)_localctx).ss = stats();
				setState(395); ((ProgramContext)_localctx).pr = program();
				((ProgramContext)_localctx).p =  new StatsPrg(((ProgramContext)_localctx).s.s, ((ProgramContext)_localctx).ss.cu, ((ProgramContext)_localctx).pr.p);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(398); match(FUN);
				setState(399); ((ProgramContext)_localctx).VAR = match(VAR);
				setState(400); ((ProgramContext)_localctx).ts = typescheme();
				setState(401); ((ProgramContext)_localctx).s = stat();
				((ProgramContext)_localctx).p =  new FunPrg((((ProgramContext)_localctx).VAR!=null?((ProgramContext)_localctx).VAR.getText():null), ((ProgramContext)_localctx).ts.ts, ((ProgramContext)_localctx).s.s);
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(403); match(FUN);
						setState(404); ((ProgramContext)_localctx).VAR = match(VAR);
						setState(405); ((ProgramContext)_localctx).ts = typescheme();
						setState(406); ((ProgramContext)_localctx).s = stat();
						_localctx.p.add((((ProgramContext)_localctx).VAR!=null?((ProgramContext)_localctx).VAR.getText():null), ((ProgramContext)_localctx).ts.ts, ((ProgramContext)_localctx).s.s);
						}
						} 
					}
					setState(413);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(414); ((ProgramContext)_localctx).pr = program();
				_localctx.p.add(((ProgramContext)_localctx).pr.p);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417); ((ProgramContext)_localctx).i = intf();
				setState(418); ((ProgramContext)_localctx).pr = program();
				((ProgramContext)_localctx).p =  new IntfPrg(((ProgramContext)_localctx).i.i, ((ProgramContext)_localctx).pr.p);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(421); ((ProgramContext)_localctx).c = cls();
				setState(422); ((ProgramContext)_localctx).pr = program();
				((ProgramContext)_localctx).p =  new ClassPrg(((ProgramContext)_localctx).c.c, ((ProgramContext)_localctx).pr.p);
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

	public static class FunctxtContext extends ParserRuleContext {
		public int _p;
		public CuFunC f;
		public FunctxtContext fc;
		public VvcContext v;
		public TypeschemeContext ts;
		public VvcContext vvc() {
			return getRuleContext(VvcContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CubexParser2.COMMA, 0); }
		public TypeschemeContext typescheme() {
			return getRuleContext(TypeschemeContext.class,0);
		}
		public FunctxtContext functxt() {
			return getRuleContext(FunctxtContext.class,0);
		}
		public FunctxtContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FunctxtContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_functxt; }
	}

	public final FunctxtContext functxt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctxtContext _localctx = new FunctxtContext(_ctx, _parentState, _p);
		FunctxtContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_functxt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			((FunctxtContext)_localctx).f =  new FunCtxtEmpty();
			}
			_ctx.stop = _input.LT(-1);
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctxtContext(_parentctx, _parentState, _p);
					_localctx.fc = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_functxt);
					setState(430);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(431); match(COMMA);
					setState(432); ((FunctxtContext)_localctx).v = vvc();
					setState(433); ((FunctxtContext)_localctx).ts = typescheme();
					((FunctxtContext)_localctx).f =  new FuncTxt(((FunctxtContext)_localctx).fc.f, ((FunctxtContext)_localctx).v.v, ((FunctxtContext)_localctx).ts.ts);
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class ClsctxtContext extends ParserRuleContext {
		public int _p;
		public CuClassC c;
		public ClsctxtContext cl;
		public Token CLSINTF;
		public KindcontextContext p;
		public TypeContext t;
		public Token VAR;
		public TypeschemeContext ts;
		public TerminalNode VAR(int i) {
			return getToken(CubexParser2.VAR, i);
		}
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CubexParser2.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CubexParser2.SEMICOLON, i);
		}
		public ClsctxtContext clsctxt() {
			return getRuleContext(ClsctxtContext.class,0);
		}
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public KindcontextContext kindcontext() {
			return getRuleContext(KindcontextContext.class,0);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public TerminalNode RBRACE() { return getToken(CubexParser2.RBRACE, 0); }
		public TerminalNode CLASS() { return getToken(CubexParser2.CLASS, 0); }
		public TerminalNode COMMA() { return getToken(CubexParser2.COMMA, 0); }
		public List<TerminalNode> VAR() { return getTokens(CubexParser2.VAR); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeschemeContext typescheme(int i) {
			return getRuleContext(TypeschemeContext.class,i);
		}
		public TerminalNode INTERFACE() { return getToken(CubexParser2.INTERFACE, 0); }
		public TerminalNode EXTENDS() { return getToken(CubexParser2.EXTENDS, 0); }
		public ClsctxtContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClsctxtContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_clsctxt; }
	}

	public final ClsctxtContext clsctxt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClsctxtContext _localctx = new ClsctxtContext(_ctx, _parentState, _p);
		ClsctxtContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, RULE_clsctxt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			((ClsctxtContext)_localctx).c =  new ClassCtxtEmpty();
			}
			_ctx.stop = _input.LT(-1);
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(492);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new ClsctxtContext(_parentctx, _parentState, _p);
						_localctx.cl = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_clsctxt);
						setState(444);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(445); match(COMMA);
						setState(446); match(INTERFACE);
						setState(447); ((ClsctxtContext)_localctx).CLSINTF = match(CLSINTF);
						setState(448); ((ClsctxtContext)_localctx).p = kindcontext();
						((ClsctxtContext)_localctx).c =  new ClassCtxtIntf(((ClsctxtContext)_localctx).cl.c, (((ClsctxtContext)_localctx).CLSINTF!=null?((ClsctxtContext)_localctx).CLSINTF.getText():null), ((ClsctxtContext)_localctx).p.kc);
						setState(466);
						switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
						case 1:
							{
							setState(450); match(EXTENDS);
							setState(451); ((ClsctxtContext)_localctx).t = type(0);
							_localctx.c.add(((ClsctxtContext)_localctx).t.t);
							setState(453); match(LBRACE);
							setState(461);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==VAR) {
								{
								{
								setState(454); ((ClsctxtContext)_localctx).VAR = match(VAR);
								setState(455); ((ClsctxtContext)_localctx).ts = typescheme();
								setState(456); match(SEMICOLON);
								_localctx.c.add((((ClsctxtContext)_localctx).VAR!=null?((ClsctxtContext)_localctx).VAR.getText():null), ((ClsctxtContext)_localctx).ts.ts);
								}
								}
								setState(463);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(464); match(RBRACE);
							}
							break;
						}
						}
						break;

					case 2:
						{
						_localctx = new ClsctxtContext(_parentctx, _parentState, _p);
						_localctx.cl = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_clsctxt);
						setState(468);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(469); match(COMMA);
						setState(470); match(CLASS);
						setState(471); ((ClsctxtContext)_localctx).CLSINTF = match(CLSINTF);
						setState(472); ((ClsctxtContext)_localctx).p = kindcontext();
						((ClsctxtContext)_localctx).c =  new ClassCtxtCls(((ClsctxtContext)_localctx).cl.c, (((ClsctxtContext)_localctx).CLSINTF!=null?((ClsctxtContext)_localctx).CLSINTF.getText():null), ((ClsctxtContext)_localctx).p.kc);
						setState(490);
						switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
						case 1:
							{
							setState(474); match(EXTENDS);
							setState(475); ((ClsctxtContext)_localctx).t = type(0);
							_localctx.c.add(((ClsctxtContext)_localctx).t.t);
							setState(477); match(LBRACE);
							setState(485);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==VAR) {
								{
								{
								setState(478); ((ClsctxtContext)_localctx).VAR = match(VAR);
								setState(479); ((ClsctxtContext)_localctx).ts = typescheme();
								setState(480); match(SEMICOLON);
								_localctx.c.add((((ClsctxtContext)_localctx).VAR!=null?((ClsctxtContext)_localctx).VAR.getText():null), ((ClsctxtContext)_localctx).ts.ts);
								}
								}
								setState(487);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(488); match(RBRACE);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return type_sempred((TypeContext)_localctx, predIndex);

		case 6: return expr_sempred((ExprContext)_localctx, predIndex);

		case 13: return functxt_sempred((FunctxtContext)_localctx, predIndex);

		case 14: return clsctxt_sempred((ClsctxtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean clsctxt_sempred(ClsctxtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13: return 2 >= _localctx._p;

		case 14: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean functxt_sempred(FunctxtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 5 >= _localctx._p;

		case 2: return 16 >= _localctx._p;

		case 3: return 15 >= _localctx._p;

		case 4: return 14 >= _localctx._p;

		case 5: return 13 >= _localctx._p;

		case 6: return 12 >= _localctx._p;

		case 7: return 11 >= _localctx._p;

		case 8: return 10 >= _localctx._p;

		case 9: return 9 >= _localctx._p;

		case 10: return 8 >= _localctx._p;

		case 11: return 7 >= _localctx._p;
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3;\u01f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\5\3\60\n\3\3\3\5\3\63\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4A\n\4\f\4\16\4D\13"+
		"\4\5\4F\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5R\n\5\f\5\16\5"+
		"U\13\5\5\5W\n\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d\n\6"+
		"\5\6f\n\6\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a2\n\b\3\b\3\b\5\b\u00a6"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ad\n\b\3\b\3\b\5\b\u00b1\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00b8\n\b\3\b\3\b\5\b\u00bc\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00c6\n\b\3\b\3\b\5\b\u00ca\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d1"+
		"\n\b\3\b\3\b\5\b\u00d5\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u00dc\n\b\3\b\3\b\5"+
		"\b\u00e0\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e7\n\b\3\b\3\b\5\b\u00eb\n\b\3"+
		"\b\3\b\7\b\u00ef\n\b\f\b\16\b\u00f2\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00fb\n\t\f\t\16\t\u00fe\13\t\5\t\u0100\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0117"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u012d\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0136"+
		"\n\13\f\13\16\13\u0139\13\13\5\13\u013b\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u014b\n\f\f\f\16\f\u014e\13\f\3\f\3"+
		"\f\5\f\u0152\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0160"+
		"\n\r\f\r\16\r\u0163\13\r\3\r\3\r\5\r\u0167\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u016f\n\r\f\r\16\r\u0172\13\r\3\r\5\r\u0175\n\r\5\r\u0177\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0180\n\r\f\r\16\r\u0183\13\r\3\r\3\r\5\r"+
		"\u0187\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u019c\n\16\f\16\16\16\u019f\13"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01ac"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01b7\n\17\f\17"+
		"\16\17\u01ba\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01ce\n\20\f\20\16\20\u01d1"+
		"\13\20\3\20\3\20\5\20\u01d5\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01e6\n\20\f\20\16\20\u01e9"+
		"\13\20\3\20\3\20\5\20\u01ed\n\20\7\20\u01ef\n\20\f\20\16\20\u01f2\13\20"+
		"\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\r\4\2\23\23\25\25"+
		"\4\2\17\20\24\24\4\2%%((\3\2!#\3\2$%\3\2-\60\3\2\61\62\4\2&\'\63\64\3"+
		"\2\65\66\3\2)*\4\2\t\t\32\32\u022d\2 \3\2\2\2\4#\3\2\2\2\6\64\3\2\2\2"+
		"\bI\3\2\2\2\ne\3\2\2\2\fq\3\2\2\2\16\u008c\3\2\2\2\20\u00f3\3\2\2\2\22"+
		"\u012c\3\2\2\2\24\u012e\3\2\2\2\26\u013c\3\2\2\2\30\u0153\3\2\2\2\32\u01ab"+
		"\3\2\2\2\34\u01ad\3\2\2\2\36\u01bb\3\2\2\2 !\t\2\2\2!\"\b\2\1\2\"\3\3"+
		"\2\2\2#\62\b\3\1\2$/\7&\2\2%&\7\24\2\2&,\b\3\1\2\'(\7\35\2\2()\7\24\2"+
		"\2)+\b\3\1\2*\'\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\60\3\2\2\2.,\3"+
		"\2\2\2/%\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\63\7\'\2\2\62$\3\2\2\2\62"+
		"\63\3\2\2\2\63\5\3\2\2\2\64\65\b\4\1\2\65E\7\33\2\2\66\67\7\25\2\2\67"+
		"8\7\31\2\289\5\n\6\29B\b\4\1\2:;\7\35\2\2;<\7\25\2\2<=\7\31\2\2=>\5\n"+
		"\6\2>?\b\4\1\2?A\3\2\2\2@:\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2"+
		"\2\2DB\3\2\2\2E\66\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\34\2\2H\7\3\2\2\2I"+
		"Y\b\5\1\2JV\7&\2\2KL\5\n\6\2LS\b\5\1\2MN\7\35\2\2NO\5\n\6\2OP\b\5\1\2"+
		"PR\3\2\2\2QM\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2US\3\2\2\2"+
		"VK\3\2\2\2VW\3\2\2\2WX\3\2\2\2XZ\7\'\2\2YJ\3\2\2\2YZ\3\2\2\2Z\t\3\2\2"+
		"\2[\\\b\6\1\2\\]\t\3\2\2]f\b\6\1\2^_\7\23\2\2_c\b\6\1\2`a\5\b\5\2ab\b"+
		"\6\1\2bd\3\2\2\2c`\3\2\2\2cd\3\2\2\2df\3\2\2\2e[\3\2\2\2e^\3\2\2\2fn\3"+
		"\2\2\2gh\6\6\2\3hi\7)\2\2ij\5\n\6\2jk\b\6\1\2km\3\2\2\2lg\3\2\2\2mp\3"+
		"\2\2\2nl\3\2\2\2no\3\2\2\2o\13\3\2\2\2pn\3\2\2\2qr\5\4\3\2rs\5\6\4\2s"+
		"t\7\31\2\2tu\5\n\6\2uv\b\7\1\2v\r\3\2\2\2wx\b\b\1\2xy\7\25\2\2y\u008d"+
		"\b\b\1\2z{\5\2\2\2{|\5\b\5\2|}\5\20\t\2}~\b\b\1\2~\u008d\3\2\2\2\177\u0080"+
		"\7\27\2\2\u0080\u0081\5\20\t\2\u0081\u0082\7\30\2\2\u0082\u0083\b\b\1"+
		"\2\u0083\u008d\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u008d\b\b\1\2\u0086"+
		"\u0087\7\22\2\2\u0087\u008d\b\b\1\2\u0088\u0089\7\26\2\2\u0089\u008d\b"+
		"\b\1\2\u008a\u008b\7\3\2\2\u008b\u008d\b\b\1\2\u008cw\3\2\2\2\u008cz\3"+
		"\2\2\2\u008c\177\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0086\3\2\2\2\u008c"+
		"\u0088\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u00f0\3\2\2\2\u008e\u008f\6\b"+
		"\3\3\u008f\u0090\7,\2\2\u0090\u0091\5\16\b\2\u0091\u0092\b\b\1\2\u0092"+
		"\u00ef\3\2\2\2\u0093\u0094\6\b\4\3\u0094\u0095\7\25\2\2\u0095\u0096\5"+
		"\b\5\2\u0096\u0097\7\33\2\2\u0097\u0098\5\20\t\2\u0098\u0099\7\34\2\2"+
		"\u0099\u009a\b\b\1\2\u009a\u00ef\3\2\2\2\u009b\u009c\6\b\5\3\u009c\u009d"+
		"\t\4\2\2\u009d\u00ef\b\b\1\2\u009e\u009f\6\b\6\3\u009f\u00a1\t\5\2\2\u00a0"+
		"\u00a2\7\33\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3"+
		"\2\2\2\u00a3\u00a5\5\16\b\2\u00a4\u00a6\7\34\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\b\1\2\u00a8\u00ef\3\2"+
		"\2\2\u00a9\u00aa\6\b\7\3\u00aa\u00ac\t\6\2\2\u00ab\u00ad\7\33\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\5\16"+
		"\b\2\u00af\u00b1\7\34\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\b\b\1\2\u00b3\u00ef\3\2\2\2\u00b4\u00b5\6\b"+
		"\b\3\u00b5\u00b7\t\7\2\2\u00b6\u00b8\7\33\2\2\u00b7\u00b6\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\5\16\b\2\u00ba\u00bc\7"+
		"\34\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\b\b\1\2\u00be\u00ef\3\2\2\2\u00bf\u00c0\6\b\t\3\u00c0\u00c1\t\b"+
		"\2\2\u00c1\u00ef\b\b\1\2\u00c2\u00c3\6\b\n\3\u00c3\u00c5\7,\2\2\u00c4"+
		"\u00c6\7\33\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c7\u00c9\5\16\b\2\u00c8\u00ca\7\34\2\2\u00c9\u00c8\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\b\1\2\u00cc\u00ef\3\2"+
		"\2\2\u00cd\u00ce\6\b\13\3\u00ce\u00d0\t\t\2\2\u00cf\u00d1\7\33\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\5\16"+
		"\b\2\u00d3\u00d5\7\34\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\b\b\1\2\u00d7\u00ef\3\2\2\2\u00d8\u00d9\6\b"+
		"\f\3\u00d9\u00db\t\n\2\2\u00da\u00dc\7\33\2\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\5\16\b\2\u00de\u00e0\7"+
		"\34\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\b\b\1\2\u00e2\u00ef\3\2\2\2\u00e3\u00e4\6\b\r\3\u00e4\u00e6\t\13"+
		"\2\2\u00e5\u00e7\7\33\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\5\16\b\2\u00e9\u00eb\7\34\2\2\u00ea\u00e9\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b\b\1\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u008e\3\2\2\2\u00ee\u0093\3\2\2\2\u00ee\u009b\3\2"+
		"\2\2\u00ee\u009e\3\2\2\2\u00ee\u00a9\3\2\2\2\u00ee\u00b4\3\2\2\2\u00ee"+
		"\u00bf\3\2\2\2\u00ee\u00c2\3\2\2\2\u00ee\u00cd\3\2\2\2\u00ee\u00d8\3\2"+
		"\2\2\u00ee\u00e3\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\17\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00ff\b\t\1"+
		"\2\u00f4\u00f5\5\16\b\2\u00f5\u00fc\b\t\1\2\u00f6\u00f7\7\35\2\2\u00f7"+
		"\u00f8\5\16\b\2\u00f8\u00f9\b\t\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00f6\3"+
		"\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u00f4\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\21\3\2\2\2\u0101\u0102\7\37\2\2\u0102\u0103\5\24\13\2\u0103"+
		"\u0104\7 \2\2\u0104\u0105\b\n\1\2\u0105\u012d\3\2\2\2\u0106\u0107\7\25"+
		"\2\2\u0107\u0108\7\67\2\2\u0108\u0109\5\16\b\2\u0109\u010a\7\36\2\2\u010a"+
		"\u010b\b\n\1\2\u010b\u012d\3\2\2\2\u010c\u010d\7\4\2\2\u010d\u010e\7\33"+
		"\2\2\u010e\u010f\5\16\b\2\u010f\u0110\7\34\2\2\u0110\u0111\5\22\n\2\u0111"+
		"\u0116\b\n\1\2\u0112\u0113\7\5\2\2\u0113\u0114\5\22\n\2\u0114\u0115\b"+
		"\n\1\2\u0115\u0117\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u012d\3\2\2\2\u0118\u0119\7\6\2\2\u0119\u011a\7\33\2\2\u011a\u011b\5"+
		"\16\b\2\u011b\u011c\7\34\2\2\u011c\u011d\5\22\n\2\u011d\u011e\b\n\1\2"+
		"\u011e\u012d\3\2\2\2\u011f\u0120\7\7\2\2\u0120\u0121\7\33\2\2\u0121\u0122"+
		"\7\25\2\2\u0122\u0123\7\b\2\2\u0123\u0124\5\16\b\2\u0124\u0125\7\34\2"+
		"\2\u0125\u0126\5\22\n\2\u0126\u0127\b\n\1\2\u0127\u012d\3\2\2\2\u0128"+
		"\u0129\t\f\2\2\u0129\u012a\5\16\b\2\u012a\u012b\b\n\1\2\u012b\u012d\3"+
		"\2\2\2\u012c\u0101\3\2\2\2\u012c\u0106\3\2\2\2\u012c\u010c\3\2\2\2\u012c"+
		"\u0118\3\2\2\2\u012c\u011f\3\2\2\2\u012c\u0128\3\2\2\2\u012d\23\3\2\2"+
		"\2\u012e\u013a\b\13\1\2\u012f\u0130\5\22\n\2\u0130\u0137\b\13\1\2\u0131"+
		"\u0132\7\35\2\2\u0132\u0133\5\22\n\2\u0133\u0134\b\13\1\2\u0134\u0136"+
		"\3\2\2\2\u0135\u0131\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u012f\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\25\3\2\2\2\u013c\u013d\7\n\2\2\u013d\u013e"+
		"\7\23\2\2\u013e\u013f\5\4\3\2\u013f\u0151\b\f\1\2\u0140\u0141\7\13\2\2"+
		"\u0141\u0142\5\n\6\2\u0142\u0143\b\f\1\2\u0143\u014c\7\37\2\2\u0144\u0145"+
		"\7\f\2\2\u0145\u0146\7\25\2\2\u0146\u0147\5\f\7\2\u0147\u0148\7\36\2\2"+
		"\u0148\u0149\b\f\1\2\u0149\u014b\3\2\2\2\u014a\u0144\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0150\7 \2\2\u0150\u0152\3\2\2\2\u0151\u0140\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\27\3\2\2\2\u0153\u0154\7\r\2\2\u0154\u0155"+
		"\7\23\2\2\u0155\u0156\5\4\3\2\u0156\u0157\5\6\4\2\u0157\u0186\b\r\1\2"+
		"\u0158\u0159\7\13\2\2\u0159\u015a\5\n\6\2\u015a\u015b\b\r\1\2\u015b\u0161"+
		"\7\37\2\2\u015c\u015d\5\22\n\2\u015d\u015e\b\r\1\2\u015e\u0160\3\2\2\2"+
		"\u015f\u015c\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0176\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\7\16\2\2"+
		"\u0165\u0167\7\33\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u0169\5\16\b\2\u0169\u0170\b\r\1\2\u016a\u016b\7\35\2\2"+
		"\u016b\u016c\5\16\b\2\u016c\u016d\b\r\1\2\u016d\u016f\3\2\2\2\u016e\u016a"+
		"\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\7\34\2\2\u0174\u0173\3"+
		"\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0164\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0181\7\36\2\2\u0179\u017a\7"+
		"\f\2\2\u017a\u017b\7\25\2\2\u017b\u017c\5\f\7\2\u017c\u017d\5\22\n\2\u017d"+
		"\u017e\b\r\1\2\u017e\u0180\3\2\2\2\u017f\u0179\3\2\2\2\u0180\u0183\3\2"+
		"\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0185\7 \2\2\u0185\u0187\3\2\2\2\u0186\u0158\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\31\3\2\2\2\u0188\u0189\5\22\n\2\u0189\u018a"+
		"\b\16\1\2\u018a\u01ac\3\2\2\2\u018b\u018c\5\22\n\2\u018c\u018d\5\24\13"+
		"\2\u018d\u018e\5\32\16\2\u018e\u018f\b\16\1\2\u018f\u01ac\3\2\2\2\u0190"+
		"\u0191\7\f\2\2\u0191\u0192\7\25\2\2\u0192\u0193\5\f\7\2\u0193\u0194\5"+
		"\22\n\2\u0194\u019d\b\16\1\2\u0195\u0196\7\f\2\2\u0196\u0197\7\25\2\2"+
		"\u0197\u0198\5\f\7\2\u0198\u0199\5\22\n\2\u0199\u019a\b\16\1\2\u019a\u019c"+
		"\3\2\2\2\u019b\u0195\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\5\32"+
		"\16\2\u01a1\u01a2\b\16\1\2\u01a2\u01ac\3\2\2\2\u01a3\u01a4\5\26\f\2\u01a4"+
		"\u01a5\5\32\16\2\u01a5\u01a6\b\16\1\2\u01a6\u01ac\3\2\2\2\u01a7\u01a8"+
		"\5\30\r\2\u01a8\u01a9\5\32\16\2\u01a9\u01aa\b\16\1\2\u01aa\u01ac\3\2\2"+
		"\2\u01ab\u0188\3\2\2\2\u01ab\u018b\3\2\2\2\u01ab\u0190\3\2\2\2\u01ab\u01a3"+
		"\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ac\33\3\2\2\2\u01ad\u01ae\b\17\1\2\u01ae"+
		"\u01af\b\17\1\2\u01af\u01b8\3\2\2\2\u01b0\u01b1\6\17\16\3\u01b1\u01b2"+
		"\7\35\2\2\u01b2\u01b3\5\2\2\2\u01b3\u01b4\5\f\7\2\u01b4\u01b5\b\17\1\2"+
		"\u01b5\u01b7\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\35\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01bc\b\20\1\2\u01bc\u01bd\b\20\1\2\u01bd\u01f0\3\2\2\2\u01be\u01bf\6"+
		"\20\17\3\u01bf\u01c0\7\35\2\2\u01c0\u01c1\7\n\2\2\u01c1\u01c2\7\23\2\2"+
		"\u01c2\u01c3\5\4\3\2\u01c3\u01d4\b\20\1\2\u01c4\u01c5\7\13\2\2\u01c5\u01c6"+
		"\5\n\6\2\u01c6\u01c7\b\20\1\2\u01c7\u01cf\7\37\2\2\u01c8\u01c9\7\25\2"+
		"\2\u01c9\u01ca\5\f\7\2\u01ca\u01cb\7\36\2\2\u01cb\u01cc\b\20\1\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01c8\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2"+
		"\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2"+
		"\u01d3\7 \2\2\u01d3\u01d5\3\2\2\2\u01d4\u01c4\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\u01ef\3\2\2\2\u01d6\u01d7\6\20\20\3\u01d7\u01d8\7\35\2\2\u01d8"+
		"\u01d9\7\r\2\2\u01d9\u01da\7\23\2\2\u01da\u01db\5\4\3\2\u01db\u01ec\b"+
		"\20\1\2\u01dc\u01dd\7\13\2\2\u01dd\u01de\5\n\6\2\u01de\u01df\b\20\1\2"+
		"\u01df\u01e7\7\37\2\2\u01e0\u01e1\7\25\2\2\u01e1\u01e2\5\f\7\2\u01e2\u01e3"+
		"\7\36\2\2\u01e3\u01e4\b\20\1\2\u01e4\u01e6\3\2\2\2\u01e5\u01e0\3\2\2\2"+
		"\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01eb\7 \2\2\u01eb\u01ed\3\2\2\2\u01ec"+
		"\u01dc\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01be\3\2"+
		"\2\2\u01ee\u01d6\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\37\3\2\2\2\u01f2\u01f0\3\2\2\2\66,/\62BESVYcen\u008c"+
		"\u00a1\u00a5\u00ac\u00b0\u00b7\u00bb\u00c5\u00c9\u00d0\u00d4\u00db\u00df"+
		"\u00e6\u00ea\u00ee\u00f0\u00fc\u00ff\u0116\u012c\u0137\u013a\u014c\u0151"+
		"\u0161\u0166\u0170\u0174\u0176\u0181\u0186\u019d\u01ab\u01b8\u01cf\u01d4"+
		"\u01e7\u01ec\u01ee\u01f0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}