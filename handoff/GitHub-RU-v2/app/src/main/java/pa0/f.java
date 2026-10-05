package pa0;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.ix;
import hc0.tb;
import hc0.wg;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        bb.Companion.getClass();
        r b = l0.b(bb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar = xa.a;
        k.g(xVar, "type");
        m mVar2 = new m("isPinned", xVar, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
        tb.Companion.getClass();
        q0 q0Var = tb.x;
        k.g(q0Var, "type");
        List n = d0.n(new m("issue", q0Var, (String) null, rVar, rVar, r));
        ix.Companion.getClass();
        q0 q0Var2 = ix.a;
        k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = d0.n(new m("unpinIssue", q0Var2, (String) null, rVar, no.a.s(wg.H0, new u0(s0.p("issueId", new t("issueId")))), n));
    }
}
