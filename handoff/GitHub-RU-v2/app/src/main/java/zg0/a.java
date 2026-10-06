package zg0;

import a81.t;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import gn0.hc;
import gn0.ll;
import gn0.pb;
import gn0.rc;
import gn0.tb;
import java.util.List;
import k71.k;
import ng0.d;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        pb.Companion.getClass();
        x xVar = pb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hc.Companion.getClass();
        q0 q0Var = hc.x;
        List n = d0Shadow.n(new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r));
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("Issue");
        List list = d.a;
        List n3 = d0Shadow.n(new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, l.r(new s[]{mVar2, no.a.c(list, "selections", "Issue", n2, list), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        m mVar3 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        rc.Companion.getClass();
        q0 q0Var2 = rc.a;
        k.g(q0Var2, "type");
        ll.Companion.getClass();
        t tVar = ll.h;
        aa.k kVar = new aa.k(tVar, new u0(10));
        t tVar2 = ll.i;
        a = l.r(new m[]{mVar3, new m("closingIssuesReferences", q0Var2, "userLinkedOnlyClosingIssueReferences", rVar, l.r(new aa.k[]{kVar, new aa.k(tVar2, new u0(Boolean.TRUE))}), n), new m("closingIssuesReferences", q0Var2, "allClosingIssueReferences", rVar, l.r(new aa.k[]{new aa.k(tVar, new u0(10)), new aa.k(tVar2, new u0(Boolean.FALSE))}), n3), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
