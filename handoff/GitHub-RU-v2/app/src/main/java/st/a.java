package st;

import a81.t;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import dt.e;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.ki;
import m10.ux;
import m10.wh;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        wh.Companion.getClass();
        q0 q0Var = wh.B;
        List n = d0Shadow.n(new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r));
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("Issue");
        List list = e.a;
        List n3 = d0Shadow.n(new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, l.r(new s[]{mVar2, no.a.c(list, "selections", "Issue", n2, list), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        m mVar3 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ki.Companion.getClass();
        q0 q0Var2 = ki.a;
        k.g(q0Var2, "type");
        ux.Companion.getClass();
        t tVar = ux.h;
        aa.k kVar = new aa.k(tVar, new u0(10));
        t tVar2 = ux.i;
        a = l.r(new m[]{mVar3, new m("closingIssuesReferences", q0Var2, "userLinkedOnlyClosingIssueReferences", rVar, l.r(new aa.k[]{kVar, new aa.k(tVar2, new u0(Boolean.TRUE))}), n), new m("closingIssuesReferences", q0Var2, "allClosingIssueReferences", rVar, l.r(new aa.k[]{new aa.k(tVar, new u0(10)), new aa.k(tVar2, new u0(Boolean.FALSE))}), n3), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
