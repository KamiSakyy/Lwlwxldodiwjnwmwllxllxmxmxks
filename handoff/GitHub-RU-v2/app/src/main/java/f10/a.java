package f10;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.d5;
import m10.eh;
import m10.h5;
import m10.i30;
import m10.l40;
import m10.yg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("color", b, (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        x xVar2 = ch.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ah.Companion.getClass();
        x xVar3 = ah.a;
        m mVar2 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, new m("avatarUrl", l0.b(cc0.a), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        List r3 = l.r(new m[]{mVar4, mVar5, new m("owner", l0.b(l40.e), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("lines", l0.b(l0.a(l0.b(xVar))), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("startingLineNumber", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("endingLineNumber", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("jumpToLineNumber", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        yg.Companion.getClass();
        List r4 = l.r(new m[]{mVar6, mVar7, mVar8, mVar9, new m("score", l0.b(yg.a), (String) null, rVar, rVar, rVar)});
        d5.Companion.getClass();
        q0 q0Var = d5.a;
        k.g(q0Var, "type");
        m mVar10 = new m("language", q0Var, (String) null, rVar, rVar, r);
        i30.Companion.getClass();
        q0 q0Var2 = i30.w0;
        k.g(q0Var2, "type");
        m mVar11 = new m("repository", q0Var2, (String) null, rVar, rVar, r3);
        m mVar12 = new m("matchCount", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar13 = new m("path", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar14 = new m("refName", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h5.Companion.getClass();
        a = l.r(new m[]{mVar10, mVar11, mVar12, mVar13, mVar14, new m("snippets", no.a.d(h5.a), (String) null, rVar, rVar, r4)});
    }

    public static List a() {
        return a;
    }
}
