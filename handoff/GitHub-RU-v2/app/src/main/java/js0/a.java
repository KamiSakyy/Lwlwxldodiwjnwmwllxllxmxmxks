package js0;

import a81.t;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.hs;
import pz0.le;
import pz0.td;
import pz0.ve;
import pz0.xd;
import sy.d0;
import v8.l0;
import vr0.d;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        le.Companion.getClass();
        q0 q0Var = le.A;
        List n = d0.n(new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r));
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("Issue");
        List list = d.a;
        List n3 = d0.n(new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, l.r(new s[]{mVar2, no.a.c(list, "selections", "Issue", n2, list), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        m mVar3 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ve.Companion.getClass();
        q0 q0Var2 = ve.a;
        k.g(q0Var2, "type");
        hs.Companion.getClass();
        t tVar = hs.h;
        aa.k kVar = new aa.k(tVar, new u0(10));
        t tVar2 = hs.i;
        a = l.r(new m[]{mVar3, new m("closingIssuesReferences", q0Var2, "userLinkedOnlyClosingIssueReferences", rVar, l.r(new aa.k[]{kVar, new aa.k(tVar2, new u0(Boolean.TRUE))}), n), new m("closingIssuesReferences", q0Var2, "allClosingIssueReferences", rVar, l.r(new aa.k[]{new aa.k(tVar, new u0(10)), new aa.k(tVar2, new u0(Boolean.FALSE))}), n3), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
