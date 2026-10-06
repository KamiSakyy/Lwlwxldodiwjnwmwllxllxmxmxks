package bk0;

import aa.m;
import aa.p;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import gn0.dn;
import gn0.hm;
import gn0.jm;
import gn0.lb;
import gn0.p8;
import gn0.pb;
import gn0.s00;
import gn0.tb;
import gn0.zm;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("login", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("DiffLine");
        List list = rf0.a.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list, "selections", "DiffLine", n, list)});
        p8.Companion.getClass();
        p a2 = l0.a(p8.a);
        zm.Companion.getClass();
        List r3 = l.r(new m[]{new m("diffLines", a2, (String) null, rVar, no.a.s(zm.c, new u0(1)), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = zm.d;
        k.g(q0Var, "type");
        List r4 = l.r(new m[]{new m("thread", q0Var, (String) null, rVar, rVar, r3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        List n2 = d0Shadow.n(new m("nodes", l0.a(hm.a), (String) null, rVar, rVar, r4));
        lb.Companion.getClass();
        x xVar3 = lb.a;
        m mVar3 = new m("isResolved", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        q0 q0Var2 = s00.P;
        k.g(q0Var2, "type");
        m mVar4 = new m("resolvedBy", q0Var2, (String) null, rVar, rVar, r);
        m mVar5 = new m("path", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("viewerCanResolve", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("viewerCanUnresolve", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        dn.Companion.getClass();
        m mVar9 = new m("subjectType", l0.b(dn.s), (String) null, rVar, rVar, rVar);
        jm.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new m("comments", l0.b(jm.a), (String) null, rVar, no.a.s(zm.a, new u0(5)), n2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
