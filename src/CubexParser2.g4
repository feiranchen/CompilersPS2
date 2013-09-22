parser grammar CubexParser2;
options { tokenVocab = CubexLexer2; }

vvc returns [CuVvc v]
	: vv= (CLSINTF | VAR) {$v = new Vvc($vv.text);};

kindcontext returns [List<String> kc]
	: {$kc = new ArrayList<String>();} (LANGLE (TPARA { $kc.add($TPARA.text); } (COMMA TPARA { $kc.add($TPARA.text); })*)? RANGLE)?;
vvt returns [CuVvT cu]
	: VAR COLON t=type { $cu = new Vvt($VAR.text, $t.t); };
typecontext returns [List<CuVvt> tc]
	: { $tc = new ArrayList<CuVvt>(); } LPAREN (v=vvt { $tc.add($vvt.cu); } (COMMA v=vvt { $tc.add($vvt.cu); })*)? RPAREN;

paratype returns [List<CuType> pt]
	: {$pt = new ArrayList<CuType>(); } (LANGLE (t=type {$pt.add($t.t);} (COMMA t=type {$pt.add($t.t);})*)? RANGLE)?;	
type returns [CuType t]
	: v = (TPARA | THING | NOTHING) {$t = $v.type== TPARA ? new VTypePara($v.text) : new VTopBot($v.text);}
	| CLSINTF {$t = new VClass($CLSINTF.text);} (p=paratype {$t.add($p.pt);})? 
	| l=type AMPERSAND r=type {$t = new VTypeInter($l.t, $r.t);};
typescheme returns [CuTypeScheme ts]
	: kc=kindcontext tc=typecontext COLON t=type {$ts = new TypeScheme($kc.kc, $tc.tc, $t.t);};
expr returns [CuExpr e]
	: VAR {$e = new VvExp($VAR.text);}
	| v=vvc pt=paratype es=exprs {$e = new VvcExp($v.v, $pt.pt, $es.cu);}
	| ex=expr VAR pt=paratype LPAREN es=exprs RPAREN {$e = new VarExpr($ex.e, $VAR.text, $pt.pt, $es.cu);} 
	| ex=expr op=(DASH | BANG) 
		{$e = ($op.type == DASH) ? new NegativeExpr($ex.e) : new NegateExpr($ex.e);}
	| l=expr op=(STAR | SLASH | PERCENT) LPAREN? r=expr RPAREN?
		{$e = ($op.type == STAR) ? new TimesExpr($l.e, $r.e) : ($op.type == SLASH) ? new DivideExpr($l.e, $r.e) : new ModuloExpr($l.e, $r.e);}
	| l=expr op=(PLUS | DASH) LPAREN? r=expr RPAREN?
		{$e = ($op.type == PLUS) ? new PlusExpr($l.e, $r.e) : new MinusExpr($l.e, $r.e);}
	| l=expr op=(THR | LTHR | RTHR | LRTHR) LPAREN? r=expr RPAREN?
		{$e = ($op.type == THR) ? new ThroughExpr($l.e, $r.e, true, true) : ($op.type == LTHR) ? new ThroughExpr($l.e, $r.e, false, true) : ($op.type == RTHR) ? new ThroughExpr($l.e, $r.e, true, false) : new ThroughExpr($l.e, $r.e, false, false);}
	| ex=expr op=(ONW | LONW) 
		{$e = ($op.type == ONW) ? new OnwardsExpr($ex.e, true) : new OnwardsExpr($ex.e, false);}
	| l=expr op=(LANGLE | LTE | RANGLE | GTE) LPAREN? r=expr RPAREN?
		{$e = ($op.type == LANGLE) ? new LessThanExpr($l.e, $r.e, true) : ($op.type == LTE) ? new LessThanExpr($l.e, $r.e, false) : ($op.type == RANGLE) ? new GreaterThanExpr($l.e, $r.e, true) : new GreaterThanExpr($l.e, $r.e, false);}
	| l=expr op=(EQEQUAL | INEQUAL) LPAREN? r=expr RPAREN?
		{$e = ($op.type == EQEQUAL) ? new EqualExpr($l.e, $r.e, true) : new EqualExpr($l.e, $r.e, false);}
	| l=expr op=(AMPERSAND | PIPE) LPAREN? r=expr RPAREN?
		{$e = ($op.type == AMPERSAND) ? new AndExpr($l.e, $r.e) : new OrExpr($l.e, $r.e);}
	| LBRACKET es=exprs RBRACKET {$e = new BrkExpr($es.cu);} 
	| l=expr APPEND r=expr {$e = new AppExpr($l.e, $r.e);} 
	| TRUE {$e = new CBoolean(true);}
	| FALSE {$e = new CBoolean(false);}
	| INTEGER {$e = new CInteger($INTEGER.int);}
	| STRING {$e = new CString($STRING.text);};
