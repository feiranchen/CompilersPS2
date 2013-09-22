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
		RULE_vv = 0, RULE_vvc = 1, RULE_kindcontext = 2, RULE_typecontext = 3, 
		RULE_paratype = 4, RULE_type = 5, RULE_typescheme = 6, RULE_expr = 7, 
		RULE_exprs = 8, RULE_stat = 9, RULE_stats = 10, RULE_intf = 11, RULE_cls = 12, 
		RULE_program = 13, RULE_functxt = 14, RULE_clsctxt = 15;
	public static final String[] ruleNames = {
		"vv", "vvc", "kindcontext", "typecontext", "paratype", "type", "typescheme", 
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
	public static class VvContext extends ParserRuleContext {
		public CuVv v;
		public Token VAR;
		public Token op;
		public TerminalNode PIPE() { return getToken(CubexParser2.PIPE, 0); }
		public TerminalNode GTE() { return getToken(CubexParser2.GTE, 0); }
		public TerminalNode APPEND() { return getToken(CubexParser2.APPEND, 0); }
		public TerminalNode PERCENT() { return getToken(CubexParser2.PERCENT, 0); }
		public TerminalNode LTE() { return getToken(CubexParser2.LTE, 0); }
		public TerminalNode BANG() { return getToken(CubexParser2.BANG, 0); }
		public TerminalNode DASH() { return getToken(CubexParser2.DASH, 0); }
		public TerminalNode STAR() { return getToken(CubexParser2.STAR, 0); }
		public TerminalNode LANGLE() { return getToken(CubexParser2.LANGLE, 0); }
		public TerminalNode EQUAL() { return getToken(CubexParser2.EQUAL, 0); }
		public TerminalNode INEQUAL() { return getToken(CubexParser2.INEQUAL, 0); }
		public TerminalNode EQEQUAL() { return getToken(CubexParser2.EQEQUAL, 0); }
		public TerminalNode RANGLE() { return getToken(CubexParser2.RANGLE, 0); }
		public TerminalNode AMPERSAND() { return getToken(CubexParser2.AMPERSAND, 0); }
		public TerminalNode RTHR() { return getToken(CubexParser2.RTHR, 0); }
		public TerminalNode LONW() { return getToken(CubexParser2.LONW, 0); }
		public TerminalNode VAR() { return getToken(CubexParser2.VAR, 0); }
		public TerminalNode LTHR() { return getToken(CubexParser2.LTHR, 0); }
		public TerminalNode PLUS() { return getToken(CubexParser2.PLUS, 0); }
		public TerminalNode LRTHR() { return getToken(CubexParser2.LRTHR, 0); }
		public TerminalNode ONW() { return getToken(CubexParser2.ONW, 0); }
		public TerminalNode SLASH() { return getToken(CubexParser2.SLASH, 0); }
		public TerminalNode THR() { return getToken(CubexParser2.THR, 0); }
		public VvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vv; }
	}

	public final VvContext vv() throws RecognitionException {
		VvContext _localctx = new VvContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_vv);
		int _la;
		try {
			setState(36);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); ((VvContext)_localctx).VAR = match(VAR);
				((VvContext)_localctx).v =  new VarFunc((((VvContext)_localctx).VAR!=null?((VvContext)_localctx).VAR.getText():null));
				}
				break;
			case EQUAL:
			case STAR:
			case SLASH:
			case PERCENT:
			case PLUS:
			case DASH:
			case LANGLE:
			case RANGLE:
			case BANG:
			case AMPERSAND:
			case PIPE:
			case APPEND:
			case THR:
			case LTHR:
			case RTHR:
			case LRTHR:
			case ONW:
			case LONW:
			case LTE:
			case GTE:
			case EQEQUAL:
			case INEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				((VvContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << STAR) | (1L << SLASH) | (1L << PERCENT) | (1L << PLUS) | (1L << DASH) | (1L << LANGLE) | (1L << RANGLE) | (1L << BANG) | (1L << AMPERSAND) | (1L << PIPE) | (1L << APPEND) | (1L << THR) | (1L << LTHR) | (1L << RTHR) | (1L << LRTHR) | (1L << ONW) | (1L << LONW) | (1L << LTE) | (1L << GTE) | (1L << EQEQUAL) | (1L << INEQUAL))) != 0)) ) {
					((VvContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				((VvContext)_localctx).v =  new Operation((((VvContext)_localctx).op!=null?((VvContext)_localctx).op.getText():null));
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

	public static class VvcContext extends ParserRuleContext {
		public CuVvc v;
		public Token CLSINTF;
		public VvContext vs;
		public VvContext vv;
		public VvContext vv() {
			return getRuleContext(VvContext.class,0);
		}
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public VvcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vvc; }
	}

	public final VvcContext vvc() throws RecognitionException {
		VvcContext _localctx = new VvcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vvc);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case CLSINTF:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); ((VvcContext)_localctx).CLSINTF = match(CLSINTF);
				((VvcContext)_localctx).v =  new Vvc((((VvcContext)_localctx).CLSINTF!=null?((VvcContext)_localctx).CLSINTF.getText():null));
				}
				break;
			case VAR:
			case EQUAL:
			case STAR:
			case SLASH:
			case PERCENT:
			case PLUS:
			case DASH:
			case LANGLE:
			case RANGLE:
			case BANG:
			case AMPERSAND:
			case PIPE:
			case APPEND:
			case THR:
			case LTHR:
			case RTHR:
			case LRTHR:
			case ONW:
			case LONW:
			case LTE:
			case GTE:
			case EQEQUAL:
			case INEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); ((VvcContext)_localctx).vs = ((VvcContext)_localctx).vv = vv();
				((VvcContext)_localctx).v =  new Vvc(((VvcContext)_localctx).vv.v);
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
		enterRule(_localctx, 4, RULE_kindcontext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((KindcontextContext)_localctx).kc =  new KindContext(); 
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(46); match(LANGLE);
				setState(57);
				_la = _input.LA(1);
				if (_la==TPARA) {
					{
					setState(47); ((KindcontextContext)_localctx).TPARA = match(TPARA);
					 _localctx.kc.add((((KindcontextContext)_localctx).TPARA!=null?((KindcontextContext)_localctx).TPARA.getText():null)); 
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(49); match(COMMA);
						setState(50); ((KindcontextContext)_localctx).TPARA = match(TPARA);
						 _localctx.kc.add((((KindcontextContext)_localctx).TPARA!=null?((KindcontextContext)_localctx).TPARA.getText():null)); 
						}
						}
						setState(56);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(59); match(RANGLE);
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
		public VvContext v;
		public TypeContext t;
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
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
		enterRule(_localctx, 6, RULE_typecontext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TypecontextContext)_localctx).tc =  new TypeContext(); 
			setState(63); match(LPAREN);
			setState(79);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << EQUAL) | (1L << STAR) | (1L << SLASH) | (1L << PERCENT) | (1L << PLUS) | (1L << DASH) | (1L << LANGLE) | (1L << RANGLE) | (1L << BANG) | (1L << AMPERSAND) | (1L << PIPE) | (1L << APPEND) | (1L << THR) | (1L << LTHR) | (1L << RTHR) | (1L << LRTHR) | (1L << ONW) | (1L << LONW) | (1L << LTE) | (1L << GTE) | (1L << EQEQUAL) | (1L << INEQUAL))) != 0)) {
				{
				setState(64); ((TypecontextContext)_localctx).v = vv();
				setState(65); match(COLON);
				setState(66); ((TypecontextContext)_localctx).t = type(0);
				 _localctx.tc.add(((TypecontextContext)_localctx).v.v, ((TypecontextContext)_localctx).t.t); 
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(68); match(COMMA);
					setState(69); ((TypecontextContext)_localctx).v = vv();
					setState(70); match(COLON);
					setState(71); ((TypecontextContext)_localctx).t = type(0);
					 _localctx.tc.add(((TypecontextContext)_localctx).v.v, ((TypecontextContext)_localctx).t.t); 
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(81); match(RPAREN);
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
		enterRule(_localctx, 8, RULE_paratype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ParatypeContext)_localctx).pt =  new ParaType(); 
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(84); match(LANGLE);
				setState(96);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THING) | (1L << NOTHING) | (1L << CLSINTF) | (1L << TPARA))) != 0)) {
					{
					setState(85); ((ParatypeContext)_localctx).t = type(0);
					_localctx.pt.add(((ParatypeContext)_localctx).t.t);
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(87); match(COMMA);
						setState(88); ((ParatypeContext)_localctx).t = type(0);
						_localctx.pt.add(((ParatypeContext)_localctx).t.t);
						}
						}
						setState(95);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(98); match(RANGLE);
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
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			switch (_input.LA(1)) {
			case THING:
			case NOTHING:
			case TPARA:
				{
				setState(102);
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
				setState(104); ((TypeContext)_localctx).CLSINTF = match(CLSINTF);
				((TypeContext)_localctx).t =  new VClass((((TypeContext)_localctx).CLSINTF!=null?((TypeContext)_localctx).CLSINTF.getText():null));
				setState(109);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(106); ((TypeContext)_localctx).p = paratype();
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
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState, _p);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(113);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(114); match(AMPERSAND);
					setState(115); ((TypeContext)_localctx).r = type(2);
					((TypeContext)_localctx).t =  new VTypeInter(((TypeContext)_localctx).l.t, ((TypeContext)_localctx).r.t);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 12, RULE_typescheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); ((TypeschemeContext)_localctx).kc = kindcontext();
			setState(124); ((TypeschemeContext)_localctx).tc = typecontext();
			setState(125); match(COLON);
			setState(126); ((TypeschemeContext)_localctx).t = type(0);
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
		public VvContext v;
		public ParatypeContext pt;
		public ExprsContext es;
		public Token INTEGER;
		public Token STRING;
		public ExprContext r;
		public Token VAR;
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
		public VvContext vv() {
			return getRuleContext(VvContext.class,0);
		}
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
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(130); ((ExprContext)_localctx).v = vv();
				((ExprContext)_localctx).e =  new VvExp(((ExprContext)_localctx).v.v);
				}
				break;

			case 2:
				{
				setState(133); ((ExprContext)_localctx).v = vvc();
				setState(134); ((ExprContext)_localctx).pt = paratype();
				setState(135); ((ExprContext)_localctx).es = exprs();
				((ExprContext)_localctx).e =  new VvcExp(((ExprContext)_localctx).v.v, ((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
				}
				break;

			case 3:
				{
				setState(138); match(LBRACKET);
				setState(139); ((ExprContext)_localctx).es = exprs();
				setState(140); match(RBRACKET);
				((ExprContext)_localctx).e =  new BrkExpr(((ExprContext)_localctx).es.cu);
				}
				break;

			case 4:
				{
				setState(143); match(TRUE);
				((ExprContext)_localctx).e =  new CBoolean(true);
				}
				break;

			case 5:
				{
				setState(145); match(FALSE);
				((ExprContext)_localctx).e =  new CBoolean(false);
				}
				break;

			case 6:
				{
				setState(147); ((ExprContext)_localctx).INTEGER = match(INTEGER);
				((ExprContext)_localctx).e =  new CInteger((((ExprContext)_localctx).INTEGER!=null?Integer.valueOf(((ExprContext)_localctx).INTEGER.getText()):0));
				}
				break;

			case 7:
				{
				setState(149); ((ExprContext)_localctx).STRING = match(STRING);
				((ExprContext)_localctx).e =  new CString((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(249);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(154); match(APPEND);
						setState(155); ((ExprContext)_localctx).r = expr(6);
						((ExprContext)_localctx).e =  new AppExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(159); ((ExprContext)_localctx).VAR = match(VAR);
						setState(160); ((ExprContext)_localctx).pt = paratype();
						setState(161); match(LPAREN);
						setState(162); ((ExprContext)_localctx).es = exprs();
						setState(163); match(RPAREN);
						((ExprContext)_localctx).e =  new VarExpr(((ExprContext)_localctx).ex.e, (((ExprContext)_localctx).VAR!=null?((ExprContext)_localctx).VAR.getText():null), ((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(167);
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
						setState(169);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(170);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(172);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(171); match(LPAREN);
							}
						}

						setState(174); ((ExprContext)_localctx).r = expr(0);
						setState(176);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(175); match(RPAREN);
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
						setState(180);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(181);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==DASH) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(183);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(182); match(LPAREN);
							}
						}

						setState(185); ((ExprContext)_localctx).r = expr(0);
						setState(187);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(186); match(RPAREN);
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
						setState(191);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(192);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THR) | (1L << LTHR) | (1L << RTHR) | (1L << LRTHR))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(194);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(193); match(LPAREN);
							}
						}

						setState(196); ((ExprContext)_localctx).r = expr(0);
						setState(198);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(197); match(RPAREN);
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
						setState(202);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(203);
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
						setState(205);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(206); match(APPEND);
						setState(208);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(207); match(LPAREN);
							}
						}

						setState(210); ((ExprContext)_localctx).r = expr(0);
						setState(212);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(211); match(RPAREN);
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
						setState(216);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(217);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LTE) | (1L << GTE))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(219);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(218); match(LPAREN);
							}
						}

						setState(221); ((ExprContext)_localctx).r = expr(0);
						setState(223);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(222); match(RPAREN);
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
						setState(227);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(228);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQEQUAL || _la==INEQUAL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(230);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(229); match(LPAREN);
							}
						}

						setState(232); ((ExprContext)_localctx).r = expr(0);
						setState(234);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(233); match(RPAREN);
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
						setState(238);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(239);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AMPERSAND || _la==PIPE) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(241);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(240); match(LPAREN);
							}
						}

						setState(243); ((ExprContext)_localctx).r = expr(0);
						setState(245);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(244); match(RPAREN);
							}
							break;
						}
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == AMPERSAND) ? new AndExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e) : new OrExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e);
						}
						break;
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 16, RULE_exprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ExprsContext)_localctx).cu =  new ArrayList<CuExpr>();
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(255); ((ExprsContext)_localctx).e = expr(0);
				_localctx.cu.add(((ExprsContext)_localctx).e.e);
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(257); match(COMMA);
						setState(258); ((ExprsContext)_localctx).e = expr(0);
						_localctx.cu.add(((ExprsContext)_localctx).e.e);
						}
						} 
					}
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public VvContext v;
		public ExprContext e;
		public StatContext l;
		public StatContext r;
		public StatContext st;
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CubexParser2.SEMICOLON, 0); }
		public VvContext vv() {
			return getRuleContext(VvContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_stat);
		int _la;
		try {
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); match(LBRACE);
				setState(269); ((StatContext)_localctx).ss = stats();
				setState(270); match(RBRACE);
				((StatContext)_localctx).s =  new Stats(((StatContext)_localctx).ss.cu);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); ((StatContext)_localctx).v = vv();
				setState(274); match(ASSIGN);
				setState(275); ((StatContext)_localctx).e = expr(0);
				setState(276); match(SEMICOLON);
				((StatContext)_localctx).s =  new AssignStat(((StatContext)_localctx).v.v, ((StatContext)_localctx).e.e);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279); match(IF);
				setState(280); match(LPAREN);
				setState(281); ((StatContext)_localctx).e = expr(0);
				setState(282); match(RPAREN);
				setState(283); ((StatContext)_localctx).l = stat();
				((StatContext)_localctx).s =  new IfStat(((StatContext)_localctx).e.e, ((StatContext)_localctx).l.s);
				setState(289);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(285); match(ELSE);
					setState(286); ((StatContext)_localctx).r = stat();
					_localctx.s.add(((StatContext)_localctx).r.s);
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291); match(WHILE);
				setState(292); match(LPAREN);
				setState(293); ((StatContext)_localctx).e = expr(0);
				setState(294); match(RPAREN);
				setState(295); ((StatContext)_localctx).st = stat();
				((StatContext)_localctx).s =  new WhileStat(((StatContext)_localctx).e.e, ((StatContext)_localctx).st.s);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(298); match(FOR);
				setState(299); match(LPAREN);
				setState(300); ((StatContext)_localctx).v = vv();
				setState(301); match(IN);
				setState(302); ((StatContext)_localctx).e = expr(0);
				setState(303); match(RPAREN);
				setState(304); ((StatContext)_localctx).st = stat();
				((StatContext)_localctx).s =  new ForStat(((StatContext)_localctx).v.v, ((StatContext)_localctx).e.e, ((StatContext)_localctx).st.s);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				_la = _input.LA(1);
				if ( !(_la==RETURN || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(308); ((StatContext)_localctx).e = expr(0);
				((StatContext)_localctx).s =  new ReturnStat(((StatContext)_localctx).e.e);
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
		enterRule(_localctx, 20, RULE_stats);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StatsContext)_localctx).cu =  new ArrayList<CuStat>();
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(314); ((StatsContext)_localctx).s = stat();
				_localctx.cu.add(((StatsContext)_localctx).s.s);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(316); match(COMMA);
					setState(317); ((StatsContext)_localctx).s = stat();
					_localctx.cu.add(((StatsContext)_localctx).s.s);
					}
					}
					setState(324);
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
		public VvContext v;
		public TypeschemeContext ts;
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CubexParser2.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CubexParser2.SEMICOLON, i);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public List<TerminalNode> FUN() { return getTokens(CubexParser2.FUN); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public KindcontextContext kindcontext() {
			return getRuleContext(KindcontextContext.class,0);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public TerminalNode RBRACE() { return getToken(CubexParser2.RBRACE, 0); }
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
		enterRule(_localctx, 22, RULE_intf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); match(INTERFACE);
			setState(328); ((IntfContext)_localctx).CLSINTF = match(CLSINTF);
			setState(329); ((IntfContext)_localctx).p = kindcontext();
			((IntfContext)_localctx).i =  new Intf((((IntfContext)_localctx).CLSINTF!=null?((IntfContext)_localctx).CLSINTF.getText():null), ((IntfContext)_localctx).p.kc);
			setState(348);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(331); match(EXTENDS);
				setState(332); ((IntfContext)_localctx).t = type(0);
				_localctx.i.add(((IntfContext)_localctx).t.t);
				setState(334); match(LBRACE);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN) {
					{
					{
					setState(335); match(FUN);
					setState(336); ((IntfContext)_localctx).v = vv();
					setState(337); ((IntfContext)_localctx).ts = typescheme();
					setState(338); match(SEMICOLON);
					_localctx.i.add(((IntfContext)_localctx).v.v, ((IntfContext)_localctx).ts.ts);
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(346); match(RBRACE);
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
		public KindcontextContext pk;
		public TypecontextContext pt;
		public TypeContext t;
		public StatContext s;
		public ExprContext ex;
		public VvContext v;
		public TypeschemeContext ts;
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CubexParser2.SEMICOLON, 0); }
		public TerminalNode SUPER() { return getToken(CubexParser2.SUPER, 0); }
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
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
		enterRule(_localctx, 24, RULE_cls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); match(CLASS);
			setState(351); match(CLSINTF);
			setState(352); ((ClsContext)_localctx).pk = kindcontext();
			setState(353); ((ClsContext)_localctx).pt = typecontext();
			((ClsContext)_localctx).c =  new Cls(((ClsContext)_localctx).v.v, ((ClsContext)_localctx).pk.kc, ((ClsContext)_localctx).pt.tc);
			setState(401);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(355); match(EXTENDS);
				setState(356); ((ClsContext)_localctx).t = type(0);
				_localctx.c.add(((ClsContext)_localctx).t.t);
				setState(358); match(LBRACE);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << VAR) | (1L << EQUAL) | (1L << LBRACE) | (1L << STAR) | (1L << SLASH) | (1L << PERCENT) | (1L << PLUS) | (1L << DASH) | (1L << LANGLE) | (1L << RANGLE) | (1L << BANG) | (1L << AMPERSAND) | (1L << PIPE) | (1L << APPEND) | (1L << THR) | (1L << LTHR) | (1L << RTHR) | (1L << LRTHR) | (1L << ONW) | (1L << LONW) | (1L << LTE) | (1L << GTE) | (1L << EQEQUAL) | (1L << INEQUAL))) != 0)) {
					{
					{
					setState(359); ((ClsContext)_localctx).s = stat();
					_localctx.c.add(((ClsContext)_localctx).s.s);
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(385);
				_la = _input.LA(1);
				if (_la==SUPER) {
					{
					setState(367); match(SUPER);
					setState(369);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
						setState(368); match(LPAREN);
						}
					}

					setState(371); ((ClsContext)_localctx).ex = expr(0);
					_localctx.c.add(((ClsContext)_localctx).ex.e);
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(373); match(COMMA);
						setState(374); ((ClsContext)_localctx).ex = expr(0);
						_localctx.c.add(((ClsContext)_localctx).ex.e);
						}
						}
						setState(381);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(383);
					_la = _input.LA(1);
					if (_la==RPAREN) {
						{
						setState(382); match(RPAREN);
						}
					}

					}
				}

				setState(387); match(SEMICOLON);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN) {
					{
					{
					setState(388); match(FUN);
					setState(389); ((ClsContext)_localctx).v = vv();
					setState(390); ((ClsContext)_localctx).ts = typescheme();
					setState(391); ((ClsContext)_localctx).s = stat();
					_localctx.c.add(((ClsContext)_localctx).v.v, ((ClsContext)_localctx).ts.ts, ((ClsContext)_localctx).s.s);
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399); match(RBRACE);
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
		public VvContext v;
		public TypeschemeContext ts;
		public IntfContext i;
		public ClsContext c;
		public IntfContext intf() {
			return getRuleContext(IntfContext.class,0);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public ClsContext cls() {
			return getRuleContext(ClsContext.class,0);
		}
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
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
		enterRule(_localctx, 26, RULE_program);
		try {
			int _alt;
			setState(438);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403); ((ProgramContext)_localctx).s = stat();
				((ProgramContext)_localctx).p =  new StatPrg(((ProgramContext)_localctx).s.s);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406); ((ProgramContext)_localctx).s = stat();
				setState(407); ((ProgramContext)_localctx).ss = stats();
				setState(408); ((ProgramContext)_localctx).pr = program();
				((ProgramContext)_localctx).p =  new StatsPrg(((ProgramContext)_localctx).s.s, ((ProgramContext)_localctx).ss.cu, ((ProgramContext)_localctx).pr.p);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411); match(FUN);
				setState(412); ((ProgramContext)_localctx).v = vv();
				setState(413); ((ProgramContext)_localctx).ts = typescheme();
				setState(414); ((ProgramContext)_localctx).s = stat();
				((ProgramContext)_localctx).p =  new FunPrg(((ProgramContext)_localctx).v.v, ((ProgramContext)_localctx).ts.ts, ((ProgramContext)_localctx).s.s);
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(416); match(FUN);
						setState(417); ((ProgramContext)_localctx).v = vv();
						setState(418); ((ProgramContext)_localctx).ts = typescheme();
						setState(419); ((ProgramContext)_localctx).s = stat();
						_localctx.p.add(((ProgramContext)_localctx).v.v, ((ProgramContext)_localctx).ts.ts, ((ProgramContext)_localctx).s.s);
						}
						} 
					}
					setState(426);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(427); ((ProgramContext)_localctx).pr = program();
				_localctx.p.add(((ProgramContext)_localctx).pr.p);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(430); ((ProgramContext)_localctx).i = intf();
				setState(431); ((ProgramContext)_localctx).pr = program();
				((ProgramContext)_localctx).p =  new IntfPrg(((ProgramContext)_localctx).i.i, ((ProgramContext)_localctx).pr.p);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(434); ((ProgramContext)_localctx).c = cls();
				setState(435); ((ProgramContext)_localctx).pr = program();
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
		int _startState = 28;
		enterRecursionRule(_localctx, RULE_functxt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			((FunctxtContext)_localctx).f =  new FunCtxtEmpty();
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctxtContext(_parentctx, _parentState, _p);
					_localctx.fc = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_functxt);
					setState(443);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(444); match(COMMA);
					setState(445); ((FunctxtContext)_localctx).v = vvc();
					setState(446); ((FunctxtContext)_localctx).ts = typescheme();
					((FunctxtContext)_localctx).f =  new FuncTxt(((FunctxtContext)_localctx).fc.f, ((FunctxtContext)_localctx).v.v, ((FunctxtContext)_localctx).ts.ts);
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		public VvContext v;
		public TypeschemeContext ts;
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CubexParser2.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CubexParser2.SEMICOLON, i);
		}
		public ClsctxtContext clsctxt() {
			return getRuleContext(ClsctxtContext.class,0);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
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
		int _startState = 30;
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
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(505);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ClsctxtContext(_parentctx, _parentState, _p);
						_localctx.cl = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_clsctxt);
						setState(457);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(458); match(COMMA);
						setState(459); match(INTERFACE);
						setState(460); ((ClsctxtContext)_localctx).CLSINTF = match(CLSINTF);
						setState(461); ((ClsctxtContext)_localctx).p = kindcontext();
						((ClsctxtContext)_localctx).c =  new ClassCtxtIntf(((ClsctxtContext)_localctx).cl.c, (((ClsctxtContext)_localctx).CLSINTF!=null?((ClsctxtContext)_localctx).CLSINTF.getText():null), ((ClsctxtContext)_localctx).p.kc);
						setState(479);
						switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
						case 1:
							{
							setState(463); match(EXTENDS);
							setState(464); ((ClsctxtContext)_localctx).t = type(0);
							_localctx.c.add(((ClsctxtContext)_localctx).t.t);
							setState(466); match(LBRACE);
							setState(474);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << EQUAL) | (1L << STAR) | (1L << SLASH) | (1L << PERCENT) | (1L << PLUS) | (1L << DASH) | (1L << LANGLE) | (1L << RANGLE) | (1L << BANG) | (1L << AMPERSAND) | (1L << PIPE) | (1L << APPEND) | (1L << THR) | (1L << LTHR) | (1L << RTHR) | (1L << LRTHR) | (1L << ONW) | (1L << LONW) | (1L << LTE) | (1L << GTE) | (1L << EQEQUAL) | (1L << INEQUAL))) != 0)) {
								{
								{
								setState(467); ((ClsctxtContext)_localctx).v = vv();
								setState(468); ((ClsctxtContext)_localctx).ts = typescheme();
								setState(469); match(SEMICOLON);
								_localctx.c.add(((ClsctxtContext)_localctx).v.v, ((ClsctxtContext)_localctx).ts.ts);
								}
								}
								setState(476);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(477); match(RBRACE);
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
						setState(481);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(482); match(COMMA);
						setState(483); match(CLASS);
						setState(484); ((ClsctxtContext)_localctx).CLSINTF = match(CLSINTF);
						setState(485); ((ClsctxtContext)_localctx).p = kindcontext();
						((ClsctxtContext)_localctx).c =  new ClassCtxtCls(((ClsctxtContext)_localctx).cl.c, (((ClsctxtContext)_localctx).CLSINTF!=null?((ClsctxtContext)_localctx).CLSINTF.getText():null), ((ClsctxtContext)_localctx).p.kc);
						setState(503);
						switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
						case 1:
							{
							setState(487); match(EXTENDS);
							setState(488); ((ClsctxtContext)_localctx).t = type(0);
							_localctx.c.add(((ClsctxtContext)_localctx).t.t);
							setState(490); match(LBRACE);
							setState(498);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << EQUAL) | (1L << STAR) | (1L << SLASH) | (1L << PERCENT) | (1L << PLUS) | (1L << DASH) | (1L << LANGLE) | (1L << RANGLE) | (1L << BANG) | (1L << AMPERSAND) | (1L << PIPE) | (1L << APPEND) | (1L << THR) | (1L << LTHR) | (1L << RTHR) | (1L << LRTHR) | (1L << ONW) | (1L << LONW) | (1L << LTE) | (1L << GTE) | (1L << EQEQUAL) | (1L << INEQUAL))) != 0)) {
								{
								{
								setState(491); ((ClsctxtContext)_localctx).v = vv();
								setState(492); ((ClsctxtContext)_localctx).ts = typescheme();
								setState(493); match(SEMICOLON);
								_localctx.c.add(((ClsctxtContext)_localctx).v.v, ((ClsctxtContext)_localctx).ts.ts);
								}
								}
								setState(500);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(501); match(RBRACE);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		case 5: return type_sempred((TypeContext)_localctx, predIndex);

		case 7: return expr_sempred((ExprContext)_localctx, predIndex);

		case 14: return functxt_sempred((FunctxtContext)_localctx, predIndex);

		case 15: return clsctxt_sempred((ClsctxtContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3;\u0201\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\5\2\'\n\2\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4\67\n\4\f\4\16\4:\13\4\5\4<\n\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\5\5R\n\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\5\6c\n\6\3"+
		"\6\5\6f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\5\7r\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u009a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00af\n\t\3\t\3\t\5\t\u00b3\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00ba\n\t\3\t\3\t\5\t\u00be\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00c5\n\t\3\t\3\t\5\t\u00c9\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00d3\n\t\3\t\3\t\5\t\u00d7\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00de\n\t\3"+
		"\t\3\t\5\t\u00e2\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e9\n\t\3\t\3\t\5\t\u00ed"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f4\n\t\3\t\3\t\5\t\u00f8\n\t\3\t\3\t\7"+
		"\t\u00fc\n\t\f\t\16\t\u00ff\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0108"+
		"\n\n\f\n\16\n\u010b\13\n\5\n\u010d\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0124\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u013a\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0143\n\f\f\f\16\f\u0146\13\f\5\f\u0148\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0158\n"+
		"\r\f\r\16\r\u015b\13\r\3\r\3\r\5\r\u015f\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u016d\n\16\f\16\16\16\u0170\13"+
		"\16\3\16\3\16\5\16\u0174\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u017c"+
		"\n\16\f\16\16\16\u017f\13\16\3\16\5\16\u0182\n\16\5\16\u0184\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u018d\n\16\f\16\16\16\u0190\13\16"+
		"\3\16\3\16\5\16\u0194\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01a9\n\17\f\17"+
		"\16\17\u01ac\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u01b9\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u01c4\n\20\f\20\16\20\u01c7\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01db\n\21"+
		"\f\21\16\21\u01de\13\21\3\21\3\21\5\21\u01e2\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01f3\n\21"+
		"\f\21\16\21\u01f6\13\21\3\21\3\21\5\21\u01fa\n\21\7\21\u01fc\n\21\f\21"+
		"\16\21\u01ff\13\21\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2"+
		"\r\5\2\32\32!*,\66\4\2\17\20\24\24\4\2%%((\3\2!#\3\2$%\3\2-\60\3\2\61"+
		"\62\4\2&\'\63\64\3\2\65\66\3\2)*\4\2\t\t\32\32\u023b\2&\3\2\2\2\4-\3\2"+
		"\2\2\6/\3\2\2\2\b@\3\2\2\2\nU\3\2\2\2\fq\3\2\2\2\16}\3\2\2\2\20\u0099"+
		"\3\2\2\2\22\u0100\3\2\2\2\24\u0139\3\2\2\2\26\u013b\3\2\2\2\30\u0149\3"+
		"\2\2\2\32\u0160\3\2\2\2\34\u01b8\3\2\2\2\36\u01ba\3\2\2\2 \u01c8\3\2\2"+
		"\2\"#\7\25\2\2#\'\b\2\1\2$%\t\2\2\2%\'\b\2\1\2&\"\3\2\2\2&$\3\2\2\2\'"+
		"\3\3\2\2\2()\7\23\2\2).\b\3\1\2*+\5\2\2\2+,\b\3\1\2,.\3\2\2\2-(\3\2\2"+
		"\2-*\3\2\2\2.\5\3\2\2\2/>\b\4\1\2\60;\7&\2\2\61\62\7\24\2\2\628\b\4\1"+
		"\2\63\64\7\35\2\2\64\65\7\24\2\2\65\67\b\4\1\2\66\63\3\2\2\2\67:\3\2\2"+
		"\28\66\3\2\2\289\3\2\2\29<\3\2\2\2:8\3\2\2\2;\61\3\2\2\2;<\3\2\2\2<=\3"+
		"\2\2\2=?\7\'\2\2>\60\3\2\2\2>?\3\2\2\2?\7\3\2\2\2@A\b\5\1\2AQ\7\33\2\2"+
		"BC\5\2\2\2CD\7\31\2\2DE\5\f\7\2EN\b\5\1\2FG\7\35\2\2GH\5\2\2\2HI\7\31"+
		"\2\2IJ\5\f\7\2JK\b\5\1\2KM\3\2\2\2LF\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2"+
		"\2\2OR\3\2\2\2PN\3\2\2\2QB\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\34\2\2T\t\3"+
		"\2\2\2Ue\b\6\1\2Vb\7&\2\2WX\5\f\7\2X_\b\6\1\2YZ\7\35\2\2Z[\5\f\7\2[\\"+
		"\b\6\1\2\\^\3\2\2\2]Y\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2"+
		"a_\3\2\2\2bW\3\2\2\2bc\3\2\2\2cd\3\2\2\2df\7\'\2\2eV\3\2\2\2ef\3\2\2\2"+
		"f\13\3\2\2\2gh\b\7\1\2hi\t\3\2\2ir\b\7\1\2jk\7\23\2\2ko\b\7\1\2lm\5\n"+
		"\6\2mn\b\7\1\2np\3\2\2\2ol\3\2\2\2op\3\2\2\2pr\3\2\2\2qg\3\2\2\2qj\3\2"+
		"\2\2rz\3\2\2\2st\6\7\2\3tu\7)\2\2uv\5\f\7\2vw\b\7\1\2wy\3\2\2\2xs\3\2"+
		"\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\r\3\2\2\2|z\3\2\2\2}~\5\6\4\2~\177"+
		"\5\b\5\2\177\u0080\7\31\2\2\u0080\u0081\5\f\7\2\u0081\u0082\b\b\1\2\u0082"+
		"\17\3\2\2\2\u0083\u0084\b\t\1\2\u0084\u0085\5\2\2\2\u0085\u0086\b\t\1"+
		"\2\u0086\u009a\3\2\2\2\u0087\u0088\5\4\3\2\u0088\u0089\5\n\6\2\u0089\u008a"+
		"\5\22\n\2\u008a\u008b\b\t\1\2\u008b\u009a\3\2\2\2\u008c\u008d\7\27\2\2"+
		"\u008d\u008e\5\22\n\2\u008e\u008f\7\30\2\2\u008f\u0090\b\t\1\2\u0090\u009a"+
		"\3\2\2\2\u0091\u0092\7\21\2\2\u0092\u009a\b\t\1\2\u0093\u0094\7\22\2\2"+
		"\u0094\u009a\b\t\1\2\u0095\u0096\7\26\2\2\u0096\u009a\b\t\1\2\u0097\u0098"+
		"\7\3\2\2\u0098\u009a\b\t\1\2\u0099\u0083\3\2\2\2\u0099\u0087\3\2\2\2\u0099"+
		"\u008c\3\2\2\2\u0099\u0091\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0095\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u00fd\3\2\2\2\u009b\u009c\6\t\3\3\u009c"+
		"\u009d\7,\2\2\u009d\u009e\5\20\t\2\u009e\u009f\b\t\1\2\u009f\u00fc\3\2"+
		"\2\2\u00a0\u00a1\6\t\4\3\u00a1\u00a2\7\25\2\2\u00a2\u00a3\5\n\6\2\u00a3"+
		"\u00a4\7\33\2\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\7\34\2\2\u00a6\u00a7"+
		"\b\t\1\2\u00a7\u00fc\3\2\2\2\u00a8\u00a9\6\t\5\3\u00a9\u00aa\t\4\2\2\u00aa"+
		"\u00fc\b\t\1\2\u00ab\u00ac\6\t\6\3\u00ac\u00ae\t\5\2\2\u00ad\u00af\7\33"+
		"\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b2\5\20\t\2\u00b1\u00b3\7\34\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\t\1\2\u00b5\u00fc\3\2\2\2\u00b6"+
		"\u00b7\6\t\7\3\u00b7\u00b9\t\6\2\2\u00b8\u00ba\7\33\2\2\u00b9\u00b8\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\5\20\t\2\u00bc"+
		"\u00be\7\34\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3"+
		"\2\2\2\u00bf\u00c0\b\t\1\2\u00c0\u00fc\3\2\2\2\u00c1\u00c2\6\t\b\3\u00c2"+
		"\u00c4\t\7\2\2\u00c3\u00c5\7\33\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\5\20\t\2\u00c7\u00c9\7\34\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\t"+
		"\1\2\u00cb\u00fc\3\2\2\2\u00cc\u00cd\6\t\t\3\u00cd\u00ce\t\b\2\2\u00ce"+
		"\u00fc\b\t\1\2\u00cf\u00d0\6\t\n\3\u00d0\u00d2\7,\2\2\u00d1\u00d3\7\33"+
		"\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d6\5\20\t\2\u00d5\u00d7\7\34\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b\t\1\2\u00d9\u00fc\3\2\2\2\u00da"+
		"\u00db\6\t\13\3\u00db\u00dd\t\t\2\2\u00dc\u00de\7\33\2\2\u00dd\u00dc\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\5\20\t\2\u00e0"+
		"\u00e2\7\34\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e3\u00e4\b\t\1\2\u00e4\u00fc\3\2\2\2\u00e5\u00e6\6\t\f\3\u00e6"+
		"\u00e8\t\n\2\2\u00e7\u00e9\7\33\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\5\20\t\2\u00eb\u00ed\7\34\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\t"+
		"\1\2\u00ef\u00fc\3\2\2\2\u00f0\u00f1\6\t\r\3\u00f1\u00f3\t\13\2\2\u00f2"+
		"\u00f4\7\33\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f7\5\20\t\2\u00f6\u00f8\7\34\2\2\u00f7\u00f6\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b\t\1\2\u00fa\u00fc\3\2"+
		"\2\2\u00fb\u009b\3\2\2\2\u00fb\u00a0\3\2\2\2\u00fb\u00a8\3\2\2\2\u00fb"+
		"\u00ab\3\2\2\2\u00fb\u00b6\3\2\2\2\u00fb\u00c1\3\2\2\2\u00fb\u00cc\3\2"+
		"\2\2\u00fb\u00cf\3\2\2\2\u00fb\u00da\3\2\2\2\u00fb\u00e5\3\2\2\2\u00fb"+
		"\u00f0\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\21\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u010c\b\n\1\2\u0101\u0102"+
		"\5\20\t\2\u0102\u0109\b\n\1\2\u0103\u0104\7\35\2\2\u0104\u0105\5\20\t"+
		"\2\u0105\u0106\b\n\1\2\u0106\u0108\3\2\2\2\u0107\u0103\3\2\2\2\u0108\u010b"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u0101\3\2\2\2\u010c\u010d\3\2\2\2\u010d\23\3\2\2"+
		"\2\u010e\u010f\7\37\2\2\u010f\u0110\5\26\f\2\u0110\u0111\7 \2\2\u0111"+
		"\u0112\b\13\1\2\u0112\u013a\3\2\2\2\u0113\u0114\5\2\2\2\u0114\u0115\7"+
		"\67\2\2\u0115\u0116\5\20\t\2\u0116\u0117\7\36\2\2\u0117\u0118\b\13\1\2"+
		"\u0118\u013a\3\2\2\2\u0119\u011a\7\4\2\2\u011a\u011b\7\33\2\2\u011b\u011c"+
		"\5\20\t\2\u011c\u011d\7\34\2\2\u011d\u011e\5\24\13\2\u011e\u0123\b\13"+
		"\1\2\u011f\u0120\7\5\2\2\u0120\u0121\5\24\13\2\u0121\u0122\b\13\1\2\u0122"+
		"\u0124\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u013a\3\2"+
		"\2\2\u0125\u0126\7\6\2\2\u0126\u0127\7\33\2\2\u0127\u0128\5\20\t\2\u0128"+
		"\u0129\7\34\2\2\u0129\u012a\5\24\13\2\u012a\u012b\b\13\1\2\u012b\u013a"+
		"\3\2\2\2\u012c\u012d\7\7\2\2\u012d\u012e\7\33\2\2\u012e\u012f\5\2\2\2"+
		"\u012f\u0130\7\b\2\2\u0130\u0131\5\20\t\2\u0131\u0132\7\34\2\2\u0132\u0133"+
		"\5\24\13\2\u0133\u0134\b\13\1\2\u0134\u013a\3\2\2\2\u0135\u0136\t\f\2"+
		"\2\u0136\u0137\5\20\t\2\u0137\u0138\b\13\1\2\u0138\u013a\3\2\2\2\u0139"+
		"\u010e\3\2\2\2\u0139\u0113\3\2\2\2\u0139\u0119\3\2\2\2\u0139\u0125\3\2"+
		"\2\2\u0139\u012c\3\2\2\2\u0139\u0135\3\2\2\2\u013a\25\3\2\2\2\u013b\u0147"+
		"\b\f\1\2\u013c\u013d\5\24\13\2\u013d\u0144\b\f\1\2\u013e\u013f\7\35\2"+
		"\2\u013f\u0140\5\24\13\2\u0140\u0141\b\f\1\2\u0141\u0143\3\2\2\2\u0142"+
		"\u013e\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u013c\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\27\3\2\2\2\u0149\u014a\7\n\2\2\u014a\u014b\7\23\2"+
		"\2\u014b\u014c\5\6\4\2\u014c\u015e\b\r\1\2\u014d\u014e\7\13\2\2\u014e"+
		"\u014f\5\f\7\2\u014f\u0150\b\r\1\2\u0150\u0159\7\37\2\2\u0151\u0152\7"+
		"\f\2\2\u0152\u0153\5\2\2\2\u0153\u0154\5\16\b\2\u0154\u0155\7\36\2\2\u0155"+
		"\u0156\b\r\1\2\u0156\u0158\3\2\2\2\u0157\u0151\3\2\2\2\u0158\u015b\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015d\7 \2\2\u015d\u015f\3\2\2\2\u015e\u014d\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\31\3\2\2\2\u0160\u0161\7\r\2\2\u0161\u0162"+
		"\7\23\2\2\u0162\u0163\5\6\4\2\u0163\u0164\5\b\5\2\u0164\u0193\b\16\1\2"+
		"\u0165\u0166\7\13\2\2\u0166\u0167\5\f\7\2\u0167\u0168\b\16\1\2\u0168\u016e"+
		"\7\37\2\2\u0169\u016a\5\24\13\2\u016a\u016b\b\16\1\2\u016b\u016d\3\2\2"+
		"\2\u016c\u0169\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0183\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173\7\16\2\2"+
		"\u0172\u0174\7\33\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0176\5\20\t\2\u0176\u017d\b\16\1\2\u0177\u0178\7\35\2"+
		"\2\u0178\u0179\5\20\t\2\u0179\u017a\b\16\1\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0177\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\7\34\2\2\u0181"+
		"\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0171\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u018e\7\36\2\2\u0186"+
		"\u0187\7\f\2\2\u0187\u0188\5\2\2\2\u0188\u0189\5\16\b\2\u0189\u018a\5"+
		"\24\13\2\u018a\u018b\b\16\1\2\u018b\u018d\3\2\2\2\u018c\u0186\3\2\2\2"+
		"\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7 \2\2\u0192\u0194\3\2\2\2\u0193"+
		"\u0165\3\2\2\2\u0193\u0194\3\2\2\2\u0194\33\3\2\2\2\u0195\u0196\5\24\13"+
		"\2\u0196\u0197\b\17\1\2\u0197\u01b9\3\2\2\2\u0198\u0199\5\24\13\2\u0199"+
		"\u019a\5\26\f\2\u019a\u019b\5\34\17\2\u019b\u019c\b\17\1\2\u019c\u01b9"+
		"\3\2\2\2\u019d\u019e\7\f\2\2\u019e\u019f\5\2\2\2\u019f\u01a0\5\16\b\2"+
		"\u01a0\u01a1\5\24\13\2\u01a1\u01aa\b\17\1\2\u01a2\u01a3\7\f\2\2\u01a3"+
		"\u01a4\5\2\2\2\u01a4\u01a5\5\16\b\2\u01a5\u01a6\5\24\13\2\u01a6\u01a7"+
		"\b\17\1\2\u01a7\u01a9\3\2\2\2\u01a8\u01a2\3\2\2\2\u01a9\u01ac\3\2\2\2"+
		"\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa"+
		"\3\2\2\2\u01ad\u01ae\5\34\17\2\u01ae\u01af\b\17\1\2\u01af\u01b9\3\2\2"+
		"\2\u01b0\u01b1\5\30\r\2\u01b1\u01b2\5\34\17\2\u01b2\u01b3\b\17\1\2\u01b3"+
		"\u01b9\3\2\2\2\u01b4\u01b5\5\32\16\2\u01b5\u01b6\5\34\17\2\u01b6\u01b7"+
		"\b\17\1\2\u01b7\u01b9\3\2\2\2\u01b8\u0195\3\2\2\2\u01b8\u0198\3\2\2\2"+
		"\u01b8\u019d\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b9\35"+
		"\3\2\2\2\u01ba\u01bb\b\20\1\2\u01bb\u01bc\b\20\1\2\u01bc\u01c5\3\2\2\2"+
		"\u01bd\u01be\6\20\16\3\u01be\u01bf\7\35\2\2\u01bf\u01c0\5\4\3\2\u01c0"+
		"\u01c1\5\16\b\2\u01c1\u01c2\b\20\1\2\u01c2\u01c4\3\2\2\2\u01c3\u01bd\3"+
		"\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\37\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\b\21\1\2\u01c9\u01ca\b\21"+
		"\1\2\u01ca\u01fd\3\2\2\2\u01cb\u01cc\6\21\17\3\u01cc\u01cd\7\35\2\2\u01cd"+
		"\u01ce\7\n\2\2\u01ce\u01cf\7\23\2\2\u01cf\u01d0\5\6\4\2\u01d0\u01e1\b"+
		"\21\1\2\u01d1\u01d2\7\13\2\2\u01d2\u01d3\5\f\7\2\u01d3\u01d4\b\21\1\2"+
		"\u01d4\u01dc\7\37\2\2\u01d5\u01d6\5\2\2\2\u01d6\u01d7\5\16\b\2\u01d7\u01d8"+
		"\7\36\2\2\u01d8\u01d9\b\21\1\2\u01d9\u01db\3\2\2\2\u01da\u01d5\3\2\2\2"+
		"\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df"+
		"\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\7 \2\2\u01e0\u01e2\3\2\2\2\u01e1"+
		"\u01d1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01fc\3\2\2\2\u01e3\u01e4\6\21"+
		"\20\3\u01e4\u01e5\7\35\2\2\u01e5\u01e6\7\r\2\2\u01e6\u01e7\7\23\2\2\u01e7"+
		"\u01e8\5\6\4\2\u01e8\u01f9\b\21\1\2\u01e9\u01ea\7\13\2\2\u01ea\u01eb\5"+
		"\f\7\2\u01eb\u01ec\b\21\1\2\u01ec\u01f4\7\37\2\2\u01ed\u01ee\5\2\2\2\u01ee"+
		"\u01ef\5\16\b\2\u01ef\u01f0\7\36\2\2\u01f0\u01f1\b\21\1\2\u01f1\u01f3"+
		"\3\2\2\2\u01f2\u01ed\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\7 "+
		"\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01e9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fc\3\2\2\2\u01fb\u01cb\3\2\2\2\u01fb\u01e3\3\2\2\2\u01fc\u01ff\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe!\3\2\2\2\u01ff\u01fd"+
		"\3\2\2\28&-8;>NQ_beoqz\u0099\u00ae\u00b2\u00b9\u00bd\u00c4\u00c8\u00d2"+
		"\u00d6\u00dd\u00e1\u00e8\u00ec\u00f3\u00f7\u00fb\u00fd\u0109\u010c\u0123"+
		"\u0139\u0144\u0147\u0159\u015e\u016e\u0173\u017d\u0181\u0183\u018e\u0193"+
		"\u01aa\u01b8\u01c5\u01dc\u01e1\u01f4\u01f9\u01fb\u01fd";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}