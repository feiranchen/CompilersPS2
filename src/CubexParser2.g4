parser grammar CubexParser2;
options { tokenVocab = CubexLexer2; }

vv returns [CuVv v]
	: VAR {$v = new VarFunc($VAR.text);}
	| op = (EQUAL | STAR | SLASH | PERCENT | PLUS | DASH | BANG | LANGLE | RANGLE | THR | LTHR | RTHR | LRTHR | ONW | LONW | APPEND | LTE | GTE | EQEQUAL | INEQUAL | AMPERSAND | PIPE)
		{$v = new Operation($op.text);};
vvc returns [CuVvc v]
	: CLSINTF {$v = new Vvc($CLSINTF.text);}
	| vs = vv {$v = new Vvc($vv.text);};

kindcontext returns [CuKindContext kc]
	: { $kc = new KindContext(); } (LANGLE (TPARA { $kc.add($TPARA.text); } (COMMA TPARA { $kc.add($TPARA.text); })*)? RANGLE)?;
typecontext returns [CuTypeContext tc]
	: { $tc = new TypeContext(); } LPAREN (v=vv COLON t=type { $tc.add($v.text, $t.text); } (COMMA v=vv COLON t=type { $tc.add($v.text, $t.text); })*)? RPAREN;
paratype returns [CuParaType pt]
	: {$pt = new ParaType(); } (LANGLE (t=type {$pt.add($t.text);} (COMMA t=type {$pt.add($t.text);})*)? RANGLE)?;	
type returns [CuType t]
	: v = (TPARA | THING | NOTHING) {$t = $v.text== TPARA ? new VTypePara($v.text) : new VTopBot($v.text);}
	| CLSINTF {$t = new VClass($CLSINTF.text);} (p=paratype {$t.add($p.text);})? 
	| l=type AMPERSAND r=type {$t = new VTypeInter($l.text, $r.text);};
typescheme returns [CuTypeScheme ts]
	: kc=kindcontext tc=typecontext COLON t=type {$ts = new TypeScheme($kc.text, $tc.text, $t.text);};
expr returns [CuExpr e]
	: v=vv {$e = new VvExp($v.text);}
	| v=vvc pt=paratype LPAREN? ex=expr {$e = new VvcExp($v.text, $pt.text, $ex.text);} (COMMA ex=expr {$e.add($ex.text);})* RPAREN? 
	| ex=expr v=vv pt=paratype LPAREN? ex=expr {$e = new MethodExpr($ex.text, $v.text, $pt.text, $ex.text);} (COMMA ex=expr {$e.add($ex.text);})* RPAREN? 
	| LBRACKET {$e = new BrkExpr();} (ex=expr {$e.add($ex.text);} (COMMA ex=expr {$e.add($ex.text);})*)? RBRACKET
	| l=expr APPEND r=expr {$e = new AppExpr($l.text, $r.text);} 
	| TRUE {$e = new CBoolean(true);}
	| FALSE {$e = new CBoolean(false);}
	| INTEGER {$e = new CInteger($INTEGER.text);}
	| STRING {$e = new CString($STRING.text);};
stat returns [CuStat s]
	: LBRACE {$s = new Stats();} (st=stat {$s.add($st.text);})* RBRACE
	| v=vv ASSIGN e=expr SEMICOLON {$s = new AssignStat($v.text, $e.text);} 
	| IF LPAREN e=expr RPAREN l=stat {$s = new IfStat($e.text, $l.text);} (ELSE r=stat {$s.add($r.text);})? 
	| WHILE LPAREN e=expr RPAREN st=stat {$s = new WhileStat($e.text, $st.text);}
	| FOR LPAREN v=vv IN e=expr RPAREN st=stat {$s = new ForStat($v.text, $e.text, $st.text);}
	| (RETURN | EQUAL) e=expr {$s = new ReturnStat($e.text);};
intf returns [CuInterface i]
	: INTERFACE CLSINTF p=kindcontext {$i = new Intf($CLSINTF.text, $p.text);} (EXTENDS t=type {$i.add($t.text);} LBRACE (FUN v=vv t=typescheme SEMICOLON {$i.add($v.text, $t.text);})* RBRACE)?;
cls returns [CuClass c]
	: CLASS CLSINTF pk=kindcontext pt=typecontext {$c = new Cls($v.text, $pk.text, $pt.text);} (EXTENDS t=type {$c.add($t.text);} LBRACE (s=stat {$c.add($s.text);})* (SUPER LPAREN? ex=expr {$c.add($ex.text);} (COMMA ex=expr {$c.add($ex.text);})* RPAREN?)? SEMICOLON (FUN v=vv t=typescheme s=stat {$c.add($v.text, $t.text, $s.text);})* RBRACE)?;
program returns [CuProgr p]
	: s=stat {$p = new StatPrg($s.text);} 
	| s=stat {$p = new StatsPrg($s.text);} (s=stat {$p.add($s.text);})* pr=program {$p.add($pr.text);}
	| FUN v=vv t=typescheme s=stat {$p = new FunPrg($v.text, $t.text, $s.text);} (FUN v=vv t=typescheme s=stat {$p.add($v.text, $t.text, $s.text);})* pr=program {$p.add($pr.text);}
	| i=intf pr=program {$p = new IntfPrg($i.text, $pr.text);}
	| c=cls pr=program {$p = new ClassPrg($c.text, $pr.text);};
functxt returns [CuFunC f]
	: {$f = new FunCtxtEmpty();}
	| fc=functxt COMMA v=vvc t=typescheme {$f = new FuncTxt($fc.text, $v.text, $t.text);};
clsctxt returns [CuClassC c]
	: {$c = new ClassCtxtEmpty();}
	| cl=clsctxt COMMA INTERFACE CLSINTF p=kindcontext {$c = new ClassCtxtIntf($cl.text, $CLSINTF.text, $p.text);} (EXTENDS t=type {$c.add($t.text);} LBRACE (v=vv t=typescheme SEMICOLON {$c.add($v.text, $t.text);})* RBRACE)? 
	| cl=clsctxt COMMA CLASS CLSINTF p=kindcontext {$c = new ClassCtxtCls($cl.text, $CLSINTF.text, $p.text);} (EXTENDS t=type {$c.add($t.text);} LBRACE (v=vv t=typescheme SEMICOLON {$c.add($v.text, $t.text);})* RBRACE)?;