exprs returns [List<CuExpr> cu] 
	: {$cu = new ArrayList<CuExpr>();} (e=expr {$cu.add($e.e);} (COMMA e=expr {$cu.add($e.e);})*)?;
stat returns [CuStat s]
	: LBRACE ss=stats RBRACE {$s = new Stats($ss.cu);}
	| VAR ASSIGN e=expr SEMICOLON {$s = new AssignStat($VAR.text, $e.e);} 
	| IF LPAREN e=expr RPAREN l=stat {$s = new IfStat($e.e, $l.s);} (ELSE r=stat {$s.add($r.s);})? 
	| WHILE LPAREN e=expr RPAREN st=stat {$s = new WhileStat($e.e, $st.s);}
	| FOR LPAREN VAR IN e=expr RPAREN st=stat {$s = new ForStat($VAR.text, $e.e, $st.s);}
	| (RETURN | EQUAL) e=expr {$s = new ReturnStat($e.e);};
stats returns [List<CuStat> cu] 
	: {$cu = new ArrayList<CuStat>();} (s=stat {$cu.add($s.s);} (COMMA s=stat {$cu.add($s.s);})*)?;
intf returns [CuInterface i]
	: INTERFACE CLSINTF p=kindcontext {$i = new Intf($CLSINTF.text, $p.kc);} (EXTENDS t=type {$i.add($t.t);} LBRACE (FUN VAR ts=typescheme SEMICOLON {$i.add($VAR.text, $ts.ts);})* RBRACE)?;
cls returns [CuClass c]
	: CLASS CLSINTF pk=kindcontext pt=typecontext {$c = new Cls($CLSINTF.text, $pk.kc, $pt.tc);} (EXTENDS t=type {$c.add($t.t);} LBRACE (s=stat {$c.add($s.s);})* (SUPER LPAREN? ex=expr {$c.add($ex.e);} (COMMA ex=expr {$c.add($ex.e);})* RPAREN?)? SEMICOLON (FUN VAR ts=typescheme s=stat {$c.add($VAR.text, $ts.ts, $s.s);})* RBRACE)?;
program returns [CuProgr p]
	: s=stat {$p = new StatPrg($s.s);} 
	| s=stat ss=stats pr=program {$p = new StatsPrg($s.s, $ss.cu, $pr.p);}
	| FUN VAR ts=typescheme s=stat {$p = new FunPrg($VAR.text, $ts.ts, $s.s);} (FUN VAR ts=typescheme s=stat {$p.add($VAR.text, $ts.ts, $s.s);})* pr=program {$p.add($pr.p);}
	| i=intf pr=program {$p = new IntfPrg($i.i, $pr.p);}
	| c=cls pr=program {$p = new ClassPrg($c.c, $pr.p);};
functxt returns [CuFunC f]
	: {$f = new FunCtxtEmpty();}
	| fc=functxt COMMA v=vvc ts=typescheme {$f = new FuncTxt($fc.f, $v.v, $ts.ts);};
clsctxt returns [CuClassC c]
	: {$c = new ClassCtxtEmpty();}
	| cl=clsctxt COMMA INTERFACE CLSINTF p=kindcontext {$c = new ClassCtxtIntf($cl.c, $CLSINTF.text, $p.kc);} (EXTENDS t=type {$c.add($t.t);} LBRACE (VAR ts=typescheme SEMICOLON {$c.add($VAR.text, $ts.ts);})* RBRACE)? 
	| cl=clsctxt COMMA CLASS CLSINTF p=kindcontext {$c = new ClassCtxtCls($cl.c, $CLSINTF.text, $p.kc);} (EXTENDS t=type {$c.add($t.t);} LBRACE (VAR ts=typescheme SEMICOLON {$c.add($VAR.text, $ts.ts);})* RBRACE)?;