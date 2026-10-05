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
import pz0.vd;
import pz0.xd;
import pz0.xs;
import sy.d0;
import v8.l0;
import x61.l;
import yt0.f;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
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
        vd.Companion.getClass();
        x xVar3 = vd.a;
        m mVar2 = new m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        hs.Companion.getClass();
        q0 q0Var = hs.N;
        List r2 = l.r(new m[]{mVar2, new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r)});
        s mVar3 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("PullRequest");
        List list = f.a;
        List r3 = l.r(new m[]{new m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, l.r(new s[]{mVar3, no.a.c(list, "selections", "PullRequest", n, list), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)}))});
        xs.Companion.getClass();
        q0 q0Var2 = xs.a;
        k.g(q0Var2, "type");
        le.Companion.getClass();
        t tVar = le.h;
        aa.k kVar = new aa.k(tVar, new u0(10));
        t tVar2 = le.i;
        Boolean bool = Boolean.TRUE;
        aa.k kVar2 = new aa.k(tVar2, new u0(bool));
        t tVar3 = le.j;
        a = l.r(new m[]{new m("closedByPullRequestsReferences", q0Var2, "userLinkedOnlyClosedByPullRequestReferences", rVar, l.r(new aa.k[]{kVar, kVar2, new aa.k(tVar3, new u0(bool))}), r2), new m("closedByPullRequestsReferences", q0Var2, "allClosedByPullRequestReferences", rVar, l.r(new aa.k[]{new aa.k(tVar, new u0(10)), new aa.k(tVar2, new u0(bool)), new aa.k(tVar3, new u0(Boolean.FALSE))}), r3), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
