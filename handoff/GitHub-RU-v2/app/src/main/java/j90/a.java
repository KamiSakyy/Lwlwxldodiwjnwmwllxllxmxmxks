package j90;

import aa.m;
import aa.p;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.bm;
import hc0.d8;
import hc0.fb;
import hc0.fl;
import hc0.hl;
import hc0.kz;
import hc0.xa;
import hc0.xl;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("login", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("DiffLine");
        List list = b50.a.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list, "selections", "DiffLine", n, list)});
        d8.Companion.getClass();
        p a2 = l0.a(d8.a);
        xl.Companion.getClass();
        List r3 = l.r(new m[]{new m("diffLines", a2, (String) null, rVar, no.a.s(xl.c, new u0(1)), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = xl.d;
        k.g(q0Var, "type");
        List r4 = l.r(new m[]{new m("thread", q0Var, (String) null, rVar, rVar, r3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        fl.Companion.getClass();
        List n2 = d0Shadow.n(new m("nodes", l0.a(fl.a), (String) null, rVar, rVar, r4));
        xa.Companion.getClass();
        x xVar3 = xa.a;
        m mVar3 = new m("isResolved", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        kz.Companion.getClass();
        q0 q0Var2 = kz.O;
        k.g(q0Var2, "type");
        m mVar4 = new m("resolvedBy", q0Var2, (String) null, rVar, rVar, r);
        m mVar5 = new m("path", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("viewerCanResolve", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("viewerCanUnresolve", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        bm.Companion.getClass();
        m mVar9 = new m("subjectType", l0.b(bm.s), (String) null, rVar, rVar, rVar);
        hl.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new m("comments", l0.b(hl.a), (String) null, rVar, no.a.s(xl.a, new u0(5)), n2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
