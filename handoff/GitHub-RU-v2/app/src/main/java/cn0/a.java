package cn0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import gn0.eq;
import gn0.hr;
import gn0.mx;
import gn0.nb;
import gn0.pb;
import gn0.r3;
import gn0.rb;
import gn0.tb;
import gn0.v3;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("color", b, (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        x xVar2 = rb.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        pb.Companion.getClass();
        x xVar3 = pb.a;
        m mVar2 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, new m("avatarUrl", l0.b(mx.a), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        hr.Companion.getClass();
        List r3 = l.r(new m[]{mVar4, mVar5, new m("owner", l0.b(hr.a), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("lines", l0.b(l0.a(l0.b(xVar))), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("startingLineNumber", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("endingLineNumber", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("jumpToLineNumber", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        nb.Companion.getClass();
        List r4 = l.r(new m[]{mVar6, mVar7, mVar8, mVar9, new m("score", l0.b(nb.a), (String) null, rVar, rVar, rVar)});
        r3.Companion.getClass();
        q0 q0Var = r3.a;
        k.g(q0Var, "type");
        m mVar10 = new m("language", q0Var, (String) null, rVar, rVar, r);
        eq.Companion.getClass();
        q0 q0Var2 = eq.m0;
        k.g(q0Var2, "type");
        m mVar11 = new m("repository", q0Var2, (String) null, rVar, rVar, r3);
        m mVar12 = new m("matchCount", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar13 = new m("path", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar14 = new m("refName", l0.b(xVar), (String) null, rVar, rVar, rVar);
        v3.Companion.getClass();
        a = l.r(new m[]{mVar10, mVar11, mVar12, mVar13, mVar14, new m("snippets", no.a.d(v3.a), (String) null, rVar, rVar, r4)});
    }

    public static List a() {
        return a;
    }
}
