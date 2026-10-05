package j60;

import a81.t;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.dc;
import hc0.fb;
import hc0.lk;
import hc0.tb;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x50.d;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        bb.Companion.getClass();
        x xVar = bb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        tb.Companion.getClass();
        q0 q0Var = tb.x;
        List n = d0.n(new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r));
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("Issue");
        List list = d.a;
        List n3 = d0.n(new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, l.r(new s[]{mVar2, no.a.c(list, "selections", "Issue", n2, list), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        m mVar3 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        dc.Companion.getClass();
        q0 q0Var2 = dc.a;
        k.g(q0Var2, "type");
        lk.Companion.getClass();
        t tVar = lk.g;
        aa.k kVar = new aa.k(tVar, new u0(10));
        t tVar2 = lk.h;
        a = l.r(new m[]{mVar3, new m("closingIssuesReferences", q0Var2, "userLinkedOnlyClosingIssueReferences", rVar, l.r(new aa.k[]{kVar, new aa.k(tVar2, new u0(Boolean.TRUE))}), n), new m("closingIssuesReferences", q0Var2, "allClosingIssueReferences", rVar, l.r(new aa.k[]{new aa.k(tVar, new u0(10)), new aa.k(tVar2, new u0(Boolean.FALSE))}), n3), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
